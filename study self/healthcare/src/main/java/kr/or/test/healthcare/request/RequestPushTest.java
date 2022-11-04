package kr.or.test.healthcare.request;

import lombok.Data;

@Data
public class RequestPushTest {

    private String appDeploymentType;

    private String patientId;

    private String hospitalCd;

    private String text;

    private String uri;

}
