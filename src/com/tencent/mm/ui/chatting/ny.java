package com.tencent.mm.ui.chatting;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.tencent.mm.n;

final class ny
  implements View.OnTouchListener
{
  ny(ShortVideoRecorderView paramShortVideoRecorderView)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return true;
      ShortVideoRecorderView.a(this.jvS, paramMotionEvent.getY());
      ShortVideoRecorderView.d(this.jvS);
      continue;
      if (ShortVideoRecorderView.e(this.jvS) - paramMotionEvent.getY() > 150.0F)
      {
        ShortVideoRecorderView.f(this.jvS).setText(n.cEl);
        ShortVideoRecorderView.g(this.jvS).setText(n.cEl);
      }
      else
      {
        ShortVideoRecorderView.f(this.jvS).setText(n.cEm);
        ShortVideoRecorderView.g(this.jvS).setText(n.cEo);
        continue;
        if (ShortVideoRecorderView.e(this.jvS) - paramMotionEvent.getY() <= 150.0F)
          ShortVideoRecorderView.i(this.jvS);
        else
          ShortVideoRecorderView.h(this.jvS);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ny
 * JD-Core Version:    0.6.2
 */