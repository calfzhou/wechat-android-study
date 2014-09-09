package com.tencent.map.location;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class u extends BroadcastReceiver
{
  u(s params)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    String str;
    do
    {
      return;
      str = paramIntent.getAction();
    }
    while ((str == null) || (!str.equals("android.net.conn.CONNECTIVITY_CHANGE")) || (paramIntent.getBooleanExtra("noConnectivity", false)) || (s.d(this.Me) == null));
    s.d(this.Me).sendEmptyMessage(256);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.map.location.u
 * JD-Core Version:    0.6.2
 */