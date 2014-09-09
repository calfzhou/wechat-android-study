package com.tencent.mm.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.List;

final class d extends android.support.v4.view.a
{
  d(AddressView paramAddressView)
  {
  }

  public final void a(View paramView, android.support.v4.view.a.a parama)
  {
    super.a(paramView, parama);
    CharSequence localCharSequence = this.iHX.getContentDescription();
    if (ch.jb((String)localCharSequence))
      localCharSequence = this.iHX.nickName;
    parama.setText(localCharSequence);
  }

  public final void onPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    CharSequence localCharSequence = this.iHX.getContentDescription();
    if (ch.jb((String)localCharSequence))
      localCharSequence = this.iHX.nickName;
    paramAccessibilityEvent.getText().add(localCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.d
 * JD-Core Version:    0.6.2
 */