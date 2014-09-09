package com.tencent.mm.ui.contact;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;

final class gl
  implements View.OnTouchListener
{
  int fqE;
  int fqF;

  gl(VoipAddressUI paramVoipAddressUI, int paramInt)
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
      return false;
      this.fqF = ((int)paramMotionEvent.getX());
      this.fqE = ((int)paramMotionEvent.getY());
      continue;
      if ((Math.abs(this.fqF - paramMotionEvent.getX()) > this.fqG) || (Math.abs(this.fqE - paramMotionEvent.getY()) > this.fqG))
      {
        this.jCH.XF();
        VoipAddressUI.e(this.jCH).clearFocus();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.gl
 * JD-Core Version:    0.6.2
 */