package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class jk
  implements View.OnClickListener
{
  jk(hd paramhd)
  {
  }

  public final void onClick(View paramView)
  {
    String str = hd.p(this.jtA);
    if ((str == null) || (str.equals("")))
      return;
    Intent localIntent = new Intent();
    localIntent.setClass(this.jtA.agh(), ContactInfoUI.class);
    localIntent.putExtra("Contact_User", str);
    localIntent.putExtra("Contact_Encryptusername", true);
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = hd.p(this.jtA);
    arrayOfObject[1] = Integer.valueOf(2);
    localn.d(11004, arrayOfObject);
    this.jtA.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jk
 * JD-Core Version:    0.6.2
 */