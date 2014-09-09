package com.tencent.mm.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.cx;
import com.tencent.mm.ui.ek;

final class z
  implements MenuItem.OnMenuItemClickListener
{
  z(SetTextSizeUI paramSetTextSizeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ek.b(this.jLS, SetTextSizeUI.a(this.jLS));
    cx localcx = cx.rV();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(SetTextSizeUI.b(this.jLS));
    localcx.a(25, arrayOfObject);
    this.jLS.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.z
 * JD-Core Version:    0.6.2
 */