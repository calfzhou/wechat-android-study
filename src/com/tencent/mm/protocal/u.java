package com.tencent.mm.protocal;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class u
{
  private String ffY = "";
  private String host = "";
  private int port = 80;
  private int type = 0;

  public u()
  {
  }

  public u(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    this.type = paramInt1;
    this.ffY = paramString1;
    this.port = paramInt2;
    this.host = paramString2;
  }

  public static String aX(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    u localu;
    for (String str = ""; localIterator.hasNext(); str = str + localu.toString() + "|")
      localu = (u)localIterator.next();
    return str;
  }

  public static v bz(String paramString1, String paramString2)
  {
    z.d("!32@/B4Tb64lLpJUS70B+JdEOmn2M5eugCl+", "parsing network control params:");
    z.d("!32@/B4Tb64lLpJUS70B+JdEOmn2M5eugCl+", "ports = " + paramString1);
    z.d("!32@/B4Tb64lLpJUS70B+JdEOmn2M5eugCl+", "timeouts = " + paramString2);
    int[] arrayOfInt1 = ch.xt(paramString1);
    int[] arrayOfInt2 = ch.xt(paramString2);
    if ((arrayOfInt2 == null) || (arrayOfInt2.length < 2))
    {
      arrayOfInt2 = new int[] { 0, 0 };
      z.e("!32@/B4Tb64lLpJUS70B+JdEOmn2M5eugCl+", "invalid timeouts");
    }
    return new v(arrayOfInt1, (int)(1000L * arrayOfInt2[0]), (int)(1000L * arrayOfInt2[1]));
  }

  private static u wn(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    if (arrayOfString.length < 4)
      return null;
    u localu = new u();
    try
    {
      localu.type = Integer.parseInt(arrayOfString[0]);
      localu.ffY = ch.ja(arrayOfString[1]);
      localu.port = Integer.parseInt(arrayOfString[2]);
      localu.host = ch.ja(arrayOfString[3]);
      return localu;
    }
    catch (NumberFormatException localNumberFormatException)
    {
    }
    return null;
  }

  public static List wo(String paramString)
  {
    LinkedList localLinkedList = new LinkedList();
    if (ch.jb(paramString));
    while (true)
    {
      return localLinkedList;
      try
      {
        String[] arrayOfString = paramString.split("\\|");
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          u localu = wn(arrayOfString[j]);
          if (localu != null)
            localLinkedList.add(localu);
        }
      }
      catch (Exception localException)
      {
        z.d("!32@/B4Tb64lLpJUS70B+JdEOmn2M5eugCl+", "unserialize split failed str[%s]", new Object[] { paramString });
      }
    }
    return localLinkedList;
  }

  public final String aGR()
  {
    return this.ffY;
  }

  public final String getHost()
  {
    return this.host;
  }

  public final String toString()
  {
    return this.type + "," + this.ffY + "," + this.port + "," + this.host;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.u
 * JD-Core Version:    0.6.2
 */