package com.tencent.mm.ui.account;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.c.a.e;

final class ju
  implements View.OnClickListener
{
  ju(ShowNonWeixinFriendUI paramShowNonWeixinFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    e locale = new e("290293790992170");
    Bundle localBundle = new Bundle();
    localBundle.putString("message", this.iSI.getString(n.bGQ));
    localBundle.putString("to", Long.toString(ShowNonWeixinFriendUI.a(this.iSI)));
    locale.a(this.iSI, "apprequests", localBundle, new jv(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.ju
 * JD-Core Version:    0.6.2
 */