package com.tencent.mm.ui.bindmobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;

final class z
  implements DialogInterface.OnClickListener
{
  z(BindMContactIntroUI paramBindMContactIntroUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((BindMContactIntroUI.a(this.jka) == null) || (BindMContactIntroUI.a(this.jka).equals("")))
      return;
    s locals = new s(s.dCy);
    bg.qX().d(locals);
    BindMContactIntroUI localBindMContactIntroUI1 = this.jka;
    BindMContactIntroUI localBindMContactIntroUI2 = this.jka;
    this.jka.getString(n.buo);
    BindMContactIntroUI.a(localBindMContactIntroUI1, e.a(localBindMContactIntroUI2, this.jka.getString(n.cfP), true, new aa(this)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.z
 * JD-Core Version:    0.6.2
 */