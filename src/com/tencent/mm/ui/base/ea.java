package com.tencent.mm.ui.base;

import android.view.View;
import android.widget.TextView;

final class ea
  implements Runnable
{
  ea(dx paramdx, View paramView)
  {
  }

  public final void run()
  {
    MMTagPanel.e(this.jcA.jcy).mA(((TextView)this.elp).getText().toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ea
 * JD-Core Version:    0.6.2
 */