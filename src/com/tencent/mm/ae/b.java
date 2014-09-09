package com.tencent.mm.ae;

import android.content.Context;
import android.graphics.Rect;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class b
{
  public static final String[] dAX = { "LDPI", "HDPI", "MDPI" };
  public String dAM;
  public String dAN;
  public boolean dAO;
  public boolean dAP;
  public int dAQ;
  public Rect dAR;
  public int dAS;
  public Rect dAT;
  public String dAU;
  public String dAV;
  public Map dAW;
  public String desc;
  public String id;
  public String title;
  public String url;

  private b(String paramString1, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.id = paramString1;
    this.dAM = paramString2;
    this.dAN = paramString3;
    this.dAO = paramBoolean1;
    this.dAP = paramBoolean2;
  }

  public static b C(Context paramContext)
  {
    int i = 1;
    long l1 = ch.h(bg.qW().oQ().get(8449), 0);
    long l2 = ch.CL() - l1;
    if ((l1 > 0L) && (l2 >= 86400L))
      yR();
    b localb;
    String str;
    while (true)
    {
      localb = null;
      return localb;
      str = (String)bg.qW().oQ().get(8193);
      if (!ch.jb(str))
      {
        if (!str.contains("id=\"setavatar\""))
          break;
        yR();
      }
    }
    ArrayList localArrayList;
    if (!ch.jb(str))
    {
      localArrayList = l(paramContext, str);
      if ((localArrayList == null) || (localArrayList.size() != i))
        localb = null;
    }
    label186: label189: 
    while (true)
    {
      label125: if (localb == null)
      {
        yR();
        break;
        localb = (b)localArrayList.get(0);
        if ((localb.dAW == null) || (localb.dAW.size() <= 0))
          break label186;
      }
      while (true)
      {
        if ((i != 0) && (localb.yQ()))
          break label189;
        localb = null;
        break label125;
        break;
        i = 0;
      }
    }
  }

  public static String hg(String paramString)
  {
    c localc = hh(paramString);
    if (localc == c.dAY)
      return paramString;
    if (localc == c.dAZ)
    {
      String str;
      if (paramString == null)
        str = null;
      while (str == null)
      {
        return null;
        int i = paramString.lastIndexOf("/");
        if ((i < 0) || (i >= -1 + paramString.length()))
          str = null;
        else
          str = paramString.substring(i + 1);
      }
      return bg.qW().pa() + str;
    }
    return null;
  }

  public static c hh(String paramString)
  {
    if (paramString.indexOf("tips/") == 0)
      return c.dAY;
    if (paramString.indexOf("weixin://") == 0)
      return c.dAZ;
    return c.dBa;
  }

  public static ArrayList l(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() < 0))
      return null;
    String str1 = com.tencent.mm.platformtools.b.ac(paramContext);
    Object localObject1;
    if (str1 == null)
    {
      localObject1 = null;
      if ((localObject1 == null) || (localObject1.size() <= 0))
        return null;
    }
    else
    {
      HashSet localHashSet = new HashSet();
      localHashSet.add(str1);
      String str2 = com.tencent.mm.platformtools.b.ad(paramContext);
      z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "getDisplaySizeType :" + str2);
      String[] arrayOfString;
      if (str2 != null)
      {
        arrayOfString = str2.split("_");
        if ((arrayOfString != null) && (arrayOfString.length >= 2))
          break label167;
      }
      label167: for (String str9 = null; ; str9 = arrayOfString[0])
      {
        localHashSet.add(str9 + "_L");
        localHashSet.add(str9 + "_P");
        localObject1 = localHashSet;
        break;
      }
    }
    Map localMap = x.bB(paramString, "tips");
    if (localMap == null)
      return null;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; ; i++)
    {
      StringBuilder localStringBuilder1 = new StringBuilder(".tips.tip");
      Object localObject2;
      b localb;
      HashMap localHashMap;
      int i7;
      label1141: StringBuilder localStringBuilder2;
      if (i > 0)
      {
        localObject2 = Integer.valueOf(i);
        String str3 = localObject2;
        if (localMap.get(str3) == null)
          break;
        String str4 = (String)localMap.get(str3 + ".$id");
        z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "parseMessages id:" + str4);
        String str5 = (String)localMap.get(str3 + ".$platform");
        if (!str5.equals("android"))
          continue;
        localb = new b(str4, str5, (String)localMap.get(str3 + ".$device"), ch.a(Boolean.valueOf((String)localMap.get(str3 + ".$enableclose"))), ch.a(Boolean.valueOf((String)localMap.get(str3 + ".$transparentclose"))));
        int j = ch.getInt((String)localMap.get(str3 + ".title.$x"), 0);
        int k = ch.getInt((String)localMap.get(str3 + ".title.$y"), 0);
        int m = ch.getInt((String)localMap.get(str3 + ".title.$width"), 0);
        int n = ch.getInt((String)localMap.get(str3 + ".title.$font"), 0);
        int i1 = ch.xs((String)localMap.get(str3 + ".title.$color"));
        localb.title = ((String)localMap.get(str3 + ".title"));
        localb.dAQ = i1;
        localb.dAR = new Rect(j, k, m + j, n + k);
        int i2 = ch.getInt((String)localMap.get(str3 + ".description.$x"), 0);
        int i3 = ch.getInt((String)localMap.get(str3 + ".description.$y"), 0);
        int i4 = ch.getInt((String)localMap.get(str3 + ".description.$width"), 0);
        int i5 = ch.getInt((String)localMap.get(str3 + ".description.$font"), 0);
        int i6 = ch.xs((String)localMap.get(str3 + ".description.$color"));
        localb.desc = ((String)localMap.get(str3 + ".description"));
        localb.dAS = i6;
        localb.dAT = new Rect(i2, i3, i4 + i2, i5 + i3);
        localb.url = ((String)localMap.get(str3 + ".url"));
        localb.dAU = ((String)localMap.get(str3 + ".time.start"));
        localb.dAV = ((String)localMap.get(str3 + ".time.end"));
        z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "parseMessages id:" + localb.id + " start:" + localb.dAU + " end:" + localb.dAV);
        localHashMap = new HashMap();
        i7 = 0;
        localStringBuilder2 = new StringBuilder().append(str3).append(".images.image");
        if (i7 <= 0)
          break label1294;
      }
      label1294: for (Object localObject3 = Integer.valueOf(i7); ; localObject3 = "")
      {
        String str6 = localObject3;
        String str7 = (String)localMap.get(str6);
        z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", " img res:" + str7);
        if (str7 == null)
          break label1302;
        String str8 = (String)localMap.get(str6 + ".$type");
        if (localObject1.contains(str8))
          localHashMap.put(str8, str7);
        i7++;
        break label1141;
        localObject2 = "";
        break;
      }
      label1302: if (localHashMap.size() > 0)
        localb.dAW = localHashMap;
      z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "msgid :" + localb.id);
      localArrayList.add(localb);
    }
    z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "msgs size: " + localArrayList.size());
    if (localArrayList.size() > 0)
      return localArrayList;
    return null;
  }

  private boolean yQ()
  {
    long l1 = ch.CM();
    long l2 = 9223372036854775807L;
    long l3 = 0L;
    try
    {
      if (this.dAV != null)
        l2 = new SimpleDateFormat("yyyy-MM-dd-HH").parse(this.dAV).getTime();
      if (this.dAU != null)
        l3 = new SimpleDateFormat("yyyy-MM-dd-HH").parse(this.dAU).getTime();
      z.d("!32@/B4Tb64lLpIeWAyce14PndetfIKFhfOl", "CHECKTIME : [" + l3 + "," + l2 + "]");
      if ((l2 <= l1) || (l3 > l1))
        return false;
    }
    catch (Exception localException)
    {
      return true;
    }
    return true;
  }

  public static void yR()
  {
    bg.qW().oQ().set(8193, "");
    bg.qW().oQ().set(8449, Long.valueOf(0L));
  }

  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("ad.id=").append(this.id).append(", platform=").append(this.dAM).append(", device=").append(this.dAN);
    String str1;
    StringBuilder localStringBuilder2;
    if (this.dAO)
    {
      str1 = ", closable";
      localStringBuilder2 = localStringBuilder1.append(str1);
      if (!this.dAP)
        break label90;
    }
    label90: for (String str2 = ", trans-closable"; ; str2 = "")
    {
      return str2;
      str1 = "";
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ae.b
 * JD-Core Version:    0.6.2
 */