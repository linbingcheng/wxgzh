package top.bingchenglin.wxgzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@EnableAutoConfiguration
@ComponentScan(basePackages = "top.bingchenglin.wxgzh")
public class WxgzhApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxgzhApplication.class, args);
	}
}
