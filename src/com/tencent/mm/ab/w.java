package com.tencent.mm.ab;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a.ee;
import com.tencent.mm.protocal.a.ef;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.protocal.a.to;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.ar;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import java.util.ArrayList;
import java.util.LinkedList;

final class w
  implements az
{
  int dAa = this.dAb.dzY;

  w(v paramv)
  {
  }

  public final boolean kJ()
  {
    if (this.dAa <= 0)
      return false;
    this.dAa = (-1 + this.dAa);
    ar localar = new ar();
    localar.hNM.hTr = new ef();
    int i = ap.P(this.dAb.dzZ, 1);
    int j = 0;
    while (true)
      if (j < i)
      {
        q localq = (q)u.yC().get(ap.P(-1 + u.yC().size(), 0));
        localq.hOP = new vt().wF(((i)u.yB().get(ap.P(-1 + u.yB().size(), 0))).getUsername());
        localq.hOV = ((int)ap.CL());
        localq.hOY = Math.abs((int)ap.CM() % 10000000);
        try
        {
          ee localee = new ee();
          localee.hUr = new ws();
          localee.hUr.cl(localq.toByteArray());
          localee.hUq = 5;
          localar.hNM.hTr.hQc.add(localee);
          ef localef = localar.hNM.hTr;
          localef.huF = (1 + localef.huF);
          Object[] arrayOfObject = new Object[6];
          arrayOfObject[0] = Integer.valueOf(this.dAa);
          arrayOfObject[1] = Integer.valueOf(j);
          arrayOfObject[2] = Integer.valueOf(i);
          arrayOfObject[3] = Integer.valueOf(localar.hNM.hTr.hQc.size());
          arrayOfObject[4] = Long.valueOf(localq.hOY);
          arrayOfObject[5] = localq.hOP.getString();
          z.d("!32@/B4Tb64lLpJ890peMBnAqTpgOBI4mE3+", "syncAddMsg  loop:%d cnt:[%d,%d] cmdList:%d id:%d u:%s", arrayOfObject);
          j++;
        }
        catch (Exception localException)
        {
          while (true)
            z.d("!32@/B4Tb64lLpJ890peMBnAqTpgOBI4mE3+", localException.getMessage());
        }
      }
    localar.hNM.hSL = 0;
    localar.hNM.hTq = ai.z(ap.jg(ap.ja((String)bg.qW().oQ().get(8195, new byte[0]))));
    localar.hNM.hQw = 0;
    localar.hNM.dZy = 0;
    bg.qX().d(new k(localar, 0, ap.CL()));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.w
 * JD-Core Version:    0.6.2
 */