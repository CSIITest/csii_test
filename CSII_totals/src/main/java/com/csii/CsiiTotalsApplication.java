package com.csii;



import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CsiiTotalsApplication {

	public static Logger logger1 = Logger.getLogger("CsiiTotalsApplication");
	// 主启动类
	public static void main(String[] args) {
		SpringApplication.run(CsiiTotalsApplication.class, args);
		
		logger1.info("本地启动成功");
	}

}
