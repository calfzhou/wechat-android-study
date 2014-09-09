package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

final class cj
  implements DialogInterface.OnClickListener
{
  cj(SharedPreferences paramSharedPreferences, Context paramContext, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jHm.edit().putInt("show_rating_flag", 4).commit();
    String str = "market://details?id=" + ak.getPackageName();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(str));
    this.dLL.startActivity(localIntent);
    z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]start market intent");
    if (paramDialogInterface != null)
      paramDialogInterface.dismiss();
    this.jHm.edit().putBoolean("show_rating_again", false).commit();
    cg.aYy();
    if (this.jHn)
    {
      n localn2 = n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(5);
      localn2.d(11216, arrayOfObject2);
      return;
    }
    n localn1 = n.fTF;
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(4);
    localn1.d(11216, arrayOfObject1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.cj
 * JD-Core Version:    0.6.2
 */