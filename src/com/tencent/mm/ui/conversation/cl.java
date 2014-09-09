package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.setting.SendFeedBackUI;

final class cl
  implements DialogInterface.OnClickListener
{
  cl(SharedPreferences paramSharedPreferences, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jHm.edit().putInt("show_rating_flag", 4).commit();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    Intent localIntent = new Intent(this.dLL, SendFeedBackUI.class);
    localIntent.putExtra("intentKeyFrom", "fromEnjoyAppDialog");
    this.dLL.startActivity(localIntent);
    z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]start feedback ui activity");
    cg.aYy();
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(2);
    localn.d(11216, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.cl
 * JD-Core Version:    0.6.2
 */