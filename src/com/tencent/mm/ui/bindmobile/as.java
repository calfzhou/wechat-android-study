package com.tencent.mm.ui.bindmobile;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.tencent.mm.sdk.platformtools.z;

final class as
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  as(FindMContactAlertUI paramFindMContactAlertUI, View paramView)
  {
  }

  public final void onGlobalLayout()
  {
    this.jkF.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    int i = this.jkF.getMeasuredHeight();
    int j = this.jkF.getMeasuredWidth();
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(j);
    arrayOfObject[1] = Integer.valueOf(i);
    z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", "bg width: %s height: %s", arrayOfObject);
    FindMContactAlertUI.b(this.jkD, j, i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.as
 * JD-Core Version:    0.6.2
 */