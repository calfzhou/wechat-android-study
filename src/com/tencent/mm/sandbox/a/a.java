package com.tencent.mm.sandbox.a;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.nx;
import com.tencent.mm.protocal.a.ny;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;

public final class a extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;

  public a(int paramInt)
  {
    b localb = new b();
    localb.a(new nx());
    localb.b(new ny());
    localb.fi("/cgi-bin/micromsg-bin/getupdateinfo");
    localb.de(113);
    localb.df(35);
    localb.dg(1000000035);
    this.dmI = localb.sU();
    nx localnx = (nx)this.dmI.sO();
    localnx.ieb = paramInt;
    localnx.iah = l.cFn;
    if ((10012 == ao.dVY) && (ao.dVZ > 0))
      localnx.iah = ao.dVZ;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(localnx.ieb);
    arrayOfObject[1] = Integer.valueOf(localnx.iah);
    arrayOfObject[2] = Integer.valueOf(l.cFn);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvlltEyUofJIkASJ9OgHRliE=", "dkchan NetSceneGetUpdateInfo updateType:%d channel:%d release:%d", arrayOfObject);
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int aMm()
  {
    return ((ny)this.dmI.sP()).iee;
  }

  public final String aMn()
  {
    return ((ny)this.dmI.sP()).ied;
  }

  public final int aMo()
  {
    return ((ny)this.dmI.sP()).iec;
  }

  public final String aMp()
  {
    return ((ny)this.dmI.sP()).ief;
  }

  public final String[] aMq()
  {
    ny localny = (ny)this.dmI.sP();
    String[] arrayOfString = new String[localny.ieh.size()];
    int i = arrayOfString.length;
    for (int j = 0; j < i; j++)
      arrayOfString[j] = ((vt)localny.ieh.get(j)).getString();
    return arrayOfString;
  }

  public final String aMr()
  {
    return ((ny)this.dmI.sP()).iei;
  }

  public final int getType()
  {
    return 11;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.a.a
 * JD-Core Version:    0.6.2
 */