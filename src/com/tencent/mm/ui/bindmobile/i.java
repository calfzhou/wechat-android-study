package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.o.ac;

final class i
  implements DialogInterface.OnCancelListener
{
  i(BindMContactIntroUI paramBindMContactIntroUI, ak paramak)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jkb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.i
 * JD-Core Version:    0.6.2
 */