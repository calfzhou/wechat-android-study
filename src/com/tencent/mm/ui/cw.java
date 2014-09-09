package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CheckBox;

final class cw
  implements DialogInterface.OnClickListener
{
  cw(CheckBox paramCheckBox, SharedPreferences paramSharedPreferences)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.iMM.isChecked())
    {
      SharedPreferences.Editor localEditor = this.iMN.edit();
      localEditor.putBoolean("gprs_alert", false);
      localEditor.commit();
    }
    com.tencent.mm.sdk.platformtools.l.iDt = false;
    paramDialogInterface.dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cw
 * JD-Core Version:    0.6.2
 */