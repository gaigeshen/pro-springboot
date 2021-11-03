package work.gaigeshen.pro.springboot.validation.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/validations")
@RestController
public class ValidationController {

  private static final Logger log = LoggerFactory.getLogger(ValidationController.class);

  @PostMapping
  public Result<ValidationResultDto> createValidation(@RequestBody ValidationDto validation) {

    log.info("creating validation with content: {}", validation.getContent());

    ValidationResultDto resultDto = new ValidationResultDto();
    resultDto.setContent(validation.getContent());
    resultDto.setResultContent(validation.getContent());

    return Result.success(resultDto);
  }

}
