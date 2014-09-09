package com.tencent.mm.pluginsdk.model;

public final class r
{
  private int _id;
  private String cDa;
  private String gZK;
  private int gZL;

  r(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    this._id = paramInt1;
    this.cDa = paramString1;
    this.gZK = paramString2;
    this.gZL = paramInt2;
  }

  public final String JS()
  {
    return this.cDa;
  }

  public final int avH()
  {
    return this.gZL;
  }

  public final String avI()
  {
    return this.gZK;
  }

  public final String toString()
  {
    return "id:" + this._id + ";productId:" + this.cDa + ";full:" + this.gZK + ";productState:" + this.gZL;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.r
 * JD-Core Version:    0.6.2
 */