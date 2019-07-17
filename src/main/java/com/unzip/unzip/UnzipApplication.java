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

	@Bean
	public CommandLineRunner demo(BlogPostRepository repository) {
		return (args) -> {
			//save a couple of customers
			repository.save(new BlogPost(7, "Jaws", "Jaws is a great movie", "google.com", 1, 1, 1));
			repository.save(new BlogPost(7, "Jaws", "Jaws is a great movie", "google.com", 1, 1, 1));
			repository.save(new BlogPost(7, "Jaws", "Jaws is a great movie", "google.com", 1, 1, 1));
			repository.save(new BlogPost(7, "Jaws", "Jaws is a great movie", "google.com", 1, 1, 1));
			repository.save(new BlogPost(7, "Jaws", "Jaws is a great movie", "google.com", 1, 1, 1));


			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (BlogPost blogPost : repository.findAll()) {
				log.info(blogPost.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			repository.findById(10)
					.ifPresent(customer -> {
						log.info("Customer found with findById(1L):");
						log.info("--------------------------------");
						log.info(customer.toString());
						log.info("");
					});
		};
	}
}
