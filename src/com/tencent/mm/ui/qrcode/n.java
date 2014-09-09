package com.tencent.mm.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class n
  implements MenuItem.OnMenuItemClickListener
{
  n(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jLg.XF();
    this.jLg.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.n
 * JD-Core Version:    0.6.2
 */