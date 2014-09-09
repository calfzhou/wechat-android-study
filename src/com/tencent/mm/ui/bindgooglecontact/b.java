package com.tencent.mm.ui.bindgooglecontact;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class b
  implements View.OnClickListener
{
  b(BindGoogleContactIntroUI paramBindGoogleContactIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    e.a(this.jih.aPI(), true, this.jih.getString(n.cmK), "", this.jih.getString(n.cmJ), this.jih.getString(n.bsK), new c(this), new d(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindgooglecontact.b
 * JD-Core Version:    0.6.2
 */