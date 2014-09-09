package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class a
  implements am
{
  private static a eJU = null;
  private final HashMap eJV = new HashMap();
  private p eJW = null;
  private cm mHandler = new b(this, ao.PP().PQ().getLooper());

  public a(p paramp)
  {
    this.eJW = paramp;
    eJU = this;
  }

  // ERROR //
  private int a(long paramLong, aj paramaj)
  {
    // Byte code:
    //   0: iconst_1
    //   1: anewarray 4	java/lang/Object
    //   4: astore 4
    //   6: aload 4
    //   8: iconst_0
    //   9: lload_1
    //   10: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   13: aastore
    //   14: ldc 64
    //   16: ldc 66
    //   18: aload 4
    //   20: invokestatic 72	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   23: aload_3
    //   24: invokestatic 78	junit/framework/Assert:assertNotNull	(Ljava/lang/Object;)V
    //   27: aload_3
    //   28: invokeinterface 84 1 0
    //   33: invokeinterface 90 1 0
    //   38: lstore 7
    //   40: ldc 92
    //   42: lload 7
    //   44: invokestatic 98	com/tencent/mm/plugin/exdevice/e/a:e	(Ljava/lang/String;J)Z
    //   47: ifne +109 -> 156
    //   50: ldc 64
    //   52: ldc 100
    //   54: invokestatic 104	com/tencent/mm/sdk/platformtools/z:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: new 106	com/tencent/mm/plugin/exdevice/service/f
    //   60: dup
    //   61: invokespecial 107	com/tencent/mm/plugin/exdevice/service/f:<init>	()V
    //   64: astore 18
    //   66: aload 18
    //   68: lload_1
    //   69: invokevirtual 111	com/tencent/mm/plugin/exdevice/service/f:az	(J)Lcom/tencent/mm/plugin/exdevice/service/f;
    //   72: iconst_m1
    //   73: invokevirtual 115	com/tencent/mm/plugin/exdevice/service/f:gY	(I)Lcom/tencent/mm/plugin/exdevice/service/f;
    //   76: iconst_m1
    //   77: invokevirtual 118	com/tencent/mm/plugin/exdevice/service/f:gX	(I)Lcom/tencent/mm/plugin/exdevice/service/f;
    //   80: ldc 120
    //   82: invokevirtual 124	com/tencent/mm/plugin/exdevice/service/f:lL	(Ljava/lang/String;)Lcom/tencent/mm/plugin/exdevice/service/f;
    //   85: pop
    //   86: getstatic 18	com/tencent/mm/plugin/exdevice/service/a:eJU	Lcom/tencent/mm/plugin/exdevice/service/a;
    //   89: getfield 52	com/tencent/mm/plugin/exdevice/service/a:mHandler	Lcom/tencent/mm/sdk/platformtools/cm;
    //   92: getstatic 18	com/tencent/mm/plugin/exdevice/service/a:eJU	Lcom/tencent/mm/plugin/exdevice/service/a;
    //   95: getfield 52	com/tencent/mm/plugin/exdevice/service/a:mHandler	Lcom/tencent/mm/sdk/platformtools/cm;
    //   98: iconst_3
    //   99: iconst_0
    //   100: iconst_0
    //   101: aload 18
    //   103: invokevirtual 130	com/tencent/mm/sdk/platformtools/cm:obtainMessage	(IIILjava/lang/Object;)Landroid/os/Message;
    //   106: invokevirtual 134	com/tencent/mm/sdk/platformtools/cm:sendMessage	(Landroid/os/Message;)Z
    //   109: invokestatic 138	junit/framework/Assert:assertTrue	(Z)V
    //   112: iconst_m1
    //   113: ireturn
    //   114: astore 5
    //   116: iconst_1
    //   117: anewarray 4	java/lang/Object
    //   120: astore 6
    //   122: aload 6
    //   124: iconst_0
    //   125: aload 5
    //   127: invokevirtual 142	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   130: aastore
    //   131: ldc 64
    //   133: ldc 144
    //   135: aload 6
    //   137: invokestatic 146	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   140: aload_0
    //   141: getfield 29	com/tencent/mm/plugin/exdevice/service/a:eJW	Lcom/tencent/mm/plugin/exdevice/service/p;
    //   144: lload_1
    //   145: iconst_m1
    //   146: iconst_m1
    //   147: ldc 148
    //   149: invokeinterface 154 6 0
    //   154: iconst_m1
    //   155: ireturn
    //   156: aload_0
    //   157: getfield 27	com/tencent/mm/plugin/exdevice/service/a:eJV	Ljava/util/HashMap;
    //   160: lload 7
    //   162: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   165: invokevirtual 158	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   168: ifne +43 -> 211
    //   171: iconst_1
    //   172: anewarray 4	java/lang/Object
    //   175: astore 17
    //   177: aload 17
    //   179: iconst_0
    //   180: lload 7
    //   182: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   185: aastore
    //   186: ldc 64
    //   188: ldc 160
    //   190: aload 17
    //   192: invokestatic 146	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   195: aload_0
    //   196: getfield 29	com/tencent/mm/plugin/exdevice/service/a:eJW	Lcom/tencent/mm/plugin/exdevice/service/p;
    //   199: lload_1
    //   200: iconst_m1
    //   201: iconst_m1
    //   202: ldc 162
    //   204: invokeinterface 154 6 0
    //   209: iconst_m1
    //   210: ireturn
    //   211: new 164	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd
    //   214: dup
    //   215: invokespecial 165	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:<init>	()V
    //   218: astore 9
    //   220: aload 9
    //   222: aload_0
    //   223: getfield 27	com/tencent/mm/plugin/exdevice/service/a:eJV	Ljava/util/HashMap;
    //   226: lload 7
    //   228: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   231: invokevirtual 169	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   234: checkcast 58	java/lang/Long
    //   237: invokevirtual 172	java/lang/Long:longValue	()J
    //   240: putfield 176	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:channelID	J
    //   243: aload 9
    //   245: aload_3
    //   246: invokeinterface 84 1 0
    //   251: invokeinterface 180 1 0
    //   256: putfield 184	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:reqCmdID	I
    //   259: aload 9
    //   261: aload_3
    //   262: invokeinterface 84 1 0
    //   267: invokeinterface 187 1 0
    //   272: putfield 190	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:respCmdID	I
    //   275: aload_3
    //   276: invokeinterface 84 1 0
    //   281: invokeinterface 194 1 0
    //   286: astore 14
    //   288: aload_3
    //   289: invokeinterface 84 1 0
    //   294: invokeinterface 197 1 0
    //   299: istore 15
    //   301: lload_1
    //   302: iload 15
    //   304: i2s
    //   305: aload 9
    //   307: aload 14
    //   309: invokestatic 203	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice:startTask	(JSLcom/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd;[B)I
    //   312: ifeq +96 -> 408
    //   315: ldc 64
    //   317: ldc 205
    //   319: invokestatic 207	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   322: iconst_m1
    //   323: ireturn
    //   324: astore 10
    //   326: iconst_1
    //   327: anewarray 4	java/lang/Object
    //   330: astore 11
    //   332: aload 11
    //   334: iconst_0
    //   335: aload 10
    //   337: invokevirtual 142	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   340: aastore
    //   341: ldc 64
    //   343: ldc 209
    //   345: aload 11
    //   347: invokestatic 146	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   350: aload_0
    //   351: getfield 29	com/tencent/mm/plugin/exdevice/service/a:eJW	Lcom/tencent/mm/plugin/exdevice/service/p;
    //   354: lload_1
    //   355: iconst_m1
    //   356: iconst_m1
    //   357: ldc 211
    //   359: invokeinterface 154 6 0
    //   364: iconst_m1
    //   365: ireturn
    //   366: astore 12
    //   368: iconst_1
    //   369: anewarray 4	java/lang/Object
    //   372: astore 13
    //   374: aload 13
    //   376: iconst_0
    //   377: aload 12
    //   379: invokevirtual 142	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   382: aastore
    //   383: ldc 64
    //   385: ldc 213
    //   387: aload 13
    //   389: invokestatic 146	com/tencent/mm/sdk/platformtools/z:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   392: aload_0
    //   393: getfield 29	com/tencent/mm/plugin/exdevice/service/a:eJW	Lcom/tencent/mm/plugin/exdevice/service/p;
    //   396: lload_1
    //   397: iconst_m1
    //   398: iconst_m1
    //   399: ldc 215
    //   401: invokeinterface 154 6 0
    //   406: iconst_m1
    //   407: ireturn
    //   408: bipush 6
    //   410: anewarray 4	java/lang/Object
    //   413: astore 16
    //   415: aload 16
    //   417: iconst_0
    //   418: lload_1
    //   419: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   422: aastore
    //   423: aload 16
    //   425: iconst_1
    //   426: lload 7
    //   428: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   431: aastore
    //   432: aload 16
    //   434: iconst_2
    //   435: aload 9
    //   437: getfield 176	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:channelID	J
    //   440: invokestatic 62	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   443: aastore
    //   444: aload 16
    //   446: iconst_3
    //   447: iload 15
    //   449: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   452: aastore
    //   453: aload 16
    //   455: iconst_4
    //   456: aload 9
    //   458: getfield 184	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:reqCmdID	I
    //   461: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   464: aastore
    //   465: aload 16
    //   467: iconst_5
    //   468: aload 9
    //   470: getfield 190	com/tencent/mm/plugin/exdevice/jni/Java2CExDevice$AccessoryCmd:respCmdID	I
    //   473: invokestatic 220	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   476: aastore
    //   477: ldc 64
    //   479: ldc 222
    //   481: aload 16
    //   483: invokestatic 72	com/tencent/mm/sdk/platformtools/z:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   486: iconst_0
    //   487: ireturn
    //
    // Exception table:
    //   from	to	target	type
    //   27	40	114	android/os/RemoteException
    //   243	275	324	android/os/RemoteException
    //   275	301	366	android/os/RemoteException
  }

  private boolean at(long paramLong)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "stopChannelImp deviceId = " + paramLong);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "remove the device from connected devices : [%d]", arrayOfObject);
    if (!com.tencent.mm.plugin.exdevice.e.a.g("conneted_device", paramLong))
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "removeFromSharedPreferences failed!!!");
    if (!this.eJV.containsKey(Long.valueOf(paramLong)))
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "Cannot find deviceId in the map");
      return false;
    }
    Java2CExDevice.stopChannelService(((Long)this.eJV.get(Long.valueOf(paramLong))).longValue());
    Java2CExDevice.destroyChannel(((Long)this.eJV.get(Long.valueOf(paramLong))).longValue());
    return true;
  }

  private long av(long paramLong)
  {
    if (!this.eJV.containsValue(Long.valueOf(paramLong)))
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "Cannot find DeviceId by channelId");
      return -1L;
    }
    Iterator localIterator = this.eJV.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (paramLong == ((Long)localEntry.getValue()).longValue())
        return ((Long)localEntry.getKey()).longValue();
    }
    Assert.assertTrue(false);
    return -1L;
  }

  public static void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    Assert.assertNotNull(eJU);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "onStateChange channelId = " + paramLong + " oldState = " + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    long l = eJU.av(paramLong);
    if (-1L == l)
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "Cannot find deviceId by channelId");
      return;
    }
    e locale = new e((byte)0);
    locale.ay(l).gW(paramInt3).gV(paramInt2).gU(paramInt1);
    Assert.assertTrue(eJU.mHandler.sendMessage(eJU.mHandler.obtainMessage(4, 0, 0, locale)));
  }

  public static void b(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    Assert.assertNotNull(eJU);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "onTaskEnd taskId = " + paramLong + " errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    f localf = new f();
    localf.az(paramLong).gY(paramInt2).gX(paramInt1).lL(paramString);
    Assert.assertTrue(eJU.mHandler.sendMessage(eJU.mHandler.obtainMessage(3, 0, 0, localf)));
  }

  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Short.valueOf(paramShort1);
    arrayOfObject[2] = Short.valueOf(paramShort2);
    if (paramArrayOfByte == null);
    long l;
    for (int i = -1; ; i = paramArrayOfByte.length)
    {
      arrayOfObject[3] = Integer.valueOf(i);
      arrayOfObject[4] = Integer.valueOf(paramInt);
      z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "onDeviceRequest channelId = %d, seq = %d, cmdId =%d, datain len = %d, errCode = %d", arrayOfObject);
      Assert.assertNotNull(eJU);
      z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "onDeviceRequest channelId = " + paramLong + " seq = " + paramShort1 + "cmdId = " + paramShort2 + "errCode = " + paramInt);
      l = eJU.av(paramLong);
      if (-1L != l)
        break;
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "Cannot find deviceId by channelId");
      return;
    }
    c localc = new c((byte)0);
    localc.ax(l).X(paramArrayOfByte).c(paramShort2).b(paramShort1);
    Assert.assertTrue(eJU.mHandler.sendMessage(eJU.mHandler.obtainMessage(5, paramInt, 0, localc)));
  }

  public final boolean as(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "startChannel deviceId = %d", arrayOfObject);
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(11, Long.valueOf(paramLong)));
  }

  public final boolean au(long paramLong)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "stopChannel deviceId = " + paramLong);
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(12, Long.valueOf(paramLong)));
  }

  public final int b(long paramLong, aj paramaj)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "startTask, taskId = %d", arrayOfObject);
    Assert.assertNotNull(paramaj);
    h localh = new h(paramLong, paramaj);
    if (this.mHandler.sendMessage(this.mHandler.obtainMessage(8, localh)))
      return 0;
    return -1;
  }

  public final void fA(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "******onScanFinished******aBluetoothVersion = " + paramInt);
    Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(2, 0, 0, null)));
  }

  public final boolean fy(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "------scan------ bluetooth version = %d", arrayOfObject);
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(6, paramInt, 0));
  }

  public final boolean fz(int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "------stopScan------");
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(7, paramInt, 0));
  }

  public final void h(String paramString1, String paramString2, int paramInt)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "******onScanFound******aBluetoothVersion = " + paramInt + " deviceMac = " + paramString1 + "deviceName = " + paramString2);
    d locald = new d(paramString1, paramString2);
    Assert.assertTrue(this.mHandler.sendMessage(this.mHandler.obtainMessage(1, 0, 0, locald)));
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "------setChannelSessionKey------ deviceId = %d", arrayOfObject1);
    g localg = new g(paramLong, paramArrayOfByte);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(10, localg)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(10);
      z.e("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "mHandler.sendMessage failed!!! messageWhat = %d", arrayOfObject2);
    }
  }

  public final void stopTask(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGnPcns361ZhjfYj7Y/PlMqL1hAHHE3hbeQ==", "stopTask taskId = %d", arrayOfObject);
    this.mHandler.sendMessage(this.mHandler.obtainMessage(9, Long.valueOf(paramLong)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.a
 * JD-Core Version:    0.6.2
 */