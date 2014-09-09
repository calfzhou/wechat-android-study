package com.tencent.mm.ui.qrcode;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class o
  implements MenuItem.OnMenuItemClickListener
{
  o(ShowQRCodeStep1UI paramShowQRCodeStep1UI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ShowQRCodeStep1UI localShowQRCodeStep1UI = this.jLg;
    String[] arrayOfString = new String[2];
    arrayOfString[0] = localShowQRCodeStep1UI.getString(n.cdJ);
    arrayOfString[1] = localShowQRCodeStep1UI.getString(n.cdM);
    e.a(localShowQRCodeStep1UI, "", arrayOfString, "", false, new q(localShowQRCodeStep1UI));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.o
 * JD-Core Version:    0.6.2
 */