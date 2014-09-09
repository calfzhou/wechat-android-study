package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.storage.i;

final class kl
  implements View.OnClickListener
{
  kl(hd paramhd, String paramString, View.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("RoomInfo_Id", this.jtA.aUL());
    localIntent.putExtra("Chat_User", this.jtA.jnf.getUsername());
    localIntent.putExtra("Is_Chatroom", this.jtA.iWI);
    localIntent.putExtra("need_matte_high_light_item", this.dPp);
    a.b(this.jtA.agh(), "chatroom", ".ui.ChatroomInfoUI", localIntent);
    if (this.fWM != null)
      this.fWM.onClick(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kl
 * JD-Core Version:    0.6.2
 */