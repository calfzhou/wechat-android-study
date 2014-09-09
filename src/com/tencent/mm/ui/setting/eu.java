package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class eu
  implements DialogInterface.OnClickListener
{
  eu(SettingsSafeUI paramSettingsSafeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = SettingsSafeUI.a(this.jOa).getText().toString();
    SettingsSafeUI.a(this.jOa).setText("");
    SettingsSafeUI.a(this.jOa).clearFocus();
    this.jOa.ak(SettingsSafeUI.a(this.jOa));
    if ((str == null) || (str.equals("")))
    {
      e.a(this.jOa, n.cnK, n.buo, new ev(this));
      return;
    }
    as localas = new as(1, str, "", "", "");
    bg.qX().d(localas);
    SettingsSafeUI localSettingsSafeUI1 = this.jOa;
    SettingsSafeUI localSettingsSafeUI2 = this.jOa;
    this.jOa.getString(n.buo);
    SettingsSafeUI.a(localSettingsSafeUI1, e.a(localSettingsSafeUI2, this.jOa.getString(n.cfP), true, new ew(this, localas)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.eu
 * JD-Core Version:    0.6.2
 */