package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.sdk.platformtools.z;

final class ch
  implements DialogInterface.OnClickListener
{
  ch(SharedPreferences paramSharedPreferences, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jHm.edit().putInt("show_rating_flag", 1).commit();
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    cg.aYy();
    cg.cx(this.dLL);
    z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]show rating dialog from enjoy app dialog.");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ch
 * JD-Core Version:    0.6.2
 */