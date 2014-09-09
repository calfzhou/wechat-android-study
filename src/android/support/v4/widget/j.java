package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

public final class j
{
  private static final m gG = new k();
  private Object gF;

  static
  {
    if (Build.VERSION.SDK_INT >= 14)
    {
      gG = new l();
      return;
    }
  }

  public j(Context paramContext)
  {
    this.gF = gG.c(paramContext);
  }

  public final boolean ax()
  {
    return gG.z(this.gF);
  }

  public final boolean b(float paramFloat)
  {
    return gG.a(this.gF, paramFloat);
  }

  public final boolean draw(Canvas paramCanvas)
  {
    return gG.a(this.gF, paramCanvas);
  }

  public final void finish()
  {
    gG.y(this.gF);
  }

  public final boolean isFinished()
  {
    return gG.x(this.gF);
  }

  public final void setSize(int paramInt1, int paramInt2)
  {
    gG.a(this.gF, paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.j
 * JD-Core Version:    0.6.2
 */