package kr.or.test.healthcare.service;

import com.google.gson.Gson;
import kr.or.test.healthcare.mapper.CoMapper;
import kr.or.test.healthcare.request.RequestPushTest;
import kr.or.test.healthcare.request.RequestTest;
import kr.or.test.healthcare.response.Response;
import kr.or.test.healthcare.response.ResponseTest;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLDecoder;

@Service
public class CoService {

    private long startTime;

    @Value("${server.name}")
    String serverName;

    @Resource(name = "db1SqlSessionFactory")
    private SqlSessionFactory db1;

    @Resource(name = "db2SqlSessionFactory")
    private SqlSessionFactory db2;

    private CoMapper choiceMapper(String hospitalCd){
        startTime = System.currentTimeMillis();
        switch (hospitalCd){
            case "db1":
                return db1.openSession().getMapper(CoMapper.class);
            case "db2":
                return db2.openSession().getMapper(CoMapper.class);
            default:
                return null;
        }
    }

    @Transactional
    public Response test1(RequestTest request){
        CoMapper mapper = choiceMapper(request.getHospitalCd());
        Response response = new Response();

        if(mapper == null){
            response.ResponseIncorrectHospitalCd(null);
            response.setElapsedTime(startTime);
            return response;
        }

        try {
            ResponseTest result = mapper.test1(request);
            response = new Response(result, null);
        }catch(Exception e){
            response = new Response(null, e);
        }

        response.setElapsedTime(startTime);

        return response;
    }

    public Response pushTest(RequestPushTest request) throws Exception {
        startTime = System.currentTimeMillis();
        Response response = new Response();
        request.setText(URLDecoder.decode(request.getText(), "UTF-8"));
        if(request.getUri() != null){
            request.setUri(URLDecoder.decode(request.getUri(), "UTF-8"));
        }
        String surl = "";

        if(serverName.equals("dev") || serverName.equals("local")){
            surl = "http://localhost:8080/" + serverName +"/push";
        }else{
            surl = "http://localhost:8080/push";
        }

        URL url = new URL(surl);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
//        conn.setRequestProperty("accKey", "~~~accKey~~~");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);

        Gson gson = new Gson();
        String json = gson.toJson(request);

        conn.setDoOutput(true);
        conn.setDoInput(true);

        try(OutputStream os = conn.getOutputStream()){
            byte request_data[] = json.getBytes("utf-8");
            os.write(request_data);
        }

        conn.connect();

        try(BufferedReader br = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), "utf-8")
        )){
            StringBuilder result = new StringBuilder();
            String responseLine = null;
            while((responseLine = br.readLine()) != null){
                result.append(responseLine.trim());
            }
            String strResult = String.valueOf(result);
            response = gson.fromJson(strResult, Response.class);
        }

        response.setElapsedTime(startTime);

        return response;
    }

}
