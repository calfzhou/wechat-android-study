package com.tencent.mm.sdk.platformtools;

public final class n
{
  public static String ecM = "]]>";
  StringBuffer ecR = new StringBuffer();
  String iDw = "";

  public n()
  {
  }

  public n(String paramString)
  {
    this.iDw = paramString;
    jP(this.iDw);
  }

  private void jP(String paramString)
  {
    this.ecR.append("<" + paramString + ">");
  }

  private void jQ(String paramString)
  {
    this.ecR.append("</" + paramString + ">");
  }

  public final String aNc()
  {
    if (!ch.jb(this.iDw))
    {
      jQ(this.iDw);
      this.iDw = "";
    }
    return this.ecR.toString();
  }

  public final void ag(String paramString1, String paramString2)
  {
    jP(paramString1);
    if (ch.jb(paramString2));
    while (true)
    {
      jQ(paramString1);
      return;
      if (paramString2.contains(ecM))
        this.ecR.append("<![CDATA[" + ch.xv(paramString2) + "]]>");
      else
        this.ecR.append("<![CDATA[" + paramString2 + "]]>");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.n
 * JD-Core Version:    0.6.2
 */