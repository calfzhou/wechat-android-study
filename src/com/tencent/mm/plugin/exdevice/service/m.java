package com.tencent.mm.plugin.exdevice.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.mm.sdk.platformtools.z;

public final class m
{
  public static boolean ar(Context paramContext)
  {
    if (paramContext.getSharedPreferences("system_config_prefs", com.tencent.mm.compatible.g.m.nN()).getBoolean("settings_fully_exit", true))
    {
      z.i("!56@/B4Tb64lLpLHXwcx366fGmA9A7CzrcX641057RgJ12vLpIQzySbrCg==", "fully exited, no need to start service");
      return false;
    }
    Intent localIntent = new Intent(paramContext, ExDeviceService.class);
    localIntent.setFlags(268435456);
    paramContext.startService(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.m
 * JD-Core Version:    0.6.2
 */