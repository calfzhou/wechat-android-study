package com.tencent.mm.plugin.c.a.c;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import junit.framework.Assert;

public final class a
{
  private com.tencent.mm.plugin.c.a.a.b ejj = null;
  private com.tencent.mm.plugin.c.a.b.a ejk = null;
  private l ejl = null;
  private final HashSet ejm = new HashSet();
  private cm mHandler = null;

  public a(Context paramContext, l paraml, am paramam)
  {
    this.ejk = new com.tencent.mm.plugin.c.a.b.a(paramam);
    if (Build.VERSION.SDK_INT >= 18)
    {
      this.ejj = new com.tencent.mm.plugin.c.a.a.b(paramam);
      this.ejj.a(paramContext, new c(this));
    }
    this.ejk.a(paramContext, new b(this));
    this.mHandler = new d(Looper.getMainLooper(), this);
    this.ejl = paraml;
  }

  public final boolean a(long paramLong, int paramInt, byte[] paramArrayOfByte)
  {
    Assert.assertNotNull(paramArrayOfByte);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******SendData****** sessionId = " + paramLong + "bluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return false;
    case 0:
      return this.ejj.b(paramLong, paramArrayOfByte);
    case 1:
    }
    return this.ejk.b(paramLong, paramArrayOfByte);
  }

  public final void b(long paramLong1, long paramLong2, int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******createSession****** deviceId = " + paramLong1 + "aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return;
    case 1:
      this.ejk.createSession(paramLong1, paramLong2);
      return;
    case 0:
    }
    this.ejj.createSession(paramLong1, paramLong2);
  }

  public final boolean e(long paramLong, int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******connect****** aSessionId = " + paramLong + " aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return false;
    case 0:
      return this.ejj.connect(paramLong);
    case 1:
    }
    return this.ejk.d(paramLong, true);
  }

  public final void f(long paramLong, int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******Destroy Session****** aSessionId = " + paramLong + " aBluetoothVersion" + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return;
    case 0:
      this.ejj.destroySession(paramLong);
      return;
    case 1:
    }
    this.ejk.destroySession(paramLong);
  }

  public final boolean fy(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******scan****** aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return false;
    case 1:
      return this.ejk.as(true);
    case 0:
    }
    return this.ejj.ar(true);
  }

  public final boolean fz(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLZviqo1TNValBqIxg1u7GCw==", "******stopScan****** aBluetoothVersion = " + paramInt);
    switch (paramInt)
    {
    default:
      Assert.assertTrue(false);
      return false;
    case 1:
      return this.ejk.as(false);
    case 0:
    }
    return this.ejj.ar(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.c.a
 * JD-Core Version:    0.6.2
 */