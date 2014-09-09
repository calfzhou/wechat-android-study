package com.tencent.mm.ui.contact.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.i;

final class dw
  implements DialogInterface.OnClickListener
{
  dw(dv paramdv)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    y.c(NormalUserFooterPreference.a(this.jEK.jEJ.jEw));
    NormalUserFooterPreference.a(this.jEK.jEJ.jEw).oB();
    bg.qX().d(new k(5));
    this.jEK.jEJ.aXT();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dw
 * JD-Core Version:    0.6.2
 */