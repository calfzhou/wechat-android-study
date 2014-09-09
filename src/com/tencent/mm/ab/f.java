package com.tencent.mm.ab;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.at;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class f extends x
  implements ab
{
  private m dlH;
  private aj dpk;
  private long dzm = -1L;

  public f(long paramLong)
  {
    this.dzm = paramLong;
  }

  public final int a(r paramr, m paramm)
  {
    this.dpk = new g();
    byte[] arrayOfByte = ap.jg(ap.ja((String)bg.qW().oQ().get(8195)));
    if (ap.B(arrayOfByte))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvhmsI+8x2U2NWfALp1Hk+2M=", "dkpush %s", new Object[] { "get keyBuf failed" });
      return -1;
    }
    ((at)this.dpk.tk()).cE(this.dzm);
    ((at)this.dpk.tk()).aS(arrayOfByte);
    this.dlH = paramm;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvhmsI+8x2U2NWfALp1Hk+2M=", "dkpush %s", new Object[] { "doscene now" });
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 268369922;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.f
 * JD-Core Version:    0.6.2
 */