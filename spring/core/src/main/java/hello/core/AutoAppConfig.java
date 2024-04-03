package hello.core;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", // 이 위치부터 찾아준다.
        basePackageClasses = AutoAppConfig.class, // package hello.core; 첫줄에 패키지부터 찾는다.
        // 아무것도 지정하지않으면(default) -> @ComponentScan이 붙은 패키지부터 하위패키지로 쭉 찾는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class) //Configuration 이 붙은놈들은 제외시킨다(충돌때문)
)
public class AutoAppConfig {

}
