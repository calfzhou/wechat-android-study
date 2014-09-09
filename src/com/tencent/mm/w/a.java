package com.tencent.mm.w;

import com.tencent.mm.model.at;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.aeh;
import com.tencent.mm.protocal.a.od;
import com.tencent.mm.protocal.a.oe;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import java.io.FileOutputStream;
import java.util.LinkedList;

public final class a extends x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;
  private ay dmV = new ay(new b(this), true);
  private int dwk = 0;

  public a()
  {
    int i = ch.a((Integer)bg.qW().oQ().get(66052));
    boolean bool = at.qz().cK(i);
    int j = 0;
    if (bool)
      j = ch.a((Integer)bg.qW().oQ().get(66053));
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviARrLmr0Ct8vO5+LRFl3DY=", "init: allfileid:" + Integer.toBinaryString(i) + " inver:" + ch.a((Integer)bg.qW().oQ().get(66053)) + " reqver:" + j);
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new od());
    localb.b(new oe());
    localb.fi("/cgi-bin/micromsg-bin/getvuserinfo");
    localb.de(167);
    localb.df(60);
    localb.dg(1000000060);
    this.dmI = localb.sU();
    ((od)this.dmI.sO()).hWt = j;
  }

  private static boolean a(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte)
  {
    try
    {
      FileOutputStream localFileOutputStream = new FileOutputStream(at.qz().e(paramInt, paramBoolean));
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.close();
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    int i = 0;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnviARrLmr0Ct8vO5+LRFl3DY=", "errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    oe localoe = (oe)((com.tencent.mm.o.a)paramaj).sP();
    z.d("!44@/B4Tb64lLpK+IBX8XDgnviARrLmr0Ct8vO5+LRFl3DY=", "onGYNetEnd new version:" + localoe.hWt + " old version:" + ch.a((Integer)bg.qW().oQ().get(66053)) + " Count:" + localoe.iel.size());
    bg.qW().oQ().set(66053, Integer.valueOf(localoe.hWt));
    if (localoe.iel.size() <= 0)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    int j = 0;
    while (i < localoe.iel.size())
    {
      j |= ((aeh)localoe.iel.get(i)).ixd;
      i++;
    }
    bg.qW().oQ().set(66052, Integer.valueOf(j));
    this.dlH.a(paramInt2, paramInt3, paramString, this);
    this.dwk = (-1 + localoe.iel.size());
    this.dmV.cP(50L);
  }

  public final int getType()
  {
    return 167;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.w.a
 * JD-Core Version:    0.6.2
 */