package com.tencent.mm.ui.friend;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.x.d;

final class cq
  implements DialogInterface.OnCancelListener
{
  cq(co paramco, d paramd)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jJq);
    co.a(this.jJp).fO(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cq
 * JD-Core Version:    0.6.2
 */