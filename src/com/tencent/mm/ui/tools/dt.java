package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.z;

public final class dt
  implements GestureDetector.OnGestureListener
{
  private final Context context;
  private final GestureDetector jTf;
  private du jTg;
  private final int jTh;
  private final int jTi;
  private final float jTj;
  private final float jTm;

  public dt(Context paramContext)
  {
    this.context = paramContext;
    this.jTf = new GestureDetector(this.context, this);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(paramContext);
    this.jTh = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.jTi = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.jTj = e.a(paramContext, 70.0F);
    this.jTm = e.a(paramContext, 50.0F);
  }

  public final void a(du paramdu)
  {
    this.jTg = paramdu;
  }

  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (this.jTg == null)
      return true;
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = Float.valueOf(paramMotionEvent1.getX());
    arrayOfObject[1] = Float.valueOf(paramMotionEvent2.getX());
    arrayOfObject[2] = Float.valueOf(paramMotionEvent1.getY());
    arrayOfObject[3] = Float.valueOf(paramMotionEvent2.getY());
    arrayOfObject[4] = Float.valueOf(paramFloat1);
    arrayOfObject[5] = Float.valueOf(paramFloat2);
    z.v("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "lastX:%f, curX:%f, lastY:%f, curY:%f, vX:%f, vY:%f", arrayOfObject);
    float f1 = Math.abs(paramMotionEvent2.getY() - paramMotionEvent1.getY());
    float f2 = Math.abs(paramMotionEvent2.getX() - paramMotionEvent1.getX());
    if ((f1 < this.jTm) && (paramFloat1 > 800.0F) && (f2 > this.jTj))
    {
      this.jTg.aWn();
      return true;
    }
    if ((f1 < this.jTm) && (paramFloat1 < -800.0F) && (f2 < -this.jTj))
    {
      this.jTg.aWo();
      return true;
    }
    if ((f2 < this.jTm) && (paramFloat2 > 800.0F))
    {
      this.jTg.aWp();
      return true;
    }
    if ((f2 < this.jTm) && (paramFloat2 < -800.0F))
    {
      this.jTg.aWm();
      return true;
    }
    return false;
  }

  public final void onLongPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }

  public final void onShowPress(MotionEvent paramMotionEvent)
  {
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.jTg == null)
      return;
    this.jTf.onTouchEvent(paramMotionEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.dt
 * JD-Core Version:    0.6.2
 */