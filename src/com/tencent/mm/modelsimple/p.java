package com.tencent.mm.modelsimple;

import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

final class p
  implements m
{
  p(o paramo)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramx.getType());
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    z.d("!32@/B4Tb64lLpK+IBX8XDgnvvg1+4U6Dcrr", "dkcert getcert type:%d ret [%d,%d]", arrayOfObject);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      n.b(this.dCw.dCv).a(paramInt1, paramInt2, "", this.dCw.dCv);
      return;
    }
    this.dCw.dCv.a(n.c(this.dCw.dCv), n.b(this.dCw.dCv));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.p
 * JD-Core Version:    0.6.2
 */