package com.tencent.mm.model;

import com.tencent.mm.as.h;
import com.tencent.mm.o.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import java.util.Iterator;
import java.util.List;

final class bk
  implements p
{
  bk(bg parambg, ap paramap)
  {
  }

  public final void a(b paramb, boolean paramBoolean)
  {
    bg.f(this.dlm);
    bg.e(this.dlm).O(paramBoolean);
    long l = bg.qW().oO().dc(Thread.currentThread().getId());
    bg.b(bg.c(this.dlm), paramBoolean);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkwt set forceManual :%b", arrayOfObject);
    if (paramBoolean)
    {
      paramb.oT().yz("readerapp");
      paramb.oQ().set(256, Boolean.valueOf(true));
      Iterator localIterator = y.qq().iterator();
      while (localIterator.hasNext())
      {
        i locali2 = (i)localIterator.next();
        if ((locali2 != null) && ((int)locali2.dhv != 0) && (locali2.jc() == 32))
        {
          locali2.be(locali2.ox());
          z.d("!44@/B4Tb64lLpLN3e9EhE0UiCLOY9dIpm2TGVjx9YX0r8A=", "contact to updatefavour " + locali2.getUsername());
          bg.qW().oT().a(locali2.getUsername(), locali2);
        }
      }
      for (String str : y.dko)
      {
        i locali1 = paramb.oT().ys(str);
        if ((locali1 != null) && (((int)locali1.dhv != 0) || (com.tencent.mm.g.a.cv(locali1.getType()))))
        {
          locali1.tD();
          paramb.oT().a(str, locali1);
        }
      }
      ai.f(paramb);
      ai.e(paramb);
      ch.eq("ver" + com.tencent.mm.protocal.a.hrn);
    }
    new ah(bg.c(this.dlm), this.dlq).Q(paramBoolean);
    bg.qW().oO().dd(l);
    bg.c(this.dlm).oW().a(bg.g(bg.rh()).ih());
  }

  public final void d(b paramb)
  {
    bg.e(this.dlm).d(paramb);
  }

  public final void pC()
  {
    bg.b(this.dlm);
    f.a(bg.c(this.dlm), bg.d(this.dlm));
    bg.e(this.dlm).rY();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bk
 * JD-Core Version:    0.6.2
 */