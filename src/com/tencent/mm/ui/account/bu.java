package com.tencent.mm.ui.account;

import android.content.Intent;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.z.b;

final class bu
  implements y
{
  bu(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final void onClick(int paramInt)
  {
    if (b.yn())
    {
      switch (paramInt)
      {
      default:
        return;
      case 0:
        Intent localIntent5 = new Intent(this.iPx, MobileInputUI.class);
        localIntent5.putExtra("mobile_input_purpose", 5);
        this.iPx.startActivity(localIntent5);
        return;
      case 1:
        Intent localIntent4 = new Intent(this.iPx, LoginUI.class);
        this.iPx.startActivity(localIntent4);
        return;
      case 2:
      }
      Intent localIntent3 = new Intent(this.iPx, FacebookLoginUI.class);
      this.iPx.startActivity(localIntent3);
      return;
    }
    switch (paramInt)
    {
    default:
      return;
    case 0:
      Intent localIntent2 = new Intent(this.iPx, MobileInputUI.class);
      localIntent2.putExtra("mobile_input_purpose", 5);
      this.iPx.startActivity(localIntent2);
      return;
    case 1:
    }
    Intent localIntent1 = new Intent(this.iPx, LoginUI.class);
    this.iPx.startActivity(localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bu
 * JD-Core Version:    0.6.2
 */