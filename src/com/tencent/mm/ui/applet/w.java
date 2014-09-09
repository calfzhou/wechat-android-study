package com.tencent.mm.ui.applet;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

final class w
  implements View.OnTouchListener
{
  int iVJ;
  int iVK;
  int iVL = -1 + (this.iVO.widthPixels - t.d(this.iWh).width);
  int iVM = -1 + (this.iVO.heightPixels - t.d(this.iWh).height);
  long iVN;

  w(t paramt, DisplayMetrics paramDisplayMetrics)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    label233: label369: 
    do
    {
      return false;
      this.iVJ = ((int)paramMotionEvent.getRawX() - t.d(this.iWh).x);
      this.iVK = ((int)paramMotionEvent.getRawY() - t.d(this.iWh).y);
      this.iVN = System.currentTimeMillis();
      return false;
      this.iVL = (-1 + (this.iVO.widthPixels - t.d(this.iWh).width));
      this.iVM = (-1 + (this.iVO.heightPixels - t.d(this.iWh).height));
      t.d(this.iWh).x = ((int)paramMotionEvent.getRawX() - this.iVJ);
      t.d(this.iWh).y = ((int)paramMotionEvent.getRawY() - this.iVK);
      WindowManager.LayoutParams localLayoutParams1 = t.d(this.iWh);
      int i;
      int j;
      int k;
      WindowManager.LayoutParams localLayoutParams4;
      if (t.d(this.iWh).x < 0)
      {
        i = 0;
        localLayoutParams1.x = i;
        WindowManager.LayoutParams localLayoutParams2 = t.d(this.iWh);
        if (t.d(this.iWh).x <= this.iVL)
          break label354;
        j = this.iVL;
        localLayoutParams2.x = j;
        WindowManager.LayoutParams localLayoutParams3 = t.d(this.iWh);
        if (t.d(this.iWh).y >= 0)
          break label369;
        k = 0;
        localLayoutParams3.y = k;
        localLayoutParams4 = t.d(this.iWh);
        if (t.d(this.iWh).y <= this.iVM)
          break label384;
      }
      for (int m = this.iVM; ; m = t.d(this.iWh).y)
      {
        localLayoutParams4.y = m;
        t.f(this.iWh).updateViewLayout(t.e(this.iWh), t.d(this.iWh));
        return false;
        i = t.d(this.iWh).x;
        break;
        j = t.d(this.iWh).x;
        break label233;
        k = t.d(this.iWh).y;
        break label265;
      }
    }
    while (System.currentTimeMillis() - this.iVN >= 300L);
    label265: label354: t.g(this.iWh);
    label384: return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.w
 * JD-Core Version:    0.6.2
 */