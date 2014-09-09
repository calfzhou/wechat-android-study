package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.account.LoginUI;

final class r
  implements View.OnClickListener
{
  r(n paramn, MobileInputUI paramMobileInputUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this.iUh, LoginUI.class);
    localIntent.putExtra("login_type", 1);
    this.iUh.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.r
 * JD-Core Version:    0.6.2
 */