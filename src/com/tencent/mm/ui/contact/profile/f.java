package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.platformtools.ap;

final class f
  implements com.tencent.mm.ui.base.y
{
  f(ContactSocialInfoUI paramContactSocialInfoUI, String[] paramArrayOfString)
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
              while ((ContactSocialInfoUI.a(this.jDe) == null) || (ContactSocialInfoUI.a(this.jDe).length() == 0));
              j = 1 + ContactSocialInfoUI.a(this.jDe).lastIndexOf(' ');
            }
            while (j <= 0);
            ContactSocialInfoUI.a(this.jDe, ContactSocialInfoUI.a(this.jDe).substring(j));
            return;
          }
          while ((ContactSocialInfoUI.a(this.jDe) == null) || (ContactSocialInfoUI.a(this.jDe).length() == 0));
          int i = ContactSocialInfoUI.a(this.jDe).lastIndexOf(' ');
          str = ContactSocialInfoUI.a(this.jDe).substring(0, i);
        }
        while ((str == null) || (str.length() == 0));
        com.tencent.mm.model.y.b(ContactSocialInfoUI.b(this.jDe), str.trim());
        return;
      }
      while ((this.jzW == null) || (this.jzW.length <= 2) || (ContactSocialInfoUI.c(this.jDe) == null) || (ContactSocialInfoUI.b(this.jDe) == null));
      if ((ContactSocialInfoUI.c(this.jDe) != null) && (!ap.jb(ContactSocialInfoUI.c(this.jDe).vJ())))
      {
        ContactSocialInfoUI.a(this.jDe, ContactSocialInfoUI.b(this.jDe).getUsername(), ContactSocialInfoUI.c(this.jDe).vJ());
        return;
      }
      break;
    case 3:
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "http://dianhua.qq.com/cgi-bin/readtemplate?lang=en&t=w_phone_home&channel=100008");
    a.b(this.jDe, "webview", ".ui.tools.WebViewUI", localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.f
 * JD-Core Version:    0.6.2
 */