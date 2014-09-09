package com.tencent.mm.plugin.exdevice.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.c.a.ea;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;

final class y
  implements DialogInterface.OnCancelListener
{
  y(x paramx, u paramu)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.eJf);
    if (x.a(this.eJg).idI != null)
    {
      x.a(this.eJg).cJR.ret = 1;
      x.a(this.eJg).idI.run();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.y
 * JD-Core Version:    0.6.2
 */