package com.tencent.mm.ui.base;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.view.View.OnClickListener;

final class ac
  implements View.OnClickListener
{
  ac(aa paramaa, DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(View paramView)
  {
    if (this.iYf != null)
      this.iYf.onClick(this.iYe, 0);
    this.iYe.cancel();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ac
 * JD-Core Version:    0.6.2
 */