package com.tencent.mm.x;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.pk;
import com.tencent.mm.protocal.a.pl;
import com.tencent.mm.protocal.a.pm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.LinkedList;

public final class d extends x
  implements ab
{
  private m dlH;
  private final a dmI;
  private LinkedList dww;
  private String dwx;

  public d(ArrayList paramArrayList)
  {
    b localb = new b();
    localb.a(new pl());
    localb.b(new pm());
    localb.fi("/cgi-bin/micromsg-bin/invitegooglecontact");
    localb.de(489);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.dww = new LinkedList();
    if (paramArrayList.size() > 0)
      for (int i = 0; i < paramArrayList.size(); i++)
      {
        pk localpk = new pk();
        localpk.hQI = ((String)paramArrayList.get(i));
        this.dww.add(localpk);
      }
  }

  public final int a(r paramr, m paramm)
  {
    z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz73fnVukCcLy0RLMamaPrhe9Iy/jdhpZSEYm54712ix4=", "doScene");
    this.dlH = paramm;
    pl localpl = (pl)this.dmI.sO();
    localpl.huF = this.dww.size();
    localpl.hQc = this.dww;
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

  public final void gJ(String paramString)
  {
    this.dwx = paramString;
  }

  public final int getType()
  {
    return 489;
  }

  public final String xA()
  {
    return this.dwx;
  }

  public final pm xB()
  {
    return (pm)this.dmI.sP();
  }

  public final LinkedList xC()
  {
    return this.dww;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.d
 * JD-Core Version:    0.6.2
 */