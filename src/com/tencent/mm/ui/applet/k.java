package com.tencent.mm.ui.applet;

import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import com.tencent.mm.at.a;

final class k
  implements View.OnTouchListener
{
  int iVJ;
  int iVK;
  int iVL = -1 + (this.iVO.widthPixels - i.a(this.iVI).width);
  int iVM = -1 + (this.iVO.heightPixels - i.a(this.iVI).height);
  long iVN;

  k(i parami, DisplayMetrics paramDisplayMetrics)
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
    label235: label371: 
    do
    {
      return false;
      this.iVJ = ((int)paramMotionEvent.getRawX() - i.a(this.iVI).x);
      this.iVK = ((int)paramMotionEvent.getRawY() - i.a(this.iVI).y);
      this.iVN = System.currentTimeMillis();
      return false;
      this.iVL = (-1 + (this.iVO.widthPixels - i.a(this.iVI).width));
      this.iVM = (-1 + (this.iVO.heightPixels - i.a(this.iVI).height));
      i.a(this.iVI).x = ((int)paramMotionEvent.getRawX() - this.iVJ);
      i.a(this.iVI).y = ((int)paramMotionEvent.getRawY() - this.iVK);
      WindowManager.LayoutParams localLayoutParams1 = i.a(this.iVI);
      int i;
      int j;
      int k;
      WindowManager.LayoutParams localLayoutParams4;
      if (i.a(this.iVI).x < 0)
      {
        i = 0;
        localLayoutParams1.x = i;
        WindowManager.LayoutParams localLayoutParams2 = i.a(this.iVI);
        if (i.a(this.iVI).x <= this.iVL)
          break label356;
        j = this.iVL;
        localLayoutParams2.x = j;
        WindowManager.LayoutParams localLayoutParams3 = i.a(this.iVI);
        if (i.a(this.iVI).y >= 0)
          break label371;
        k = 0;
        localLayoutParams3.y = k;
        localLayoutParams4 = i.a(this.iVI);
        if (i.a(this.iVI).y <= this.iVM)
          break label386;
      }
      for (int m = this.iVM; ; m = i.a(this.iVI).y)
      {
        localLayoutParams4.y = m;
        i.c(this.iVI).updateViewLayout(i.b(this.iVI), i.a(this.iVI));
        return false;
        i = i.a(this.iVI).x;
        break;
        j = i.a(this.iVI).x;
        break label235;
        k = i.a(this.iVI).y;
        break label267;
      }
    }
    while (System.currentTimeMillis() - this.iVN >= 300L);
    label267: label356: a.aNX();
    label386: a.v(false, true);
    this.iVI.hP();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.k
 * JD-Core Version:    0.6.2
 */