package kr.or.test.healthcare.controller;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import kr.or.test.healthcare.request.RequestTest;
import kr.or.test.healthcare.response.Response;
import kr.or.test.healthcare.service.CoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "공통")
public class CoController {

    @Autowired
    public CoService coService;

    @PostMapping("/api/test1")
    @Operation(summary = "테스트1", description = "test1")
    Response test1(@RequestBody RequestTest request) { return coService.test1(request); }

}
