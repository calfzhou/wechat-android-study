package com.tencent.mm.n;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.bm;
import com.tencent.mm.protocal.a.bn;
import java.util.LinkedList;

public final class z extends x
  implements ab
{
  private m dlH;
  private LinkedList dnL = null;
  private LinkedList dnM = null;

  public z(LinkedList paramLinkedList)
  {
    this.dnL = paramLinkedList;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    if ((this.dnL == null) || (this.dnL.size() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvpajGcALgELfb+fEVloi6T1iuClPeVMNpw==", k.nL() + "doScene ReqSize==0");
      return -1;
    }
    this.dlH = paramm;
    b localb = new b();
    localb.a(new bm());
    localb.b(new bn());
    localb.fi("/cgi-bin/micromsg-bin/batchgetheadimg");
    localb.de(123);
    localb.df(15);
    localb.dg(1000000015);
    a locala = localb.sU();
    bm localbm = (bm)locala.sO();
    localbm.hvf = this.dnL;
    localbm.huF = this.dnL.size();
    return a(paramr, locala, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvpajGcALgELfb+fEVloi6T1iuClPeVMNpw==", "errType:" + paramInt2 + " errCode:" + paramInt3);
    this.dnM = ((bn)((a)paramaj).sP()).hQE;
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 123;
  }

  public final LinkedList sA()
  {
    return this.dnM;
  }

  protected final int sB()
  {
    return 20;
  }

  public final LinkedList sz()
  {
    return this.dnL;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.z
 * JD-Core Version:    0.6.2
 */