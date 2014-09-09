package com.tencent.mm.modelfriend;

import com.tencent.mm.compatible.c.v;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.a.aba;
import com.tencent.mm.protocal.a.gb;
import com.tencent.mm.protocal.a.gd;
import com.tencent.mm.protocal.a.zb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;

public final class al extends x
  implements com.tencent.mm.network.ab
{
  private m dlH;
  private aj dpk = new am();
  private int dua = 2;

  private al(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.protocal.aa localaa = (com.tencent.mm.protocal.aa)this.dpk.tk();
    localaa.hNB.hQH = paramInt;
    localaa.hNB.hQG = paramString1;
    localaa.hNB.eJv = y.aGW();
    localaa.hNB.hRj = ch.je(paramString2);
    localaa.hNB.hVI = paramString3;
    localaa.hNB.hRg = bg.qS();
    localaa.hNB.hVJ = v.getSimCountryIso();
    localaa.hNB.hVK = 1;
  }

  public al(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2, "");
  }

  public al(String paramString1, String paramString2, String paramString3)
  {
    this(2, paramString1, paramString2, paramString3);
  }

  protected final int a(aj paramaj)
  {
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvngb9j239D9dCEvdErt89hw=", "onGYNetEnd  errType:%d errCode:%d", arrayOfObject);
    com.tencent.mm.protocal.ab localab = (com.tencent.mm.protocal.ab)paramaj.sS();
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      bg.a(true, localab.hNC.hRm, localab.hNC.hRn, localab.hNC.hRl);
      this.dua = (-1 + this.dua);
      if (this.dua <= 0)
      {
        this.dlH.a(3, -1, "", this);
        return;
      }
      a(tp(), this.dlH);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvngb9j239D9dCEvdErt89hw=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    bg.a(false, localab.hNC.hRm, localab.hNC.hRn, localab.hNC.hRl);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      b.eT(ws());
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 481;
  }

  protected final int sB()
  {
    return 5;
  }

  public final int sg()
  {
    return ((com.tencent.mm.protocal.aa)this.dpk.tk()).hNB.hQH;
  }

  public final String wm()
  {
    return ((com.tencent.mm.protocal.ab)this.dpk.sS()).hNC.hVL;
  }

  public final int ws()
  {
    zb localzb = ((com.tencent.mm.protocal.ab)this.dpk.sS()).hNC.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 1)
          return ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.al
 * JD-Core Version:    0.6.2
 */