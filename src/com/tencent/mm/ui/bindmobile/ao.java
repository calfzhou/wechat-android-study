package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.storage.e;

final class ao
  implements DialogInterface.OnClickListener
{
  ao(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qW().oQ().set(12322, Boolean.valueOf(false));
    com.tencent.mm.plugin.a.b.jF(bg.qS() + "," + this.jkD.getClass().getName() + ",R300_200_phone," + bg.eg("R300_200_phone") + ",2");
    FindMContactAlertUI.d(this.jkD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ao
 * JD-Core Version:    0.6.2
 */