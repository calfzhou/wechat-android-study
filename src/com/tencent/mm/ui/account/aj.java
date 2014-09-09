package com.tencent.mm.ui.account;

import android.widget.TextView;
import com.tencent.mm.model.x;
import com.tencent.mm.ui.cc;

final class aj
  implements cc
{
  aj(FacebookFriendUI paramFacebookFriendUI, TextView paramTextView)
  {
  }

  public final void DT()
  {
    if ((x.qc()) && (FacebookFriendUI.a(this.iOo)))
    {
      if (FacebookFriendUI.b(this.iOo).getCount() != 0)
        break label46;
      this.dWX.setVisibility(0);
    }
    while (true)
    {
      FacebookFriendUI.c(this.iOo);
      return;
      label46: this.dWX.setVisibility(8);
    }
  }

  public final void DU()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.aj
 * JD-Core Version:    0.6.2
 */