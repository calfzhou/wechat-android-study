package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;

final class by
  implements DialogInterface.OnClickListener
{
  by(LoginHistoryUI paramLoginHistoryUI, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("R400_100_login");
    Intent localIntent = new Intent();
    localIntent.putExtra("regsetinfo_binduin", LoginHistoryUI.h(this.iPx).dCF);
    localIntent.putExtra("regsetinfo_pwd", LoginHistoryUI.h(this.iPx).iPI);
    localIntent.putExtra("regsetinfo_ismobile", 0);
    localIntent.putExtra("regsetinfo_ticket", ((i)this.dpb).wm());
    localIntent.putExtra("regsetinfo_NextControl", ((i)this.dpb).wo());
    localIntent.setClass(this.iPx, RegSetInfoUI.class);
    this.iPx.aPI().startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.by
 * JD-Core Version:    0.6.2
 */