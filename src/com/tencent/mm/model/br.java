package com.tencent.mm.model;

import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.v;
import com.tencent.mm.storage.w;

final class br
  implements v
{
  br(bg parambg)
  {
  }

  public final void a(r paramr, s params)
  {
    int i = 1;
    if (paramr == null)
      break label6;
    label6: 
    while ((!i.xY(paramr.getUsername())) && (!i.ya(paramr.getUsername())) && (!i.yc(paramr.getUsername())) && (!y.dj(paramr.getUsername())))
      return;
    r localr7;
    r localr8;
    if (i.yc(paramr.getUsername()))
    {
      localr7 = params.yE("floatbottle");
      if (localr7 != null)
        break label1181;
      localr8 = new r("floatbottle");
    }
    label386: label655: label1130: label1143: int i3;
    for (int i2 = i; ; i3 = 0)
    {
      localr8.bu(i);
      localr8.bt(z.qs());
      ar localar4 = bg.qW().oV().A(8, " and not ( type = 10000 and isSend != 2 ) ");
      if ((localar4 != null) && (localar4.kk() > 0L))
      {
        localr8.v(localar4);
        localr8.setContent(i.ye(localar4.kt()) + ":" + localar4.getContent());
        localr8.bv(Integer.toString(localar4.getType()));
        w localw3 = params.ih();
        if (localw3 != null)
        {
          PString localPString5 = new PString();
          PString localPString6 = new PString();
          PInt localPInt3 = new PInt();
          localar4.bJ("floatbottle");
          localar4.setContent(localr8.getContent());
          localw3.a(localar4, localPString5, localPString6, localPInt3, false);
          localr8.bu(localPString5.value);
          localr8.bw(localPString6.value);
          localr8.bx(localPInt3.value);
        }
      }
      while (i2 != 0)
      {
        params.d(localr8);
        return;
        localr8.aIB();
      }
      params.a(localr8, localr8.getUsername());
      return;
      r localr2;
      r localr3;
      Long localLong;
      long l;
      r localr1;
      ar localar1;
      if ((i.xY(paramr.getUsername())) || (i.ya(paramr.getUsername())))
      {
        if (i.xY(paramr.getUsername()))
          break;
        if (!i.ya(paramr.getUsername()))
          break label1170;
        localr2 = params.yE("qmessage");
        if (localr2 != null)
          break label1161;
        localr3 = new r("qmessage");
        aw localaw = bg.qW().oV();
        localLong = (Long)bg.qW().oQ().get(12295);
        if (localLong == null)
        {
          l = 0L;
          localr3.bt(localaw.cQ(l));
          ar localar2 = bg.qW().oV().A(2, " and not ( type = 10000 and isSend != 2 ) ");
          localr1 = localr3;
          localar1 = localar2;
        }
      }
      while (true)
      {
        if ((localar1 != null) && (localar1.kk() > 0L))
        {
          localr1.v(localar1);
          localr1.setContent(localar1.kt() + ":" + localar1.getContent());
          localr1.bv(Integer.toString(localar1.getType()));
          w localw1 = params.ih();
          if (localw1 != null)
          {
            PString localPString1 = new PString();
            PString localPString2 = new PString();
            PInt localPInt1 = new PInt();
            localar1.bJ("qmessage");
            localar1.setContent(localr1.getContent());
            localw1.a(localar1, localPString1, localPString2, localPInt1, false);
            localr1.bu(localPString1.value);
            localr1.bw(localPString2.value);
            localr1.bx(localPInt1.value);
          }
        }
        while (true)
        {
          if (i == 0)
            break label655;
          params.d(localr1);
          return;
          l = localLong.longValue();
          break;
          localr1.aIB();
        }
        params.a(localr1, localr1.getUsername());
        return;
        r localr4;
        if ((y.dj(paramr.getUsername())) && (!ch.jb(paramr.jR())))
        {
          localr4 = params.yE(paramr.jR());
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = paramr.getUsername();
          arrayOfObject1[i] = paramr.jR();
          com.tencent.mm.sdk.platformtools.z.v("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "postConvExt, username = %s, parentRef = %s", arrayOfObject1);
          if (paramr.jR().equals("officialaccounts"))
            break label1155;
        }
        label1026: label1155: int m;
        for (int k = i; ; m = 0)
        {
          r localr6;
          if (localr4 == null)
          {
            r localr5 = new r(paramr.jR());
            if (k != 0)
              localr5.Ab();
            localr6 = localr5;
          }
          int i1;
          for (int n = i; ; i1 = 0)
          {
            localr6.bt(bg.qW().oW().yQ(paramr.jR()));
            Object[] arrayOfObject2 = new Object[i];
            arrayOfObject2[0] = Integer.valueOf(localr6.jI());
            com.tencent.mm.sdk.platformtools.z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "enterprise cvs count is %d", arrayOfObject2);
            String str = bg.qW().oW().yR(paramr.jR());
            ar localar3 = bg.qW().oV().zr(str);
            if ((localar3 != null) && (localar3.kk() > 0L))
            {
              localr6.v(localar3);
              localr6.setContent(localar3.kt() + ":" + localar3.getContent());
              localr6.bv(Integer.toString(localar3.getType()));
              w localw2 = params.ih();
              if (localw2 != null)
              {
                PString localPString3 = new PString();
                PString localPString4 = new PString();
                PInt localPInt2 = new PInt();
                localar3.bJ(paramr.jR());
                localar3.setContent(localr6.getContent());
                localw2.a(localar3, localPString3, localPString4, localPInt2, i);
                localr6.bu(localPString3.value);
                localr6.bw(localPString4.value);
                localr6.bx(localPInt2.value);
              }
              if (n == 0)
                break label1130;
              params.d(localr6);
            }
            while (true)
            {
              if (!"@blacklist".equals(paramr.jR()))
                break label1143;
              i locali = bg.qW().oT().ys(paramr.getUsername());
              if ((locali == null) || (ch.jb(locali.getUsername())) || (locali.xI()))
                break;
              s locals = bg.qW().oW();
              String[] arrayOfString = new String[i];
              arrayOfString[0] = paramr.getUsername();
              locals.c(arrayOfString, "");
              return;
              localr6.aIB();
              break label1026;
              params.a(localr6, localr6.getUsername());
            }
            break label6;
            localr6 = localr4;
          }
        }
        label1161: localr3 = localr2;
        int j = 0;
        break label386;
        label1170: localar1 = null;
        localr1 = null;
        j = 0;
      }
      label1181: localr8 = localr7;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.br
 * JD-Core Version:    0.6.2
 */