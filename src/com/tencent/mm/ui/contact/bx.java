package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ag.c;
import com.tencent.mm.platformtools.ap;

final class bx
  implements View.OnClickListener
{
  bx(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (!ContactRemarkInfoModUI.j(this.jzm))
      return;
    ContactRemarkInfoModUI.g(this.jzm);
    Intent localIntent = new Intent(this.jzm, ContactRemarkImagePreviewUI.class);
    localIntent.putExtra("Contact_User", ContactRemarkInfoModUI.k(this.jzm));
    if ((!ap.jb(ContactRemarkInfoModUI.l(this.jzm))) && (!ContactRemarkInfoModUI.m(this.jzm)));
    for (String str = c.yU().hk(ContactRemarkInfoModUI.k(this.jzm)); ; str = ContactRemarkInfoModUI.n(this.jzm))
    {
      localIntent.putExtra("remark_image_path", str);
      localIntent.putExtra("view_temp_remark_image", ContactRemarkInfoModUI.m(this.jzm));
      this.jzm.startActivityForResult(localIntent, 400);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bx
 * JD-Core Version:    0.6.2
 */