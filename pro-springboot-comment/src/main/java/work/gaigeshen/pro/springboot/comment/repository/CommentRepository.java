package work.gaigeshen.pro.springboot.comment.repository;

import work.gaigeshen.pro.springboot.comment.entity.Comment;

/**
 *
 * @author gaigeshen
 */
public interface CommentRepository {

  void createComment(Comment comment);
}
