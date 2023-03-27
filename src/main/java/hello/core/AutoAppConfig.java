package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration  //hello.core의 경로 애들을 다 스캔하겠다 , @component를 스캔함
@ComponentScan(basePackages = "hello.core",excludeFilters = @Filter(type = FilterType.ANNOTATION,
        classes = Configuration.class))
public class AutoAppConfig {
}
