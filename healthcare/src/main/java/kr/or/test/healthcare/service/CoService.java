package kr.or.test.healthcare.service;

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
        return response;
    }

}
