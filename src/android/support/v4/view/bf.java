package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class bf extends be
{
  public final void a(View paramView, a parama)
  {
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)parama.du);
  }

  public final boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bf
 * JD-Core Version:    0.6.2
 */