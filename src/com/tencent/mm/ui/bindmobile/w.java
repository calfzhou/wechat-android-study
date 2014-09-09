package com.tencent.mm.ui.bindmobile;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.tools.ei;

final class w
  implements MenuItem.OnMenuItemClickListener
{
  w(BindMContactIntroUI paramBindMContactIntroUI, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ei localei = new ei(this.jka.aPI());
    localei.a(new x(this));
    localei.b(new y(this));
    localei.baG();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.w
 * JD-Core Version:    0.6.2
 */