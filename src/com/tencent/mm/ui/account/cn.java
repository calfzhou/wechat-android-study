package com.tencent.mm.ui.account;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.z.b;

final class cn
  implements MenuItem.OnMenuItemClickListener
{
  cn(LoginHistoryUI paramLoginHistoryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (b.yn())
    {
      String[] arrayOfString2 = new String[3];
      arrayOfString2[0] = this.iPx.getResources().getString(n.bQf);
      arrayOfString2[1] = this.iPx.getResources().getString(n.bQh);
      arrayOfString2[2] = this.iPx.getResources().getString(n.bQe);
      e.b(this.iPx, null, arrayOfString2, null, LoginHistoryUI.f(this.iPx));
      return true;
    }
    String[] arrayOfString1 = new String[2];
    arrayOfString1[0] = this.iPx.getResources().getString(n.bQf);
    arrayOfString1[1] = this.iPx.getResources().getString(n.bQh);
    e.b(this.iPx, null, arrayOfString1, null, LoginHistoryUI.f(this.iPx));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.cn
 * JD-Core Version:    0.6.2
 */