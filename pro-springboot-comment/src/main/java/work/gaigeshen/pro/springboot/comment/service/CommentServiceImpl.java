package work.gaigeshen.pro.springboot.comment.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import work.gaigeshen.pro.springboot.comment.dto.CommentDto;
import work.gaigeshen.pro.springboot.comment.dto.CommentResultDto;
import work.gaigeshen.pro.springboot.comment.entity.Comment;
import work.gaigeshen.pro.springboot.comment.repository.CommentRepository;
import work.gaigeshen.pro.springboot.comment.service.remote.ValidationService;
import work.gaigeshen.pro.springboot.commons.dto.ValidationDto;
import work.gaigeshen.pro.springboot.commons.dto.ValidationResultDto;
import work.gaigeshen.pro.springboot.commons.web.Result;

import java.util.Date;

/**
 *
 * @author gaigeshen
 */
@Service
public class CommentServiceImpl implements CommentService {

  private final CommentRepository commentRepository;

  private final ValidationService validationService;

  public CommentServiceImpl(CommentRepository commentRepository, ValidationService validationService) {
    this.commentRepository = commentRepository;
    this.validationService = validationService;
  }

  @GlobalTransactional
  @Override
  public CommentResultDto createComment(CommentDto comment) {

    ValidationDto validation = new ValidationDto();
    validation.setContent(comment.getContent());

    Result<ValidationResultDto> result = validationService.createValidation(validation);
    ValidationResultDto validationResultDto = result.getData();

    Comment newComment = new Comment();
    newComment.setUserId(comment.getUserId());
    newComment.setArticleId(comment.getArticleId());
    newComment.setContent(comment.getContent());
    newComment.setValidationId(validationResultDto.getId());
    newComment.setCreateTime(new Date());
    commentRepository.createComment(newComment);

    int a = 1 / 0;

    CommentResultDto resultDto = new CommentResultDto();
    resultDto.setId(newComment.getId());
    resultDto.setUserId(newComment.getUserId());
    resultDto.setArticleId(newComment.getArticleId());
    resultDto.setContent(newComment.getContent());
    resultDto.setCreateTime(newComment.getCreateTime());

    return resultDto;
  }
}
