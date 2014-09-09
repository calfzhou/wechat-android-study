package com.tencent.mm.ui.base.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ui.base.aa;

final class m
  implements DialogInterface.OnClickListener
{
  m(EditPreference paramEditPreference)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (EditPreference.a(this.jgH) != null)
      EditPreference.a(this.jgH).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.m
 * JD-Core Version:    0.6.2
 */