package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.view.MenuItem;
import android.view.View;

public final class z
{
  static final ae dE = new aa();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      dE = new ac();
      return;
    }
    if (i >= 11)
    {
      dE = new ab();
      return;
    }
  }

  public static MenuItem a(MenuItem paramMenuItem, af paramaf)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).a(paramaf);
    return dE.a(paramMenuItem, paramaf);
  }

  public static MenuItem a(MenuItem paramMenuItem, n paramn)
  {
    if ((paramMenuItem instanceof b))
      paramMenuItem = ((b)paramMenuItem).a(paramn);
    return paramMenuItem;
  }

  public static MenuItem a(MenuItem paramMenuItem, View paramView)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramView);
    return dE.a(paramMenuItem, paramView);
  }

  public static void a(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
    {
      ((b)paramMenuItem).setShowAsAction(paramInt);
      return;
    }
    dE.a(paramMenuItem, paramInt);
  }

  public static MenuItem b(MenuItem paramMenuItem, int paramInt)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).setActionView(paramInt);
    return dE.b(paramMenuItem, paramInt);
  }

  public static View c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).getActionView();
    return dE.c(paramMenuItem);
  }

  public static boolean d(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).expandActionView();
    return dE.d(paramMenuItem);
  }

  public static boolean e(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof b))
      return ((b)paramMenuItem).collapseActionView();
    return dE.e(paramMenuItem);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.z
 * JD-Core Version:    0.6.2
 */