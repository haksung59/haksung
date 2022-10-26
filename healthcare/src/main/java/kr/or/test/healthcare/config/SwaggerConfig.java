package kr.or.test.healthcare.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("kr.or.kcomwel.healthcare.controller"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(true)
                .globalResponses(HttpMethod.POST,
                        Arrays.asList(new ResponseBuilder()
                                .code("500")
                                .description("서버 오류")
                                .build(),
                                new ResponseBuilder()
                                        .code("401")
                                        .description("인증번호가 필요합니다.")
                                        .build()));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("REST API DOCS")
                .version("1.0")
                .build();
    }

}
