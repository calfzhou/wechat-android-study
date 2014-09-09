package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.o;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class bx extends a
{
  bx(ViewPager paramViewPager)
  {
  }

  private boolean ai()
  {
    return (ViewPager.b(this.fC) != null) && (ViewPager.b(this.fC).getCount() > 1);
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    parama.setClassName(ViewPager.class.getName());
    parama.setScrollable(ai());
    if (this.fC.canScrollHorizontally(1))
      parama.addAction(4096);
    if (this.fC.canScrollHorizontally(-1))
      parama.addAction(8192);
  }

  public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    o localo = o.ap();
    localo.setScrollable(ai());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.b(this.fC) != null))
    {
      localo.setItemCount(ViewPager.b(this.fC).getCount());
      localo.setFromIndex(ViewPager.c(this.fC));
      localo.setToIndex(ViewPager.c(this.fC));
    }
  }

  public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.performAccessibilityAction(paramView, paramInt, paramBundle))
      return true;
    switch (paramInt)
    {
    default:
      return false;
    case 4096:
      if (this.fC.canScrollHorizontally(1))
      {
        this.fC.k(1 + ViewPager.c(this.fC));
        return true;
      }
      return false;
    case 8192:
    }
    if (this.fC.canScrollHorizontally(-1))
    {
      this.fC.k(-1 + ViewPager.c(this.fC));
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.bx
 * JD-Core Version:    0.6.2
 */