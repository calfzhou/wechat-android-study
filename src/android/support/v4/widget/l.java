package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

final class l
  implements m
{
  public final void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
  }

  public final boolean a(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }

  public final boolean a(Object paramObject, Canvas paramCanvas)
  {
    return ((EdgeEffect)paramObject).draw(paramCanvas);
  }

  public final Object c(Context paramContext)
  {
    return new EdgeEffect(paramContext);
  }

  public final boolean x(Object paramObject)
  {
    return ((EdgeEffect)paramObject).isFinished();
  }

  public final void y(Object paramObject)
  {
    ((EdgeEffect)paramObject).finish();
  }

  public final boolean z(Object paramObject)
  {
    EdgeEffect localEdgeEffect = (EdgeEffect)paramObject;
    localEdgeEffect.onRelease();
    return localEdgeEffect.isFinished();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.l
 * JD-Core Version:    0.6.2
 */