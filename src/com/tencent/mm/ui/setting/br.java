package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.ui.base.aa;

final class br
  implements DialogInterface.OnClickListener
{
  br(SettingsAccountInfoUI paramSettingsAccountInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SettingsAccountInfoUI.a(this.jMH).setText("");
    SettingsAccountInfoUI.b(this.jMH).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.br
 * JD-Core Version:    0.6.2
 */