package kr.or.test.healthcare.mapper;

import kr.or.test.healthcare.request.RequestTest;
import kr.or.test.healthcare.response.ResponseTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CoMapper {

    ResponseTest test1(RequestTest request);

}
