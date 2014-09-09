package com.tencent.mm.ui.tools.gridviewheaders;

import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.mm.sdk.platformtools.cm;

final class l
  implements Runnable
{
  l(GridHeadersGridView paramGridHeadersGridView)
  {
  }

  public final void run()
  {
    if (this.jWg.hzM == 0)
    {
      this.jWg.hzM = 1;
      View localView = this.jWg.rs(this.jWg.jWe);
      if ((localView != null) && (!localView.hasFocusable()))
      {
        if (this.jWg.oy)
          break label157;
        localView.setPressed(true);
        this.jWg.setPressed(true);
        this.jWg.refreshDrawableState();
        int i = ViewConfiguration.getLongPressTimeout();
        if (!this.jWg.isLongClickable())
          break label148;
        if (this.jWg.jVM == null)
          this.jWg.jVM = new k(this.jWg, (byte)0);
        this.jWg.jVM.aAu();
        GridHeadersGridView.d(this.jWg).postDelayed(this.jWg.jVM, i);
      }
    }
    return;
    label148: this.jWg.hzM = 2;
    return;
    label157: this.jWg.hzM = 2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gridviewheaders.l
 * JD-Core Version:    0.6.2
 */