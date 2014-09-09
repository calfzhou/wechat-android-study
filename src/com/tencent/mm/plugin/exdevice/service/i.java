package com.tencent.mm.plugin.exdevice.service;

import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.mm.plugin.c.a.c.l;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public final class i
  implements l
{
  private static i eKh = null;
  private com.tencent.mm.plugin.c.a.c.a eKd = null;
  private am eKe = null;
  private final HashMap eKf = new HashMap();
  private final HashMap eKg = new HashMap();
  private CountDownLatch eKi;

  public i()
  {
    long l1 = Thread.currentThread().getId();
    long l2 = Looper.getMainLooper().getThread().getId();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(l1);
    arrayOfObject[1] = Long.valueOf(l2);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "now thread id : %d, main thread is : %d", arrayOfObject);
    if ((Build.VERSION.SDK_INT == 14) || (Build.VERSION.SDK_INT == 15))
    {
      if (l1 == l2)
      {
        z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "it is main thread now, init the bluetoothadapter directly");
        this.eKd = new com.tencent.mm.plugin.c.a.c.a(ak.getContext(), this, ao.PP().PQ());
        return;
      }
      new cm(Looper.getMainLooper()).postAtFrontOfQueueV2(new j(this));
      this.eKi = new CountDownLatch(1);
    }
    try
    {
      this.eKi.await();
      label197: z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "now has init the sdk adapter");
      return;
      this.eKd = new com.tencent.mm.plugin.c.a.c.a(ak.getContext(), this, ao.PP().PQ());
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label197;
    }
  }

  private void E(String paramString, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "insertDeviceIdTypeMap deviceid =%s, aBLuetoothVersion = %d", arrayOfObject);
    Assert.assertNotNull(paramString);
    boolean bool;
    if (1 != paramInt)
    {
      bool = false;
      if (paramInt != 0);
    }
    else
    {
      bool = true;
    }
    Assert.assertTrue(bool);
    long l = com.tencent.mm.plugin.exdevice.g.a.lU(paramString);
    if (this.eKf.containsKey(Long.valueOf(l)))
      return;
    this.eKf.put(Long.valueOf(l), Integer.valueOf(paramInt));
  }

  private static i PD()
  {
    if (eKh != null)
      return eKh;
    i locali = new i();
    eKh = locali;
    return locali;
  }

  public static boolean a(int paramInt, am paramam)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******scan******\r\n aBluetoothVersion = " + paramInt);
    i locali = PD();
    if (!locali.eKd.fy(paramInt))
      return false;
    locali.eKe = paramam;
    return true;
  }

  public static boolean connect(long paramLong)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******connect****** aSessionId = " + paramLong);
    i locali = PD();
    Assert.assertTrue(locali.eKg.containsKey(Long.valueOf(paramLong)));
    return locali.eKd.e(paramLong, ((Integer)locali.eKg.get(Long.valueOf(paramLong))).intValue());
  }

  public static void createSession(long paramLong1, long paramLong2)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "------createSession------ aDeviceId = " + paramLong1 + " aChannelId = " + paramLong2);
    i locali = PD();
    if (locali.eKf.containsKey(Long.valueOf(paramLong1)))
    {
      locali.eKd.b(paramLong1, paramLong2, ((Integer)locali.eKf.get(Long.valueOf(paramLong1))).intValue());
      return;
    }
    int i = ao.PP().aM(paramLong1);
    if (-1 != i);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      locali.E(com.tencent.mm.plugin.c.a.d.a.aj(paramLong1), i);
      locali.eKd.b(paramLong1, paramLong2, i);
      return;
    }
  }

  public static void destroySession(long paramLong)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******destroySession****** aSessionId = " + paramLong);
    i locali = PD();
    if (!locali.eKf.containsKey(Long.valueOf(paramLong)))
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "the session not exist");
      return;
    }
    locali.eKd.f(paramLong, ((Integer)locali.eKg.get(Long.valueOf(paramLong))).intValue());
  }

  public static boolean fz(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******stopScan******\r\n aBluetoothVersion = " + paramInt);
    return PD().eKd.fz(paramInt);
  }

  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******sendData****** aSessionId = " + paramLong);
    Assert.assertNotNull(paramArrayOfByte);
    i locali = PD();
    Assert.assertTrue(locali.eKg.containsKey(Long.valueOf(paramLong)));
    return locali.eKd.a(paramLong, ((Integer)locali.eKg.get(Long.valueOf(paramLong))).intValue(), paramArrayOfByte);
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onSessionCreate******\r\n aSessionId = " + paramLong1 + " aDeviceID = " + paramLong2);
    Assert.assertTrue(this.eKf.containsKey(Long.valueOf(paramLong2)));
    if (!this.eKg.containsKey(Long.valueOf(paramLong1)))
      this.eKg.put(Long.valueOf(paramLong1), this.eKf.get(Long.valueOf(paramLong2)));
    Java2CExDevice.onBluetoothSessionCreated(paramLong2, paramLong3, paramLong1);
  }

  public final void ai(long paramLong)
  {
    Java2CExDevice.onBluetoothError(paramLong, 0);
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onConnected****** sessionId = " + paramLong + "Connected = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothConnected(paramLong);
      return;
    }
    Java2CExDevice.onBluetoothDisconnected(paramLong);
  }

  public final void c(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onSend****** sessionId = " + paramLong + "success = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothSendDataCompleted(paramLong);
      return;
    }
    Java2CExDevice.onBluetoothError(paramLong, 0);
  }

  public final void c(long paramLong, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onRecv****** sessionId = " + paramLong);
    Java2CExDevice.onBluetoothRecvData(paramLong, paramArrayOfByte);
  }

  public final void fA(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onScanFinished******\r\n aBluetoothVersion = " + paramInt);
    if (this.eKe == null)
      return;
    this.eKe.fA(paramInt);
    this.eKe = null;
  }

  public final void h(String paramString1, String paramString2, int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLle80sXR2O3t2U/R9gkfKlA==", "******onScanFound******\r\n deviceMac = " + paramString1 + " deviceName " + paramString2);
    E(paramString1, paramInt);
    if (this.eKe == null)
      return;
    this.eKe.h(paramString1, paramString2, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.i
 * JD-Core Version:    0.6.2
 */