package com.tencent.mm.ui.base;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.FloatMath;
import android.view.MotionEvent;

public final class c
{
  public static boolean Dx()
  {
    return Build.VERSION.SDK_INT >= 5;
  }

  public static void a(PointF paramPointF, Bitmap paramBitmap)
  {
    if ((paramPointF == null) || (paramBitmap == null))
      return;
    paramPointF.set(paramBitmap.getWidth() / 2.0F, paramBitmap.getHeight() / 2.0F);
  }

  public static void a(PointF paramPointF, MotionEvent paramMotionEvent)
  {
    if ((paramPointF == null) || (paramMotionEvent == null))
      return;
    float f1 = e(paramMotionEvent, 0) + e(paramMotionEvent, 1);
    float f2 = f(paramMotionEvent, 0) + f(paramMotionEvent, 1);
    paramPointF.set(f1 / 2.0F, f2 / 2.0F);
  }

  public static float e(MotionEvent paramMotionEvent, int paramInt)
  {
    if (h(paramMotionEvent))
    {
      new b();
      return paramMotionEvent.getX(paramInt);
    }
    return paramMotionEvent.getX();
  }

  public static float f(MotionEvent paramMotionEvent, int paramInt)
  {
    if (h(paramMotionEvent))
    {
      new b();
      return paramMotionEvent.getY(paramInt);
    }
    return paramMotionEvent.getY();
  }

  private static boolean h(MotionEvent paramMotionEvent)
  {
    boolean bool1 = Dx();
    boolean bool2 = false;
    if (bool1)
    {
      int i = paramMotionEvent.getPointerCount();
      bool2 = false;
      if (i >= 2)
        bool2 = true;
    }
    return bool2;
  }

  public static float i(MotionEvent paramMotionEvent)
  {
    float f1 = e(paramMotionEvent, 0) - e(paramMotionEvent, 1);
    float f2 = f(paramMotionEvent, 0) - f(paramMotionEvent, 1);
    return FloatMath.sqrt(f1 * f1 + f2 * f2);
  }

  public static int k(MotionEvent paramMotionEvent)
  {
    if (Dx())
    {
      new b();
      return paramMotionEvent.getPointerCount();
    }
    return 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.c
 * JD-Core Version:    0.6.2
 */