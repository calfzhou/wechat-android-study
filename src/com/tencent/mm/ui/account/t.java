package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class t
  implements MenuItem.OnMenuItemClickListener
{
  t(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = this.iOi.getIntent();
    localIntent.putExtra("bind_facebook_succ", FacebookAuthUI.b(this.iOi));
    this.iOi.setResult(-1, localIntent);
    this.iOi.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.t
 * JD-Core Version:    0.6.2
 */