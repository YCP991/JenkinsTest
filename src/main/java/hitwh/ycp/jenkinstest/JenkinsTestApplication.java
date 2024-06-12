package hitwh.ycp.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class JenkinsTestApplication {

    public static void main(String[] args) {

        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
