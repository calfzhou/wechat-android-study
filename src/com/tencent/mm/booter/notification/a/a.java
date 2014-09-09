package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.c.a.mz;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.s;
import java.util.Map;

public abstract class a
{
  public static boolean bR(int paramInt)
  {
    return (paramInt == 50) || (paramInt == 53);
  }

  public static int c(ar paramar)
  {
    String str = paramar.kz();
    int i;
    if (y.dj(paramar.kt()))
    {
      i = 0;
      if (!ch.jb(str))
        break label31;
    }
    label31: Map localMap;
    do
    {
      return i;
      i = 3;
      break;
      localMap = com.tencent.mm.sdk.platformtools.x.bB(str, "msgsource");
    }
    while ((localMap == null) || (localMap.isEmpty()));
    while (true)
    {
      int j;
      try
      {
        j = Integer.parseInt((String)localMap.get(".msgsource.tips"));
        if ((j & 0x1) == 0)
        {
          int m = j & 0x2;
          k = 0;
          if (m != 0)
            return k;
        }
      }
      catch (Exception localException)
      {
        return i;
      }
      int k = j;
    }
  }

  public static boolean cj(String paramString)
  {
    mx localmx = new mx();
    localmx.cPr.cEg = 1;
    localmx.cPr.content = paramString;
    com.tencent.mm.sdk.c.a.aGB().g(localmx);
    return (localmx.cPs.type == 2) || (paramString.equals(ar.iju));
  }

  public static boolean ck(String paramString)
  {
    mx localmx = new mx();
    localmx.cPr.cEg = 1;
    localmx.cPr.content = paramString;
    com.tencent.mm.sdk.c.a.aGB().g(localmx);
    return (localmx.cPs.type == 3) || (paramString.equals(ar.ijt));
  }

  public static boolean cl(String paramString)
  {
    return (y.dU(paramString)) || ((y.dc(paramString)) && (!y.dT(paramString)));
  }

  public static int cm(String paramString)
  {
    return bg.qW().oW().Bl(paramString);
  }

  public static boolean dc(String paramString)
  {
    return paramString.toLowerCase().endsWith("@chatroom");
  }

  public static int lG()
  {
    return z.dZ(y.dkj);
  }

  public static boolean n(ar paramar)
  {
    if (paramar == null)
      return false;
    return paramar.zk(com.tencent.mm.model.x.pG());
  }

  public static boolean v(Context paramContext)
  {
    return paramContext.getSharedPreferences(ak.aHi(), 0).getBoolean("settings_show_detail", true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.a
 * JD-Core Version:    0.6.2
 */