package work.gaigeshen.pro.springboot.validation.service;

import org.springframework.stereotype.Service;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.validation.entity.Validation;
import work.gaigeshen.pro.springboot.validation.repository.ValidationRepository;

import java.util.Date;

/**
 *
 * @author gaigeshen
 */
@Service
public class ValidationServiceImpl implements ValidationService {

  private final ValidationRepository validationRepository;

  public ValidationServiceImpl(ValidationRepository validationRepository) {
    this.validationRepository = validationRepository;
  }

  @Override
  public ValidationResultDto createValidation(ValidationDto validation) {

    Validation newValidation = new Validation();
    newValidation.setContent(validation.getContent());
    newValidation.setResultContent(validation.getContent());
    newValidation.setCreateTime(new Date());

    validationRepository.createValidation(newValidation);

    ValidationResultDto resultDto = new ValidationResultDto();
    resultDto.setId(newValidation.getId());
    resultDto.setContent(newValidation.getContent());
    resultDto.setResultContent(newValidation.getContent());

    return resultDto;
  }
}
