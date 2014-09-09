package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class aq
  implements Runnable
{
  aq(ap paramap, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    ap.Bt();
    int i;
    Object localObject;
    if (this.dpb.getType() == 128)
    {
      ap.a(this.dHP);
      String str2 = ((t)this.dpb).getFileName();
      i = ((t)this.dpb).AJ();
      localObject = str2;
      long l = 0L;
      if ((localObject != null) && (this.dHP.dGs.get(localObject) != null))
      {
        l = ((l)this.dHP.dGs.get(localObject)).nM();
        this.dHP.dGs.remove(localObject);
      }
      z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "onSceneEnd SceneType:" + this.dpb.getType() + " errtype:" + this.dpd + " errCode:" + this.dpe + " retCode:" + i + " file:" + (String)localObject + " time:" + l);
      if ((this.dpd != 3) || (i == 0))
        break label405;
      ap.c(this.dHP);
      label217: z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "onSceneEnd  inCnt:" + ap.Bv() + " stop:" + ap.d(this.dHP) + " running:" + ap.e(this.dHP) + " recving:" + ap.f(this.dHP) + " sending:" + ap.g(this.dHP));
      if (ap.d(this.dHP) <= 0)
        break label424;
      ap.h(this.dHP);
    }
    while (true)
    {
      ap.Bu();
      return;
      if (this.dpb.getType() == 127)
      {
        ap.b(this.dHP);
        String str1 = ((w)this.dpb).getFileName();
        i = ((w)this.dpb).AJ();
        localObject = str1;
        break;
      }
      z.e("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "onSceneEnd Error SceneType:" + this.dpb.getType());
      ap.Bu();
      return;
      label405: if (this.dpd == 0)
        break label217;
      ap.a(this.dHP, 0);
      break label217;
      label424: if ((!ap.g(this.dHP)) && (!ap.f(this.dHP)))
        ap.i(this.dHP);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.aq
 * JD-Core Version:    0.6.2
 */