package com.tencent.mm.plugin.c.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.mm.plugin.exdevice.g.a;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public final class b
{
  private Context dkf = null;
  e eic = null;
  private final HashMap eid = new HashMap();
  private BluetoothAdapter eie = null;
  private Runnable eif = null;
  private volatile boolean eig = false;
  private volatile boolean eih = false;
  private final HashSet eii = new HashSet();
  private BluetoothAdapter.LeScanCallback eij = new d(this);
  private cm mHandler = null;

  public b(am paramam)
  {
    this.mHandler = new cm(paramam.getLooper());
  }

  @TargetApi(18)
  private boolean HO()
  {
    try
    {
      Assert.assertTrue(this.eih);
      boolean bool = this.dkf.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void HP()
  {
    if (!this.eig);
    do
    {
      return;
      this.mHandler.removeCallbacks(this.eif);
      this.eig = false;
      this.eie.stopLeScan(this.eij);
    }
    while (this.eic == null);
    this.eic.HQ();
  }

  private long ah(long paramLong)
  {
    g localg1 = new g(paramLong, this.dkf, this);
    String str = String.valueOf(localg1.HT());
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(localg1.hashCode());
    arrayOfObject[1] = Long.valueOf(paramLong);
    arrayOfObject[2] = str;
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BluetoothLESession hashCode = %d, macAddr = %d, mapKey = %s", arrayOfObject);
    g localg2 = (g)this.eid.remove(str);
    if (localg2 != null)
      localg2.close();
    synchronized (this.eid)
    {
      this.eid.put(str, localg1);
      return localg1.HT();
    }
  }

  @TargetApi(18)
  public final void a(Context paramContext, e parame)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------init------");
    Assert.assertNotNull(paramContext);
    Assert.assertNotNull(parame);
    if (this.eih)
      return;
    this.eih = true;
    this.dkf = paramContext;
    this.eic = parame;
    if (!HO())
    {
      z.w("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport!!!");
      return;
    }
    this.eie = ((BluetoothManager)this.dkf.getSystemService("bluetooth")).getAdapter();
  }

  public final boolean ar(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("------scanLEDevice------");
    if (paramBoolean);
    for (String str = "true"; ; str = "false")
    {
      z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", str);
      Assert.assertTrue(this.eih);
      if (HO())
        break;
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport");
      return false;
    }
    if (paramBoolean)
    {
      if (this.eig)
        HP();
      if (!this.eie.startLeScan(this.eij))
      {
        z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "mAdapter.startLeScan Failed!!!");
        if (!this.eii.isEmpty())
        {
          Iterator localIterator = this.eii.iterator();
          while (localIterator.hasNext())
          {
            Long localLong = (Long)localIterator.next();
            z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
            if (this.eic != null)
              this.eic.b(localLong.longValue(), false);
          }
          this.eii.clear();
        }
        return false;
      }
      this.mHandler.postDelayed(this.eif, 10000L);
      this.eig = true;
      return true;
    }
    HP();
    return true;
  }

  public final boolean b(long paramLong, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramLong);
    arrayOfObject[bool] = Integer.valueOf(paramArrayOfByte.length);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------writeData------ sessionId = %d, data length = %d", arrayOfObject);
    Assert.assertTrue(this.eih);
    if (!HO())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport");
      return false;
    }
    String str = String.valueOf(paramLong);
    while (true)
    {
      synchronized (this.eid)
      {
        g localg = (g)this.eid.get(str);
        if (localg != null)
        {
          Assert.assertTrue(bool);
          return localg.N(paramArrayOfByte);
        }
      }
      bool = false;
    }
  }

  public final boolean connect(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------connect------ sessionId = %d ", arrayOfObject1);
    Assert.assertTrue(this.eih);
    if (!HO())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport");
      return false;
    }
    String str = String.valueOf(paramLong);
    while (true)
    {
      g localg;
      boolean bool;
      BluetoothManager localBluetoothManager;
      synchronized (this.eid)
      {
        localg = (g)this.eid.get(str);
        if (localg != null)
        {
          bool = true;
          Assert.assertTrue(bool);
          localBluetoothManager = (BluetoothManager)this.dkf.getSystemService("bluetooth");
          if (localBluetoothManager != null)
            break label160;
          z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "null == bluetoothManager");
        }
      }
      synchronized (this.eii)
      {
        label160: List localList;
        while (true)
        {
          this.eii.add(Long.valueOf(paramLong));
          return ar(true);
          localObject1 = finally;
          throw localObject1;
          bool = false;
          break;
          localList = localBluetoothManager.getConnectedDevices(8);
          if (localList != null)
            break label185;
          z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "null == list, may be no device is connected phone now");
        }
        label185: Iterator localIterator = localList.iterator();
        long l;
        do
        {
          if (!localIterator.hasNext())
            break;
          BluetoothDevice localBluetoothDevice = (BluetoothDevice)localIterator.next();
          l = a.lU(localBluetoothDevice.getAddress());
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = localBluetoothDevice.getAddress();
          arrayOfObject2[1] = Long.valueOf(l);
          arrayOfObject2[2] = localBluetoothDevice.getName();
          z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "get connected device: mac = %s, long of mac =%d, name = %s", arrayOfObject2);
        }
        while (paramLong != l);
        z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "This device is connected to phone now, start connecting without scan...");
        return localg.connect();
      }
    }
  }

  public final void createSession(long paramLong1, long paramLong2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(paramLong1);
    arrayOfObject[1] = Long.valueOf(paramLong2);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------createSession------ macAddr = %d channelId = %d", arrayOfObject);
    Assert.assertTrue(this.eih);
    if (!HO())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport");
      return;
    }
    Assert.assertTrue(this.mHandler.post(new f(this, paramLong1, paramLong2)));
  }

  public final void destroySession(long paramLong)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------destroySession------ sessionId = %d", arrayOfObject1);
    Assert.assertTrue(this.eih);
    if (!HO())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "BLE Unsupport");
      return;
    }
    g localg;
    synchronized (this.eid)
    {
      localg = (g)this.eid.remove(String.valueOf(paramLong));
      if (localg == null)
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Long.valueOf(paramLong);
        z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "Cannot find BluetoothLESession by sessionId(%d)", arrayOfObject2);
        return;
      }
    }
    localg.close();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.b
 * JD-Core Version:    0.6.2
 */