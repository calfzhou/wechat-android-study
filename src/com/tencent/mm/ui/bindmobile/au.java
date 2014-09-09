package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class au
  implements DialogInterface.OnCancelListener
{
  au(FindMContactAlertUI paramFindMContactAlertUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (FindMContactAlertUI.h(this.jkD) != null)
    {
      bg.qX().b(431, FindMContactAlertUI.h(this.jkD));
      FindMContactAlertUI.i(this.jkD);
      FindMContactAlertUI.j(this.jkD);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.au
 * JD-Core Version:    0.6.2
 */