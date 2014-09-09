package com.tencent.mm.ui.voicesearch;

import com.tencent.mm.model.y;
import com.tencent.mm.modelsimple.al;
import com.tencent.mm.n.af;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class m
  implements Runnable
{
  m(j paramj, x paramx)
  {
  }

  public final void run()
  {
    xb localxb = ((al)this.dpb).zG();
    z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "count " + localxb.ibK);
    if (localxb.ibK > 0)
    {
      Iterator localIterator = localxb.ibL.iterator();
      while (localIterator.hasNext())
      {
        wz localwz2 = (wz)localIterator.next();
        if (y.cF(localwz2.ifO))
        {
          if (j.f(this.jZD) == null)
            j.a(this.jZD, new LinkedList());
          j.f(this.jZD).add(localwz2);
        }
      }
    }
    String str = ai.a(localxb.hVf);
    z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "user " + str);
    if (ch.ja(str).length() > 0)
    {
      wz localwz1 = new wz();
      localwz1.hVf = localxb.hVf;
      localwz1.ifO = localxb.ifO;
      localwz1.dtg = localxb.dtg;
      localwz1.ifj = localxb.ifj;
      localwz1.dti = localxb.dti;
      localwz1.dtm = localxb.dtm;
      localwz1.Kt = localxb.Kt;
      localwz1.Ks = localxb.Ks;
      localwz1.dtf = localxb.dtf;
      localwz1.ifP = localxb.ifP;
      localwz1.ifS = localxb.ifS;
      localwz1.ifQ = localxb.ifQ;
      localwz1.ifR = localxb.ifR;
      localwz1.ifU = localxb.ifU;
      af.sh().c(str, ai.a(localxb.hOU));
      if (j.f(this.jZD) == null)
        j.a(this.jZD, new LinkedList());
      j.f(this.jZD).clear();
      if (y.cF(localwz1.ifO))
        j.f(this.jZD).add(localwz1);
      z.d("!44@/B4Tb64lLpIwWRoRNv7NY4nYWcMLVN9cmAcB8VcA6vM=", "count " + j.f(this.jZD).size());
    }
    j.b(this.jZD, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.m
 * JD-Core Version:    0.6.2
 */