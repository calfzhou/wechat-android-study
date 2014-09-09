package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.MotionEvent;

public final class aj
{
  static final am dI = new ak();

  static
  {
    if (Build.VERSION.SDK_INT >= 5)
    {
      dI = new al();
      return;
    }
  }

  public static int a(MotionEvent paramMotionEvent)
  {
    return 0xFF & paramMotionEvent.getAction();
  }

  public static int a(MotionEvent paramMotionEvent, int paramInt)
  {
    return dI.a(paramMotionEvent, paramInt);
  }

  public static int b(MotionEvent paramMotionEvent)
  {
    return (0xFF00 & paramMotionEvent.getAction()) >> 8;
  }

  public static int b(MotionEvent paramMotionEvent, int paramInt)
  {
    return dI.b(paramMotionEvent, paramInt);
  }

  public static float c(MotionEvent paramMotionEvent, int paramInt)
  {
    return dI.c(paramMotionEvent, paramInt);
  }

  public static int c(MotionEvent paramMotionEvent)
  {
    return dI.c(paramMotionEvent);
  }

  public static float d(MotionEvent paramMotionEvent, int paramInt)
  {
    return dI.d(paramMotionEvent, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aj
 * JD-Core Version:    0.6.2
 */