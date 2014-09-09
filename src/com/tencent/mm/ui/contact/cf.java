package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.storage.i;

final class cf
  implements MenuItem.OnMenuItemClickListener
{
  cf(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(this.jzs.aPI(), ContactRemarkInfoModUI.class);
    localIntent.putExtra("Contact_Scene", ContactRemarkInfoViewUI.c(this.jzs));
    localIntent.putExtra("Contact_User", ContactRemarkInfoViewUI.d(this.jzs).getUsername());
    this.jzs.startActivity(localIntent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cf
 * JD-Core Version:    0.6.2
 */