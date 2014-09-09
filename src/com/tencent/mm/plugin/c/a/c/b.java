package com.tencent.mm.plugin.c.a.c;

import com.tencent.mm.plugin.c.a.b.d;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class b extends d
{
  b(a parama)
  {
  }

  public final void HQ()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onDiscoverFinished******");
    a.a(this.ejn);
    Assert.assertTrue(a.a(this.ejn, 2, 1, null));
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onSessionCreate****** sessionID = " + paramLong1 + " deviceID = " + paramLong2);
    e locale = new e(paramLong1, paramLong2, paramLong3);
    Assert.assertTrue(a.a(this.ejn, 6, 1, locale));
  }

  public final void aj(String paramString1, String paramString2)
  {
    if (!a.a(this.ejn, paramString1))
      return;
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onDiscover****** deviceMac = " + paramString1 + "deviceName = " + paramString2);
    j localj = new j(paramString1, paramString2);
    Assert.assertTrue(a.a(this.ejn, 3, 1, localj));
  }

  public final void b(long paramLong, int paramInt, String paramString)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onError****** SessionId = " + paramLong + " errorCode = " + paramInt + " errorInfo = " + paramString);
    h localh = new h(paramLong, paramInt, paramString);
    Assert.assertTrue(a.a(this.ejn, 5, 1, localh));
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onConnected****** SessionId = " + paramLong + " Connected = " + paramBoolean);
    g localg = new g(paramLong, paramBoolean);
    Assert.assertTrue(a.a(this.ejn, 4, 1, localg));
  }

  public final void c(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onSend****** SessionId = " + paramLong + " success = " + paramBoolean);
    k localk = new k(paramLong, paramBoolean);
    Assert.assertTrue(a.a(this.ejn, 0, 1, localk));
  }

  public final void c(long paramLong, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BC onRecv****** sessionId = " + paramLong);
    i locali = new i(paramLong, paramArrayOfByte);
    Assert.assertTrue(a.a(this.ejn, 1, 1, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.c.b
 * JD-Core Version:    0.6.2
 */