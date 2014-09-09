package com.tencent.mm.ui.voicetranstext;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.mm.sdk.platformtools.cm;

final class h
  implements View.OnTouchListener
{
  h(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
      do
      {
        return false;
        VoiceTransTextUI.c(this.kav);
        VoiceTransTextUI.a(this.kav, paramView.getScrollY());
        VoiceTransTextUI.b(this.kav, VoiceTransTextUI.d(this.kav));
        VoiceTransTextUI.e(this.kav).removeMessages(0);
      }
      while (!VoiceTransTextUI.f(this.kav));
      VoiceTransTextUI.g(this.kav);
      VoiceTransTextUI.a(this.kav, true);
      return false;
    case 1:
    case 3:
    case 4:
    }
    if (Math.abs(VoiceTransTextUI.h(this.kav) - paramView.getScrollY()) > VoiceTransTextUI.i(this.kav))
      VoiceTransTextUI.e(this.kav).sendMessage(VoiceTransTextUI.e(this.kav).obtainMessage(0, paramView));
    if ((VoiceTransTextUI.j(this.kav) < 800L) && (Math.abs(VoiceTransTextUI.h(this.kav) - paramView.getScrollY()) <= VoiceTransTextUI.i(this.kav)) && (!VoiceTransTextUI.k(this.kav)))
    {
      VoiceTransTextUI.e(this.kav).removeMessages(0);
      VoiceTransTextUI.l(this.kav);
      this.kav.finish();
    }
    VoiceTransTextUI.a(this.kav, false);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.h
 * JD-Core Version:    0.6.2
 */