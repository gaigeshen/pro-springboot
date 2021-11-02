package work.gaigeshen.pro.springboot.validation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/validations")
@RestController
public class ValidationController {

  @PostMapping
  public Result createValidation(@RequestBody ValidationDto validation) {
    return Result.success();
  }

}
