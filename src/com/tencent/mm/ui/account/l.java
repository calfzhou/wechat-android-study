package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.base.e;

final class l
  implements View.OnClickListener
{
  l(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    b.jF(bg.qS() + "," + getClass().getName() + ",R500_250," + bg.eg("R500_250") + ",3");
    e.a(this.iOb, n.bYh, n.bYb, n.btQ, n.bsK, new m(this), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.l
 * JD-Core Version:    0.6.2
 */