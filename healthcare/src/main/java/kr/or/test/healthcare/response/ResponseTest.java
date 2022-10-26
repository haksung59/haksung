package kr.or.test.healthcare.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema
public class ResponseTest {

    @Schema(description = "아이디")
    private String id;

    @Schema(description = "이름")
    private String name;

}
