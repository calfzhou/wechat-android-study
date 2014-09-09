package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.pluginapp.AddMoreFriendsUI;

final class dz
  implements MenuItem.OnMenuItemClickListener
{
  dz(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent(this.jBX, AddMoreFriendsUI.class);
    this.jBX.startActivity(localIntent);
    n.fTF.q(10241, "1");
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dz
 * JD-Core Version:    0.6.2
 */