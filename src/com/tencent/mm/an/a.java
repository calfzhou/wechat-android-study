package com.tencent.mm.an;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static final Map hNa = new HashMap();

  public static String aFl()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("[a=");
    if (bg.qW() == null);
    String str2;
    for (String str1 = "0"; ; str1 = "1")
    {
      str2 = str1 + " ";
      if (bg.qW() != null)
        break;
      return str2;
    }
    StringBuilder localStringBuilder2 = new StringBuilder().append(str2).append("c=");
    String str3;
    StringBuilder localStringBuilder3;
    if (bg.qW().oQ() == null)
    {
      str3 = "0";
      String str4 = str3 + " ";
      localStringBuilder3 = new StringBuilder().append(str4).append("u=");
      if (!bg.oE())
        break label145;
    }
    label145: for (String str5 = "1"; ; str5 = "0")
    {
      return str5 + "]";
      str3 = "1";
      break;
    }
  }

  public static void nr(int paramInt)
  {
    int i = 1 + ch.a((Integer)hNa.get(Integer.valueOf(paramInt)));
    hNa.put(Integer.valueOf(paramInt), Integer.valueOf(i));
  }

  public static void run()
  {
    if (1000L * ch.ab(ch.a((Long)bg.qW().oQ().get(66819), 0L)) > 1800000L);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
        wk("");
      return;
    }
  }

  public static void wk(String paramString)
  {
    String str1 = paramString + aFl();
    Iterator localIterator = hNa.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry != null) && (localEntry.getKey() != null) && (localEntry.getValue() != null) && (((Integer)localEntry.getValue()).intValue() != 0))
      {
        localStringBuilder.append(localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append(localEntry.getValue());
        localStringBuilder.append(',');
      }
    }
    hNa.clear();
    if (localStringBuilder.length() > 0)
    {
      z.d("!56@/B4Tb64lLpIuznxMDiXSbLODn5KryCuRSaa8QdgziIU25k1eppL/vA==", "append fmesage card click");
      cx.g(10, localStringBuilder.toString());
    }
    String str2 = str1 + aFl();
    z.d("!56@/B4Tb64lLpIuznxMDiXSbLODn5KryCuRSaa8QdgziIU25k1eppL/vA==", "dkfm :" + str2);
    try
    {
      bg.qW().oQ().set(66819, Long.valueOf(ch.CL()));
      return;
    }
    catch (Exception localException)
    {
      z.e("!56@/B4Tb64lLpIuznxMDiXSbLODn5KryCuRSaa8QdgziIU25k1eppL/vA==", "e:" + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.a
 * JD-Core Version:    0.6.2
 */