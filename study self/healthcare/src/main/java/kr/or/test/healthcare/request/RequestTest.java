package kr.or.test.healthcare.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema
public class RequestTest {

    @Schema(description = "병원코드", type = "string")
    private String hospitalCd;

    @Schema(description = "test", type = "string")
    private String test;

}
