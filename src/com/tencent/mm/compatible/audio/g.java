package com.tencent.mm.compatible.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class g extends BroadcastReceiver
{
  g(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_CONNECTED ] ");
    e.M(true);
    this.dJT.ca(3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.g
 * JD-Core Version:    0.6.2
 */