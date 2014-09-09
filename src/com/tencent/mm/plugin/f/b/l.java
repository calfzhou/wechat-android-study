package com.tencent.mm.plugin.f.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.eb;
import com.tencent.mm.protocal.a.ec;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class l extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public l(LinkedList paramLinkedList)
  {
    b localb = new b();
    localb.a(new eb());
    localb.b(new ec());
    localb.fi("/cgi-bin/micromsg-bin/clientperfreport");
    localb.de(309);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    eb localeb = (eb)this.dmI.sO();
    localeb.hSn = com.tencent.mm.protocal.a.hrh;
    localeb.hSm = com.tencent.mm.protocal.a.hri;
    localeb.hSp = com.tencent.mm.protocal.a.hrl;
    localeb.hSq = y.aGW();
    localeb.hSo = com.tencent.mm.protocal.a.hrk;
    localeb.hQc = paramLinkedList;
    localeb.hUo = paramLinkedList.size();
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvspKwibh5bfcrypJOQbfQNy62LwDne5OpQ==", "get report strategy ok");
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 309;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.l
 * JD-Core Version:    0.6.2
 */