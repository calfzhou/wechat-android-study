package com.tencent.mm.plugin.gwallet.a;

public final class a extends Exception
{
  k fdz;

  public a(int paramInt, String paramString)
  {
    this(new k(paramInt, paramString));
  }

  private a(k paramk)
  {
    this(paramk, null);
  }

  private a(k paramk, Exception paramException)
  {
    super(paramk.fdT, paramException);
    this.fdz = paramk;
  }

  public a(String paramString, Exception paramException)
  {
    this(new k(-1001, paramString), paramException);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.a
 * JD-Core Version:    0.6.2
 */