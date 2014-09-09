package com.tencent.mm.ui.contact;

import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.platformtools.ap;

final class cs
  implements com.tencent.mm.ui.base.y
{
  cs(cr paramcr, String[] paramArrayOfString)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 2:
      do
      {
        String str;
        do
        {
          do
          {
            int j;
            do
            {
              do
                return;
              while ((this.jzX.jzU == null) || (this.jzX.jzU.length() == 0));
              j = 1 + this.jzX.jzU.lastIndexOf(' ');
            }
            while (j <= 0);
            FriendPreference.a(this.jzX.jzV, this.jzX.jzU.substring(j));
            return;
          }
          while ((this.jzX.jzU == null) || (this.jzX.jzU.length() == 0));
          int i = this.jzX.jzU.lastIndexOf(' ');
          str = this.jzX.jzU.substring(0, i);
        }
        while ((str == null) || (str.length() == 0));
        com.tencent.mm.model.y.b(FriendPreference.c(this.jzX.jzV), str.trim());
        return;
      }
      while ((this.jzW == null) || (this.jzW.length <= 2) || (FriendPreference.a(this.jzX.jzV) == null) || (FriendPreference.c(this.jzX.jzV) == null));
      if ((FriendPreference.a(this.jzX.jzV) != null) && (!ap.jb(FriendPreference.a(this.jzX.jzV).vJ())))
      {
        FriendPreference.a(this.jzX.jzV, FriendPreference.c(this.jzX.jzV).getUsername(), FriendPreference.a(this.jzX.jzV).vJ());
        return;
      }
      break;
    case 3:
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "http://dianhua.qq.com/cgi-bin/readtemplate?lang=en&t=w_phone_home&channel=100008");
    a.b(FriendPreference.b(this.jzX.jzV), "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cs
 * JD-Core Version:    0.6.2
 */