package com.tencent.mm.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class ch
  implements DialogInterface.OnClickListener
{
  ch(SettingsChattingUI paramSettingsChattingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SettingsChattingUI.a(this.jNi, false);
    SettingsChattingUI localSettingsChattingUI1 = this.jNi;
    SettingsChattingUI localSettingsChattingUI2 = this.jNi;
    this.jNi.getString(n.buo);
    SettingsChattingUI.a(localSettingsChattingUI1, e.a(localSettingsChattingUI2, this.jNi.getString(n.buA), true, new ci(this)));
    bw.a(new cj(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ch
 * JD-Core Version:    0.6.2
 */