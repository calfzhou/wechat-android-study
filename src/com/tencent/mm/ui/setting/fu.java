package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.f.c.n;

final class fu
  implements DialogInterface.OnClickListener
{
  fu(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (SettingsUI.b(this.jOo) != null)
      SettingsUI.b(this.jOo).dismiss();
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(3);
    localn.e(11305, arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fu
 * JD-Core Version:    0.6.2
 */