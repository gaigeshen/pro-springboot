package work.gaigeshen.pro.springboot.validation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.gaigeshen.pro.springboot.validation.api.dto.Result;
import work.gaigeshen.pro.springboot.validation.api.dto.ValidationDto;
import work.gaigeshen.pro.springboot.validation.api.ValidationService;
import work.gaigeshen.pro.springboot.validation.api.dto.ValidationResultDto;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/validations")
@RestController
public class ValidationController implements ValidationService {

  private static final Logger log = LoggerFactory.getLogger(ValidationController.class);

  @Override
  public Result<ValidationResultDto> createValidation(ValidationDto validation) {

    log.info("creating validation with content: {}", validation.getContent());

    ValidationResultDto resultDto = new ValidationResultDto();
    resultDto.setContent(validation.getContent());
    resultDto.setResultContent(validation.getContent());

    return Result.success(resultDto);
  }

}
