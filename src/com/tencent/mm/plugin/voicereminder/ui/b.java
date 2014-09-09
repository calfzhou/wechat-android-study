package com.tencent.mm.plugin.voicereminder.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.y;
import com.tencent.mm.plugin.voicereminder.a.f;
import com.tencent.mm.ui.chatting.ChattingUI;

final class b
  implements DialogInterface.OnClickListener
{
  b(RemindDialog paramRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    f localf = (f)bg.qF().eA(f.class.getName());
    if (localf != null)
      localf.tf(RemindDialog.c(this.gTb));
    if (y.dE(bg.ig().lp()))
    {
      this.gTb.finish();
      return;
    }
    RemindDialog localRemindDialog = this.gTb;
    Intent localIntent = new Intent().putExtra("Chat_User", RemindDialog.c(this.gTb));
    localIntent.setClass(localRemindDialog, ChattingUI.class);
    localRemindDialog.startActivity(localIntent);
    this.gTb.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.ui.b
 * JD-Core Version:    0.6.2
 */