package com.tencent.mm.modelsimple;

import com.tencent.mm.n.af;
import com.tencent.mm.n.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.wz;
import com.tencent.mm.protocal.a.xa;
import com.tencent.mm.protocal.a.xb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class al extends com.tencent.mm.o.x
  implements ab
{
  private m dlH;
  private final a dmI;

  public al(String paramString)
  {
    b localb = new b();
    localb.a(new xa());
    localb.b(new xb());
    localb.fi("/cgi-bin/micromsg-bin/searchcontact");
    localb.de(106);
    localb.df(34);
    localb.dg(1000000034);
    this.dmI = localb.sU();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvskuBoSXLBiioNoutEDWEGE=", "search username [%s]", new Object[] { paramString });
    ((xa)this.dmI.sO()).hVf = new vt().wF(paramString);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    xb localxb = (xb)this.dmI.sP();
    Iterator localIterator;
    if ((localxb != null) && (localxb.ibK > 0))
      localIterator = localxb.ibL.iterator();
    while (localIterator.hasNext())
    {
      wz localwz = (wz)localIterator.next();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localwz.hVf;
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvskuBoSXLBiioNoutEDWEGE=", "search RES username [%s]", arrayOfObject2);
      com.tencent.mm.n.x localx2 = new com.tencent.mm.n.x();
      localx2.setUsername(ai.a(localwz.hVf));
      localx2.fe(localwz.hTy);
      localx2.ff(localwz.hTz);
      localx2.db(-1);
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = localx2.getUsername();
      arrayOfObject3[1] = localx2.st();
      arrayOfObject3[2] = localx2.su();
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvskuBoSXLBiioNoutEDWEGE=", "dkhurl search %s b[%s] s[%s]", arrayOfObject3);
      localx2.bi(3);
      localx2.T(true);
      af.sJ().a(localx2);
      continue;
      if ((localxb != null) && (!ch.jb(ai.a(localxb.hVf))))
      {
        String str = ai.a(localxb.hVf);
        com.tencent.mm.n.x localx1 = new com.tencent.mm.n.x();
        localx1.setUsername(str);
        localx1.fe(localxb.hTy);
        localx1.ff(localxb.hTz);
        localx1.db(-1);
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = localx1.getUsername();
        arrayOfObject1[1] = localx1.st();
        arrayOfObject1[2] = localx1.su();
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvskuBoSXLBiioNoutEDWEGE=", "dkhurl search %s b[%s] s[%s]", arrayOfObject1);
        localx1.bi(3);
        localx1.T(true);
        af.sJ().a(localx1);
      }
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 106;
  }

  public final xb zG()
  {
    return (xb)this.dmI.sP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.al
 * JD-Core Version:    0.6.2
 */