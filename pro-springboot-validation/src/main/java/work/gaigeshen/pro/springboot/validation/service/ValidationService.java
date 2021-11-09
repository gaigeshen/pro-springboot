package work.gaigeshen.pro.springboot.validation.service;

import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;

/**
 *
 * @author gaigeshen
 */
public interface ValidationService {

  ValidationResultDto createValidation(ValidationDto validation);

}
