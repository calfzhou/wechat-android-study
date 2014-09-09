package com.tencent.mm.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;

final class cr
  implements Runnable
{
  cr(cg paramcg)
  {
  }

  public final void run()
  {
    cg.c(this.iMo).getWindow().setFlags(1024, 1024);
    if (cg.h(this.iMo) != null)
      cg.h(this.iMo).hide();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.cr
 * JD-Core Version:    0.6.2
 */