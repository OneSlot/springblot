package demodb.demo;

import demodb.demo.model.Author;
import demodb.demo.model.Gender;
import demodb.demo.model.Post;
import demodb.demo.repository.AuthorRepository;
import demodb.demo.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.time.LocalDate;

@SpringBootApplication
public class DemoApplication {


    private static Logger logger =LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("Hello Git!...");

    }

   @Bean @Profile("dev")
    public CommandLineRunner runner(AuthorRepository authorRepository, PostRepository postRepository){
        return args -> {
        Author author1= new Author("Aung Aung", LocalDate.of(1992,3,21),"Horror", Gender.MALE);

            Post p1 = new Post("Just for Fire","Life",LocalDate.now());
            Post p2 = new Post("Authority","Political",LocalDate.now());

       p1.setAuthor(author1);
       p2.setAuthor(author1);
        };
    }
}
