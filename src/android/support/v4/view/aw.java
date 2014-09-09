package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class aw
{
  static final az ev = new ax();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      ev = new ay();
      return;
    }
  }

  public static float a(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return ev.a(paramVelocityTracker, paramInt);
  }

  public static float b(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return ev.b(paramVelocityTracker, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.aw
 * JD-Core Version:    0.6.2
 */