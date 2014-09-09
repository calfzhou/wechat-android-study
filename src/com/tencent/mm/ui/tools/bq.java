package com.tencent.mm.ui.tools;

import com.tencent.mm.sdk.platformtools.y;

final class bq
{
  private String jQC;
  private String jQD;
  private String jQE;

  bq(String paramString1, String paramString2, String paramString3)
  {
    this.jQC = paramString1;
    this.jQD = paramString2;
    this.jQE = paramString3;
  }

  public final String getDisplayName()
  {
    String str = y.aGW();
    if (str.equals("zh_CN"))
      return this.jQC;
    if ((str.equals("zh_TW")) || (str.equals("zh_HK")))
      return this.jQD;
    return this.jQE;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.bq
 * JD-Core Version:    0.6.2
 */