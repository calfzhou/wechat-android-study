package com.tencent.mm.protocal;

import com.tencent.mm.platformtools.ao;
import com.tencent.mm.protocal.a.td;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;

public final class k extends p
  implements n
{
  public td hNq = new td();

  public final int getCmdId()
  {
    return 178;
  }

  public final int sV()
  {
    return 380;
  }

  public final byte[] sW()
  {
    if ((10002 == ao.dVY) && (ao.dVZ > 0))
    {
      ao.dVZ = 0;
      bh.l("", "", 0);
    }
    a(bh.aHr());
    this.hNq.hRd = new ws().cl(ch.aHG());
    z.appenderFlush();
    this.hNq.hRy = m.b(this);
    this.hNq.iah = l.cFn;
    if ((10012 == ao.dVY) && (ao.dVZ > 0))
      this.hNq.iah = ao.dVZ;
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.hNq.iah);
    arrayOfObject[1] = Integer.valueOf(l.cFn);
    arrayOfObject[2] = this.hNq.hSn;
    arrayOfObject[3] = this.hNq.hSm;
    arrayOfObject[4] = this.hNq.ieD;
    z.i("!24@/B4Tb64lLpIZFt1xb4C2yA==", "dkchan NewAuthRequest channel:%d release:%d brand:%s model:%s Finger:%s", arrayOfObject);
    this.hNq.eJw = a.hrm;
    j.cz("");
    return this.hNq.toByteArray();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.k
 * JD-Core Version:    0.6.2
 */