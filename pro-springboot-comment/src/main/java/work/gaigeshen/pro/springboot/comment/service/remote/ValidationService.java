package work.gaigeshen.pro.springboot.comment.service.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;

/**
 *
 * @author gaigeshen
 */
@FeignClient(name = "pro-springboot-validation", path = "validations", contextId = "validationService", fallback = DefaultValidationService.class)
public interface ValidationService {

  @PostMapping
  Result<ValidationResultDto> createValidation(@RequestBody ValidationDto validation);

}
