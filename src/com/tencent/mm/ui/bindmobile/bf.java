package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class bf
  implements DialogInterface.OnCancelListener
{
  bf(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (FindMContactIntroUI.i(this.jkI) != null)
    {
      bg.qX().b(431, FindMContactIntroUI.i(this.jkI));
      FindMContactIntroUI.j(this.jkI);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bf
 * JD-Core Version:    0.6.2
 */