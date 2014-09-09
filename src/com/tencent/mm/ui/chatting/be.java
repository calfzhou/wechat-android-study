package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.c;
import com.tencent.mm.ai.d;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.cd;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class be
{
  public static boolean F(ar paramar)
  {
    if (paramar == null)
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check is store emoji error, msg is null");
    ad localad;
    do
    {
      return true;
      localad = g.axR().ly(paramar.kp());
    }
    while ((localad != null) && (localad.field_catalog != ab.iiJ) && (localad.field_catalog != ab.iiI) && (localad.field_catalog != ab.iiH) && (localad.field_catalog != ad.iiU) && (localad.field_catalog != ad.iiT));
    return false;
  }

  public static boolean G(ar paramar)
  {
    if (paramar == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check is game msg error, msg is null");
      return true;
    }
    if (paramar.jK() == 0);
    b localb;
    for (String str = bw.en(paramar.getContent()); ; str = paramar.getContent())
    {
      localb = b.iS(str);
      if (localb != null)
        break;
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "parse app message content fail");
      return false;
    }
    k localk = com.tencent.mm.pluginsdk.model.app.l.F(localb.appId, false);
    return (localk != null) && (localk.avN());
  }

  public static boolean H(ar paramar)
  {
    return paramar.getType() == 419430449;
  }

  public static void a(Context paramContext, String paramString, ar paramar)
  {
    if (!a(paramContext, paramString, paramar, "emoji"))
      return;
    String str = com.tencent.mm.storage.z.yW(paramar.getContent()).vu();
    if ((str == null) || (str.endsWith("-1")))
      str = paramar.kp();
    if (str == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "showAcceptEmojiConnector: filePath is null");
      return;
    }
    g.axR().e(paramContext, paramString, str);
  }

  public static void a(Context paramContext, String paramString, ar paramar, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, paramar, "text"))
      return;
    String str1 = e(paramar.getContent(), paramar.jK(), paramBoolean);
    if (paramar.aJM())
    {
      String str2 = e(paramar.kw(), paramar.jK(), paramBoolean);
      str1 = str1 + "\n\n" + str2;
    }
    if ((str1 == null) || (str1.equals("")))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "Transfer text erro: content null");
      return;
    }
    g.axY().j(paramString, str1, y.dR(paramString));
  }

  private static boolean a(Context paramContext, String paramString1, ar paramar, String paramString2)
  {
    if (paramContext == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "send %s fail, context is null", new Object[] { paramString2 });
      return false;
    }
    if (ch.jb(paramString1))
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "send %s fail, username is null", new Object[] { paramString2 });
      return false;
    }
    if (paramar == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "send %s fail, msg is null", new Object[] { paramString2 });
      return false;
    }
    return true;
  }

  public static void b(Context paramContext, String paramString, ar paramar)
  {
    if (!a(paramContext, paramString, paramar, "appEmoji"))
      return;
    com.tencent.mm.storage.z localz = com.tencent.mm.storage.z.yW(paramar.getContent());
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = localz.vu();
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "jacks send App Emoji: %s, %s", arrayOfObject);
    g.axR().e(paramContext, paramString, localz.vu());
  }

  public static void b(Context paramContext, String paramString, ar paramar, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, paramar, "appmsg"))
      return;
    String str = e(paramar.getContent(), paramar.jK(), paramBoolean);
    g.axY().a(paramString, null, ch.xw(str));
  }

  public static boolean bb(List paramList)
  {
    if (paramList == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check contain undownload image or video error, select item empty");
      return false;
    }
    Iterator localIterator = paramList.iterator();
    label194: label199: 
    while (true)
    {
      ar localar;
      com.tencent.mm.y.l locall1;
      if (localIterator.hasNext())
      {
        localar = (ar)localIterator.next();
        if (localar.jK() == 1)
          return false;
        if (localar.aJA())
        {
          boolean bool = localar.kk() < 0L;
          locall1 = null;
          if (bool)
            locall1 = ap.yg().T(localar.kk());
          if (((locall1 != null) && (locall1.xM() > 0L)) || (localar.kl() <= 0L))
            break label194;
        }
      }
      for (com.tencent.mm.y.l locall2 = ap.yg().S(localar.kl()); ; locall2 = locall1)
      {
        if ((locall2 == null) || ((locall2.getOffset() >= locall2.sp()) && (locall2.sp() != 0)))
          break label199;
        return true;
        if (!localar.aJE())
          break;
        q localq = com.tencent.mm.ak.m.AL().hY(localar.kp());
        if ((localq == null) || (localq.getStatus() == 199) || (localq.getStatus() == 199))
          break;
        return true;
        return false;
      }
    }
  }

  public static void c(Context paramContext, String paramString, ar paramar)
  {
    if (!a(paramContext, paramString, paramar, "image"));
    label194: 
    while (true)
    {
      return;
      boolean bool1 = paramar.kk() < 0L;
      com.tencent.mm.y.l locall1 = null;
      if (bool1)
        locall1 = ap.yg().T(paramar.kk());
      if (((locall1 == null) || (locall1.xM() <= 0L)) && (paramar.kl() > 0L));
      for (com.tencent.mm.y.l locall2 = ap.yg().S(paramar.kl()); ; locall2 = locall1)
      {
        if (locall2 == null)
          break label194;
        boolean bool2 = locall2.xR();
        int i = 0;
        if (bool2)
        {
          boolean bool3 = com.tencent.mm.y.m.a(locall2).xN().startsWith("SERVERID://");
          i = 0;
          if (!bool3)
            i = 1;
        }
        String str = ap.yg().f(com.tencent.mm.y.m.c(locall2), "", "");
        ap.yg().f(locall2.xO(), "th_", "");
        if (ch.jb(str))
          break;
        com.tencent.mm.pluginsdk.n localn = g.axY();
        locall2.xS();
        localn.c(paramContext, paramString, str, i);
        return;
      }
    }
  }

  public static void c(Context paramContext, String paramString, ar paramar, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, paramar, "friendcard"))
      return;
    String str = e(paramar.getContent(), paramar.jK(), paramBoolean);
    g.axY().j(paramString, str, 42);
  }

  public static void d(Context paramContext, String paramString, ar paramar)
  {
    if (!a(paramContext, paramString, paramar, "video"))
      return;
    q localq = v.ij(paramar.kp());
    String str1 = paramar.kp();
    int i = localq.AX();
    int j = localq.AU();
    String str2 = localq.AZ();
    int k = paramar.getType();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = paramString;
    arrayOfObject[2] = Integer.valueOf(i);
    arrayOfObject[3] = Integer.valueOf(j);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "copy video fileName %s userName %s export %d videoLength", arrayOfObject);
    String str3 = r.ia(com.tencent.mm.model.x.pG());
    r localr = com.tencent.mm.ak.m.AL();
    String str4 = localr.ib(str1);
    String str5 = localr.ib(str3);
    String str6 = localr.ic(str1);
    String str7 = localr.ic(str3);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "copy video: srcFullPath[%s] destFullPath[%s] srcThumbPath[%s] destThumbPath[%s]", new Object[] { str4, str5, str6, str7 });
    p.f(str4, str5, false);
    p.f(str6, str7, false);
    v.a(str3, j, paramString, null, i, str2, k);
    v.ih(str3);
  }

  public static void d(Context paramContext, String paramString, ar paramar, boolean paramBoolean)
  {
    if (!a(paramContext, paramString, paramar, "location"))
      return;
    String str = e(paramar.getContent(), paramar.jK(), paramBoolean);
    g.axY().j(paramString, str, 48);
  }

  private static String e(String paramString, int paramInt, boolean paramBoolean)
  {
    if ((paramBoolean) && (paramString != null) && (paramInt == 0))
      paramString = bw.en(paramString);
    return paramString;
  }

  public static void e(Context paramContext, String paramString, ar paramar, boolean paramBoolean)
  {
    while (true)
    {
      String str1;
      try
      {
        c localc = b.jd(paramar.getContent());
        LinkedList localLinkedList = localc.dRV;
        if (localLinkedList != null)
        {
          Iterator localIterator = localLinkedList.iterator();
          if (localIterator.hasNext())
          {
            d locald = (d)localIterator.next();
            b localb = new b();
            localb.title = locald.title;
            localb.description = locald.djA;
            localb.diE = "view";
            localb.type = 5;
            localb.url = locald.url;
            localb.cNM = localc.cNM;
            localb.cNN = localc.cNN;
            localb.ddY = localc.ddY;
            localb.thumburl = locald.djy;
            str1 = b.b(localb);
            ar localar = new ar();
            localar.setContent(str1);
            localar.bv(paramar.jK());
            localar.q(locald.time);
            int i = str1.indexOf("<msg>");
            if ((i <= 0) || (i >= str1.length()))
              break label298;
            str2 = str1.substring(i).trim();
            Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str2, "msg");
            if ((localMap != null) && (localMap.size() > 0))
              localar.bL(cd.u(localMap));
            b(paramContext, paramString, localar, paramBoolean);
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = localException.getLocalizedMessage();
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "[oneliang]retransmit multi app msg error : %s", arrayOfObject);
      }
      return;
      label298: String str2 = str1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.be
 * JD-Core Version:    0.6.2
 */