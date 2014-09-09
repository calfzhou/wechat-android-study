package com.tencent.mm.ui.base;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

final class bt extends GestureDetector.SimpleOnGestureListener
{
  bt(MMHorList paramMMHorList)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return this.jar.aQy();
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return this.jar.aa(paramFloat1);
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    MMHorList.a(this.jar, (int)paramFloat1);
    this.jar.requestLayout();
    return true;
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    Rect localRect = new Rect();
    for (int i = 0; ; i++)
    {
      if (i < this.jar.getChildCount())
      {
        View localView = this.jar.getChildAt(i);
        int j = localView.getLeft();
        int k = localView.getRight();
        localRect.set(j, localView.getTop(), k, localView.getBottom());
        if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          continue;
        if (MMHorList.c(this.jar) != null)
          MMHorList.c(this.jar).onItemClick(this.jar, localView, i + (1 + MMHorList.d(this.jar)), MMHorList.e(this.jar).getItemId(i + (1 + MMHorList.d(this.jar))));
        if (MMHorList.f(this.jar) != null)
          MMHorList.f(this.jar).onItemSelected(this.jar, localView, i + (1 + MMHorList.d(this.jar)), MMHorList.e(this.jar).getItemId(i + (1 + MMHorList.d(this.jar))));
      }
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bt
 * JD-Core Version:    0.6.2
 */