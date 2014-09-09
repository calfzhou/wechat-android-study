package com.tencent.mm.ui.base;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.ch;

final class dw
  implements View.OnTouchListener
{
  dw(MMTagPanel paramMMTagPanel, eg parameg)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (MMTagPanel.g(this.jcy))
    {
      String str = this.jcy.aSD();
      if (!ch.jb(str))
      {
        if ((this.jcz != null) && (str.length() > this.jcz.aSQ()))
          str = str.substring(0, this.jcz.aSQ());
        this.jcy.P(str, true);
        if (MMTagPanel.e(this.jcy) != null)
          MMTagPanel.e(this.jcy).mE(str);
        this.jcy.aSE();
      }
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dw
 * JD-Core Version:    0.6.2
 */