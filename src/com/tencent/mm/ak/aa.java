package com.tencent.mm.ak;

import com.tencent.mm.compatible.g.l;
import com.tencent.mm.o.x;
import java.util.Map;

final class aa
  implements Runnable
{
  aa(z paramz, x paramx, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    z.nA();
    int i;
    Object localObject;
    if (this.dpb.getType() == 150)
    {
      z.a(this.dGx);
      String str2 = ((d)this.dpb).getFileName();
      y.dGq = str2;
      int j = ((d)this.dpb).AJ();
      z.b(this.dGx);
      i = j;
      localObject = str2;
    }
    while (true)
    {
      long l = 0L;
      if ((localObject != null) && (this.dGx.dGs.get(localObject) != null))
      {
        l = ((l)this.dGx.dGs.get(localObject)).nM();
        this.dGx.dGs.remove(localObject);
      }
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "onSceneEnd SceneType:" + this.dpb.getType() + " errtype:" + this.dpd + " errCode:" + this.dpe + " retCode:" + i + " file:" + (String)localObject + " time:" + l);
      if ((this.dpd == 3) && (i != 0))
      {
        z.e(this.dGx);
        label234: com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "onSceneEnd  inCnt:" + z.nB() + " stop:" + z.f(this.dGx) + " running:" + z.g(this.dGx) + " recving:" + z.h(this.dGx) + " sending:" + z.i(this.dGx));
        if (z.f(this.dGx) <= 0)
          break label488;
        z.j(this.dGx);
      }
      while (true)
      {
        z.Be();
        return;
        if (this.dpb.getType() == 149)
        {
          z.c(this.dGx);
          z.d(this.dGx);
          if ((this.dpb instanceof g))
          {
            String str1 = ((g)this.dpb).getFileName();
            i = ((g)this.dpb).AJ();
            localObject = str1;
            break;
          }
          if (!(this.dpb instanceof k))
            break label518;
          localObject = ((k)this.dpb).getFileName();
          i = 0;
          break;
        }
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpLVp/k2HKC5ReM1DewbkulZ", "onSceneEnd Error SceneType:" + this.dpb.getType());
        z.Be();
        return;
        if (this.dpd == 0)
          break label234;
        z.a(this.dGx, 0);
        break label234;
        label488: if ((!z.i(this.dGx)) && (!z.h(this.dGx)))
          z.k(this.dGx);
      }
      label518: i = 0;
      localObject = null;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.aa
 * JD-Core Version:    0.6.2
 */