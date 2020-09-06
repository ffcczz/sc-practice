package baseservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import sun.misc.Request;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket newsApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.enable(true);
        docket.apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.ashbur")).paths(PathSelectors.any()).build();
        return docket;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("ashbur api info").description("api info").version("1.0").build();
    }
}
