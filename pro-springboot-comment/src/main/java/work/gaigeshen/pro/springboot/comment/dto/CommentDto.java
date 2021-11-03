package work.gaigeshen.pro.springboot.comment.dto;


/**
 *
 * @author gaigeshen
 */
public class CommentDto {

  private Long userId;

  private Long articleId;

  private String content;

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
}
