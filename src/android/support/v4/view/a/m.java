package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class m extends AccessibilityNodeProvider
{
  m(n paramn)
  {
  }

  public final AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    this.fR.ao();
    return null;
  }

  public final List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    return this.fR.an();
  }

  public final boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.fR.am();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.m
 * JD-Core Version:    0.6.2
 */