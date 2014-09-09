package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class du
  implements View.OnClickListener
{
  du(LoginUI paramLoginUI)
  {
  }

  public final void onClick(View paramView)
  {
    this.iPW.startActivity(new Intent(this.iPW, FacebookLoginUI.class));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.du
 * JD-Core Version:    0.6.2
 */