package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.UUID;
import junit.framework.Assert;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public final class a
{
  public static final UUID eiN = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
  public static final UUID eiO = UUID.fromString("e5b152ed-6b46-09e9-4678-665e9a972cbc");
  public d eiP;
  private Context eiQ;
  private final BroadcastReceiver eiR = new b(this);
  private HashMap eid = new HashMap();
  private BluetoothAdapter eie;
  private Runnable eif;
  private boolean eih = false;
  private cm mHandler;

  public a(am paramam)
  {
    this.mHandler = new cm(paramam.getLooper());
    this.eif = new c(this);
  }

  private boolean HU()
  {
    Assert.assertTrue(this.eih);
    return this.eie != null;
  }

  private boolean HV()
  {
    if (!this.eie.isDiscovering())
      return true;
    if (!this.eie.cancelDiscovery())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "mAdapter.cancelDiscovery Failed!!!");
      return false;
    }
    this.mHandler.removeCallbacks(this.eif);
    return true;
  }

  public final void a(Context paramContext, d paramd)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "------init------");
    Assert.assertNotNull(paramContext);
    Assert.assertNotNull(paramd);
    if (this.eih)
      return;
    this.eih = true;
    this.eiP = paramd;
    this.eiQ = paramContext;
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
    localIntentFilter.addAction("android.bluetooth.device.action.FOUND");
    localIntentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
    localIntentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
    this.eiQ.registerReceiver(this.eiR, localIntentFilter);
    this.eie = BluetoothAdapter.getDefaultAdapter();
  }

  final long ah(long paramLong)
  {
    f localf1 = new f(paramLong);
    long l = localf1.ein;
    f localf2 = (f)this.eid.remove(Long.valueOf(l));
    if (localf2 != null)
      localf2.disconnect();
    this.eid.put(Long.valueOf(l), localf1);
    return l;
  }

  public final boolean as(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("scanDevices");
    if (paramBoolean);
    for (String str = "true"; ; str = "false")
    {
      z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", str);
      Assert.assertTrue(this.eih);
      if (HU())
        break;
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "BC Unsupport!!!");
      return false;
    }
    if (paramBoolean)
    {
      if ((this.eie.isDiscovering()) && (!HV()))
        return false;
      if (!this.eie.startDiscovery())
      {
        z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "mAdapter.startDiscovery() Failed");
        return false;
      }
      this.mHandler.postDelayed(this.eif, 10000L);
      return true;
    }
    return HV();
  }

  public final boolean b(long paramLong, byte[] paramArrayOfByte)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "writeData to: " + paramLong);
    Assert.assertTrue(this.eih);
    if (!HU())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "BC Unsupport!!!");
      return false;
    }
    f localf = (f)this.eid.get(Long.valueOf(paramLong));
    if (localf != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLfYulCLBIG2OvhTg4RJk6Kw==", "write");
      if (localf.eiW == null)
        break;
      return localf.eiW.O(paramArrayOfByte);
    }
  }

  public final void createSession(long paramLong1, long paramLong2)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "createSession");
    Assert.assertTrue(this.eih);
    if (!HU())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "BC Unsupport!!!");
      return;
    }
    Assert.assertTrue(this.mHandler.post(new e(this, paramLong1, paramLong2)));
  }

  public final boolean d(long paramLong, boolean paramBoolean)
  {
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "connect to: " + paramLong);
    Assert.assertTrue(this.eih);
    if (!HU())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "BC Unsupport!!!");
      return false;
    }
    f localf = (f)this.eid.get(Long.valueOf(paramLong));
    boolean bool = false;
    if (localf != null)
      bool = true;
    Assert.assertTrue(bool);
    return localf.a(this, paramBoolean);
  }

  public final void destroySession(long paramLong)
  {
    boolean bool = true;
    Object[] arrayOfObject = new Object[bool];
    arrayOfObject[0] = Long.valueOf(paramLong);
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "------destroySession------ sessionId = %d", arrayOfObject);
    Assert.assertTrue(this.eih);
    if (!HU())
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "BC Unsupport!!!");
      return;
    }
    f localf = (f)this.eid.remove(Long.valueOf(paramLong));
    if (localf != null);
    while (true)
    {
      Assert.assertTrue(bool);
      localf.disconnect();
      return;
      bool = false;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.a
 * JD-Core Version:    0.6.2
 */