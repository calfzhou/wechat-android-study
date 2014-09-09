package com.tencent.mm.modelfriend;

import android.content.Context;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.aba;
import com.tencent.mm.protocal.a.by;
import com.tencent.mm.protocal.a.bz;
import com.tencent.mm.protocal.a.zb;
import com.tencent.mm.protocal.s;
import com.tencent.mm.protocal.t;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.y;
import java.util.Iterator;
import java.util.LinkedList;

public final class ai extends x
  implements ab
{
  private m dlH = null;
  private final com.tencent.mm.network.aj dpk = new aj();
  private int dua = 2;

  public ai(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3)
  {
    s locals = (s)this.dpk.tk();
    locals.hNs.hQH = paramInt1;
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvtitwdiFr6yUU+4wykkCPbQfDMqQQ+s8JQ==", "Get mobile:" + paramString1 + " opcode:" + paramInt1 + " verifyCode:" + paramString2);
    locals.hNs.hQV = paramString1;
    locals.hNs.hQW = paramString2;
    locals.hNs.hQX = paramInt2;
    locals.hNs.hQY = paramString3;
    locals.hNs.eJv = y.aGW();
    locals.hNs.hRg = bg.qS();
    by localby;
    if ((ch.jb(locals.hNs.hRb)) && (ch.jb(locals.hNs.hRc)))
    {
      localby = locals.hNs;
      if (!l.iDv)
        break label218;
    }
    label218: for (String str = ak.getContext().getString(n.cbC); ; str = ak.getContext().getString(n.cbB))
    {
      localby.hRb = str;
      locals.hNs.hRc = a.hrm;
      return;
    }
  }

  public ai(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    this(paramString1, paramInt1, paramString2, 0, paramString3);
    ((s)this.dpk.tk()).hNs.hQZ = paramString4;
  }

  public ai(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this(paramString1, 11, paramString2, 0, paramString3, paramString4);
    s locals = (s)this.dpk.tk();
    locals.hNs.hRb = paramString5;
    locals.hNs.hRc = paramString6;
  }

  private int ws()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
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

  protected final int a(com.tencent.mm.network.aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    s locals = (s)this.dpk.tk();
    if ((locals.hNs.hQV == null) || (locals.hNs.hQV.length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvtitwdiFr6yUU+4wykkCPbQfDMqQQ+s8JQ==", "doScene getMobile Error: " + locals.hNs.hQV);
      return -1;
    }
    if (((locals.hNs.hQH == 6) || (locals.hNs.hQH == 9)) && ((locals.hNs.hQW == null) || (locals.hNs.hQW.length() <= 0)))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvtitwdiFr6yUU+4wykkCPbQfDMqQQ+s8JQ==", "doScene getVerifyCode Error: " + locals.hNs.hQV);
      return -1;
    }
    return a(paramr, this.dpk, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(paramInt3);
    com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpK+IBX8XDgnvtitwdiFr6yUU+4wykkCPbQfDMqQQ+s8JQ==", "dkidc onGYNetEnd  errType:%d errCode:%d", arrayOfObject);
    t localt = (t)paramaj.sS();
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      bg.a(true, localt.hNt.hRm, localt.hNt.hRn, localt.hNt.hRl);
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
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpK+IBX8XDgnvtitwdiFr6yUU+4wykkCPbQfDMqQQ+s8JQ==", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    bg.a(false, localt.hNt.hRm, localt.hNt.hRn, localt.hNt.hRl);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      b.eT(ws());
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
  }

  public final void dA(int paramInt)
  {
    ((s)this.dpk.tk()).hNs.hRf = paramInt;
  }

  public final void dz(int paramInt)
  {
    ((s)this.dpk.tk()).hNs.hRe = paramInt;
  }

  public final int getType()
  {
    return 145;
  }

  public final String getUsername()
  {
    return ((t)this.dpk.sS()).hNt.hRk;
  }

  protected final int sB()
  {
    return 3;
  }

  public final int sg()
  {
    return ((s)this.dpk.tk()).hNs.hQH;
  }

  public final String tR()
  {
    return ((t)this.dpk.sS()).hNt.hQZ;
  }

  public final int wk()
  {
    return ((t)this.dpk.sS()).hNt.hRi;
  }

  public final String wl()
  {
    return ((t)this.dpk.sS()).hNt.hRj;
  }

  public final String wm()
  {
    return ((t)this.dpk.sS()).hNt.dQm;
  }

  public final String wn()
  {
    return ((t)this.dpk.sS()).hNt.hRs;
  }

  public final int wo()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 6)
          return ch.getInt(localaba.iuZ, 3);
      }
    }
    return 3;
  }

  public final int wp()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 4)
          return ch.getInt(localaba.iuZ, 30);
      }
    }
    return 30;
  }

  public final int wq()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 5)
          return ch.getInt(localaba.iuZ, 0);
      }
    }
    return 0;
  }

  public final boolean wr()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    aba localaba;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localaba = (aba)localIterator.next();
      }
      while (localaba.hPS != 7);
    }
    for (int i = ch.getInt(localaba.iuZ, 0); ; i = 0)
      return i > 0;
  }

  public final boolean wt()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    aba localaba;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localaba = (aba)localIterator.next();
      }
      while (localaba.hPS != 10);
    }
    for (int i = ch.getInt(localaba.iuZ, 0); ; i = 0)
      return i > 0;
  }

  public final String wu()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 14)
          return localaba.iuZ;
      }
    }
    return null;
  }

  public final String wv()
  {
    zb localzb = ((t)this.dpk.sS()).hNt.hRu;
    if ((localzb != null) && (localzb.iss != null) && (localzb.iss.size() > 0))
    {
      Iterator localIterator = localzb.iss.iterator();
      while (localIterator.hasNext())
      {
        aba localaba = (aba)localIterator.next();
        if (localaba.hPS == 15)
          return localaba.iuZ;
      }
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ai
 * JD-Core Version:    0.6.2
 */