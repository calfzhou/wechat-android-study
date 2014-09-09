package com.tencent.mm.plugin.gwallet.a;

public final class k
{
  int fdS;
  String fdT;

  public k(int paramInt, String paramString)
  {
    this.fdS = paramInt;
    if ((paramString == null) || (paramString.trim().length() == 0))
    {
      this.fdT = b.hV(paramInt);
      return;
    }
    this.fdT = (paramString + " (response: " + b.hV(paramInt) + ")");
  }

  public final int Vo()
  {
    return this.fdS;
  }

  public final boolean Vp()
  {
    return this.fdS == 0;
  }

  public final boolean Vq()
  {
    return this.fdS == 7;
  }

  public final String toString()
  {
    return "IabResult: " + this.fdT;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.k
 * JD-Core Version:    0.6.2
 */