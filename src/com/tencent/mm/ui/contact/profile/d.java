package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import com.tencent.mm.model.y;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.preference.o;

final class d
  implements Runnable
{
  d(ContactInfoUI paramContactInfoUI, cn paramcn)
  {
  }

  public final void run()
  {
    if ((ContactInfoUI.b(this.jCT) != null) && (this.hHX != null) && (!ap.jb(ContactInfoUI.b(this.jCT).getUsername())) && (ContactInfoUI.b(this.jCT).getUsername().equals(this.hHX.field_encryptUsername)) && (!y.dQ(ContactInfoUI.b(this.jCT).getUsername())))
    {
      ContactInfoUI.b(this.jCT).aT(this.hHX.field_conRemark);
      this.jCT.getIntent().putExtra("Contact_User", ContactInfoUI.b(this.jCT).getUsername());
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
 * Qualified Name:     com.tencent.mm.ui.contact.profile.d
 * JD-Core Version:    0.6.2
 */