package com.tencent.mm.ui;

import android.widget.TextView;

final class eb
  implements Runnable
{
  eb(MMTabView paramMMTabView, String paramString)
  {
  }

  public final void run()
  {
    MMTabView.a(this.iNb).setText(this.iNa);
    this.iNb.aQj();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.eb
 * JD-Core Version:    0.6.2
 */