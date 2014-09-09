package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.b;

final class ga
  implements View.OnClickListener
{
  ga(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final void onClick(View paramView)
  {
    b.jE("R500_100");
    Intent localIntent = new Intent(this.iQU, RegByEmailUI.class);
    this.iQU.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ga
 * JD-Core Version:    0.6.2
 */