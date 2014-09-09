package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import android.text.ClipboardManager;
import com.tencent.mm.ui.base.y;

final class l
  implements y
{
  l(k paramk)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return;
    case 0:
    }
    ((ClipboardManager)this.hHi.hHg.getContext().getSystemService("clipboard")).setText(this.hHi.hHh.djA);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.preference.l
 * JD-Core Version:    0.6.2
 */