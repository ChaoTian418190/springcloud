package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("cn.enjoy.mapper")
public class MicrocloudProviderPoductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderPoductApplication.class, args);
    }

}
