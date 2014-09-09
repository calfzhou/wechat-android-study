package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class u
{
  static final y dD = new v();

  static
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      dD = new x();
      return;
    }
  }

  public static boolean a(KeyEvent paramKeyEvent)
  {
    return dD.metaStateHasModifiers(paramKeyEvent.getMetaState(), 1);
  }

  public static boolean b(KeyEvent paramKeyEvent)
  {
    return dD.metaStateHasNoModifiers(paramKeyEvent.getMetaState());
  }

  public static void c(KeyEvent paramKeyEvent)
  {
    dD.c(paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.u
 * JD-Core Version:    0.6.2
 */