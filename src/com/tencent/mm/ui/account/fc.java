package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class fc
  implements View.OnClickListener
{
  fc(RegByMobileRegAIOUI paramRegByMobileRegAIOUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", RegByMobileRegAIOUI.j(this.iQP));
    localIntent.putExtra("couttry_code", RegByMobileRegAIOUI.i(this.iQP));
    a.dWo.b(localIntent, this.iQP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.fc
 * JD-Core Version:    0.6.2
 */