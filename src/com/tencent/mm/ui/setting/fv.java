package com.tencent.mm.ui.setting;

import android.app.Dialog;
import android.view.View;
import android.view.View.OnClickListener;

final class fv
  implements View.OnClickListener
{
  fv(SettingsUI paramSettingsUI)
  {
  }

  public final void onClick(View paramView)
  {
    SettingsUI.d(this.jOo).dismiss();
    SettingsUI.c(this.jOo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fv
 * JD-Core Version:    0.6.2
 */