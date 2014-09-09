package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class aw
  implements View.OnClickListener
{
  aw(MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", this.iUs.dyU);
    localIntent.putExtra("couttry_code", this.iUs.dmj);
    a.dWo.b(localIntent, this.iUs);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.aw
 * JD-Core Version:    0.6.2
 */