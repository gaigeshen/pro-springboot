package work.gaigeshen.pro.springboot.comment.service.remote;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;

/**
 *
 * @author gaigeshen
 */
@Component
public class DefaultValidationService implements ValidationService {

  private static final Logger log = LoggerFactory.getLogger(DefaultValidationService.class);

  @Override
  public Result<ValidationResultDto> createValidation(ValidationDto validation) {

    log.info("creating validation with content by default validation service: {}", validation.getContent());

    ValidationResultDto resultDto = new ValidationResultDto();
    resultDto.setContent(validation.getContent());
    resultDto.setResultContent(validation.getContent() + " [fallback]");

    return Result.success(resultDto);
  }
}
