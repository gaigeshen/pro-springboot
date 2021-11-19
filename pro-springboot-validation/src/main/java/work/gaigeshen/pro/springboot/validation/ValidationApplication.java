package work.gaigeshen.pro.springboot.validation;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author gaigeshen
 */
@EnableAutoDataSourceProxy
@SpringBootApplication
public class ValidationApplication {

  public static void main(String[] args) {
    SpringApplication.run(ValidationApplication.class, args);
  }
}
