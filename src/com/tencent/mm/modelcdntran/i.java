package com.tencent.mm.modelcdntran;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.a.f;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class i
{
  public static int drZ = 1;
  public static int dsa = 2;
  public static int dsb = 3;
  public static int dsc = -1;
  public static int dsd = 3;
  public static int dse = 4;
  public static int dsf = 5;
  public static int dsg = 1;
  public static int dsh = 2;
  public static int dsi = -10001;
  public static int dsj = -10002;
  public static int dsk = -10003;
  public static int dsl = -10004;

  public static String a(String paramString1, long paramLong, String paramString2, String paramString3)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = Long.valueOf(paramLong);
    arrayOfObject[2] = paramString2;
    arrayOfObject[3] = paramString3;
    arrayOfObject[4] = ch.aHN();
    z.d("!32@A5jPUhK25kM10phlUcYHaD7as7hdt5l7", "cdntra genClientId prefix[%s] createtime:%d talker[%s] suffix:[%s] stack[%s]", arrayOfObject);
    boolean bool1 = ch.jb(fQ(paramString1));
    String str1 = null;
    if (bool1);
    String str2;
    do
    {
      boolean bool3;
      do
      {
        boolean bool2;
        do
        {
          return str1;
          bool2 = ch.jb(paramString2);
          str1 = null;
        }
        while (bool2);
        bool3 = paramLong < 0L;
        str1 = null;
      }
      while (!bool3);
      str2 = ch.ja(fQ(paramString3));
      String str3 = f.d((x.pG() + "-" + paramString2).getBytes());
      str1 = "a" + paramString1 + "_" + str3.substring(0, 16) + "_" + paramLong;
    }
    while (ch.jb(str2));
    return str1 + "_" + str2;
  }

  public static void a(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    if (ch.B(paramArrayOfByte))
      paramArrayOfByte = new byte[0];
    String str = new String(paramArrayOfByte);
    if (paramInt == 4)
      z.e(paramString, str);
    do
    {
      return;
      if (paramInt == 3)
      {
        z.w(paramString, str);
        return;
      }
      if (paramInt == 2)
      {
        z.i(paramString, str);
        return;
      }
      if (paramInt == 1)
      {
        z.d(paramString, str);
        return;
      }
    }
    while (paramInt != 0);
    z.v(paramString, str);
  }

  private static String fQ(String paramString)
  {
    if (!ch.jb(paramString));
    for (int i = 0; ; i++)
      if (i < paramString.length())
      {
        char c = paramString.charAt(i);
        if ((!ch.m(c)) && (!ch.n(c)))
          paramString = null;
      }
      else
      {
        return paramString;
      }
  }

  public static int y(Context paramContext)
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo == null)
        return drZ;
      if (localNetworkInfo.getType() == 1)
        return dsb;
      if (localNetworkInfo.getSubtype() == 1)
        return drZ;
      if (localNetworkInfo.getSubtype() == 2)
        return drZ;
      if (localNetworkInfo.getSubtype() >= 3)
        return dsa;
      int i = drZ;
      return i;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    return drZ;
  }

  public static int z(Context paramContext)
  {
    int i = bc.aT(paramContext);
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo == null)
      return dsc;
    if (localNetworkInfo.getType() == 1)
      return dsg;
    if ((localNetworkInfo.getSubtype() == 1) || (localNetworkInfo.getSubtype() == 2))
      return dsd;
    if (localNetworkInfo.getSubtype() >= 3)
      return dse;
    if (localNetworkInfo.getSubtype() >= 13)
      return dsf;
    if (bc.ou(i))
      return dsh;
    return dsd;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.i
 * JD-Core Version:    0.6.2
 */