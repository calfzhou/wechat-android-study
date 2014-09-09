package com.tencent.mm.x;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.bs;
import com.tencent.mm.protocal.a.bt;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends x
  implements ab
{
  public static int dwm = 0;
  public static int dwn = 1;
  public static int dwo = -85;
  private m dlH;
  private final com.tencent.mm.o.a dmI;
  private int dwp = -1;
  private String dwq;
  private int dwr = 0;

  public a(int paramInt1, String paramString, int paramInt2)
  {
    switch (b.dws[(paramInt1 - 1)])
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      this.dwq = paramString;
      this.dwr = paramInt2;
      b localb = new b();
      localb.a(new bs());
      localb.b(new bt());
      localb.fi("/cgi-bin/micromsg-bin/bindgooglecontact");
      localb.de(487);
      localb.df(0);
      localb.dg(0);
      this.dmI = localb.sU();
      return;
      this.dwp = 1;
      continue;
      this.dwp = 2;
    }
  }

  public final int a(r paramr, m paramm)
  {
    z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz73fnVukCcLy0RLMamaPrhe9Iy/jdhpZSEYm54712ix4=", "doScene");
    this.dlH = paramm;
    bs localbs = (bs)this.dmI.sO();
    localbs.hQH = this.dwp;
    localbs.hQI = this.dwq;
    localbs.hQJ = this.dwr;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = paramString;
    z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz73fnVukCcLy0RLMamaPrhe9Iy/jdhpZSEYm54712ix4=", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", arrayOfObject);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 487;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.a
 * JD-Core Version:    0.6.2
 */