package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;

final class dq
  implements DialogInterface.OnClickListener
{
  dq(LoginUI paramLoginUI, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("R400_100_login");
    Intent localIntent = new Intent();
    localIntent.putExtra("regsetinfo_binduin", LoginUI.e(this.iPW).dCF);
    localIntent.putExtra("regsetinfo_pwd", LoginUI.e(this.iPW).iPI);
    localIntent.putExtra("regsetinfo_ismobile", 0);
    localIntent.putExtra("regsetinfo_ticket", LoginUI.h(this.iPW));
    localIntent.putExtra("regsetinfo_NextControl", ((i)this.dpb).wo());
    localIntent.setClass(this.iPW, RegSetInfoUI.class);
    this.iPW.aPI().startActivity(localIntent);
    b.jF(bg.qS() + "," + this.iPW.getClass().getName() + ",R400_100_login," + bg.eg("R400_100_login") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.dq
 * JD-Core Version:    0.6.2
 */