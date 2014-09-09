package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.f.c.n;

final class ft
  implements DialogInterface.OnClickListener
{
  ft(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (SettingsUI.b(this.jOo) != null)
      SettingsUI.b(this.jOo).dismiss();
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(2);
    localn.e(11305, arrayOfObject);
    SettingsUI.c(this.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ft
 * JD-Core Version:    0.6.2
 */