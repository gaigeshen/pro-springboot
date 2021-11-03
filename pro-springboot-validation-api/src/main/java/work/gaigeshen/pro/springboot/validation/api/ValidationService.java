package work.gaigeshen.pro.springboot.validation.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import work.gaigeshen.pro.springboot.validation.api.dto.Result;
import work.gaigeshen.pro.springboot.validation.api.dto.ValidationDto;
import work.gaigeshen.pro.springboot.validation.api.dto.ValidationResultDto;

/**
 *
 * @author gaigeshen
 */
@FeignClient(name = "pro-springboot-validation", path = "validations", contextId = "validationService")
public interface ValidationService {

  @PostMapping
  Result<ValidationResultDto> createValidation(@RequestBody ValidationDto validation);

}
