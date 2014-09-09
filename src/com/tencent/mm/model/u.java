package com.tencent.mm.model;

import com.tencent.mm.o.f;
import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.cl;
import com.tencent.mm.y.a;
import com.tencent.mm.y.ap;

public class u
  implements j
{
  public k a(q paramq)
  {
    int i = 1;
    String str1 = (String)f.c(2, "");
    k localk;
    if (str1.length() <= 0)
      localk = null;
    label147: label211: label230: label362: label368: label371: 
    while (true)
    {
      return localk;
      String str2 = ai.a(paramq.hOP);
      String str3 = ai.a(paramq.hOQ);
      if ((ch.ja(str2).length() <= 0) || (ch.ja(str3).length() <= 0))
      {
        z.e("!44@/B4Tb64lLpKRf/dPq32Ifa+acCo+StrnxqhXyjPpfAs=", "neither from-user nor to-user can be empty");
        return null;
      }
      ar localar1 = a(paramq, str2, str3, str1);
      if (localar1 == null)
        return null;
      int k;
      int n;
      ar localar2;
      int i1;
      if ((bg.qW().oY().has(str2)) || (str1.equals(str2)))
      {
        k = i;
        if (k == 0)
          break label288;
        localar1.bv(i);
        localar1.bJ(str3);
        n = paramq.dZy;
        localar2 = localar1;
        localar2.setStatus(n);
        if (paramq.hOR == 10000)
          localar1.setStatus(4);
        localar1.bP(paramq.hOW);
        if (localar1.kk() != 0L)
          break label332;
        localar1.o(bw.e(localar1));
        localk = new k(localar1, i);
        if ((!y.di(str2)) || (!y.dU(str2)))
          break label362;
        i1 = i;
        if ((!y.dc(str2)) || (y.dT(str2)))
          break label368;
      }
      while (true)
      {
        if ((k != 0) || (!localar1.aJA()) || (i1 != 0) || (i != 0))
          break label371;
        ap.yi().N(localar1.kk());
        return localk;
        int m = 0;
        break;
        localar1.bv(0);
        localar1.bJ(str2);
        if (paramq.dZy > 3)
        {
          n = paramq.dZy;
          localar2 = localar1;
          break label147;
        }
        n = 3;
        localar2 = localar1;
        break label147;
        bg.qW().oV().b(paramq.hOY, localar1);
        localk = new k(localar1, false);
        break label211;
        int i2 = 0;
        break label230;
        int j = 0;
      }
    }
  }

  protected ar a(q paramq, String paramString1, String paramString2, String paramString3)
  {
    aw localaw = bg.qW().oV();
    if (paramString3.equals(paramString1));
    while (true)
    {
      ar localar = localaw.q(paramString2, paramq.hOY);
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Long.valueOf(paramq.hOY);
      arrayOfObject1[1] = Long.valueOf(localar.kk());
      z.i("!44@/B4Tb64lLpKRf/dPq32Ifa+acCo+StrnxqhXyjPpfAs=", "dkmsgid prepareMsgInfo svrid:%d localid:%d", arrayOfObject1);
      if ((localar.kk() != 0L) && (604800000L + localar.kn() < bw.b(paramString1, paramq.hOV)))
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Long.valueOf(paramq.hOY);
        arrayOfObject2[1] = Long.valueOf(localar.kk());
        z.w("!44@/B4Tb64lLpKRf/dPq32Ifa+acCo+StrnxqhXyjPpfAs=", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", arrayOfObject2);
        bw.v(localar.kk());
        localar.o(0L);
      }
      if (localar.kk() == 0L)
      {
        localar = new ar();
        localar.p(paramq.hOY);
        localar.q(bw.b(paramString1, paramq.hOV));
        localar.setType(paramq.hOR);
        localar.setContent(ch.ja(ai.a(paramq.hOS)));
      }
      return localar;
      paramString2 = paramString1;
    }
  }

  public void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.u
 * JD-Core Version:    0.6.2
 */