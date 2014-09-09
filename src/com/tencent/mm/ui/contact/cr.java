package com.tencent.mm.ui.contact;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.c;
import com.tencent.mm.modelfriend.i;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.chatting.oj;
import java.util.List;

final class cr
  implements View.OnClickListener
{
  cr(FriendPreference paramFriendPreference, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    if ((FriendPreference.a(this.jzV) != null) && (!ap.jb(FriendPreference.a(this.jzV).vJ())));
    for (String[] arrayOfString = FriendPreference.b(this.jzV).getResources().getStringArray(c.Nt); ; arrayOfString = FriendPreference.b(this.jzV).getResources().getStringArray(c.Nu))
    {
      if (oj.aWB())
      {
        List localList = ap.b(arrayOfString);
        localList.add(FriendPreference.b(this.jzV).getResources().getString(n.bzT));
        arrayOfString = (String[])localList.toArray(new String[localList.size()]);
      }
      e.b(FriendPreference.b(this.jzV), null, arrayOfString, null, new cs(this, arrayOfString));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cr
 * JD-Core Version:    0.6.2
 */