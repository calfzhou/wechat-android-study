package com.tencent.mm.ui.contact.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.c.a.ba;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;

final class v
  implements DialogInterface.OnCancelListener
{
  v(i parami, x paramx)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().b(536, this.jDl);
    ba localba = new ba();
    localba.cIe.cDf = 2;
    localba.cIe.cDg = this.dpb;
    a.aGB().g(localba);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.v
 * JD-Core Version:    0.6.2
 */