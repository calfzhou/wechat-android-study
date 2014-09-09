package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ae;
import com.tencent.mm.o.ac;

final class ig
  implements DialogInterface.OnCancelListener
{
  ig(RegSetInfoUI paramRegSetInfoUI, ae paramae)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.iSi);
    bg.qX().b(126, this.iSh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ig
 * JD-Core Version:    0.6.2
 */