package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

class bg extends bf
{
  public final void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public final void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }

  public final void b(View paramView, int paramInt)
  {
    paramView.setImportantForAccessibility(1);
  }

  public final void f(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }

  public final int g(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }

  public final ViewParent k(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bg
 * JD-Core Version:    0.6.2
 */