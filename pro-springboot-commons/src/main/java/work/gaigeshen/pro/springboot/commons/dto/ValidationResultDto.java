package work.gaigeshen.pro.springboot.commons.dto;

/**
 *
 * @author gaigeshen
 */
public class ValidationResultDto {

  private Long id;

  private String content;

  private String resultContent;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
