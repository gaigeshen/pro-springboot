package work.gaigeshen.pro.springboot.validation.repository;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import work.gaigeshen.pro.springboot.validation.entity.Validation;

/**
 *
 * @author gaigeshen
 */
@Repository
public class ValidationRepositoryImpl implements ValidationRepository {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public ValidationRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void createValidation(Validation validation) {

    KeyHolder keyHolder = new GeneratedKeyHolder();

    MapSqlParameterSource parameters = new MapSqlParameterSource();
    parameters.addValue("content", validation.getContent());
    parameters.addValue("resultContent", validation.getResultContent());
    parameters.addValue("createTime", validation.getCreateTime());

    jdbcTemplate.update("insert into validation (content, result_content, create_time) values (:content, :resultContent, :createTime)",
            parameters, keyHolder);

    validation.setId(keyHolder.getKeyAs(Long.class));
  }
}
