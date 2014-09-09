package com.tencent.mm.ui.setting;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ap;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;

final class dl
  implements View.OnClickListener
{
  dl(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final void onClick(View paramView)
  {
    ap localap = new ap((String)bg.qW().oQ().get(2));
    bg.qX().d(localap);
    SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI = this.jNu;
    ActionBarActivity localActionBarActivity = this.jNu.aPI();
    this.jNu.getString(n.buo);
    SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI, com.tencent.mm.ui.base.e.a(localActionBarActivity, this.jNu.getString(n.cfr), true, new dm(this, localap)));
    this.jNu.XF();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.dl
 * JD-Core Version:    0.6.2
 */