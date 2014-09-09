package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class bj
{
  static final bm ex = new bk();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      ex = new bl();
      return;
    }
  }

  public static int a(ViewConfiguration paramViewConfiguration)
  {
    return ex.a(paramViewConfiguration);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bj
 * JD-Core Version:    0.6.2
 */