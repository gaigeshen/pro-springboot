package work.gaigeshen.pro.springboot.comment.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import work.gaigeshen.pro.springboot.comment.entity.Comment;

/**
 *
 * @author gaigeshen
 */
@Repository
public class CommentRepositoryImpl implements CommentRepository {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public CommentRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void createComment(Comment comment) {

    KeyHolder keyHolder = new GeneratedKeyHolder();

    MapSqlParameterSource parameters = new MapSqlParameterSource();
    parameters.addValue("userId", comment.getUserId());
    parameters.addValue("articleId", comment.getArticleId());
    parameters.addValue("content", comment.getContent());
    parameters.addValue("validationId", comment.getValidationId());
    parameters.addValue("createTime", comment.getCreateTime());

    jdbcTemplate.update("insert into comment (user_id, article_id, content, validation_id, create_time) values (:userId, :articleId, :content, :validationId, :createTime)",
            parameters, keyHolder);

    comment.setId(keyHolder.getKeyAs(Long.class));
  }
}
