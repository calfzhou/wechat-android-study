package com.tencent.mm.ui.friend;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ao;
import com.tencent.mm.o.ac;

final class cl
  implements DialogInterface.OnCancelListener
{
  cl(ck paramck, ao paramao)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    bg.qX().c(this.jJm);
    ck.a(this.jJn).fN(false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.friend.cl
 * JD-Core Version:    0.6.2
 */