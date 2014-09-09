package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.widget.LinearLayout;

final class t
  implements Runnable
{
  t(s params, int paramInt)
  {
  }

  public final void run()
  {
    ((Dialog)this.iXN.iXK.getTag()).dismiss();
    if (this.iXN.iXL != null)
      this.iXN.iXL.lz(this.iXM);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.t
 * JD-Core Version:    0.6.2
 */