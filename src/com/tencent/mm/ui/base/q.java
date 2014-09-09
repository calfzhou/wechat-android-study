package com.tencent.mm.ui.base;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class q
  implements DialogInterface.OnClickListener
{
  q(x paramx, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    boolean bool = true;
    if (this.iXI != null)
      bool = this.iXI.o(this.iXJ.getText().toString().trim());
    if (bool)
      paramDialogInterface.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.q
 * JD-Core Version:    0.6.2
 */