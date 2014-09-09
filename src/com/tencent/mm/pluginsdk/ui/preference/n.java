package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import com.tencent.mm.aj.j;
import com.tencent.mm.c.a.cx;
import com.tencent.mm.c.a.cz;
import com.tencent.mm.c.b.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.av;

public final class n
{
  public String djA;
  public boolean dsv;
  public String duA;
  public int gsc;
  public String hlo;
  public long id;
  public String username;

  private static n a(Context paramContext, long paramLong, int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt3)
  {
    n localn = new n();
    localn.id = paramLong;
    if (paramInt1 == 1);
    for (boolean bool = true; ; bool = false)
    {
      localn.dsv = bool;
      z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "build, fmsgInfo.type = " + paramInt2 + ", fmsgInfo.talker = " + paramString1);
      if (paramInt2 != 0)
        break label364;
      if (paramString2 != null)
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + paramString1);
      return null;
    }
    localn.username = paramString3;
    localn.duA = paramString4;
    switch (paramInt3)
    {
    default:
      localn.djA = paramContext.getString(com.tencent.mm.n.byX);
    case 4:
    case 10:
    case 11:
    case 31:
    case 32:
    case 58:
    case 59:
    case 60:
    }
    while (true)
    {
      return localn;
      localn.djA = paramContext.getString(com.tencent.mm.n.byN);
      continue;
      cx localcx = new cx();
      localcx.cJk.cJh = paramString5;
      localcx.cJk.cJi = paramString6;
      com.tencent.mm.sdk.c.a.aGB().g(localcx);
      int i = com.tencent.mm.n.byT;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.Y(localcx.cJl.cJm, "");
      localn.djA = paramContext.getString(i, arrayOfObject);
      continue;
      localn.djA = paramContext.getString(com.tencent.mm.n.bze);
      continue;
      localn.djA = paramContext.getString(com.tencent.mm.n.byY);
      continue;
      localn.hlo = as.zl(paramString2).aJX();
      localn.djA = paramContext.getString(com.tencent.mm.n.byR);
      continue;
      label364: if (paramInt1 == 1)
      {
        localn.username = paramString1;
        localn.djA = paramString2;
      }
      else
      {
        localn.username = paramString3;
        localn.duA = paramString4;
        if ((paramString7 != null) && (!paramString7.trim().equals("")))
          localn.djA = paramString7;
        else
          localn.djA = paramContext.getString(com.tencent.mm.n.bJP);
      }
    }
  }

  public static n a(Context paramContext, com.tencent.mm.aj.a parama)
  {
    return a(paramContext, parama.field_fmsgSysRowId, parama.field_fmsgIsSend, parama.field_talker, parama.field_fmsgContent, parama.field_fmsgType, parama.field_contentFromUsername, parama.field_contentNickname, parama.field_contentPhoneNumMD5, parama.field_contentFullPhoneNumMD5, parama.field_contentVerifyContent, parama.field_addScene);
  }

  public static n a(Context paramContext, com.tencent.mm.aj.f paramf)
  {
    String str1 = null;
    long l = paramf.iGx;
    int i = paramf.field_isSend;
    String str2 = paramf.field_talker;
    String str3 = paramf.field_msgContent;
    int j = paramf.field_type;
    String str4;
    String str5;
    String str6;
    String str7;
    int k;
    if (j == 0)
    {
      as localas = as.zl(str3);
      str4 = localas.aJQ();
      str5 = localas.iV();
      str6 = localas.aJS();
      str7 = localas.aJV();
      k = localas.Ew();
    }
    while (true)
    {
      return a(paramContext, l, i, str2, str3, j, str4, str5, str6, str7, str1, k);
      if (i == 0)
      {
        av localav = av.zp(str3);
        str4 = localav.aJQ();
        str5 = localav.iV();
        str1 = localav.getContent();
        str6 = null;
        str7 = null;
        k = 0;
      }
      else
      {
        str4 = null;
        str5 = null;
        str6 = null;
        str7 = null;
        str1 = null;
        k = 0;
      }
    }
  }

  public static n a(Context paramContext, j paramj)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "build shake, talker = " + paramj.field_talker + ", scene = " + paramj.field_scene);
    n localn = new n();
    localn.id = paramj.iGx;
    if (paramj.field_isSend == 1);
    for (boolean bool = true; ; bool = false)
    {
      localn.dsv = bool;
      localn.username = paramj.field_sayhiuser;
      localn.gsc = paramj.field_scene;
      if (paramj.field_isSend != 1)
        break;
      localn.djA = paramj.field_content;
      return localn;
    }
    av localav = av.zp(paramj.field_content);
    if ((localav.getContent() != null) && (!localav.getContent().trim().equals("")));
    for (localn.djA = localav.getContent(); ; localn.djA = paramContext.getString(com.tencent.mm.n.bzg))
    {
      localn.duA = localav.iV();
      return localn;
    }
  }

  public static n a(Context paramContext, ac paramac)
  {
    z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "build lbs, talker = " + paramac.field_sayhiuser + ", scene = " + paramac.field_scene);
    n localn = new n();
    localn.id = paramac.iGx;
    if (paramac.field_isSend == 1);
    for (boolean bool = true; ; bool = false)
    {
      localn.dsv = bool;
      localn.username = paramac.field_sayhiuser;
      localn.gsc = paramac.field_scene;
      if (paramac.field_isSend != 1)
        break;
      localn.djA = paramac.field_content;
      return localn;
    }
    av localav = av.zp(paramac.field_content);
    if ((localav.getContent() != null) && (!localav.getContent().trim().equals("")));
    for (localn.djA = localav.getContent(); ; localn.djA = paramContext.getString(com.tencent.mm.n.bzg))
    {
      localn.duA = localav.iV();
      return localn;
    }
  }

  public static n[] a(Context paramContext, com.tencent.mm.aj.f[] paramArrayOff)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert fmsgList, talker = ");
    if ((paramArrayOff == null) || (paramArrayOff[0] == null));
    for (String str = "null"; ; str = paramArrayOff[0].field_talker)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", str);
      if ((paramArrayOff != null) && (paramArrayOff.length != 0))
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "convert fmsg fail, fmsgList is null");
      return null;
    }
    n[] arrayOfn = new n[paramArrayOff.length];
    for (int i = 0; i < arrayOfn.length; i++)
      arrayOfn[i] = a(paramContext, paramArrayOff[i]);
    return arrayOfn;
  }

  public static n[] a(Context paramContext, j[] paramArrayOfj)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert shakeList, talker = ");
    if ((paramArrayOfj == null) || (paramArrayOfj[0] == null));
    for (String str = "null"; ; str = paramArrayOfj[0].field_sayhiuser)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", str);
      if ((paramArrayOfj != null) && (paramArrayOfj.length != 0))
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "convert shake fail, shakeList is null");
      return null;
    }
    n[] arrayOfn = new n[paramArrayOfj.length];
    for (int i = 0; i < arrayOfn.length; i++)
      arrayOfn[i] = a(paramContext, paramArrayOfj[i]);
    return arrayOfn;
  }

  public static n[] a(Context paramContext, ac[] paramArrayOfac)
  {
    StringBuilder localStringBuilder = new StringBuilder("convert lbsList, talker = ");
    if ((paramArrayOfac == null) || (paramArrayOfac[0] == null));
    for (String str = "null"; ; str = paramArrayOfac[0].field_sayhiuser)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", str);
      if ((paramArrayOfac != null) && (paramArrayOfac.length != 0))
        break;
      z.e("!44@/B4Tb64lLpISOYcLaKm7W/BeKpl7Eo/rew2ISNFCVQs=", "convert lbs fail, lbsList is null");
      return null;
    }
    n[] arrayOfn = new n[paramArrayOfac.length];
    for (int i = 0; i < arrayOfn.length; i++)
      arrayOfn[i] = a(paramContext, paramArrayOfac[i]);
    return arrayOfn;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.n
 * JD-Core Version:    0.6.2
 */