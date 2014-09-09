package com.tencent.mm.ui.bindmobile;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class ax
  implements View.OnClickListener
{
  ax(FindMContactIntroUI paramFindMContactIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    e.a(this.jkI, this.jkI.getString(n.bJC), null, this.jkI.getString(n.bJD), this.jkI.getString(n.bJB), new ay(this), new az(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ax
 * JD-Core Version:    0.6.2
 */