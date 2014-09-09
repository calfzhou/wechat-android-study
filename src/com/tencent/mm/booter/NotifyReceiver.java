package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;

public class NotifyReceiver extends BroadcastReceiver
{
  private static WakerLock dhD = null;
  private static ac diK;
  private static long diL = 0L;

  public static void lw()
  {
    bg.qX().b(38, diK);
    bg.qX().b(39, diK);
    if (diK == null)
      diK = new ac();
    bg.qX().a(38, diK);
    bg.qX().a(39, diK);
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "onReceive");
    if (paramIntent == null)
      return;
    if (paramContext.getSharedPreferences("system_config_prefs", m.nN()).getBoolean("settings_fully_exit", true))
    {
      z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "fully exited, no need to start service");
      return;
    }
    Intent localIntent = new Intent(paramContext, NotifyReceiver.NotifyService.class);
    if (paramIntent.getBooleanExtra("intent_from_shoot_key", false))
      localIntent.putExtra("notify_option_type", 3);
    localIntent.putExtras(paramIntent);
    paramContext.startService(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.NotifyReceiver
 * JD-Core Version:    0.6.2
 */