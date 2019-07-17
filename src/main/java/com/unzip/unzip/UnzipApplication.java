package com.unzip.unzip;
import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Models.Comments;
import com.unzip.unzip.Models.User;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Repositories.CommentsRepository;
import com.unzip.unzip.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UnzipApplication {


	private static final Logger log = LoggerFactory.getLogger(UnzipApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UnzipApplication.class, args);

	}

}
