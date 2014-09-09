package com.tencent.mm.modelfriend;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.mm.aj.f;
import com.tencent.mm.aj.g;
import com.tencent.mm.aj.l;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class aa
{
  private static Map dtP = null;

  public static boolean a(String paramString, Context paramContext, byte[] paramArrayOfByte)
  {
    return a.b(paramString, paramContext, paramArrayOfByte);
  }

  public static Bitmap c(String paramString, Context paramContext)
  {
    return a.h(paramString, paramContext);
  }

  public static boolean dw(int paramInt)
  {
    av localav = az.xc().dH(paramInt);
    if (localav == null);
    while (localav.wK() != 1)
      return false;
    return true;
  }

  public static String gw(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
      return "";
    return az.wZ().gk(paramString);
  }

  public static void k(List paramList)
  {
    if (paramList.size() == 0);
    while (true)
    {
      return;
      HashSet localHashSet = new HashSet();
      Iterator localIterator1 = l.AE().Ax().iterator();
      while (localIterator1.hasNext())
      {
        f localf = (f)localIterator1.next();
        as localas = bg.qW().oV().zD(localf.field_msgContent);
        if (localas != null)
        {
          String str1 = localas.aJV();
          String str2 = localas.aJS();
          if (((localas.Ew() == 10) || (localas.Ew() == 11)) && ((paramList.contains(str1)) || (paramList.contains(str2))))
            localHashSet.add(localf.field_talker);
        }
      }
      z.d("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "deleteMobileFMessage(md5List), delete fmsg and fconv, talker size = " + localHashSet.size());
      Iterator localIterator2 = localHashSet.iterator();
      while (localIterator2.hasNext())
        com.tencent.mm.aj.e.hH((String)localIterator2.next());
    }
  }

  public static void l(List paramList)
  {
    if (paramList == null)
    {
      z.e("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "sync address book failed, null info list");
      return;
    }
    az.wZ().g(paramList);
  }

  public static void m(List paramList)
  {
    if (paramList == null)
    {
      z.e("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "set uploaded mobile contact failed, null info list");
      return;
    }
    az.wZ().i(paramList);
  }

  public static List vN()
  {
    return az.wZ().vN();
  }

  public static void vY()
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(true));
  }

  public static boolean vZ()
  {
    if ((bg.qW() != null) && (bg.qW().oQ() != null))
      return ch.a((Boolean)bg.qW().oQ().get(12322, Boolean.valueOf(true)), true);
    z.e("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "[arthurdan.UploadPhone] Notice!!!! MMCore.getAccStg() is null!!!");
    return false;
  }

  public static boolean wa()
  {
    z.d("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "isTipInMobileFriend");
    if (wb() == ab.dtS)
      return !ch.a((Boolean)bg.qW().oQ().get(12322, Boolean.valueOf(false)), false);
    return false;
  }

  public static ab wb()
  {
    while (true)
    {
      try
      {
        str1 = (String)bg.qW().oQ().get(4097, "");
        str2 = (String)bg.qW().oQ().get(6, "");
        boolean bool = x.qe();
        z.d("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "isUpload " + bool + " stat " + x.pK());
        if ((str1 != null) && (str1.length() > 0))
        {
          if ((str2 == null) || (str2.length() <= 0))
            break label149;
          if ((str1 == null) && (str2 == null))
            return ab.dtQ;
          if ((str1 != null) && (str2 == null))
            return ab.dtR;
          if (bool)
            return ab.dtS;
          ab localab = ab.dtT;
          return localab;
        }
      }
      catch (Exception localException)
      {
        return ab.dtQ;
      }
      String str1 = null;
      continue;
      label149: String str2 = null;
    }
  }

  public static void wc()
  {
    bg.qW().oQ().set(4097, "");
    bg.qW().oQ().set(6, "");
  }

  public static String wd()
  {
    return (String)bg.qW().oQ().get(6, "");
  }

  public static boolean we()
  {
    return (bg.oE()) && (wb() == ab.dtS) && (vZ());
  }

  public static void wf()
  {
    az.wZ().vK();
  }

  public static void wg()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = l.AE().Ax().iterator();
    while (localIterator1.hasNext())
    {
      f localf = (f)localIterator1.next();
      as localas = bg.qW().oV().zD(localf.field_msgContent);
      if ((localas != null) && ((localas.Ew() == 10) || (localas.Ew() == 11)))
        localHashSet.add(localf.field_talker);
    }
    z.d("!32@/B4Tb64lLpLlcnOZ5z2wsUFTA6om59vy", "deleteMobileFMessage, delete fmsg and fconv, talker size = " + localHashSet.size());
    Iterator localIterator2 = localHashSet.iterator();
    while (localIterator2.hasNext())
      com.tencent.mm.aj.e.hH((String)localIterator2.next());
  }

  public static List wh()
  {
    return az.wZ().vL();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.aa
 * JD-Core Version:    0.6.2
 */