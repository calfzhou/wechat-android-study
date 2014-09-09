package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.g;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeProvider;

final class e extends b
{
  public final g a(Object paramObject, View paramView)
  {
    AccessibilityNodeProvider localAccessibilityNodeProvider = ((View.AccessibilityDelegate)paramObject).getAccessibilityNodeProvider(paramView);
    if (localAccessibilityNodeProvider != null)
      return new g(localAccessibilityNodeProvider);
    return null;
  }

  public final Object a(a parama)
  {
    return new l(new f(this, parama));
  }

  public final boolean a(Object paramObject, View paramView, int paramInt, Bundle paramBundle)
  {
    return ((View.AccessibilityDelegate)paramObject).performAccessibilityAction(paramView, paramInt, paramBundle);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.e
 * JD-Core Version:    0.6.2
 */