package com.tencent.mm.ui.chatting;

import android.content.DialogInterface.OnDismissListener;
import com.tencent.mm.ui.base.y;

final class oo
  implements y
{
  oo(oj paramoj, DialogInterface.OnDismissListener paramOnDismissListener, String paramString)
  {
  }

  public final void onClick(int paramInt)
  {
    if (this.jwn != null)
      this.jwn.onDismiss(null);
    String str = this.jwm.replace(" ", "").replace("#", "@");
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    oj.d(this.jwl, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oo
 * JD-Core Version:    0.6.2
 */