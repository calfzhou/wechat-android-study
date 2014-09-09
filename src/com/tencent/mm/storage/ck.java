package com.tencent.mm.storage;

public final class ck
{
  private String ikT;
  private String user;

  public ck(String paramString)
  {
    int i = paramString.indexOf("@");
    if (i >= 0)
    {
      this.user = paramString.substring(0, i);
      this.ikT = paramString.substring(i);
      return;
    }
    this.user = paramString;
    this.ikT = "";
  }

  public final String zW(String paramString)
  {
    if (this.ikT != null)
      paramString = this.ikT;
    return paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ck
 * JD-Core Version:    0.6.2
 */