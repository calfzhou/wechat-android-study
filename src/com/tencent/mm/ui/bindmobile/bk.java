package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class bk
  implements DialogInterface.OnCancelListener
{
  bk(FindMContactLearmMoreUI paramFindMContactLearmMoreUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (FindMContactLearmMoreUI.e(this.jkM) != null)
    {
      bg.qX().b(431, FindMContactLearmMoreUI.e(this.jkM));
      FindMContactLearmMoreUI.f(this.jkM);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bk
 * JD-Core Version:    0.6.2
 */