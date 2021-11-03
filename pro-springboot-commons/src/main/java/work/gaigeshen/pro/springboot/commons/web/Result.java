package work.gaigeshen.pro.springboot.commons.web;

/**
 *
 * @author gaigeshen
 */
public class Result<D> {

  private int code;
  private String message;

  private D data;

  public static <D> Result<D> success() {
    return success(null);
  }

  public static <D> Result<D> success(D data) {
    return new Result<>(0, null, data);
  }

  public static <D> Result<D> failure(int code) {
    return failure(code, null);
  }

  public static <D> Result<D> failure(int code, String message) {
    return failure(code, message, null);
  }

  public static <D> Result<D> failure(int code, String message, D data) {
    return new Result<>(code, message, data);
  }

  private Result(int code, String message, D data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  private Result() { }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

  public D getData() {
    return data;
  }
}
