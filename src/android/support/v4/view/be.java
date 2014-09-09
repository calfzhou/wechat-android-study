package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

class be extends bd
{
  final long S()
  {
    return ValueAnimator.getFrameDelay();
  }

  public final void a(View paramView, int paramInt, Paint paramPaint)
  {
    paramView.setLayerType(paramInt, paramPaint);
  }

  public void a(View paramView, Paint paramPaint)
  {
    a(paramView, paramView.getLayerType(), paramPaint);
    paramView.invalidate();
  }

  public final int i(View paramView)
  {
    return paramView.getLayerType();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.be
 * JD-Core Version:    0.6.2
 */