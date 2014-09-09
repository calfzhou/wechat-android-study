package com.tencent.mm.ui.contact.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.q.a;

final class j
  implements DialogInterface.OnClickListener
{
  j(i parami, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.jDk.field_hadAlert = 1;
    this.jDk.field_brandFlag = (0x4 | this.jDk.field_brandFlag);
    i.a(this.jDl, this.jDk, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.j
 * JD-Core Version:    0.6.2
 */