package com.tencent.mm.platformtools;

import android.os.Build.VERSION;
import android.util.FloatMath;
import android.view.MotionEvent;

public final class o
{
  public static boolean Dx()
  {
    return Build.VERSION.SDK_INT >= 5;
  }

  private static float e(MotionEvent paramMotionEvent, int paramInt)
  {
    if (h(paramMotionEvent))
    {
      new n();
      return paramMotionEvent.getX(paramInt);
    }
    return paramMotionEvent.getX();
  }

  private static float f(MotionEvent paramMotionEvent, int paramInt)
  {
    if (h(paramMotionEvent))
    {
      new n();
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
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.o
 * JD-Core Version:    0.6.2
 */