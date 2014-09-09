package com.tencent.mm.ui.bindmobile;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

final class ar
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  ar(FindMContactAlertUI paramFindMContactAlertUI, aa paramaa)
  {
  }

  public final void onGlobalLayout()
  {
    this.jkE.getWindow().getDecorView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
    int i = this.jkE.getWindow().getDecorView().getMeasuredWidth();
    int j = this.jkE.getWindow().getDecorView().getMeasuredHeight();
    View localView = FindMContactAlertUI.a(this.jkD, (ViewGroup)this.jkE.getWindow().getDecorView());
    if (localView != null);
    for (int k = 2 * localView.getMeasuredWidth(); ; k = i)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(k);
      arrayOfObject[1] = Integer.valueOf(j);
      z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", "dialog width: %s height: %s", arrayOfObject);
      FindMContactAlertUI.a(this.jkD, k, j);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ar
 * JD-Core Version:    0.6.2
 */