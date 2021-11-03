package work.gaigeshen.pro.springboot.comment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import work.gaigeshen.pro.springboot.comment.dto.CommentDto;
import work.gaigeshen.pro.springboot.comment.dto.CommentResultDto;
import work.gaigeshen.pro.springboot.comment.service.CommentService;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/comments")
@RestController
public class CommentController {

  private final CommentService commentService;

  public CommentController(CommentService commentService) {
    this.commentService = commentService;
  }

  @PostMapping
  public Result<CommentResultDto> createComment(@RequestBody CommentDto comment) {
    CommentResultDto resultDto = commentService.createComment(comment);
    return Result.success(resultDto);
  }

}
