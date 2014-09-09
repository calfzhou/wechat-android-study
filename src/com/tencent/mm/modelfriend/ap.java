package com.tencent.mm.modelfriend;

import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.o.z;
import com.tencent.mm.protocal.a.no;
import com.tencent.mm.sdk.platformtools.y;
import java.util.LinkedList;

public final class ap extends x
  implements ab
{
  private m dlH = null;
  private final com.tencent.mm.network.aj dpk = new aq();

  public ap(String paramString1, String paramString2, int paramInt, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    com.tencent.mm.protocal.ai localai = (com.tencent.mm.protocal.ai)this.dpk.tk();
    localai.hNG.idw = paramString1;
    localai.hNG.idx = paramString2;
    localai.hNG.hwV = paramString3;
    localai.hNG.idy = paramString4;
    localai.hNG.idz = paramString5;
    localai.hNG.idA = paramString6;
    localai.hNG.idB = paramInt;
    localai.hNG.eJv = y.aGW();
    localai.hNG.hRg = bg.qS();
  }

  protected final int a(com.tencent.mm.network.aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  protected final void a(z paramz)
  {
  }

  public final int getType()
  {
    return 429;
  }

  protected final int sB()
  {
    return 3;
  }

  public final int wA()
  {
    return ((com.tencent.mm.protocal.aj)this.dpk.sS()).hNH.idD;
  }

  public final byte[] wB()
  {
    return com.tencent.mm.platformtools.ai.a(((com.tencent.mm.protocal.aj)this.dpk.sS()).hNH.idC, new byte[0]);
  }

  public final String wC()
  {
    return ((com.tencent.mm.protocal.aj)this.dpk.sS()).hNH.idz;
  }

  public final LinkedList wz()
  {
    return ((com.tencent.mm.protocal.aj)this.dpk.sS()).hNH.hQc;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ap
 * JD-Core Version:    0.6.2
 */