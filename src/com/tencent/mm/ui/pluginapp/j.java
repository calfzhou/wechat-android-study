package com.tencent.mm.ui.pluginapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class j
  implements View.OnTouchListener
{
  j(ContactSearchResultUI paramContactSearchResultUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (ContactSearchResultUI.b(this.jKG) != null)
      ContactSearchResultUI.b(this.jKG).onTouchEvent(paramMotionEvent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.j
 * JD-Core Version:    0.6.2
 */