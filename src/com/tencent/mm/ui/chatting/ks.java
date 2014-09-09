package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.mm.storage.ar;

final class ks
  implements DialogInterface.OnClickListener
{
  ks(kr paramkr, ar paramar, MenuItem paramMenuItem)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    hd localhd = this.jue.jtA;
    ar localar = this.dxM;
    this.iMs.getGroupId();
    hd.e(localhd, localar);
    paramDialogInterface.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ks
 * JD-Core Version:    0.6.2
 */