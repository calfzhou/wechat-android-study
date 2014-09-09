package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.service.af;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.protocal.a.pa;
import com.tencent.mm.protocal.a.pb;
import com.tencent.mm.protocal.a.ws;

public final class t extends x
  implements ab
{
  private String cIj;
  private m dlH = null;
  private a dmI = null;
  private String eJb;

  public t(String paramString1, String paramString2, String paramString3, int paramInt, byte[] paramArrayOfByte)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new pa());
    localb.b(new pb());
    localb.fi("/cgi-bin/micromsg-bin/harddeviceauth");
    localb.de(541);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    pa localpa = (pa)this.dmI.sO();
    oy localoy = new oy();
    localoy.ieD = paramString2;
    localoy.ieE = paramString3;
    localpa.hQL = localoy;
    localpa.ieO = paramInt;
    localpa.ieP = new ws().cl(paramArrayOfByte);
    this.eJb = paramString3;
    this.cIj = paramString1;
  }

  private byte[] Pi()
  {
    pb localpb = (pb)this.dmI.sP();
    try
    {
      byte[] arrayOfByte = localpb.ieT.aLM();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  private byte[] Pk()
  {
    pb localpb = (pb)this.dmI.sP();
    try
    {
      byte[] arrayOfByte = localpb.ieU.aLM();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final byte[] Pj()
  {
    pb localpb = (pb)this.dmI.sP();
    try
    {
      byte[] arrayOfByte = localpb.ieV.aLM();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XClcxdIqU/qrgkBsOf6igfKrYuvUg41b2", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    com.tencent.mm.plugin.exdevice.e.b localb = z.Pp().lQ(this.eJb);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      pb localpb = (pb)this.dmI.sP();
      if (localb != null)
      {
        byte[] arrayOfByte1 = Pj();
        if (arrayOfByte1 != null)
          localb.field_authBuf = arrayOfByte1;
        localb.bG(localpb.ieX);
        localb.bF(localpb.ieW);
        byte[] arrayOfByte2 = Pi();
        if (arrayOfByte2 != null)
        {
          an.PN().f(localb.field_mac, arrayOfByte2);
          an.PO().OX().setChannelSessionKey(localb.field_mac, arrayOfByte2);
          localb.field_sessionKey = arrayOfByte2;
        }
        byte[] arrayOfByte3 = Pk();
        if (arrayOfByte3 != null)
        {
          an.PN().g(localb.field_mac, arrayOfByte3);
          localb.field_sessionBuf = arrayOfByte3;
        }
        byte[] arrayOfByte4 = Pj();
        if (arrayOfByte1 != null)
        {
          an.PN().e(localb.field_mac, arrayOfByte4);
          localb.field_authBuf = arrayOfByte1;
        }
        localb.n(System.currentTimeMillis() / 1000L);
        if (2 == an.PN().aB(localb.field_mac))
        {
          z.Ps();
          l.C(this.cIj, 2);
        }
        an.PN().aD(localb.field_mac);
        boolean bool = z.Pp().a(localb, new String[0]);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(bool);
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XClcxdIqU/qrgkBsOf6igfKrYuvUg41b2", "update local device auth infos = %b", arrayOfObject);
      }
    }
    while (true)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.z.e("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XClcxdIqU/qrgkBsOf6igfKrYuvUg41b2", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceIdServer == null");
      break;
      z.Ps();
      l.C(this.cIj, 4);
      z.Ps();
      l.D(this.cIj, 3);
    }
  }

  public final int getType()
  {
    return 541;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.t
 * JD-Core Version:    0.6.2
 */