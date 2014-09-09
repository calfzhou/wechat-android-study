package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.aj;
import com.tencent.mm.storage.b;

final class aq
  implements aj
{
  aq(ap paramap)
  {
  }

  public final void La()
  {
  }

  public final void gg(int paramInt)
  {
  }

  public final void gh(int paramInt)
  {
    String str;
    if (ap.a(this.jDA).mD(paramInt))
    {
      str = ap.a(this.jDA).mF(paramInt);
      if (!com.tencent.mm.platformtools.ap.jb(str));
    }
    else
    {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClass(ap.b(this.jDA), ContactInfoUI.class);
    localIntent.putExtra("Contact_User", str);
    localIntent.putExtra("Contact_RoomNickname", ap.c(this.jDA).dh(str));
    ap.b(this.jDA).startActivity(localIntent);
  }

  public final void gi(int paramInt)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.aq
 * JD-Core Version:    0.6.2
 */