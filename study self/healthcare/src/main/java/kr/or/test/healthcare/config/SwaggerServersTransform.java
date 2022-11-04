package kr.or.test.healthcare.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import springfox.documentation.oas.web.OpenApiTransformationContext;
import springfox.documentation.oas.web.WebMvcOpenApiTransformationFilter;
import springfox.documentation.spi.DocumentationType;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Component
public class SwaggerServersTransform implements WebMvcOpenApiTransformationFilter {

    @Value("${server.name")
    private String serverName;

    @Value("${server.url}")
    private String serverUrl;

    @Override
    public OpenAPI transform(OpenApiTransformationContext<HttpServletRequest> context) {
        OpenAPI openAPI = context.getSpecification();

        Server server = new Server();
        server.setDescription(serverName);
        server.setUrl(serverUrl);

        openAPI.setServers(Arrays.asList(server));

        return openAPI;
    }

    @Override
    public boolean supports(DocumentationType delimiter) { return delimiter.equals(DocumentationType.OAS_30);}

}
