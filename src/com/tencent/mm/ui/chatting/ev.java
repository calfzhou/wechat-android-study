package com.tencent.mm.ui.chatting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.voicereminder.a.a;

final class ev
  implements DialogInterface.OnCancelListener
{
  ev(et paramet, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jpO);
    bg.qX().b(331, eo.b(this.jpN.jpM.jpJ));
    eo.a(this.jpN.jpM.jpJ, null);
    if (eo.c(this.jpN.jpM.jpJ) != null)
      eo.c(this.jpN.jpM.jpJ).dismiss();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ev
 * JD-Core Version:    0.6.2
 */