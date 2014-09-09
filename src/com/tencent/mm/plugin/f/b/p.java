package com.tencent.mm.plugin.f.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.aea;
import com.tencent.mm.protocal.a.aeb;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class p extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public p(LinkedList paramLinkedList)
  {
    if (paramLinkedList == null)
      throw new NullPointerException("arg list must not be null");
    b localb = new b();
    localb.a(new aea());
    localb.b(new aeb());
    localb.fi("/cgi-bin/micromsg-bin/useractionreport");
    localb.de(311);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    aea localaea = (aea)this.dmI.sO();
    localaea.hSn = com.tencent.mm.protocal.a.hrh;
    localaea.hSm = com.tencent.mm.protocal.a.hri;
    localaea.hSp = com.tencent.mm.protocal.a.hrl;
    localaea.hSq = y.aGW();
    localaea.hSo = com.tencent.mm.protocal.a.hrk;
    localaea.iwO = paramLinkedList.size();
    localaea.hQc = paramLinkedList;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0))
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvqKNZoWR4O7s886QyC6aQFihVZKa9kW5xA==", "get report strategy ok");
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 311;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.f.b.p
 * JD-Core Version:    0.6.2
 */