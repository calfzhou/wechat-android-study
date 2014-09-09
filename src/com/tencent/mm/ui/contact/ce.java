package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ag.c;

final class ce
  implements View.OnClickListener
{
  ce(ContactRemarkInfoViewUI paramContactRemarkInfoViewUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (!ContactRemarkInfoViewUI.a(this.jzs))
      return;
    Intent localIntent = new Intent(this.jzs, ContactRemarkImagePreviewUI.class);
    localIntent.putExtra("Contact_User", ContactRemarkInfoViewUI.b(this.jzs));
    localIntent.putExtra("remark_image_path", c.yU().hk(ContactRemarkInfoViewUI.b(this.jzs)));
    localIntent.putExtra("view_only", true);
    this.jzs.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ce
 * JD-Core Version:    0.6.2
 */