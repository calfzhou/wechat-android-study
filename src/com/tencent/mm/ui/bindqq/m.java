package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.p.a;

final class m
  implements DialogInterface.OnCancelListener
{
  m(l paraml, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.jkZ.jkX.onDetach();
    bg.qX().c(this.jkY);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.m
 * JD-Core Version:    0.6.2
 */