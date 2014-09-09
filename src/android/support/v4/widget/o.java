package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public final class o
{
  static final p gL = new q();
  Object gK;

  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      gL = new s();
      return;
    }
    if (i >= 9)
    {
      gL = new r();
      return;
    }
  }

  private o(Context paramContext, Interpolator paramInterpolator)
  {
    this.gK = gL.b(paramContext, paramInterpolator);
  }

  public static o a(Context paramContext, Interpolator paramInterpolator)
  {
    return new o(paramContext, paramInterpolator);
  }

  public final void abortAnimation()
  {
    gL.D(this.gK);
  }

  public final int getCurrX()
  {
    return gL.A(this.gK);
  }

  public final int getCurrY()
  {
    return gL.B(this.gK);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.o
 * JD-Core Version:    0.6.2
 */