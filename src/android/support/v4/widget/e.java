package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.ba;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

final class e extends android.support.v4.view.a
{
  private final Rect gu = new Rect();

  e(DrawerLayout paramDrawerLayout)
  {
  }

  private boolean v(View paramView)
  {
    View localView = this.gv.aq();
    return (localView != null) && (localView != paramView);
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    android.support.v4.view.a.a locala = android.support.v4.view.a.a.a(parama);
    super.a(paramView, locala);
    parama.setSource(paramView);
    ViewParent localViewParent = ba.k(paramView);
    if ((localViewParent instanceof View))
      parama.setParent((View)localViewParent);
    Rect localRect = this.gu;
    locala.getBoundsInParent(localRect);
    parama.setBoundsInParent(localRect);
    locala.getBoundsInScreen(localRect);
    parama.setBoundsInScreen(localRect);
    parama.setVisibleToUser(locala.isVisibleToUser());
    parama.setPackageName(locala.getPackageName());
    parama.setClassName(locala.getClassName());
    parama.setContentDescription(locala.getContentDescription());
    parama.setEnabled(locala.isEnabled());
    parama.setClickable(locala.isClickable());
    parama.setFocusable(locala.isFocusable());
    parama.setFocused(locala.isFocused());
    parama.setAccessibilityFocused(locala.isAccessibilityFocused());
    parama.setSelected(locala.isSelected());
    parama.setLongClickable(locala.isLongClickable());
    parama.addAction(locala.getActions());
    locala.recycle();
    int i = this.gv.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = this.gv.getChildAt(j);
      if (!v(localView))
        parama.addChild(localView);
    }
  }

  public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!v(paramView))
      return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.e
 * JD-Core Version:    0.6.2
 */