package com.tencent.mm.booter;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public class MMReceivers$MainProcessReceiver extends MMReceivers.BootReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null));
    String str1;
    do
    {
      return;
      str1 = paramIntent.getStringExtra("main_process_action_code_key");
      z.i("!44@/B4Tb64lLpL9dd+/oc9PYLjB/uZqnBGxkQAN7KV5D+Q=", "onReceive, action = %s", new Object[] { str1 });
      if (str1 == null)
      {
        z.e("!44@/B4Tb64lLpL9dd+/oc9PYLjB/uZqnBGxkQAN7KV5D+Q=", "onReceive action == null!!");
        return;
      }
    }
    while (!str1.equals("com.tencent.mm.intent.ACIONT_MAIN_LOAD_DEX"));
    String str2 = paramIntent.getStringExtra("main_process_action_plugin_dex_filepath");
    String str3 = paramIntent.getStringExtra("main_process_action_plugin_name");
    String str4 = paramIntent.getStringExtra("main_process_action_plugin_hash");
    a.b(new File(str2), str3, str4);
    z.i("!44@/B4Tb64lLpL9dd+/oc9PYLjB/uZqnBGxkQAN7KV5D+Q=", "Main Add Dex File, filePath:%s,name:%s,hash:%s", new Object[] { str2, str3, str4 });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.MMReceivers.MainProcessReceiver
 * JD-Core Version:    0.6.2
 */