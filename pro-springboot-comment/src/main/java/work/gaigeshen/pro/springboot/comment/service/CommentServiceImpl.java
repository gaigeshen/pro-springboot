package work.gaigeshen.pro.springboot.comment.service;

import org.springframework.stereotype.Service;
import work.gaigeshen.pro.springboot.comment.dto.CommentDto;
import work.gaigeshen.pro.springboot.comment.dto.CommentResultDto;
import work.gaigeshen.pro.springboot.comment.service.remote.ValidationService;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;

/**
 *
 * @author gaigeshen
 */
@Service
public class CommentServiceImpl implements CommentService {

  private final ValidationService validationService;

  public CommentServiceImpl(ValidationService validationService) {
    this.validationService = validationService;
  }

  @Override
  public CommentResultDto createComment(CommentDto comment) {

    ValidationDto validation = new ValidationDto();
    validation.setContent(comment.getContent());

    Result<ValidationResultDto> result = validationService.createValidation(validation);

    ValidationResultDto validationResultDto = result.getData();

    CommentResultDto resultDto = new CommentResultDto();
    resultDto.setUserId(comment.getUserId());
    resultDto.setArticleId(comment.getArticleId());
    resultDto.setContent(comment.getContent());
    resultDto.setResultContent(validationResultDto.getResultContent());
    return resultDto;
  }
}
