package android.support.v4.view;

import android.os.Build.VERSION;

public final class q
{
  static final r dC = new s();

  static
  {
    if (Build.VERSION.SDK_INT >= 17)
    {
      dC = new t();
      return;
    }
  }

  public static int getAbsoluteGravity(int paramInt1, int paramInt2)
  {
    return dC.getAbsoluteGravity(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.q
 * JD-Core Version:    0.6.2
 */