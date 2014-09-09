package com.tencent.mm.booter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.jg.JgClassChecked;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class InstallReceiver extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null))
      return;
    String str1 = paramIntent.getAction();
    z.i("!44@/B4Tb64lLpKHfvyC9/rQc20cw3qxVcQGTFufDl7pIG0=", "action:[%s]", new Object[] { str1 });
    if ((ch.jb(str1)) || (!str1.equals("com.android.vending.INSTALL_REFERRER")))
    {
      z.e("!44@/B4Tb64lLpKHfvyC9/rQc20cw3qxVcQGTFufDl7pIG0=", "action is null or nil, or not the installed action");
      return;
    }
    String str2 = paramIntent.getStringExtra("referrer");
    z.i("!44@/B4Tb64lLpKHfvyC9/rQc20cw3qxVcQGTFufDl7pIG0=", "get referer:[%s]", new Object[] { str2 });
    if (ch.jb(str2))
    {
      z.e("!44@/B4Tb64lLpKHfvyC9/rQc20cw3qxVcQGTFufDl7pIG0=", "get referer is null or nil");
      return;
    }
    z.d("!44@/B4Tb64lLpKHfvyC9/rQc20cw3qxVcQGTFufDl7pIG0=", "[PREF] write installreferer = " + str2);
    paramContext.getSharedPreferences(ak.aHi(), 0).edit().putString("installreferer", str2).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.InstallReceiver
 * JD-Core Version:    0.6.2
 */