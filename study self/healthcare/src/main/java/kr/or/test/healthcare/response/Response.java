package kr.or.test.healthcare.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Schema
@NoArgsConstructor
public class Response {

    @Schema
    private long elapsedTime;

    public void setElapsedTime(long startTime){
        long endTime = System.currentTimeMillis();
        this.elapsedTime = endTime - startTime;
    }

    @Schema
    private String status;

    @Schema
    private List errors = new ArrayList();

    @Schema
    private String message;

    @Schema
    private String timestamp;

    @Schema
    private String bodyType;

    @Schema
    private Object body;

    public void ResponseIncorrectHospitalCd(Object body){
        this.status = "NOT OK";
        this.errors.add("check hospitalCd");
        this.message = "병원 코드를 확인하세요.";
//        if(body instanceof ResponseUpdateReturn) {
//            ((ResponseUpdateReturn)body).setReturnCd("0001");
//            ((ResponseUpdateReturn)body).setReturnMsg(this.message);
//        }
        this.body = body;
    }

    public Response(Object request, Object e){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.timestamp = sdf.format(new Date());

        if(request instanceof List<?>){
            if(((List<?>) request).size() < 1){
                throw new IndexOutOfBoundsException();
            }else if(((List<?>) request).get(0) == null){
                throw new NullPointerException();
            }else {
                this.setBodyType("ARRAY");
                this.setBody(request);
            }
        }else {
            this.setBodyType("OBJECT");
            this.setBody(request);
        }

        if(e instanceof Exception){
            this.setStatus("Not OK");
            if(e instanceof IndexOutOfBoundsException){
                this.errors.add("No data found");
            }else if(e instanceof NullPointerException){
                this.errors.add("No data found");
            }else {
                this.errors.add("Errors");
            }
            StringWriter sw = new StringWriter();
            ((Exception) e).printStackTrace(new PrintWriter(sw));
            this.setMessage(sw.toString().substring(0, 50));
        }else {
            this.setStatus("OK");
        }
    }

}
