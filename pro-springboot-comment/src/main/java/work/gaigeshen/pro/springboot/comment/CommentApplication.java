package work.gaigeshen.pro.springboot.comment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import work.gaigeshen.pro.springboot.validation.api.ValidationService;

/**
 *
 * @author gaigeshen
 */
@EnableFeignClients(clients = { ValidationService.class })
@SpringBootApplication
public class CommentApplication {

  public static void main(String[] args) {
    SpringApplication.run(CommentApplication.class, args);
  }
}
