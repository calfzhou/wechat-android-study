package com.tencent.mm.ui.conversation;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;

final class ck
  implements DialogInterface.OnClickListener
{
  ck(SharedPreferences paramSharedPreferences, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jHm.edit().putInt("show_rating_flag", 4).commit();
    if (this.jHn)
    {
      this.jHm.edit().putBoolean("show_rating_again", false).commit();
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(3);
      localn2.d(11216, arrayOfObject2);
    }
    while (true)
    {
      if (paramDialogInterface != null)
        paramDialogInterface.dismiss();
      cg.aYy();
      return;
      z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]need to show rating dialog again.");
      this.jHm.edit().putBoolean("show_rating_again", true).commit();
      n localn1 = n.fTF;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(6);
      localn1.d(11216, arrayOfObject1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ck
 * JD-Core Version:    0.6.2
 */