package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.as;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class bo
  implements DialogInterface.OnClickListener
{
  bo(SettingsAccountInfoUI paramSettingsAccountInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = SettingsAccountInfoUI.a(this.jMH).getText().toString();
    SettingsAccountInfoUI.a(this.jMH).setText("");
    SettingsAccountInfoUI.a(this.jMH).clearFocus();
    this.jMH.ak(SettingsAccountInfoUI.a(this.jMH));
    if ((str == null) || (str.equals("")))
    {
      e.a(this.jMH, n.cnK, n.buo, new bp(this));
      return;
    }
    as localas = new as(1, str, "", "", "");
    bg.qX().d(localas);
    SettingsAccountInfoUI localSettingsAccountInfoUI1 = this.jMH;
    SettingsAccountInfoUI localSettingsAccountInfoUI2 = this.jMH;
    this.jMH.getString(n.buo);
    SettingsAccountInfoUI.a(localSettingsAccountInfoUI1, e.a(localSettingsAccountInfoUI2, this.jMH.getString(n.cfP), true, new bq(this, localas)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.bo
 * JD-Core Version:    0.6.2
 */