package com.github.doobo.weight;

import java.util.UUID;

public class WeightParent<T> implements java.io.Serializable,Cloneable {

  /**
   * 唯一键
   */
  private String uniqueKey;

  /**
   * 权重
   */
  private int count = 1;

  /**
   * 最小边界
   */
  private int min;

  /**
   * 最大边界
   */
  private int max;

  /**
   * 结果物
   */
  private transient T t;

  public WeightParent() {
    uniqueKey = UUID.randomUUID().toString();
  }

  public WeightParent(T t,int count) {
    uniqueKey = UUID.randomUUID().toString();
    this.t = t;
    this.count = count;
  }

  public WeightParent(int count) {
      this.count = count;
  }

  public int getCount() {
      return count;
  }

  public void setCount(int count) {
      this.count = count;
  }

  public int getMin() {
    return min;
  }

  public void setMin(int min) {
    this.min = min;
  }

  public int getMax() {
    return max;
  }

  public void setMax(int max) {
    this.max = max;
  }

  public String getUniqueKey() {
    return uniqueKey;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    WeightParent<T> weightParent = (WeightParent<T>)super.clone();
    weightParent.setT(this.getT());
    weightParent.setMax(this.getMax());
    weightParent.setMin(this.getMin());
    weightParent.setCount(this.getCount());
    return weightParent;
  }
}
