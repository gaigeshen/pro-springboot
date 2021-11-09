package work.gaigeshen.pro.springboot.comment.entity;

import java.util.Date;

/**
 *
 * @author gaigeshen
 */
public class Comment {

  private Long id;

  private Long userId;

  private Long articleId;

  private String content;

  private Long validationId;

  private Date createTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Long getArticleId() {
    return articleId;
  }

  public void setArticleId(Long articleId) {
    this.articleId = articleId;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getValidationId() {
    return validationId;
  }

  public void setValidationId(Long validationId) {
    this.validationId = validationId;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
