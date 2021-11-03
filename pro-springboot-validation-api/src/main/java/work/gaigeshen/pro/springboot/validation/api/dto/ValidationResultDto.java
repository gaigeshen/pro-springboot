package work.gaigeshen.pro.springboot.validation.api.dto;

/**
 *
 * @author gaigeshen
 */
public class ValidationResultDto {

  private String content;

  private String resultContent;

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
