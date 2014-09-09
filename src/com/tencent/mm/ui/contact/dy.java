package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.ui.voicesearch.j;

final class dy
  implements View.OnTouchListener
{
  int fqE;
  int fqF;

  dy(SelectContactUI paramSelectContactUI, int paramInt)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while (true)
    {
      if (SelectContactUI.g(this.jBX) != null)
        SelectContactUI.g(this.jBX).onTouchEvent(paramMotionEvent);
      if (SelectContactUI.n(this.jBX) != null)
        SelectContactUI.n(this.jBX).onTouchEvent(paramMotionEvent);
      return false;
      this.fqF = ((int)paramMotionEvent.getX());
      this.fqE = ((int)paramMotionEvent.getY());
      continue;
      if ((Math.abs(this.fqF - paramMotionEvent.getX()) > this.fqG) || (Math.abs(this.fqE - paramMotionEvent.getY()) > this.fqG))
      {
        this.jBX.XF();
        SelectContactUI.p(this.jBX).clearFocus();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dy
 * JD-Core Version:    0.6.2
 */