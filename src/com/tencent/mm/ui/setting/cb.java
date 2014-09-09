package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class cb
  implements DialogInterface.OnCancelListener
{
  cb(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (SettingsAliasUI.f(this.jNd) != null)
      bg.qX().c(SettingsAliasUI.f(this.jNd));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cb
 * JD-Core Version:    0.6.2
 */