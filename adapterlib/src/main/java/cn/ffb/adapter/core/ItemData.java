package cn.ffb.adapter.core;

/**
 * Created by lingfei on 2017/5/12.
 */

public class ItemData {
  private Object data;

  public ItemData(Object data) {
    this.data = data;
  }

  public <T> T getData() {
    return (T) data;
  }

  public boolean isInstance(Object data) {
    return this.data.getClass() == data.getClass();
  }
}
