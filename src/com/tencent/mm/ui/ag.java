package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class ag
  implements DialogInterface.OnCancelListener
{
  ag(ExposeWithProofUI paramExposeWithProofUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(ExposeWithProofUI.d(this.iJf));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ag
 * JD-Core Version:    0.6.2
 */