package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class bl
  implements View.OnClickListener
{
  bl(LoginByMobileUI paramLoginByMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this.iPh, LoginUI.class);
    localIntent.putExtra("login_type", 1);
    this.iPh.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bl
 * JD-Core Version:    0.6.2
 */