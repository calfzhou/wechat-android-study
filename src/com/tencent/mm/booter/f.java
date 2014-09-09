package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;

public final class f
{
  public static boolean h(Context paramContext, String paramString)
  {
    if (((!paramString.equals("noop")) || ((l.iDu) && (l.iDt))) && (paramContext.getSharedPreferences("system_config_prefs", m.nN()).getBoolean("settings_fully_exit", true)))
    {
      z.i("!44@/B4Tb64lLpIzvC/moQitzF+fhNaOymSkEyY1qkrbh9E=", "fully exited, no need to start service");
      return false;
    }
    z.d("!44@/B4Tb64lLpIzvC/moQitzF+fhNaOymSkEyY1qkrbh9E=", "ensure service running, type=" + paramString);
    Intent localIntent = new Intent(paramContext, CoreService.class);
    localIntent.setFlags(268435456);
    paramContext.startService(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.f
 * JD-Core Version:    0.6.2
 */