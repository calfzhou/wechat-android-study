package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ac;
import com.tencent.mm.pluginsdk.g;

final class f
  implements DialogInterface.OnClickListener
{
  f(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ac localac = g.axX();
    if (localac != null)
      localac.o(e.a(this.ehG), x.pJ(), e.b(this.ehG));
    e.c(this.ehG).aq(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.f
 * JD-Core Version:    0.6.2
 */