package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class et
  implements DialogInterface.OnCancelListener
{
  et(SelectContactUI paramSelectContactUI, k paramk)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jBZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.et
 * JD-Core Version:    0.6.2
 */