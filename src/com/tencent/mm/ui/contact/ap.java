package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

final class ap
  implements MenuItem.OnMenuItemClickListener
{
  ap(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent(this.jyq, SelectContactUI.class);
    localIntent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
    localIntent.putExtra("List_Type", 0);
    localIntent.putExtra("show_facing_chat", true);
    this.jyq.aPI().startActivity(localIntent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ap
 * JD-Core Version:    0.6.2
 */