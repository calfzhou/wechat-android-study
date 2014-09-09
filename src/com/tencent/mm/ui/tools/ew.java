package com.tencent.mm.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.cm;

final class ew
  implements View.OnTouchListener
{
  ew(MaskImageButton paramMaskImageButton)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while ((!this.jUd.isClickable()) && (!this.jUd.isLongClickable()))
    {
      return true;
      paramView.setPressed(true);
      paramView.invalidate();
      MaskImageButton.b(this.jUd).removeCallbacks(MaskImageButton.a(this.jUd));
      continue;
      MaskImageButton.b(this.jUd).post(MaskImageButton.a(this.jUd));
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ew
 * JD-Core Version:    0.6.2
 */