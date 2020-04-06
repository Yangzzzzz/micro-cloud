package cn.ihzgnay.micro.microbaseprovider7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan("cn.ihzgnay.micro")
//@MapperScan("cn.ihzgnay.micro.*")
public class MicroBaseProvider7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroBaseProvider7001Application.class, args);
    }

}
