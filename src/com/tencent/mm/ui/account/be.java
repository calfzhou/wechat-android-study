package com.tencent.mm.ui.account;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;

final class be extends GestureDetector.SimpleOnGestureListener
{
  be(HorizontalListView paramHorizontalListView)
  {
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return this.iOM.aQy();
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return this.iOM.aa(paramFloat1);
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    synchronized (this.iOM)
    {
      HorizontalListView localHorizontalListView2 = this.iOM;
      localHorizontalListView2.iOD += (int)paramFloat1;
      this.iOM.requestLayout();
      return true;
    }
  }

  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    Rect localRect = new Rect();
    for (int i = 0; ; i++)
    {
      if (i < this.iOM.getChildCount())
      {
        View localView = this.iOM.getChildAt(i);
        int j = localView.getLeft();
        int k = localView.getRight();
        localRect.set(j, localView.getTop(), k, localView.getBottom());
        if (!localRect.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()))
          continue;
        if (HorizontalListView.c(this.iOM) != null)
          HorizontalListView.c(this.iOM).onItemClick(this.iOM, localView, i + (1 + HorizontalListView.d(this.iOM)), this.iOM.oU.getItemId(i + (1 + HorizontalListView.d(this.iOM))));
        if (HorizontalListView.e(this.iOM) != null)
          HorizontalListView.e(this.iOM).onItemSelected(this.iOM, localView, i + (1 + HorizontalListView.d(this.iOM)), this.iOM.oU.getItemId(i + (1 + HorizontalListView.d(this.iOM))));
      }
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.be
 * JD-Core Version:    0.6.2
 */