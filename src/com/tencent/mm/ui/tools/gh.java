package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;

final class gh
  implements MenuItem.OnMenuItemClickListener
{
  gh(ShareImageUI paramShareImageUI, gk paramgk)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    cr localcr = e.a(this.jUM.aPI(), this.jUM.getString(n.bRf), false, null);
    bg.qQ().n(new gi(this, localcr));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gh
 * JD-Core Version:    0.6.2
 */