package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class bc
  implements Runnable
{
  bc(bb parambb, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    bb.nA();
    int j;
    long l1;
    if (this.dpb.getType() == 222)
    {
      z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "onSceneEnd  SendAppMsg errtype:" + this.dpd + " errCode:" + this.dpe);
      j = 0;
      l1 = -1L;
      long l2 = 0L;
      if ((l1 != -1L) && (this.hvx.dGs.get(Long.valueOf(l1)) != null))
      {
        l2 = ((l)this.hvx.dGs.get(Long.valueOf(l1))).nM();
        this.hvx.dGs.remove(Long.valueOf(l1));
      }
      z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "onSceneEnd SceneType:" + this.dpb.getType() + " errtype:" + this.dpd + " errCode:" + this.dpe + " retCode:" + j + " rowid:" + l1 + " time:" + l2);
      if ((this.dpd != 3) || (j == 0))
        break label571;
      bb.c(this.hvx);
      label238: z.d("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "onSceneEnd  inCnt:" + bb.nB() + " stop:" + bb.d(this.hvx) + " running:" + bb.e(this.hvx) + " recving:" + bb.f(this.hvx) + " sending:" + bb.g(this.hvx));
      if (bb.d(this.hvx) <= 0)
        break label590;
      bb.h(this.hvx);
    }
    while (true)
    {
      bb.Be();
      return;
      if (this.dpb.getType() == 221)
      {
        bb.a(this.hvx);
        long l3 = ((ae)this.dpb).ayM();
        int k = ((ae)this.dpb).AJ();
        l1 = l3;
        j = k;
        break;
      }
      if (this.dpb.getType() == 220)
      {
        bb.b(this.hvx);
        l1 = ((av)this.dpb).ayM();
        int i = ((av)this.dpb).AJ();
        String str = ((av)this.dpb).lj();
        if ((!((av)this.dpb).ayX()) && (!ch.jb(str)))
        {
          a locala = new a();
          bf.GP().b(l1, locala);
          if (locala.iGx == l1)
          {
            s.g(locala.field_msgInfoId, str);
            bb.cr(locala.field_msgInfoId);
          }
        }
        j = i;
        break;
      }
      z.e("!32@/B4Tb64lLpLoJPSIVxJcckmKhlwfO3bY", "onSceneEnd Error SceneType:" + this.dpb.getType());
      bb.Be();
      return;
      label571: if (this.dpd == 0)
        break label238;
      bb.a(this.hvx, 0);
      break label238;
      label590: if ((!bb.g(this.hvx)) && (!bb.f(this.hvx)))
        bb.i(this.hvx);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.bc
 * JD-Core Version:    0.6.2
 */