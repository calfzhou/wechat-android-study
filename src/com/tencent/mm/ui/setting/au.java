package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class au
  implements DialogInterface.OnClickListener
{
  au(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SettingsAboutSystemUI.a(this.jMk, false);
    SettingsAboutSystemUI localSettingsAboutSystemUI1 = this.jMk;
    SettingsAboutSystemUI localSettingsAboutSystemUI2 = this.jMk;
    this.jMk.getString(n.buo);
    SettingsAboutSystemUI.a(localSettingsAboutSystemUI1, e.a(localSettingsAboutSystemUI2, this.jMk.getString(n.buA), true, new av(this)));
    bw.a(new aw(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.au
 * JD-Core Version:    0.6.2
 */