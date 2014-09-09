package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

final class b extends BroadcastReceiver
{
  b(a parama)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    String str2;
    do
    {
      BluetoothDevice localBluetoothDevice1;
      do
      {
        String str1;
        do
        {
          BluetoothDevice localBluetoothDevice2;
          do
          {
            return;
            str1 = paramIntent.getAction();
            z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "------onReceive------ action  = " + str1);
            if (!"android.bluetooth.device.action.FOUND".equals(str1))
              break;
            localBluetoothDevice2 = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
          }
          while (localBluetoothDevice2.getBondState() == 12);
          this.eiS.eiP.aj(localBluetoothDevice2.getAddress(), localBluetoothDevice2.getName());
          return;
          if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(str1))
          {
            this.eiS.eiP.HQ();
            return;
          }
          if ("android.bluetooth.adapter.action.SCAN_MODE_CHANGED".equals(str1))
          {
            switch (paramIntent.getIntExtra("android.bluetooth.adapter.extra.SCAN_MODE", -1))
            {
            case 22:
            default:
              return;
            case 20:
            case 21:
              return;
            case 23:
            }
            return;
          }
        }
        while (!"android.bluetooth.device.action.ACL_DISCONNECTED".equals(str1));
        localBluetoothDevice1 = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        str2 = localBluetoothDevice1.getAddress();
      }
      while (!a.a(this.eiS).containsKey(Long.valueOf(com.tencent.mm.plugin.exdevice.g.a.lU(str2))));
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = localBluetoothDevice1.getName();
      arrayOfObject[1] = str2;
      z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdL7oO+FzIZx2fJ89xCmoQayA==", "------ACTION_ACL_DISCONNECTED------ device name = %s, device Mac = %s", arrayOfObject);
    }
    while (this.eiS.eiP == null);
    this.eiS.eiP.b(com.tencent.mm.plugin.exdevice.g.a.lU(str2), false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.b
 * JD-Core Version:    0.6.2
 */