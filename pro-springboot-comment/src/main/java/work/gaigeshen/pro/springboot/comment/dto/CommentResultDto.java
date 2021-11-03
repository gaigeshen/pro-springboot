package work.gaigeshen.pro.springboot.comment.dto;

/**
 *
 * @author gaigeshen
 */
public class CommentResultDto {

  private Long userId;

  private Long articleId;

  private String content;

  private String resultContent;

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

  public String getResultContent() {
    return resultContent;
  }

  public void setResultContent(String resultContent) {
    this.resultContent = resultContent;
  }
}
