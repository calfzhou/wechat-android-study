package com.tencent.mm.ab;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.bc;
import com.tencent.mm.protocal.bd;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class i extends x
  implements ab
{
  private m dlH;
  private final aj dpk = new j();

  public i()
  {
    if ((bg.qW() != null) && (bg.qW().oQ() != null))
    {
      String str = (String)bg.qW().oQ().get(8195);
      ((bc)this.dpk.tk()).aT(ap.jg(str));
      ((bc)this.dpk.tk()).bk(bg.qW().oD());
      return;
    }
    z.e("!44@/B4Tb64lLpK+IBX8XDgnvu5u9K1H+kdxmklhbC1aTkU=", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    bd localbd = (bd)paramaj.sS();
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvu5u9K1H+kdxmklhbC1aTkU=", "new syncCheck complete, selector=" + localbd.aHd());
    if ((bg.oE()) && (!bg.rd()))
    {
      byte[] arrayOfByte = ((bc)paramaj.tk()).aHc();
      if (ap.B(arrayOfByte))
        z.e("!44@/B4Tb64lLpK+IBX8XDgnvu5u9K1H+kdxmklhbC1aTkU=", "onGYNetEnd md5 is null");
      localbd.aU(arrayOfByte);
      n.a(localbd.aHd(), 3, localbd.aHl());
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 39;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.i
 * JD-Core Version:    0.6.2
 */