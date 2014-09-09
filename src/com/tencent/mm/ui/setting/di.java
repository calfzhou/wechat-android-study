package com.tencent.mm.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class di
  implements View.OnClickListener
{
  di(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final void onClick(View paramView)
  {
    s locals = new s(s.dCA);
    bg.qX().d(locals);
    SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI1 = this.jNu;
    SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI2 = this.jNu;
    this.jNu.getString(n.buo);
    SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI1, e.a(localSettingsModifyEmailAddrUI2, this.jNu.getString(n.chr), true, new dj(this)));
    this.jNu.XF();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.di
 * JD-Core Version:    0.6.2
 */