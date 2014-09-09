package com.tencent.mm.plugin.safedevice.a;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.protocal.a.acs;
import com.tencent.mm.protocal.a.act;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class b extends x
  implements ab
{
  private String cGo;
  private String deviceName;
  private m dlH;
  private a dmI;
  private String fTM;

  public b(String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new acs());
    localb.b(new act());
    localb.fi("/cgi-bin/micromsg-bin/updatesafedevice");
    localb.de(361);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.cGo = paramString1;
    this.deviceName = paramString2;
    this.fTM = paramString3;
    acs localacs = (acs)this.dmI.sO();
    localacs.hVl = paramString1;
    localacs.KH = paramString2;
    localacs.ieD = paramString3;
  }

  public final int a(r paramr, m paramm)
  {
    if ((ch.jb(this.cGo)) || (ch.jb(this.deviceName)) || (ch.jb(this.fTM)))
    {
      z.e("!56@/B4Tb64lLpIBiqvmtdi3uYj9JP/EPRUUMEFhQtqL6vQVsUYiCWsNGA==", "null device is or device name or device type");
      return -1;
    }
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpIBiqvmtdi3uYj9JP/EPRUUMEFhQtqL6vQVsUYiCWsNGA==", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final String getDeviceId()
  {
    return this.cGo;
  }

  public final String getDeviceName()
  {
    return this.deviceName;
  }

  public final String getDeviceType()
  {
    return this.fTM;
  }

  public final int getType()
  {
    return 361;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.b
 * JD-Core Version:    0.6.2
 */