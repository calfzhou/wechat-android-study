package com.tencent.mm.modelcdntran;

import com.tencent.mm.model.at;
import com.tencent.mm.model.ay;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class p
  implements az
{
  p(CdnTransportEngine paramCdnTransportEngine)
  {
  }

  public final boolean kJ()
  {
    if ((CdnTransportEngine.a(this.drN) == 0) && (CdnTransportEngine.b(this.drN) == 0))
      return false;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = CdnTransportEngine.c(this.drN);
    arrayOfObject[1] = Integer.valueOf(CdnTransportEngine.a(this.drN));
    arrayOfObject[2] = Integer.valueOf(CdnTransportEngine.b(this.drN));
    z.i("!44@/B4Tb64lLpIOAjTgD1JTqYyjqbRxHUgGUCewsAH7DnA=", "CdnDataFlowStat id:%s send:%d recv:%d", arrayOfObject);
    at.qy().x(CdnTransportEngine.b(this.drN), CdnTransportEngine.a(this.drN));
    CdnTransportEngine.d(this.drN);
    CdnTransportEngine.e(this.drN);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.p
 * JD-Core Version:    0.6.2
 */