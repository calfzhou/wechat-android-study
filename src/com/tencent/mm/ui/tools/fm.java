package com.tencent.mm.ui.tools;

import android.os.IBinder;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.mm.i;

final class fm
  implements Runnable
{
  fm(fj paramfj, FragmentActivity paramFragmentActivity)
  {
  }

  public final void run()
  {
    if (fj.f(this.jUD) == null)
    {
      com.tencent.mm.sdk.platformtools.z.w(fj.c(this.jUD), "want to collapse search view, but search menu item is null");
      return;
    }
    if ((this.jUE != null) && (!this.jUE.isFinishing()))
    {
      FragmentActivity localFragmentActivity = this.jUE;
      InputMethodManager localInputMethodManager = (InputMethodManager)localFragmentActivity.getSystemService("input_method");
      if (localInputMethodManager != null)
      {
        View localView2 = localFragmentActivity.getCurrentFocus();
        if (localView2 != null)
        {
          IBinder localIBinder = localView2.getWindowToken();
          if (localIBinder != null)
            localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
        }
      }
    }
    View localView1 = android.support.v4.view.z.c(fj.f(this.jUD));
    if (localView1 != null)
      localView1.findViewById(i.aqy).clearFocus();
    fj.j(this.jUD);
    this.jUD.jUy = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fm
 * JD-Core Version:    0.6.2
 */