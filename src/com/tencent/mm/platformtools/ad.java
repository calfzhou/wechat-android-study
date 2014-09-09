package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.c;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.e;

final class ad
  implements DialogInterface.OnClickListener
{
  ad(Activity paramActivity, Runnable paramRunnable)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(true));
    ac.f(true, false);
    c.vp();
    if (this.dVh != null)
      this.dVh.run();
    this.dVg.getSharedPreferences(ak.aHi(), 0).edit().putBoolean("login_upload_contacts_already_displayed", true).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ad
 * JD-Core Version:    0.6.2
 */