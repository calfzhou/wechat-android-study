package com.tencent.mm.ui.chatting;

import android.content.DialogInterface.OnDismissListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.ui.base.y;

final class om
  implements y
{
  om(ol paramol, String paramString)
  {
  }

  public final void onClick(int paramInt)
  {
    if (this.jwo.jwn != null)
      this.jwo.jwn.onDismiss(null);
    switch (paramInt)
    {
    default:
      return;
    case 0:
      if (oj.e(this.jwo.jwl))
      {
        oj.a(this.jwo.jwl, this.gfH);
        n.fTF.q(10113, "1");
        return;
      }
      oj.b(this.jwo.jwl, this.gfH);
      n.fTF.q(10114, "1");
      return;
    case 1:
    }
    oj.b(this.jwo.jwl, this.gfH);
    n.fTF.q(10114, "1");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.om
 * JD-Core Version:    0.6.2
 */