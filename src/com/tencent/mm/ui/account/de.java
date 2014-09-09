package com.tencent.mm.ui.account;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.ui.account.mobile.MobileInputUI;

final class de
  implements MenuItem.OnMenuItemClickListener
{
  de(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    b.jE("L200_100");
    Intent localIntent = new Intent(this.iPD, MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 1);
    localIntent.addFlags(67108864);
    this.iPD.startActivity(localIntent);
    this.iPD.finish();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.de
 * JD-Core Version:    0.6.2
 */