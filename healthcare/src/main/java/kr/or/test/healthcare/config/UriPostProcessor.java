package kr.or.test.healthcare.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.spring.web.paths.DefaultPathProvider;
import springfox.documentation.spring.web.paths.Paths;

@Component
public class UriPostProcessor implements BeanPostProcessor {

    @Value("${server.servlet.context-path}")
    private String context;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if("pathProvider".equals(beanName)){
            return new DefaultPathProvider(){
                @Override
                public String getOperationPath(String operationPath) {
                    operationPath = operationPath.replaceFirst(context, "/");
                    UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
                    return Paths.removeAdjacentForwardSlashes(uriComponentsBuilder.path(operationPath).build().toString());
                }

                @Override
                public String getResourceListingPath(String groupName, String apiDeclaration) {
                    return super.getResourceListingPath(groupName, apiDeclaration);
                }
            };
        }

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
