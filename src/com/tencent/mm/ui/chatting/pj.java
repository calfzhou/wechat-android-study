package com.tencent.mm.ui.chatting;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.a.f;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.applet.aa;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.sdk.a.a;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.modelmsg.WXImageObject;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.modelmsg.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.cn;
import com.tencent.mm.ui.cg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class pj
  implements mn
{
  private static am jwS = new pk();
  private hd joF;
  private final Set jwR = new HashSet();

  protected pj(hd paramhd)
  {
    this.joF = paramhd;
  }

  private aa a(WXMediaMessage paramWXMediaMessage, k paramk)
  {
    return new pl(this, paramWXMediaMessage, paramk);
  }

  @TargetApi(9)
  private static void a(Context paramContext, Set paramSet)
  {
    String str = null;
    if (paramSet != null)
    {
      int i = paramSet.size();
      str = null;
      if (i > 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        Iterator localIterator = paramSet.iterator();
        while (localIterator.hasNext())
        {
          localStringBuilder.append((String)localIterator.next());
          localStringBuilder.append(";");
        }
        str = localStringBuilder.toString();
      }
    }
    SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(ak.aHk(), 0).edit();
    localEditor.putString("transactions_array_key", str);
    if (Build.VERSION.SDK_INT > 8)
    {
      localEditor.apply();
      return;
    }
    localEditor.commit();
  }

  private String o(k paramk)
  {
    hd localhd = this.joF;
    int i = n.bAS;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = l.d(this.joF.agh(), paramk);
    return localhd.getString(i, arrayOfObject);
  }

  public static void y(Bundle paramBundle)
  {
    jwS.ae(paramBundle);
    jwS.Bo();
  }

  public final void aWG()
  {
    jwS.a(this, null);
  }

  public final void aWH()
  {
    jwS.remove(this);
    this.jwR.clear();
    a(this.joF.agh(), null);
  }

  public final boolean bH(String paramString1, String paramString2)
  {
    z.d("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "request, pkg = " + paramString1 + ", openId = " + paramString2);
    com.tencent.mm.sdk.modelmsg.b localb = new com.tencent.mm.sdk.modelmsg.b();
    localb.username = this.joF.aUL();
    localb.hvw = f.d(ap.CM().getBytes());
    localb.ehE = paramString2;
    SharedPreferences localSharedPreferences = this.joF.Bp(ak.aHi());
    this.joF.agh();
    localb.dAo = y.d(localSharedPreferences);
    localb.dCE = ((String)bg.qW().oQ().get(274436));
    Bundle localBundle = new Bundle();
    localb.d(localBundle);
    u.u(localBundle);
    u.v(localBundle);
    com.tencent.mm.sdk.a.b localb1 = new com.tencent.mm.sdk.a.b();
    localb1.iCY = paramString1;
    localb1.iDa = localBundle;
    boolean bool = a.a(this.joF.agh(), localb1);
    this.jwR.add(localb.hvw);
    a(this.joF.agh(), this.jwR);
    return bool;
  }

  public final void x(Bundle paramBundle)
  {
    int i = 1;
    int j = 0;
    if (this.joF.aVK())
    {
      z.v("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "handleResp Chatting is a fragment but not foregound");
      return;
    }
    String str1 = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
    c localc = new c(paramBundle);
    WXMediaMessage localWXMediaMessage = localc.iDh;
    if (this.jwR.size() == 0)
    {
      Activity localActivity = this.joF.agh();
      HashSet localHashSet = new HashSet();
      String str5 = localActivity.getSharedPreferences(ak.aHk(), 0).getString("transactions_array_key", null);
      if ((str5 != null) && (str5.length() > 0))
      {
        String[] arrayOfString = str5.split(";");
        int n = arrayOfString.length;
        for (int i1 = 0; i1 < n; i1++)
          localHashSet.add(arrayOfString[i1]);
      }
      this.jwR.addAll(localHashSet);
    }
    if (!this.jwR.contains(localc.hvw))
    {
      z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "invalid resp, check transaction failed, transaction=" + localc.hvw);
      return;
    }
    this.jwR.remove(localc.hvw);
    a(this.joF.agh(), this.jwR);
    k localk = new k();
    localk.field_appId = str1;
    z.d("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "handleResp, appId = " + str1);
    if (!bf.GO().c(localk, new String[0]))
    {
      z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "unregistered app, ignore request, appId = " + str1);
      return;
    }
    int k = localWXMediaMessage.getType();
    switch (k)
    {
    case 6:
    default:
      z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "unknown type = " + k);
      i = 0;
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 7:
    case 8:
    }
    label516: label631: label1147: 
    while (i == 0)
    {
      z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "deal fail, result is false");
      return;
      cn localcn6 = r.a(this.joF.aPC(), localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk));
      int m = 0;
      if (localcn6 != null)
        m = i;
      i = m;
      continue;
      cn localcn5;
      if ((localWXMediaMessage.thumbData != null) && (localWXMediaMessage.thumbData.length > 0))
      {
        localcn5 = r.a(this.joF.aPC(), localWXMediaMessage.thumbData, o(localk), false, a(localWXMediaMessage, localk));
        if (localcn5 != null)
          break label631;
        z.e("!44@/B4Tb64lLpK7L4H1H4x0/YwP53rZHr+jycI+/d/EnbY=", "showDialogItem3 fail, invalid argument");
      }
      while (true)
      {
        i = j;
        break;
        WXImageObject localWXImageObject = (WXImageObject)localWXMediaMessage.mediaObject;
        if ((localWXImageObject.imageData != null) && (localWXImageObject.imageData.length > 0))
        {
          localcn5 = r.a(this.joF.aPC(), localWXImageObject.imageData, o(localk), false, a(localWXMediaMessage, localk));
          break label516;
        }
        localcn5 = r.b(this.joF.aPC(), localWXImageObject.imagePath, o(localk), false, a(localWXMediaMessage, localk));
        break label516;
        j = i;
      }
      if ((localWXMediaMessage.thumbData != null) && (localWXMediaMessage.thumbData.length > 0));
      for (cn localcn4 = r.a(this.joF.aPC(), localWXMediaMessage.thumbData, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, 2, a(localWXMediaMessage, localk)); localcn4 == null; localcn4 = r.a(this.joF.aPC(), h.QV, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk)))
      {
        i = 0;
        break;
      }
      cg localcg;
      byte[] arrayOfByte;
      String str2;
      String str3;
      String str4;
      aa localaa;
      if ((localWXMediaMessage.thumbData != null) && (localWXMediaMessage.thumbData.length > 0))
      {
        localcg = this.joF.aPC();
        arrayOfByte = localWXMediaMessage.thumbData;
        str2 = localWXMediaMessage.title;
        str3 = localWXMediaMessage.description;
        str4 = o(localk);
        localaa = a(localWXMediaMessage, localk);
      }
      for (cn localcn3 = r.a(localcg, arrayOfByte, str2, str3, str4, false, i, localaa); localcn3 == null; localcn3 = r.a(this.joF.aPC(), h.QY, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk)))
      {
        i = 0;
        break;
      }
      if (r.a(this.joF.aPC(), localWXMediaMessage.title, localWXMediaMessage.thumbData, localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk)) == null)
      {
        i = 0;
        continue;
        if ((localWXMediaMessage.thumbData != null) && (localWXMediaMessage.thumbData.length > 0));
        for (cn localcn2 = r.a(this.joF.aPC(), localWXMediaMessage.thumbData, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, 0, a(localWXMediaMessage, localk)); localcn2 == null; localcn2 = r.a(this.joF.aPC(), h.QW, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk)))
        {
          i = 0;
          break;
        }
        if ((localWXMediaMessage.thumbData != null) && (localWXMediaMessage.thumbData.length > 0));
        for (cn localcn1 = r.a(this.joF.aPC(), localWXMediaMessage.thumbData, o(localk), false, a(localWXMediaMessage, localk)); ; localcn1 = r.a(this.joF.aPC(), h.QW, localWXMediaMessage.title, localWXMediaMessage.description, o(localk), false, a(localWXMediaMessage, localk)))
        {
          if (localcn1 != null)
            break label1147;
          i = 0;
          break;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.pj
 * JD-Core Version:    0.6.2
 */