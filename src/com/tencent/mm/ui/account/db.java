package com.tencent.mm.ui.account;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class db
  implements DialogInterface.OnClickListener
{
  db(da paramda)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    bg.qX().a(145, this.iPF.iPD);
    ai localai = new ai(LoginIndepPass.d(this.iPF.iPD), 16, "", 0, "");
    bg.qX().d(localai);
    LoginIndepPass localLoginIndepPass1 = this.iPF.iPD;
    LoginIndepPass localLoginIndepPass2 = this.iPF.iPD;
    this.iPF.iPD.getString(n.buo);
    LoginIndepPass.a(localLoginIndepPass1, e.a(localLoginIndepPass2, this.iPF.iPD.getString(n.cfP), true, new dc(this, localai)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.db
 * JD-Core Version:    0.6.2
 */