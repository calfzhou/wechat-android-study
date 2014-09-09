package com.tencent.mm.model;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.o.g;
import com.tencent.mm.protocal.a.cx;
import com.tencent.mm.sdk.platformtools.z;

final class bj
  implements Runnable
{
  bj(cx paramcx1, cx paramcx2, cx paramcx3)
  {
  }

  public final void run()
  {
    l locall = new l();
    long l = -1L;
    if ((bg.h(bg.rh()) != null) && (this.dln != null))
    {
      bg.h(bg.rh()).b(this.dln, this.dlo, this.dlp);
      l = locall.nM();
    }
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(locall.nM());
    arrayOfObject[1] = Long.valueOf(l);
    z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "dkrsa setautoauthtick [%d %d]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bj
 * JD-Core Version:    0.6.2
 */