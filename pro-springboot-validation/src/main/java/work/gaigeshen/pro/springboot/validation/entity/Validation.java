package work.gaigeshen.pro.springboot.validation.entity;

import java.util.Date;

/**
 *
 * @author gaigeshen
 */
public class Validation {

  private Long id;

  private String content;

  private String resultContent;

  private Date createTime;

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

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}
