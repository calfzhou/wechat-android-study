package com.tencent.mm.plugin.c.a.c;

import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

final class c extends com.tencent.mm.plugin.c.a.a.e
{
  c(a parama)
  {
  }

  public final void HQ()
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onDiscoverFinished******");
    a.a(this.ejn);
    Assert.assertTrue(a.a(this.ejn, 2, 0, null));
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onSessionCreate****** sessionID = " + paramLong1 + " deviceID = " + paramLong2);
    e locale = new e(paramLong1, paramLong2, paramLong3);
    Assert.assertTrue(a.a(this.ejn, 6, 0, locale));
  }

  public final void ai(String paramString1, String paramString2)
  {
    if (!a.a(this.ejn, paramString1))
      return;
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onDiscover******");
    j localj = new j(paramString1, paramString2);
    Assert.assertTrue(a.a(this.ejn, 3, 0, localj));
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onConnected****** SessionId = " + paramLong + " Connected = " + paramBoolean);
    g localg = new g(paramLong, paramBoolean);
    Assert.assertTrue(a.a(this.ejn, 4, 0, localg));
  }

  public final void c(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onSend****** SessionId = " + paramLong + " success = " + paramBoolean);
    k localk = new k(paramLong, paramBoolean);
    Assert.assertTrue(a.a(this.ejn, 0, 0, localk));
  }

  public final void c(long paramLong, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******BLE onRecv****** sessionId = " + paramLong);
    i locali = new i(paramLong, paramArrayOfByte);
    Assert.assertTrue(a.a(this.ejn, 1, 0, locali));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.c.c
 * JD-Core Version:    0.6.2
 */