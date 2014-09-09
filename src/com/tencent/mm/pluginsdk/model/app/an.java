package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.rh;
import com.tencent.mm.protocal.a.ri;
import com.tencent.mm.sdk.platformtools.z;

public final class an extends x
  implements ab
{
  private m dlH;
  public a dmI;

  public an(int paramInt, String paramString)
  {
    b localb = new b();
    localb.a(new rh());
    localb.b(new ri());
    localb.fi("/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist");
    localb.de(1060);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    rh localrh = (rh)this.dmI.sO();
    localrh.offset = paramInt;
    localrh.doC = 20;
    localrh.dAo = paramString;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvvsJGPpivDLw2hUYb3eiJqTXVZj/QSd20A==", "do scene");
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvvsJGPpivDLw2hUYb3eiJqTXVZj/QSd20A==", "onGYNetEnd code(%d, %d)", arrayOfObject);
    if (this.dlH != null)
      this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 1060;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.an
 * JD-Core Version:    0.6.2
 */