package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.an;
import com.tencent.smtt.sdk.b;
import com.tencent.smtt.sdk.e;
import java.io.File;

public class MMReceivers$ToolsProcessReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null));
    String str1;
    do
    {
      boolean bool;
      do
      {
        return;
        str1 = paramIntent.getStringExtra("tools_process_action_code_key");
        z.i("!44@/B4Tb64lLpIkgs39Nqw599wY74g+r90QyBDOg2LtLsI=", "onReceive, action = " + str1);
        if (!str1.equals("com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS"))
          break;
        z.appenderFlushSync();
        bool = e.cP(paramContext);
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Boolean.valueOf(bool);
        z.i("!44@/B4Tb64lLpIkgs39Nqw599wY74g+r90QyBDOg2LtLsI=", "onReceive, ACTION_KILL_TOOLS_PROCESS, x5 kernel video fg = %b", arrayOfObject);
      }
      while (bool);
      Process.killProcess(Process.myPid());
      return;
      if (str1.equals("com.tencent.mm.intent.ACTION_TOOLS_REMOVE_COOKIE"))
        try
        {
          b.cN(paramContext.getApplicationContext());
          com.tencent.smtt.sdk.a.bdq().removeAllCookie();
          b.bdr();
          b.sync();
          return;
        }
        catch (Exception localException)
        {
          z.i("!44@/B4Tb64lLpIkgs39Nqw599wY74g+r90QyBDOg2LtLsI=", "clear cookie faild : " + localException.getMessage());
          return;
        }
    }
    while (!str1.equals("com.tencent.mm.intent.ACIONT_TOOLS_LOAD_DEX"));
    String str2 = paramIntent.getStringExtra("tools_process_action_plugin_dex_filepath");
    String str3 = paramIntent.getStringExtra("tools_process_action_plugin_name");
    String str4 = paramIntent.getStringExtra("tools_process_action_plugin_hash");
    com.tencent.mm.am.a.b(new File(str2), str3, str4);
    z.i("!44@/B4Tb64lLpIkgs39Nqw599wY74g+r90QyBDOg2LtLsI=", "Tools Add Dex File, filePath:%s,name:%s,hash:%s", new Object[] { str2, str3, str4 });
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(an.jTk, "com.tencent.mm.booter.MMReceivers$MainProcessReceiver"));
    localIntent.putExtra("main_process_action_code_key", "com.tencent.mm.intent.ACIONT_MAIN_LOAD_DEX");
    localIntent.putExtra("main_process_action_plugin_dex_filepath", str2);
    localIntent.putExtra("main_process_action_plugin_name", str3);
    localIntent.putExtra("main_process_action_plugin_hash", str4);
    ak.getContext().sendBroadcast(localIntent);
    z.d("!44@/B4Tb64lLpL9dd+/oc9PYLjB/uZqnBGxkQAN7KV5D+Q=", "notifyMainProcessAddDex path:%s,pluginName:%s,hash:%s", new Object[] { str2, str3, str4 });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.ToolsProcessReceiver
 * JD-Core Version:    0.6.2
 */