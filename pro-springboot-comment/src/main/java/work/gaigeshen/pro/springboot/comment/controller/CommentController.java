package work.gaigeshen.pro.springboot.comment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gaigeshen
 */
@RequestMapping("/comments")
@RestController
public class CommentController {

  @PostMapping
  public Result createComment(@RequestBody CommentDto comment) {
    return Result.success();
  }

}
