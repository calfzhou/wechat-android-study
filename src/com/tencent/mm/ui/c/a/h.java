package com.tencent.mm.ui.c.a;

public final class h extends Throwable
{
  private int ejr = 0;
  private String jHH;

  public h(String paramString)
  {
    super(paramString);
  }

  public h(String paramString1, String paramString2, int paramInt)
  {
    super(paramString1);
    this.jHH = paramString2;
    this.ejr = paramInt;
  }

  public final String aYC()
  {
    return this.jHH;
  }

  public final int getErrorCode()
  {
    return this.ejr;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.h
 * JD-Core Version:    0.6.2
 */