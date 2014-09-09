package com.tencent.mm.plugin.base.stub;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.ac;

final class g
  implements DialogInterface.OnClickListener
{
  g(e parame)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ac localac = com.tencent.mm.pluginsdk.g.axX();
    if (localac != null)
      localac.o(e.a(this.ehG), x.pJ(), e.b(this.ehG));
    e.c(this.ehG).aq(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.g
 * JD-Core Version:    0.6.2
 */