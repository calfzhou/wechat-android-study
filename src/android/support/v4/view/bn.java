package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class bn
{
  static final bq ey = new br();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      ey = new bp();
      return;
    }
    if (i >= 11)
    {
      ey = new bo();
      return;
    }
  }

  public static void a(ViewGroup paramViewGroup)
  {
    ey.a(paramViewGroup, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bn
 * JD-Core Version:    0.6.2
 */