package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class fz
  implements View.OnClickListener
{
  fz(RegByMobileRegUI paramRegByMobileRegUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", RegByMobileRegUI.k(this.iQU));
    localIntent.putExtra("couttry_code", RegByMobileRegUI.j(this.iQU));
    a.dWo.b(localIntent, this.iQU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fz
 * JD-Core Version:    0.6.2
 */