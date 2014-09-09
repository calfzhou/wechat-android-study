package com.qq.taf.jce.dynamic;

public class StringField extends JceField
{
  private String data;

  StringField(String paramString, int paramInt)
  {
    super(paramInt);
    this.data = paramString;
  }

  public String get()
  {
    return this.data;
  }

  public void set(String paramString)
  {
    this.data = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.qq.taf.jce.dynamic.StringField
 * JD-Core Version:    0.6.2
 */