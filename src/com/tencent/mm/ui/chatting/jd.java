package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.model.y;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.SingleChatInfoUI;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class jd
  implements MenuItem.OnMenuItemClickListener
{
  jd(hd paramhd)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    Intent localIntent1 = new Intent();
    this.jtA.XF();
    if (this.jtA.iWI)
    {
      localIntent1.putExtra("Chat_User", this.jtA.jnf.getUsername());
      localIntent1.putExtra("RoomInfo_Id", this.jtA.aUL());
      localIntent1.putExtra("Is_Chatroom", this.jtA.jom);
      localIntent1.putExtra("Is_Lbsroom", this.jtA.jon);
      a.b(this.jtA.agh(), "chatroom", ".ui.ChatroomInfoUI", localIntent1);
    }
    while (true)
    {
      return true;
      if ((y.dN(this.jtA.aUL())) || (i.xY(this.jtA.aUL())) || (i.ya(this.jtA.aUL())) || (y.dK(this.jtA.aUL())) || (i.yc(this.jtA.aUL())) || (this.jtA.jnf.aIg()))
      {
        Intent localIntent2 = new Intent(this.jtA.agh(), ContactInfoUI.class);
        bb.b(localIntent2, this.jtA.aUL());
        this.jtA.startActivityForResult(localIntent2, 213);
      }
      else
      {
        localIntent1.setClass(this.jtA.agh(), SingleChatInfoUI.class);
        localIntent1.putExtra("Single_Chat_Talker", this.jtA.aUL());
        this.jtA.startActivity(localIntent1);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jd
 * JD-Core Version:    0.6.2
 */