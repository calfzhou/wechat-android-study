package com.tencent.mm.ui.contact;

import android.content.Intent;

final class fz
  implements Runnable
{
  fz(fy paramfy)
  {
  }

  public final void run()
  {
    if (!this.jCz.jCy.getIntent().getBooleanExtra("stay_in_wechat", true))
      this.jCz.jCy.moveTaskToBack(true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fz
 * JD-Core Version:    0.6.2
 */