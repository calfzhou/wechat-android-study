package android.support.v4.app;

import android.os.Build.VERSION;

public final class af
{
  private static final al cs = new am();

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      cs = new ap();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      cs = new ao();
      return;
    }
    if (Build.VERSION.SDK_INT >= 11)
    {
      cs = new an();
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.af
 * JD-Core Version:    0.6.2
 */