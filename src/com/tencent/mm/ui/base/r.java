package com.tencent.mm.ui.base;

import android.content.Context;
import com.tencent.mm.ui.MMActivity;

final class r
  implements Runnable
{
  r(Context paramContext)
  {
  }

  public final void run()
  {
    ((MMActivity)this.dLL).aep();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.r
 * JD-Core Version:    0.6.2
 */