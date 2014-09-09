package com.tencent.mm.storage;

import java.util.ArrayList;

public final class ba
{
  public String cEh;
  public String ikc;
  public ArrayList ikd = new ArrayList();
  public int ike;
  public long ikf = 0L;

  public ba(String paramString1, String paramString2, ar paramar)
  {
    this(paramString1, paramString2, paramar, 0);
  }

  public ba(String paramString1, String paramString2, ar paramar, int paramInt)
  {
    this.cEh = paramString1;
    this.ikc = paramString2;
    this.ike = paramInt;
    if (paramar != null)
      this.ikd.add(paramar);
  }

  static boolean B(ar paramar)
  {
    return (paramar != null) && (paramar.jK() == 0) && (paramar.getStatus() == 3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ba
 * JD-Core Version:    0.6.2
 */