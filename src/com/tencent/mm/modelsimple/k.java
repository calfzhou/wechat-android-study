package com.tencent.mm.modelsimple;

import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

final class k
  implements m
{
  k(j paramj)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramx.getType());
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "dkcert getcert type:%d ret [%d,%d]", arrayOfObject);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      i.b(this.dCr.dCq).a(paramInt1, paramInt2, "", this.dCr.dCq);
      return;
    }
    this.dCr.dCq.a(i.c(this.dCr.dCq), i.b(this.dCr.dCq));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.k
 * JD-Core Version:    0.6.2
 */