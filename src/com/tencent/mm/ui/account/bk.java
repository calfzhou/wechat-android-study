package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class bk
  implements View.OnClickListener
{
  bk(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", LoginByMobileUI.i(this.iPh));
    localIntent.putExtra("couttry_code", LoginByMobileUI.j(this.iPh));
    a.dWo.b(localIntent, this.iPh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bk
 * JD-Core Version:    0.6.2
 */