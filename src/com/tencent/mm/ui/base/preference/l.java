package com.tencent.mm.ui.base.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.ui.base.aa;

final class l
  implements DialogInterface.OnClickListener
{
  l(EditPreference paramEditPreference, EditText paramEditText)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (EditPreference.a(this.jgH) != null)
      EditPreference.a(this.jgH).dismiss();
    this.jgH.setValue(this.jgG.getText().toString());
    if (EditPreference.b(this.jgH) != null)
      EditPreference.b(this.jgH).aTE();
    if (EditPreference.c(this.jgH) != null)
      EditPreference.c(this.jgH).a(this.jgH, EditPreference.d(this.jgH));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.l
 * JD-Core Version:    0.6.2
 */