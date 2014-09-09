package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class dp
  implements Comparable
{
  public int color;
  public int joW;
  public boolean joX;
  public boolean joY;
  public String joZ;
  public int offset;

  public static dp i(Map paramMap, String paramString)
  {
    dp localdp = new dp();
    while (true)
    {
      String str1;
      try
      {
        localdp.offset = Integer.parseInt((String)paramMap.get(paramString + ".offset"));
        str1 = (String)paramMap.get(paramString + ".font");
        if (ch.jb(str1))
        {
          z.d("!32@/B4Tb64lLpI9fuE9aJHdASDRltduz/PZ", "parseFrom, font is null, use default value");
          str2 = "m";
          localdp.joX = do.Cf(str2);
          localdp.joY = do.Cg(str2);
          localdp.joW = do.Ch(str2);
          localdp.color = do.Ci((String)paramMap.get(paramString + ".color"));
          localdp.joZ = ((String)paramMap.get(paramString + ".chars"));
          if (!ch.jb(localdp.joZ))
            break;
          z.e("!32@/B4Tb64lLpI9fuE9aJHdASDRltduz/PZ", "parseFrom fail, chars is null");
          return null;
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpI9fuE9aJHdASDRltduz/PZ", "parseFrom fail, ex = " + localException.getMessage());
        return null;
      }
      String str2 = str1.toLowerCase();
    }
    return localdp;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dp
 * JD-Core Version:    0.6.2
 */