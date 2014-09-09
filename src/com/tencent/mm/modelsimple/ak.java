package com.tencent.mm.modelsimple;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.Map;

public final class ak
{
  public LinkedList dDb;
  public String desc;
  public String title;

  private static LinkedList b(Map paramMap, String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i < 1000; i++)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(".action");
      Object localObject;
      if (i > 0)
        localObject = Integer.valueOf(i);
      aj localaj;
      while (true)
      {
        String str = localObject;
        try
        {
          int j = Integer.valueOf((String)paramMap.get(str + ".$type")).intValue();
          localaj = new aj();
          if (j == 5)
          {
            localaj.dCZ = ch.ja((String)paramMap.get(str + ".iconurl"));
            localaj.desc = ch.ja((String)paramMap.get(str + ".desc"));
            localaj.dDa = ch.ja((String)paramMap.get(str + ".link"));
            if ((!ch.jb(localaj.dCZ)) || (!ch.jb(localaj.desc)) || (!ch.jb(localaj.dDa)))
              break label293;
            return localLinkedList;
            localObject = "";
          }
        }
        catch (Exception localException)
        {
          z.w("!44@/B4Tb64lLpK+IBX8XDgnvixiFaHlmIL8X17EHTvJycQ=", "parseVendorsFromXml() " + localException.getMessage());
          return localLinkedList;
        }
      }
      return localLinkedList;
      label293: localLinkedList.add(localaj);
    }
    return localLinkedList;
  }

  public static ak hw(String paramString)
  {
    if (paramString == null);
    Map localMap;
    do
    {
      return null;
      localMap = x.bB(paramString, "recommend");
    }
    while (localMap == null);
    LinkedList localLinkedList = b(localMap, ".recommend");
    ak localak = new ak();
    localak.title = ch.ja((String)localMap.get(".recommend.title"));
    localak.desc = ch.ja((String)localMap.get(".recommend.desc"));
    localak.dDb = localLinkedList;
    return localak;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ak
 * JD-Core Version:    0.6.2
 */