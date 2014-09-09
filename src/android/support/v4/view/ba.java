package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class ba
{
  static final bi ew = new bb();

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      ew = new bh();
      return;
    }
    if (i >= 16)
    {
      ew = new bg();
      return;
    }
    if (i >= 14)
    {
      ew = new bf();
      return;
    }
    if (i >= 11)
    {
      ew = new be();
      return;
    }
    if (i >= 9)
    {
      ew = new bd();
      return;
    }
  }

  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ew.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    ew.a(paramView, paramInt, paramPaint);
  }

  public static void a(View paramView, Paint paramPaint)
  {
    ew.a(paramView, paramPaint);
  }

  public static void a(View paramView, a parama)
  {
    ew.a(paramView, parama);
  }

  public static void a(View paramView, Runnable paramRunnable)
  {
    ew.a(paramView, paramRunnable);
  }

  public static boolean a(View paramView, int paramInt)
  {
    return ew.a(paramView, paramInt);
  }

  public static int e(View paramView)
  {
    return ew.e(paramView);
  }

  public static void f(View paramView)
  {
    ew.f(paramView);
  }

  public static int g(View paramView)
  {
    return ew.g(paramView);
  }

  public static void h(View paramView)
  {
    ew.b(paramView, 1);
  }

  public static int i(View paramView)
  {
    return ew.i(paramView);
  }

  public static int j(View paramView)
  {
    return ew.j(paramView);
  }

  public static ViewParent k(View paramView)
  {
    return ew.k(paramView);
  }

  public static boolean l(View paramView)
  {
    return ew.l(paramView);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.ba
 * JD-Core Version:    0.6.2
 */