package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ui.account.mobile.MobileInputUI;

final class kr
  implements View.OnClickListener
{
  kr(WelcomeSelectView_5_2 paramWelcomeSelectView_5_2, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent(this.dLL, MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 5);
    this.dLL.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.kr
 * JD-Core Version:    0.6.2
 */