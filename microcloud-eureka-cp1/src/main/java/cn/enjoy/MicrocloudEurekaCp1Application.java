package cn.enjoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicrocloudEurekaCp1Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudEurekaCp1Application.class, args);
    }

}
