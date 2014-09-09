package com.tencent.mm.ui.account;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class da
  implements View.OnClickListener
{
  da(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void onClick(View paramView)
  {
    e.a(this.iPD, this.iPD.getString(n.bYQ) + LoginIndepPass.c(this.iPD), this.iPD.getString(n.bYR), new db(this), new dd(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.da
 * JD-Core Version:    0.6.2
 */