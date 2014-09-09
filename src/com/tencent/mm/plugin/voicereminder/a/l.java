package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.a.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class l
{
  private static final d dju = new d(100);
  public int dQW;
  public String dQX;
  public String dQY;
  public int gSK;
  public int gSL;
  public String gSM;
  public int gSN;
  public int gSO;
  public int gSP;
  public int gSQ;

  public static l tg(String paramString)
  {
    l locall1;
    if (ch.jb(paramString))
      locall1 = null;
    int j;
    do
    {
      return locall1;
      int i = paramString.indexOf('<');
      if (i > 0)
        paramString = paramString.substring(i);
      j = paramString.hashCode();
      locall1 = (l)dju.get(Integer.valueOf(j));
    }
    while (locall1 != null);
    Map localMap = x.bB(paramString, "msg");
    if (localMap == null)
    {
      z.e("!56@/B4Tb64lLpLcQwGQMRj/JcCiXnqe7QDw59ljz32/TwrYqce0E1yKAg==", "parse msg failed");
      return null;
    }
    try
    {
      l locall2 = new l();
      locall2.dQW = ch.getInt((String)localMap.get(".msg.appmsg.appattach.totallen"), 0);
      locall2.dQY = ((String)localMap.get(".msg.appmsg.appattach.attachid"));
      locall2.dQX = ((String)localMap.get(".msg.appmsg.appattach.fileext"));
      locall2.gSK = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$remindtime"), 0);
      locall2.gSL = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$remindid"), 0);
      locall2.gSM = ((String)localMap.get(".msg.appmsg.voicecmd.reminder.$remindattachid"));
      locall2.gSN = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$remindattachtotallen"), 0);
      locall2.gSO = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$remindformat"), 0);
      locall2.gSP = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$originformat"), 0);
      locall2.gSQ = ch.getInt((String)localMap.get(".msg.appmsg.voicecmd.reminder.$msgsvrid"), 0);
      dju.b(Integer.valueOf(j), locall2);
      return locall2;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpLcQwGQMRj/JcCiXnqe7QDw59ljz32/TwrYqce0E1yKAg==", "parse amessage xml failed");
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.l
 * JD-Core Version:    0.6.2
 */