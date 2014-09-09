package com.tencent.mm.q;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import com.tencent.mm.storage.v;

final class ac
  implements v
{
  ac(aa paramaa)
  {
  }

  public final void a(r paramr, s params)
  {
    String str;
    a locala;
    if ((paramr != null) && (!ch.jb(paramr.getUsername())))
    {
      str = paramr.getUsername();
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(str);
      if ((locali != null) && (locali.aIg()) && (!y.du(str)))
      {
        locala = aa.uY().fz(str);
        if (!locala.ui())
          break label132;
        if (locala.tY() != null)
          break label89;
        paramr.bx(null);
        z.e("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "getExtInfo() == null");
      }
    }
    return;
    label89: if (locala.tY().uD() == null)
    {
      paramr.bx(null);
      z.e("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "enterpriseBizInfo == null");
      return;
    }
    paramr.bx(ch.ja(locala.tY().uD().dqu));
    return;
    label132: if ((locala.uf()) || (locala.uh()) || (y.dO(str)))
    {
      paramr.bx(null);
      return;
    }
    paramr.bx("officialaccounts");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.ac
 * JD-Core Version:    0.6.2
 */