package com.tencent.mm.ui.pluginapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;

final class c
  implements View.OnTouchListener
{
  c(AddFriendSearchPreference paramAddFriendSearchPreference)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 1)
      AddFriendSearchPreference.c(this.jKA).onClick(paramView);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.c
 * JD-Core Version:    0.6.2
 */