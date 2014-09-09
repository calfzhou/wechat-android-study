package com.tencent.mm.plugin.c.a.a;

import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import com.tencent.mm.plugin.exdevice.g.a;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;

final class d
  implements BluetoothAdapter.LeScanCallback
{
  d(b paramb)
  {
  }

  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramBluetoothDevice.getName();
    arrayOfObject[1] = paramBluetoothDevice.getAddress();
    arrayOfObject[2] = Long.valueOf(a.lU(paramBluetoothDevice.getAddress()));
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "------onLeScan------ device Name = %s, mac = %s(%d)", arrayOfObject);
    synchronized (b.d(this.eik))
    {
      if (!b.d(this.eik).isEmpty())
      {
        long l = a.lU(paramBluetoothDevice.getAddress());
        if (b.d(this.eik).contains(Long.valueOf(l)))
        {
          b.a(this.eik, l);
          b.d(this.eik).remove(Long.valueOf(l));
          if (b.d(this.eik).isEmpty())
          {
            z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "Connect PreScan is done, stop scan");
            this.eik.ar(false);
          }
        }
      }
      if (this.eik.eic != null)
        this.eik.eic.ai(paramBluetoothDevice.getAddress(), paramBluetoothDevice.getName());
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.d
 * JD-Core Version:    0.6.2
 */