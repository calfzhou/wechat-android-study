package com.tencent.mm.ui.bindqq;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.p.a;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

final class l
  implements DialogInterface.OnClickListener
{
  l(g paramg)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    a locala = new a(x.pF(), g.a(this.jkX), g.b(this.jkX).aRh(), g.b(this.jkX).aRi(), g.b(this.jkX).aRj(), 3);
    bg.qX().d(locala);
    g localg = this.jkX;
    Context localContext = g.c(this.jkX);
    g.c(this.jkX).getString(n.buo);
    g.a(localg, e.a(localContext, g.c(this.jkX).getString(n.bQn), true, new m(this, locala)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.l
 * JD-Core Version:    0.6.2
 */