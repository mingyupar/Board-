package src.main.java.com.example.hanghae;

import com.example.hanghae.EnableJapAuditing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableJapAuditing
@SpringBootApplication
public class HanghaeApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanghaeApplication.class, args);
    }

}
