package com.tencent.mm.plugin.exdevice.service;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.HashMap;
import junit.framework.Assert;

public final class ar extends r
  implements p
{
  private RemoteCallbackList eKA = new RemoteCallbackList();
  private RemoteCallbackList eKB = new RemoteCallbackList();
  private RemoteCallbackList eKC = new RemoteCallbackList();
  private RemoteCallbackList eKD = new RemoteCallbackList();
  private final ay eKE = new ay((byte)0);
  private int eKF = 0;
  private a eKz = null;
  private final cm mHandler = new as(this, ao.PP().PQ().getLooper());

  private static IInterface a(long paramLong, RemoteCallbackList paramRemoteCallbackList, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "findCallbackbyId, Id = %d, count = %d", arrayOfObject);
    for (int i = 0; i < paramInt; i++)
    {
      HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
      if (localHashMap.containsKey(Long.valueOf(paramLong)))
        return (IInterface)localHashMap.get(Long.valueOf(paramLong));
    }
    com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Can not find id in the callback list");
    return null;
  }

  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "registerRemoteCB, ID = %d", arrayOfObject);
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == aCallbackList || null == aCallback");
      return false;
    }
    int i = paramRemoteCallbackList.beginBroadcast();
    do
      i--;
    while ((i >= 0) && (!paramRemoteCallbackList.getBroadcastItem(i).asBinder().equals(paramIInterface.asBinder())));
    if (i < 0)
    {
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Register a new process in callback list.");
      HashMap localHashMap2 = new HashMap();
      localHashMap2.put(Long.valueOf(paramLong), paramIInterface);
      paramRemoteCallbackList.register(paramIInterface, localHashMap2);
      paramRemoteCallbackList.finishBroadcast();
      return true;
    }
    HashMap localHashMap1 = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
    if (localHashMap1 == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == map");
      paramRemoteCallbackList.finishBroadcast();
      return false;
    }
    localHashMap1.put(Long.valueOf(paramLong), paramIInterface);
    paramRemoteCallbackList.finishBroadcast();
    return true;
  }

  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "unRegisterRemoteCB, device id = %d, aCount = %d", arrayOfObject);
    boolean bool;
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == aCallbackList || null == aCallback");
      bool = false;
    }
    do
    {
      return bool;
      do
        paramInt--;
      while ((paramInt >= 0) && (!paramRemoteCallbackList.getBroadcastItem(paramInt).asBinder().equals(paramIInterface.asBinder())));
      if (paramInt < 0)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Can not find callback in callback list");
        return false;
      }
      HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(paramInt);
      if (localHashMap == null)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == map");
        return false;
      }
      if ((IInterface)localHashMap.remove(Long.valueOf(paramLong)) == null)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Cannot find id in the map");
        return false;
      }
      if (!localHashMap.isEmpty())
        return true;
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "No id is in the map, unregister this process");
      bool = paramRemoteCallbackList.unregister(paramIInterface);
    }
    while (bool);
    com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "aCallbackList.unregister failed!!!");
    return bool;
  }

  private boolean a(w paramw)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "unRegistOnscanCallback");
    boolean bool = this.eKC.unregister(paramw);
    if (!bool)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mCBListOnScanCallback.unregister Failed!!!");
      return bool;
    }
    this.eKF = (-1 + this.eKF);
    return bool;
  }

  private void c(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[1] = Integer.valueOf(paramInt1);
    arrayOfObject[2] = Integer.valueOf(paramInt2);
    arrayOfObject[3] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onTaskEndImp taskId = %d, errType = %d, errCode =%d, errMsg = %s", arrayOfObject);
    int i = this.eKB.beginBroadcast();
    aj localaj = (aj)a(paramLong, this.eKB, i);
    if (localaj == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Cannot find Callback By taskId = " + paramLong);
      this.eKB.finishBroadcast();
      return;
    }
    try
    {
      localaj.PL().a(paramLong, paramInt1, paramInt2, paramString, localaj);
      if (!a(this.eKB, paramLong, localaj, i))
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "unRegisterRemoteCB failed!!!");
      this.eKB.finishBroadcast();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "callback.onTaskEnd Error!!!");
    }
  }

  private boolean c(long paramLong, aj paramaj)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "startTaskImp, task Id = %d", arrayOfObject);
    if (paramaj == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == aTask");
      c(paramLong, -1, -1, "null == aTask");
      bool = false;
    }
    do
    {
      return bool;
      int i = this.eKz.b(paramLong, paramaj);
      if (i != 0)
      {
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mBTDeviceMrg.startTask Failed ret = " + i);
        c(paramLong, -1, -1, "mBTDeviceMrg.startTask Failed!!!");
        return false;
      }
    }
    while (a(this.eKB, paramLong, paramaj));
    com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "registerRemoteCB Fail!!!");
    c(paramLong, -1, -1, "registerRemoteCB Fail!!!");
    return false;
  }

  public final long[] PF()
  {
    return null;
  }

  public final long a(aj paramaj)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "startTask");
    if (paramaj == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == aTask");
      return -1L;
    }
    long l = this.eKE.Pz();
    ax localax = new ax(l, paramaj);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(0, localax)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(0);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!! messsage what  = %d", arrayOfObject);
      return -1L;
    }
    return l;
  }

  public final void a(int paramInt, long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    arrayOfObject1[1] = Long.valueOf(paramLong);
    arrayOfObject1[2] = Short.valueOf(paramShort1);
    arrayOfObject1[3] = Short.valueOf(paramShort2);
    if (paramArrayOfByte == null);
    for (int i = 0; ; i = paramArrayOfByte.length)
    {
      arrayOfObject1[4] = Integer.valueOf(i);
      com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", arrayOfObject1);
      at localat = new at((byte)0);
      localat.e(paramShort2).Y(paramArrayOfByte).aN(paramLong).d(paramShort1).gZ(paramInt);
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(6, localat)))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(6);
        com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!!, message what = %d", arrayOfObject2);
      }
      return;
    }
  }

  public final boolean a(int paramInt, w paramw)
  {
    boolean bool1 = false;
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "******scan****** aBluetoothVersion = " + paramInt);
    int i = this.eKF;
    if (i > 0)
    {
      com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "count >= MAX_SCAN_REGISTER count = " + i);
      return bool1;
    }
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "registOnscanCallback");
    boolean bool2 = this.eKC.register(paramw);
    if (!bool2)
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mCBListOnScanCallback.register Failed!!!");
    while (true)
    {
      bool1 = false;
      if (!bool2)
        break;
      bool1 = this.eKz.fy(paramInt);
      if (bool1)
        break;
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mBTDeviceMrg.scan Failed!!!");
      Assert.assertTrue(a(paramw));
      return bool1;
      this.eKF = (1 + this.eKF);
    }
  }

  public final boolean a(long paramLong, int paramInt, z paramz)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "startChannel deviceId = %d, bluetoothVersion = %d", arrayOfObject1);
    if (paramz == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "null == callback");
      return false;
    }
    if (paramLong < 0L)
    {
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Long.valueOf(paramLong);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Invalid device id = %d", arrayOfObject4);
      return false;
    }
    if ((1 != paramInt) && (paramInt != 0))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramInt);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Invalid bluetooth version = %d", arrayOfObject3);
      return false;
    }
    aw localaw = new aw(paramLong, paramInt, paramz);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(3, localaw)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(3);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!! message what = %d", arrayOfObject2);
      return false;
    }
    return true;
  }

  public final boolean a(t paramt)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "registOnDeviceRequest");
    boolean bool = this.eKD.register(paramt);
    if (!bool)
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mCBListOnDeviceReq.register Failed!!!");
    return bool;
  }

  public final boolean aK(long paramLong)
  {
    return false;
  }

  public final boolean aL(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "stopTask, task Id = %d", arrayOfObject1);
    if (paramLong < 0L)
    {
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "taskId < 0");
      return false;
    }
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1, Long.valueOf(paramLong))))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(1);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage, message what = %d", arrayOfObject2);
      return false;
    }
    return true;
  }

  public final boolean au(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "stopChannel deviceId = %d", arrayOfObject1);
    if (paramLong < 0L)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Long.valueOf(paramLong);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "Invalid device id = %d", arrayOfObject3);
      return false;
    }
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Long.valueOf(paramLong))))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(4);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!! message what = %d", arrayOfObject2);
      return false;
    }
    return true;
  }

  public final void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onStateChange deviceId = " + paramLong + " oldState" + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    au localau = new au((byte)0);
    localau.aO(paramLong).ha(paramInt1).hb(paramInt2).hc(paramInt3);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(5, localau)))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(5);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!!, messagewhat = %d", arrayOfObject);
    }
  }

  public final void b(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    arrayOfObject1[1] = Integer.valueOf(paramInt1);
    arrayOfObject1[2] = Integer.valueOf(paramInt2);
    arrayOfObject1[3] = paramString;
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onTaskEnd taskId = %d, errTpye = %d, errCode = %d, errMsg = %s", arrayOfObject1);
    av localav = new av();
    localav.aP(paramLong).hd(paramInt1).he(paramInt2).lM(paramString);
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2, localav)))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(2);
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mHandler.sendMessage failed!!!, MessageWhat = %d", arrayOfObject2);
    }
  }

  public final boolean b(int paramInt, w paramw)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "******stopScan****** aBluetoothVersion = " + paramInt);
    if (!this.eKz.fz(paramInt))
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mBTDeviceMrg.stopScan Failed!!!");
    while (paramw == null)
      return false;
    Assert.assertTrue(a(paramw));
    return true;
  }

  public final boolean b(t paramt)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "unRegistOnDeviceRequest");
    boolean bool = this.eKD.unregister(paramt);
    if (!bool)
      com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "mCBListOnDeviceReq.unregister Failed!!!");
    return bool;
  }

  public final void f(int paramInt, String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onScanCallback messageType = " + paramInt + " errCode = 0" + null);
    int i = this.eKC.beginBroadcast();
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          ((w)this.eKC.getBroadcastItem(j)).a(paramInt, 0, null, paramString1, paramString2);
          if (2 == paramInt)
            this.eKC.unregister(this.eKC.getBroadcastItem(j));
          j++;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "onScanCallback Exception i = " + j);
        }
    this.eKC.finishBroadcast();
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(paramLong);
    com.tencent.mm.sdk.platformtools.z.i("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "------setChannelSessionKey------ deviceId = %d", arrayOfObject);
    this.eKz.setChannelSessionKey(paramLong, paramArrayOfByte);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.ar
 * JD-Core Version:    0.6.2
 */