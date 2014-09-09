package com.tencent.mm.modelsimple;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.w;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;

public final class y extends x
  implements ab
{
  private m dlH;
  private final aj dpk = new w();

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvo8kWlPn93ZHd7LGXDDDDNM=", "dkcert onGYNetEnd [%d,%d]", arrayOfObject);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 381;
  }

  public final boolean tq()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.y
 * JD-Core Version:    0.6.2
 */