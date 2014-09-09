package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.protocal.a.pc;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.a.xs;
import com.tencent.mm.protocal.a.xt;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class v extends x
  implements ab
{
  private m dAd = null;
  private a eJc = null;

  public v(long paramLong1, String paramString1, String paramString2, long paramLong2, long paramLong3, byte[] paramArrayOfByte, int paramInt)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Long.valueOf(paramLong2);
    arrayOfObject[3] = Long.valueOf(paramLong3);
    arrayOfObject[4] = Integer.valueOf(paramArrayOfByte.length);
    arrayOfObject[5] = Integer.valueOf(paramInt);
    z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XGaN5kWUfE/LxFSNODXr0xbrhiRquKAPy", "NetSceneSendHardDeviceMsg deviceType = %s, deviceId = %s, sessionId = %d, createTime = %d, data length = %d, msgType = %d", arrayOfObject);
    b localb = new b();
    localb.a(new xs());
    localb.b(new xt());
    localb.de(538);
    localb.fi("/cgi-bin/micromsg-bin/sendharddevicemsg");
    localb.df(0);
    localb.dg(0);
    this.eJc = localb.sU();
    xs localxs = (xs)this.eJc.sO();
    oy localoy = new oy();
    localoy.ieD = paramString1;
    localoy.ieE = paramString2;
    localxs.hQL = localoy;
    pc localpc = new pc();
    localpc.ieZ = paramLong2;
    localpc.hOV = ((int)paramLong3);
    localpc.hPZ = new ws().cl(paramArrayOfByte);
    localpc.ewb = paramInt;
    localxs.irI = localpc;
    localxs.ieU = new ws().cl(an.PN().aI(paramLong1));
  }

  public final long HT()
  {
    Assert.assertNotNull(this.eJc);
    return ((xs)this.eJc.sO()).irI.ieZ;
  }

  public final int a(r paramr, m paramm)
  {
    this.dAd = paramm;
    return a(paramr, this.eJc, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    z.i("!64@/B4Tb64lLpLHXwcx366fGjbfKZDnni8XGaN5kWUfE/LxFSNODXr0xbrhiRquKAPy", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.dAd.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 538;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.v
 * JD-Core Version:    0.6.2
 */