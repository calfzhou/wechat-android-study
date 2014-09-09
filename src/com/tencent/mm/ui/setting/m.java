package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.tools.eo;

final class m
  implements MenuItem.OnMenuItemClickListener
{
  m(SelfQRCodeUI paramSelfQRCodeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    SelfQRCodeUI localSelfQRCodeUI = this.jLL;
    eo localeo = new eo(localSelfQRCodeUI);
    localeo.a(new p(localSelfQRCodeUI));
    localeo.b(new q(localSelfQRCodeUI));
    localeo.ck();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.m
 * JD-Core Version:    0.6.2
 */