package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import com.tencent.mm.c.a.hh;
import com.tencent.mm.c.a.hj;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.chatting.ChattingUI;

final class h
  implements com.tencent.mm.ui.base.y
{
  h(ContactSocialInfoUI paramContactSocialInfoUI)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
      hh localhh;
      do
      {
        return;
        localhh = new hh();
        localhh.cLX.cDf = 0;
        localhh.cLX.cLZ = (ContactSocialInfoUI.d(this.jDe) + "@qqim");
        localhh.cLX.cGZ = ContactSocialInfoUI.e(this.jDe);
        a.aGB().g(localhh);
      }
      while (!localhh.cLY.cCM);
      Intent localIntent = new Intent(this.jDe, ChattingUI.class);
      localIntent.putExtra("Chat_User", ContactSocialInfoUI.d(this.jDe) + "@qqim");
      this.jDe.startActivity(localIntent);
      return;
    case 1:
    }
    new com.tencent.mm.ui.applet.y(this.jDe).qw(ContactSocialInfoUI.d(this.jDe));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.h
 * JD-Core Version:    0.6.2
 */