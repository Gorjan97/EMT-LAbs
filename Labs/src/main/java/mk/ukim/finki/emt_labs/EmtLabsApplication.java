package mk.ukim.finki.emt_labs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class EmtLabsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmtLabsApplication.class, args);
    }

}
