package com.tencent.mm.modelvoice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.ay;

public class RemoteController$RemoteControlReceiver extends BroadcastReceiver
{
  private static ay dHm;
  private static z dHn;

  public static void Bp()
  {
    dHn = null;
    if (dHm != null)
    {
      dHm.aNu();
      dHm = null;
    }
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    do
    {
      return;
      if (!"android.intent.action.MEDIA_BUTTON".equals(paramIntent.getAction()))
      {
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLxZ3s2f/sNV4nKd9KlcPzYAJUV4T6XQso=", "unknown action, ignore" + paramIntent.getAction());
        return;
      }
      if ((dHm == null) && (dHn != null))
      {
        com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpLxZ3s2f/sNV4nKd9KlcPzYAJUV4T6XQso=", "got remote key event down");
        dHm = new ay(new aa(this), true);
      }
    }
    while (dHm == null);
    dHm.cP(1000L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.RemoteController.RemoteControlReceiver
 * JD-Core Version:    0.6.2
 */