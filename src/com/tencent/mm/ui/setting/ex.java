package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.ui.base.aa;

final class ex
  implements DialogInterface.OnClickListener
{
  ex(SettingsSafeUI paramSettingsSafeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SettingsSafeUI.a(this.jOa).setText("");
    SettingsSafeUI.b(this.jOa).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ex
 * JD-Core Version:    0.6.2
 */