package com.tencent.mm.sdk.platformtools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class ci
  implements View.OnTouchListener
{
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 1:
    case 3:
    case 4:
    case 0:
    }
    while (true)
    {
      return false;
      paramView.post(new cj(this, paramView));
      continue;
      paramView.setPressed(true);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ci
 * JD-Core Version:    0.6.2
 */