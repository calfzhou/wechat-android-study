package com.tencent.mm.compatible.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.compatible.b.a;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;

final class h extends BroadcastReceiver
{
  h(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt onReceive action[ BluetoothDevice.ACTION_ACL_DISCONNECTED ] ");
    e.M(false);
    if (v.dNG.dMu == 1)
      a.a(e.a(this.dJT));
    this.dJT.ca(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.h
 * JD-Core Version:    0.6.2
 */