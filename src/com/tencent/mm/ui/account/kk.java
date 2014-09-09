package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;

final class kk
  implements View.OnClickListener
{
  kk(WelcomeSelectView paramWelcomeSelectView)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("not_auth_setting", true);
    localIntent.putExtra("from_login_history", true);
    a.dWo.n(localIntent, this.iSV.getContext());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kk
 * JD-Core Version:    0.6.2
 */