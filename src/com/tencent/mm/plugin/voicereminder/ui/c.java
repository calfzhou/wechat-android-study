package com.tencent.mm.plugin.voicereminder.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.plugin.voicereminder.a.f;

final class c
  implements DialogInterface.OnClickListener
{
  c(RemindDialog paramRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    f localf = (f)bg.qF().eA(f.class.getName());
    if (localf != null)
      localf.tf(RemindDialog.c(this.gTb));
    this.gTb.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.ui.c
 * JD-Core Version:    0.6.2
 */