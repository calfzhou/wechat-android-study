package com.tencent.mm.ui.bindmobile;

import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;

final class q
  implements View.OnClickListener
{
  q(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    ActionBarActivity localActionBarActivity = this.jka.aPI();
    BindMContactIntroUI localBindMContactIntroUI = this.jka;
    int i = n.bwk;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = BindMContactIntroUI.a(this.jka);
    e.a(localActionBarActivity, localBindMContactIntroUI.getString(i, arrayOfObject), this.jka.getString(n.ajf), new r(this), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.q
 * JD-Core Version:    0.6.2
 */