package com.tencent.mm.compatible.loader;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public final class k extends DefaultHandler
{
  boolean dOn = false;
  String dOo = null;
  ArrayList dOp;
  i dOq;

  public final void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.dOn)
    {
      this.dOo = new String(paramArrayOfChar, paramInt1, paramInt2);
      this.dOn = false;
    }
  }

  public final void endElement(String paramString1, String paramString2, String paramString3)
  {
    this.dOn = false;
    if (paramString3.equalsIgnoreCase("name"))
      this.dOq.cA(this.dOo);
    do
    {
      return;
      if (paramString3.equalsIgnoreCase("url"))
      {
        this.dOq.cB(this.dOo);
        return;
      }
      if (paramString3.equalsIgnoreCase("md5"))
      {
        this.dOq.cC(this.dOo);
        return;
      }
      if (paramString3.equalsIgnoreCase("version"))
      {
        this.dOq.cD(this.dOo);
        return;
      }
      if (paramString3.equalsIgnoreCase("size"))
      {
        this.dOq.ch(Integer.valueOf(this.dOo).intValue());
        return;
      }
      if (paramString3.equalsIgnoreCase("downloadType"))
      {
        this.dOq.cj(Integer.valueOf(this.dOo).intValue());
        return;
      }
    }
    while (!paramString3.equalsIgnoreCase("Plugin"));
    this.dOp.add(this.dOq.nD());
  }

  public final void startElement(String paramString1, String paramString2, String paramString3, Attributes paramAttributes)
  {
    this.dOn = true;
    if (paramString3.equalsIgnoreCase("Plugins"))
      this.dOp = new ArrayList();
    while (!paramString3.equalsIgnoreCase("Plugin"))
      return;
    this.dOq = new i();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.k
 * JD-Core Version:    0.6.2
 */