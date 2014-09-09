package com.tencent.mm.modelvoice;

import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.az;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.fz;
import com.tencent.mm.protocal.a.ga;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.q;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class t extends x
  implements ab
{
  private static az dGZ = null;
  private static List dHa = new ArrayList();
  private int cIm = 0;
  private String dGY;
  private boolean dHb = false;
  private boolean dHc = false;
  private m dlH;
  private a dmI;
  private ay dmV = new ay(new v(this), false);
  private String rI;

  public t(br parambr)
  {
    boolean bool2;
    if (parambr != null)
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      this.rI = parambr.getFileName();
      if (this.rI == null)
        break label108;
    }
    while (true)
    {
      Assert.assertTrue(bool1);
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "NetSceneDownloadVoice:  file:" + this.rI);
      this.dGY = parambr.BO();
      return;
      bool2 = false;
      break;
      label108: bool1 = false;
    }
  }

  private void Bo()
  {
    String str = this.rI;
    ar localar;
    if (str == null)
      localar = null;
    while (localar != null)
    {
      if (dGZ != null)
        dGZ.b(localar);
      Iterator localIterator = dHa.iterator();
      while (localIterator.hasNext())
        am.h(new u(this, (c)localIterator.next(), localar));
      br localbr = bm.BD().iG(str);
      if (localbr == null)
        localar = null;
      else
        localar = bg.qW().oV().cV(localbr.AV());
    }
  }

  public static void a(az paramaz)
  {
    if (dGZ == null)
      dGZ = paramaz;
  }

  public static void a(c paramc)
  {
    if (!dHa.contains(paramc))
      dHa.add(paramc);
  }

  public static void b(c paramc)
  {
    dHa.remove(paramc);
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(aj paramaj)
  {
    fz localfz = (fz)((a)paramaj).sO();
    if ((localfz.hOY == 0L) || (localfz.hPt == null) || (localfz.hPt.length() == 0) || (localfz.hQh <= 0) || (localfz.hQd < 0))
    {
      bs.jdMethod_if(this.rI);
      return aa.doN;
    }
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if (this.rI == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "doScene:  filename null!");
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    String str = this.rI;
    br localbr = bm.BD().iG(str);
    if ((localbr == null) || (!localbr.BJ()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "Get info Failed file:" + this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "doScene file:" + this.rI + " netTimes:" + localbr.AW());
    if (!bs.iv(this.rI))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "checkVoiceNetTimes Failed file:" + this.rI);
      bs.jdMethod_if(this.rI);
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    int i = localbr.AO() - localbr.AP();
    if (i <= 0)
    {
      if (localbr.getStatus() == 5)
      {
        this.dHc = true;
        com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "doScene file:" + this.rI + " Net:" + localbr.AO() + " Local:" + localbr.AP());
        this.cIm = (10000 + k.nJ());
        return -1;
      }
      bs.r(this.rI, localbr.AP());
      this.cIm = (10000 + k.nJ());
      return -1;
    }
    if (localbr.sp() == localbr.AO())
      this.dHb = true;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new fz());
    localb.b(new ga());
    localb.fi("/cgi-bin/micromsg-bin/downloadvoice");
    localb.de(128);
    localb.df(20);
    localb.dg(1000000020);
    this.dmI = localb.sU();
    fz localfz = (fz)this.dmI.sO();
    localfz.hPt = localbr.BN();
    localfz.hOY = localbr.kl();
    localfz.hQh = i;
    localfz.hQd = localbr.AP();
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = localfz.hPt;
    arrayOfObject[1] = Integer.valueOf(localfz.hOO);
    arrayOfObject[2] = Integer.valueOf(localfz.hQh);
    arrayOfObject[3] = Integer.valueOf(localfz.hQd);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "doScene req.ClientMsgId:%s req.MsgId:%d req.Length:%d req.Offset:%d", arrayOfObject);
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd file:" + this.rI + " + id:" + paramInt1 + " errtype:" + paramInt2 + " errCode:" + paramInt3);
    ga localga = (ga)((a)paramaj).sP();
    if (localga.hQf == 1)
    {
      com.tencent.mm.sdk.platformtools.z.v("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", this.rI + " cancelFlag = 1");
      bs.iA(this.rI);
      return;
    }
    if (paramInt3 == -22)
    {
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " resp:" + paramaj.sS().tQ());
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd file:" + this.rI + " Recv:" + localga.hQi.aLK() + " fileOff:" + localga.hQd);
    if (localga.hQi.aLL() == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd get recv Buffer null");
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    byte[] arrayOfByte = localga.hQi.aLL().toByteArray();
    if (arrayOfByte.length == 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd Recv Buf ZERO length ");
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    int i = bs.T(this.dGY, this.rI).write(arrayOfByte, arrayOfByte.length, localga.hQd);
    if (i < 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd Write Failed File:" + this.rI + " ret:" + i);
      bs.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "OnRecvEnd : file:" + this.rI + " filesize:" + i + " voiceFormat:" + this.dGY);
    int j = bs.r(this.rI, i);
    if (j < 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTE3x0o8JQwFk=", "onGYNetEnd file:" + this.rI + "updateAfterRecv Ret:" + j);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (j == 1)
    {
      Bo();
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    long l = 1000L;
    if (this.dHb)
      l = 0L;
    this.dmV.cP(l);
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    bs.jdMethod_if(this.rI);
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getType()
  {
    return 128;
  }

  protected final int sB()
  {
    return 100;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.t
 * JD-Core Version:    0.6.2
 */