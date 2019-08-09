package com.unzip.unzip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class UnzipApplication {
	private static final Logger log = LoggerFactory.getLogger(UnzipApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UnzipApplication.class, args);
	}
}
