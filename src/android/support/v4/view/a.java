package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a
{
  private static final d ds;
  private static final Object dt;
  final Object du = ds.a(this);

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
      ds = new e();
    while (true)
    {
      dt = ds.O();
      return;
      if (Build.VERSION.SDK_INT >= 14)
        ds = new b();
      else
        ds = new g();
    }
  }

  public static android.support.v4.view.a.g c(View paramView)
  {
    return ds.a(dt, paramView);
  }

  public static boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ds.a(dt, paramView, paramAccessibilityEvent);
  }

  public static void sendAccessibilityEvent(View paramView, int paramInt)
  {
    ds.a(dt, paramView, paramInt);
  }

  public static void sendAccessibilityEventUnchecked(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ds.d(dt, paramView, paramAccessibilityEvent);
  }

  public void a(View paramView, android.support.v4.view.a.a parama)
  {
    ds.a(dt, paramView, parama);
  }

  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ds.b(dt, paramView, paramAccessibilityEvent);
  }

  public void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    ds.c(dt, paramView, paramAccessibilityEvent);
  }

  public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return ds.a(dt, paramViewGroup, paramView, paramAccessibilityEvent);
  }

  public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
  {
    return ds.a(dt, paramView, paramInt, paramBundle);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a
 * JD-Core Version:    0.6.2
 */