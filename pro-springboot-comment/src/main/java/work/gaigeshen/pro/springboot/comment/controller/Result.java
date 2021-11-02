package work.gaigeshen.pro.springboot.comment.controller;

/**
 *
 * @author gaigeshen
 */
public class Result {

  private int code;
  private String message;

  private Object data;

  public static Result success() {
    return success(null);
  }

  public static Result success(Object data) {
    return new Result(0, null, data);
  }

  public static Result failure(int code) {
    return failure(code, null);
  }

  public static Result failure(int code, String message) {
    return failure(code, message, null);
  }

  public static Result failure(int code, String message, Object data) {
    return new Result(code, message, data);
  }

  private Result(int code, String message, Object data) {
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

  public Object getData() {
    return data;
  }
}
