package com.tencent.mm.ui.chatting;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class dq
{
  public int color;
  public int joW;
  public boolean joX;
  public boolean joY;
  public int jpa;
  public int jpb;

  public static dq j(Map paramMap, String paramString)
  {
    String str1 = (String)paramMap.get(paramString + ".range");
    if (ch.jb(str1))
    {
      z.e("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom fail, range is null");
      return null;
    }
    if ((str1.length() < 5) || (str1.charAt(0) != '{') || (str1.charAt(-1 + str1.length()) != '}') || (!str1.contains(",")))
    {
      z.e("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom fail, range wrong format, range = " + str1);
      return null;
    }
    z.d("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom, range = " + str1);
    String[] arrayOfString = str1.substring(1, -1 + str1.length()).split(",");
    if ((arrayOfString == null) || (arrayOfString.length != 2))
    {
      z.e("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom fail, range wrong format, strs array length = " + arrayOfString.length);
      return null;
    }
    dq localdq = new dq();
    while (true)
    {
      String str2;
      try
      {
        localdq.jpa = Integer.parseInt(arrayOfString[0]);
        localdq.jpb = (localdq.jpa + Integer.parseInt(arrayOfString[1]));
        str2 = (String)paramMap.get(paramString + ".font");
        if (ch.jb(str2))
        {
          z.d("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom, font is null, use default value");
          str3 = "m";
          localdq.joX = do.Cf(str3);
          localdq.joY = do.Cg(str3);
          localdq.joW = do.Ch(str3);
          localdq.color = do.Ci((String)paramMap.get(paramString + ".color"));
          return localdq;
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpL/n4OIDAhdwePk0dXxF5lw", "parseFrom fail, ex = " + localException.getMessage());
        return null;
      }
      String str3 = str2.toLowerCase();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dq
 * JD-Core Version:    0.6.2
 */