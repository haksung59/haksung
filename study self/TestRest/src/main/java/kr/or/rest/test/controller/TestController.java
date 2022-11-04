package kr.or.rest.test.controller;

import com.google.gson.Gson;
import kr.or.rest.test.request.Request;
import kr.or.rest.test.response.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class TestController {

    @PostMapping("/")
    Response index(@RequestBody Request request) throws Exception {
        Response response = new Response();
        String surl = "http://localhost:8080/test";

        URL url = new URL(surl);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
//        conn.setRequestProperty("accKey", "d840d3f6-b56f-58af-8d51-82990babfcaf");
        conn.setConnectTimeout(10000);
        conn.setReadTimeout(10000);

        Gson gson = new Gson();
        String json = gson.toJson(request);

        conn.setDoOutput(true);
        conn.setDoInput(true);

        try(OutputStream os = conn.getOutputStream()){
            byte request_data[] = json.getBytes("utf-8");
            os.write(request_data);
            os.close();
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

        return response;

    }

    @PostMapping("/test")
    Response test(@RequestBody Request request){
        Response response = new Response();
        if(request.getId().equals("haksung59")){
            response.setAge("30");
        }else {
            response.setAge("0");
        }

        if(request.getName().equals("김학성")){
            response.setSex("M");
        }else {
            response.setSex("F");
        }

        return response;
    }

}
