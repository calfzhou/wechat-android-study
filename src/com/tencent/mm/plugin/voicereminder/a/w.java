package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.modelvoice.t;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class w
  implements Runnable
{
  w(v paramv, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    v.nA();
    int i;
    Object localObject;
    if (this.dpb.getType() == 128)
    {
      v.a(this.gSV);
      String str2 = ((t)this.dpb).getFileName();
      i = ((t)this.dpb).AJ();
      localObject = str2;
      long l = 0L;
      if ((localObject != null) && (this.gSV.dGs.get(localObject) != null))
      {
        l = ((l)this.gSV.dGs.get(localObject)).nM();
        this.gSV.dGs.remove(localObject);
      }
      z.d("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "onSceneEnd SceneType:" + this.dpb.getType() + " errtype:" + this.dpd + " errCode:" + this.dpe + " retCode:" + i + " file:" + (String)localObject + " time:" + l);
      if ((this.dpd != 3) || (i == 0))
        break label406;
      v.c(this.gSV);
      label217: z.d("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "onSceneEnd  inCnt:" + v.nB() + " stop:" + v.d(this.gSV) + " running:" + v.e(this.gSV) + " recving:" + v.f(this.gSV) + " sending:" + v.g(this.gSV));
      if (v.d(this.gSV) <= 0)
        break label425;
      v.h(this.gSV);
    }
    while (true)
    {
      v.Be();
      return;
      if (this.dpb.getType() == 329)
      {
        v.b(this.gSV);
        String str1 = ((b)this.dpb).getFileName();
        i = ((b)this.dpb).AJ();
        localObject = str1;
        break;
      }
      z.e("!44@/B4Tb64lLpLcQwGQMRj/JTqm3tSvFCTzMyP/DRnOfzs=", "onSceneEnd Error SceneType:" + this.dpb.getType());
      v.Be();
      return;
      label406: if (this.dpd == 0)
        break label217;
      v.a(this.gSV, 0);
      break label217;
      label425: if ((!v.g(this.gSV)) && (!v.f(this.gSV)))
        v.i(this.gSV);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.w
 * JD-Core Version:    0.6.2
 */