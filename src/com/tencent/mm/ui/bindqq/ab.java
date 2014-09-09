package com.tencent.mm.ui.bindqq;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.ui.base.aa;

final class ab
  implements DialogInterface.OnClickListener
{
  ab(z paramz)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    StartUnbindQQ.c(this.jll.jlk).setText("");
    StartUnbindQQ.a(this.jll.jlk).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.ab
 * JD-Core Version:    0.6.2
 */