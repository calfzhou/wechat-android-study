package com.tencent.mm.compatible.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.compatible.b.a;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.sdk.platformtools.z;

final class i extends BroadcastReceiver
{
  i(e parame)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    int i;
    do
    {
      return;
      String str = paramIntent.getAction();
      i = paramIntent.getIntExtra("android.bluetooth.profile.extra.STATE", -1);
      z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt onReceive action[" + str + "] state:" + i);
      if (i == 2)
      {
        e.M(true);
        this.dJT.ca(3);
        return;
      }
    }
    while (i != 0);
    e.M(false);
    if (v.dNG.dMu == 1)
      a.a(e.a(this.dJT));
    this.dJT.ca(4);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.i
 * JD-Core Version:    0.6.2
 */