package com.tencent.mm.ui;

import android.content.Intent;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.applet.ContactListExpandPreference;
import com.tencent.mm.pluginsdk.ui.applet.aj;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class eo
  implements aj
{
  eo(SingleChatInfoUI paramSingleChatInfoUI)
  {
  }

  public final void La()
  {
    if (SingleChatInfoUI.b(this.iNx) != null)
      SingleChatInfoUI.b(this.iNx).aAN();
  }

  public final void gg(int paramInt)
  {
  }

  public final void gh(int paramInt)
  {
    String str1 = SingleChatInfoUI.b(this.iNx).mF(paramInt);
    String str2 = ap.ja(SingleChatInfoUI.b(this.iNx).mH(paramInt));
    if (ap.jb(str2))
    {
      cn localcn = bg.qW().oU().Ab(str1);
      if ((localcn != null) && (!ap.jb(localcn.field_encryptUsername)))
        str2 = localcn.field_conRemark;
    }
    if (ap.jb(str1))
      return;
    Intent localIntent = new Intent();
    localIntent.setClass(this.iNx, ContactInfoUI.class);
    localIntent.putExtra("Contact_User", str1);
    localIntent.putExtra("Contact_RemarkName", str2);
    localIntent.putExtra("Contact_Nick", ap.ja(SingleChatInfoUI.b(this.iNx).mG(paramInt)));
    localIntent.putExtra("Contact_RoomMember", true);
    i locali = bg.qW().oT().ys(str1);
    if ((locali != null) && ((int)locali.dhv > 0) && (a.cv(locali.getType())))
      bb.c(localIntent, str1);
    localIntent.putExtra("Kdel_from", 0);
    this.iNx.startActivityForResult(localIntent, 0);
  }

  public final void gi(int paramInt)
  {
    SingleChatInfoUI.c(this.iNx);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.eo
 * JD-Core Version:    0.6.2
 */