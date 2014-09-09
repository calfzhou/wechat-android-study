package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;

final class u
  implements DialogInterface.OnClickListener
{
  u(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = this.iOi.getString(n.buo);
    String str2 = this.iOi.getString(n.bGM);
    FacebookAuthUI.a(this.iOi, ProgressDialog.show(this.iOi, str1, str2, true));
    FacebookAuthUI.d(this.iOi).setOnCancelListener(FacebookAuthUI.c(this.iOi));
    s locals = new s(s.dCz);
    bg.qX().d(locals);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.u
 * JD-Core Version:    0.6.2
 */