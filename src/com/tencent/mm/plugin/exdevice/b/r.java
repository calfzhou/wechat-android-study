package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.plugin.exdevice.service.o;
import com.tencent.mm.protocal.a.bu;
import com.tencent.mm.protocal.a.bv;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.protocal.a.oz;
import com.tencent.mm.sdk.platformtools.ch;

public final class r extends x
  implements ab
{
  private m dlH = null;
  private com.tencent.mm.o.a dmI = null;

  public r(String paramString)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new bu());
    localb.b(new bv());
    localb.fi("/cgi-bin/micromsg-bin/bindharddevice");
    localb.de(536);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    ((bu)this.dmI.sO()).hQK = ch.ja(paramString);
  }

  public final int a(com.tencent.mm.network.r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    int i = 1;
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8Xi4sDLihX2amkDwS6hMqhyIdJGNQ5SL25", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    bv localbv;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      if ((this.dmI == null) || (this.dmI.sP() == null))
        break label533;
      localbv = (bv)this.dmI.sP();
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = localbv.hQL.ieE;
      arrayOfObject1[i] = localbv.hQL.ieD;
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8Xi4sDLihX2amkDwS6hMqhyIdJGNQ5SL25", "hardDevice : DeviceIdServer = %s, DeviceType = %s", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[5];
      arrayOfObject2[0] = localbv.hQM.ieG;
      arrayOfObject2[i] = localbv.hQM.ieF;
      arrayOfObject2[2] = localbv.hQM.ieH;
      arrayOfObject2[3] = localbv.hQM.ieI;
      arrayOfObject2[4] = Integer.valueOf(localbv.hQM.ieJ);
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8Xi4sDLihX2amkDwS6hMqhyIdJGNQ5SL25", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s", arrayOfObject2);
      if (z.Pp().lR(localbv.hQM.ieF) != null)
      {
        boolean bool = z.Pp().lS(localbv.hQM.ieF);
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = localbv.hQM.ieF;
        arrayOfObject3[i] = Boolean.valueOf(bool);
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8Xi4sDLihX2amkDwS6hMqhyIdJGNQ5SL25", "delete local deviceinfo : %s, ret : %b", arrayOfObject3);
        if (!bool)
          break label559;
      }
    }
    while (true)
    {
      com.tencent.mm.plugin.exdevice.e.b localb = new com.tencent.mm.plugin.exdevice.e.b();
      localb.field_deviceID = localbv.hQL.ieE;
      localb.field_deviceType = localbv.hQL.ieD;
      localb.field_connProto = localbv.hQM.ieI;
      localb.field_connStrategy = localbv.hQM.ieJ;
      localb.field_closeStrategy = localbv.hQM.ieK;
      localb.field_mac = com.tencent.mm.plugin.exdevice.g.a.lU(com.tencent.mm.plugin.exdevice.g.a.lV(localbv.hQM.ieH));
      localb.field_md5Str = com.tencent.mm.a.f.d(new String(localbv.hQL.ieD + localbv.hQL.ieE).getBytes());
      localb.field_authKey = localbv.hQM.ieG;
      localb.field_brandName = localbv.hQM.ieF;
      o localo = an.PN().aC(localb.field_mac);
      if ((localo != null) && (localo.cLJ == 2))
      {
        com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8Xi4sDLihX2amkDwS6hMqhyIdJGNQ5SL25", "before do bind netscene, stop the channel now");
        z.Pr();
        f.ap(localb.field_mac);
        an.PN().aA(localb.field_mac);
      }
      if (i != 0)
        z.Pp().b(localb);
      while (true)
      {
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
        label533: localbv = null;
        break;
        z.Pp().a(localbv.hQL.ieE, localb);
      }
      label559: i = 0;
    }
  }

  public final int getType()
  {
    return 536;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.r
 * JD-Core Version:    0.6.2
 */