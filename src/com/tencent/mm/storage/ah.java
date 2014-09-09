package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class ah
{
  public String cDa;
  public String cEh;
  public String cHL;
  public String dFV;
  public long dxj;
  public String id;
  public int ijk;
  public int ijl;
  public int ijm;
  public int ijn;
  public String ijo = "";

  public static ah a(Map paramMap, String paramString1, String paramString2)
  {
    if (paramMap == null)
      return null;
    ah localah = new ah();
    localah.ijo = paramString2;
    localah.cEh = paramString1;
    localah.id = ((String)paramMap.get(".msg.emoji.$idbuffer"));
    localah.dFV = ((String)paramMap.get(".msg.emoji.$fromusername"));
    String str = (String)paramMap.get(".msg.emoji.$androidmd5");
    localah.cHL = str;
    if (str == null)
      localah.cHL = ((String)paramMap.get(".msg.emoji.$md5"));
    try
    {
      localah.ijk = Integer.valueOf((String)paramMap.get(".msg.emoji.$type")).intValue();
      if (paramMap.get(".msg.emoji.$androidlen") != null)
        localah.ijl = Integer.valueOf((String)paramMap.get(".msg.emoji.$androidlen")).intValue();
      while (true)
      {
        if (paramMap.get(".msg.gameext.$type") != null)
          localah.ijm = Integer.valueOf((String)paramMap.get(".msg.gameext.$type")).intValue();
        if (paramMap.get(".msg.gameext.$content") != null)
          localah.ijn = Integer.valueOf((String)paramMap.get(".msg.gameext.$content")).intValue();
        if (paramMap.get(".msg.emoji.$productid") != null)
          localah.cDa = ((String)paramMap.get(".msg.emoji.$productid"));
        z.d("!44@/B4Tb64lLpKW6XSoHkFWUALbfQePvuhUA6eVCF+4bVs=", "id:" + localah.id + " md5:" + localah.cHL + " emojitype:" + localah.ijk + " emojilen:" + localah.ijl + " gametype:" + localah.ijm + " gamecontent:" + localah.ijn + " productid:" + localah.cDa);
        return localah;
        if (paramMap.get(".msg.emoji.$len") != null)
          localah.ijl = Integer.valueOf((String)paramMap.get(".msg.emoji.$len")).intValue();
      }
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ah
 * JD-Core Version:    0.6.2
 */