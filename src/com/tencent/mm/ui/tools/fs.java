package com.tencent.mm.ui.tools;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.mm.i;

final class fs
  implements Runnable
{
  fs(fr paramfr, View paramView)
  {
  }

  public final void run()
  {
    ((InputMethodManager)this.jUF.jUE.getSystemService("input_method")).showSoftInput(this.dYk.findViewById(i.aqy), 0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fs
 * JD-Core Version:    0.6.2
 */