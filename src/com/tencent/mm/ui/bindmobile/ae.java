package com.tencent.mm.ui.bindmobile;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.base.e;

final class ae
  implements MenuItem.OnMenuItemClickListener
{
  ae(BindMContactUI paramBindMContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    BindMContactUI.a(this.jkl, BindMContactUI.d(this.jkl).getText().toString().trim() + ch.xC(BindMContactUI.b(this.jkl).getText().toString()));
    if ((!a.uI(BindMContactUI.e(this.jkl))) || (ch.xC(BindMContactUI.b(this.jkl).getText().toString()).length() <= 0))
    {
      e.b(this.jkl, n.bwy, n.buo);
      return true;
    }
    BindMContactUI.b(this.jkl, BindMContactUI.e(this.jkl));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ae
 * JD-Core Version:    0.6.2
 */