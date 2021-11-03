package work.gaigeshen.pro.springboot.comment.service;

import work.gaigeshen.pro.springboot.comment.dto.CommentDto;
import work.gaigeshen.pro.springboot.comment.dto.CommentResultDto;

/**
 * @author gaigeshen
 */
public interface CommentService {

  CommentResultDto createComment(CommentDto comment);

}
