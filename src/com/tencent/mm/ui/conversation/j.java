package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class j
  implements MenuItem.OnMenuItemClickListener
{
  j(BizConversationUI paramBizConversationUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent = new Intent(this.jFf, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", BizConversationUI.b(this.jFf));
    this.jFf.startActivity(localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.j
 * JD-Core Version:    0.6.2
 */