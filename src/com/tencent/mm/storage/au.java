package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class au
{
  private String content = "";
  private String dCB = "";
  private boolean eDP = false;
  private String fqR;
  private String ijK = "";
  private String title = "";

  public static au zo(String paramString)
  {
    au localau = new au();
    Map localMap = x.bB(paramString, "msg");
    if (localMap != null);
    try
    {
      localau.title = ((String)localMap.get(".msg.pushmail.content.subject"));
      localau.content = ((String)localMap.get(".msg.pushmail.content.digest"));
      localau.dCB = ((String)localMap.get(".msg.pushmail.content.sender"));
      localau.ijK = ((String)localMap.get(".msg.pushmail.waplink"));
      localau.eDP = ch.ja((String)localMap.get(".msg.pushmail.content.attach")).equalsIgnoreCase("true");
      localau.fqR = ((String)localMap.get(".msg.pushmail.mailid"));
      return localau;
    }
    catch (Exception localException)
    {
    }
    return localau;
  }

  public final String aKd()
  {
    return this.ijK;
  }

  public final boolean aKe()
  {
    return this.eDP;
  }

  public final String aKf()
  {
    return this.fqR;
  }

  public final String getContent()
  {
    return this.content;
  }

  public final String getTitle()
  {
    return this.title;
  }

  public final String zj()
  {
    return this.dCB;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.au
 * JD-Core Version:    0.6.2
 */