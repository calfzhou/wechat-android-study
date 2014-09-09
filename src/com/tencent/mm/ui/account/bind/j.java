package com.tencent.mm.ui.account.bind;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class j
  implements View.OnClickListener
{
  j(BindMobileUI paramBindMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("country_name", BindMobileUI.f(this.iTO));
    localIntent.putExtra("couttry_code", BindMobileUI.g(this.iTO));
    a.dWo.b(localIntent, this.iTO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.j
 * JD-Core Version:    0.6.2
 */