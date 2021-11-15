package byteinfo.top.druidtwosource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
public class KnifeConfiguration {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2(){
        Docket docket= new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("Apis")
                        .termsOfServiceUrl("byteinfo.top")
                        .version("1.0")
                        .build()
                )
                .groupName("2.X版本")
                .select()
                .apis(RequestHandlerSelectors.basePackage("byteinfo.top.druidtwosource.controller"))
                .paths(PathSelectors.any())
                .build()
                ;
        return docket;
    }
}
