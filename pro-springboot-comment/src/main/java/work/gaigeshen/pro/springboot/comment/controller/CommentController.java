package work.gaigeshen.pro.springboot.comment.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.gaigeshen.pro.springboot.comment.dto.CommentDto;
import work.gaigeshen.pro.springboot.comment.dto.CommentResultDto;
import work.gaigeshen.pro.springboot.comment.service.CommentService;
import work.gaigeshen.pro.springboot.commons.web.Result;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/comments")
@RestController
public class CommentController {

  private static final Logger log = LoggerFactory.getLogger(CommentController.class);

  private final CommentService commentService;

  public CommentController(CommentService commentService) {
    this.commentService = commentService;
  }

  @SentinelResource(value = "comments-resource", fallback = "createCommentFallback", blockHandler = "createCommentBlockHandler")
  @PostMapping
  public Result<CommentResultDto> createComment(@RequestBody CommentDto comment) {
    CommentResultDto resultDto = commentService.createComment(comment);
    return Result.success(resultDto);
  }

  public Result<CommentResultDto> createCommentFallback(CommentDto comment, Throwable e) {
    CommentResultDto resultDto = new CommentResultDto();
    resultDto.setUserId(comment.getUserId());
    resultDto.setArticleId(comment.getArticleId());
    resultDto.setContent(comment.getContent());
    resultDto.setResultContent(comment.getContent() + " [controller fallback]");

    log.error(e.getMessage(), e);

    return Result.success(resultDto);
  }

  public Result<CommentResultDto> createCommentBlockHandler(CommentDto comment, BlockException e) {
    CommentResultDto resultDto = new CommentResultDto();
    resultDto.setUserId(comment.getUserId());
    resultDto.setArticleId(comment.getArticleId());
    resultDto.setContent(comment.getContent());
    resultDto.setResultContent(comment.getContent() + " [controller block handler]");

    log.error("rule: " + e.getRule(), e);

    return Result.success(resultDto);
  }
}
