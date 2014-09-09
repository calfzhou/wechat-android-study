package com.tencent.mm.model;

public final class bs
{
  private int cCB = 57005;
  private String data = null;
  private int type = 57005;

  public bs(int paramInt1, int paramInt2, String paramString)
  {
    this.type = paramInt1;
    this.cCB = paramInt2;
    this.data = paramString;
  }

  public final String getData()
  {
    return this.data;
  }

  public final int getType()
  {
    return this.type;
  }

  public final int rm()
  {
    return this.cCB;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bs
 * JD-Core Version:    0.6.2
 */