package com.tencent.mm.ui.bindlinkedin;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.aa.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class k
  implements DialogInterface.OnClickListener
{
  k(j paramj)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b localb = new b();
    BindLinkedInUI.a(this.jjo.jjm, e.a(this.jjo.jjm, this.jjo.jjm.getString(n.aAy), false, new l(this, localb)));
    bg.qX().d(localb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindlinkedin.k
 * JD-Core Version:    0.6.2
 */