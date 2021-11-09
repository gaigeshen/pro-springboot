package work.gaigeshen.pro.springboot.validation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;
import work.gaigeshen.pro.springboot.validation.service.ValidationService;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/validations")
@RestController
public class ValidationController {

  private final ValidationService validationService;

  public ValidationController(ValidationService validationService) {
    this.validationService = validationService;
  }

  @PostMapping
  public Result<ValidationResultDto> createValidation(@RequestBody ValidationDto validation) {
    ValidationResultDto resultDto = validationService.createValidation(validation);
    return Result.success(resultDto);
  }

}
