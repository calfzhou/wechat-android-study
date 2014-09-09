package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.o;

final class c
  implements Runnable
{
  c(ContactInfoUI paramContactInfoUI, String paramString)
  {
  }

  public final void run()
  {
    z.d("!32@/B4Tb64lLpLSOpQlr7qYXUQIXraHz9cn", "onNotifyChange verify = " + ContactInfoUI.c(this.jCT) + ", contact = " + ContactInfoUI.b(this.jCT));
    if ((ContactInfoUI.b(this.jCT) != null) && (!ap.jb(ContactInfoUI.b(this.jCT).getUsername())) && (!y.dQ(ContactInfoUI.b(this.jCT).getUsername())) && (ContactInfoUI.b(this.jCT).getUsername().equals(this.iIl)))
    {
      if (ContactInfoUI.d(this.jCT) != null)
      {
        ContactInfoUI.d(this.jCT).ID();
        ContactInfoUI.e(this.jCT).removeAll();
      }
      this.jCT.DP();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.c
 * JD-Core Version:    0.6.2
 */