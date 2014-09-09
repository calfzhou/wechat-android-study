package com.tencent.mm.ui.voicetranstext;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

final class m
  implements Runnable
{
  m(VoiceTransTextUI paramVoiceTransTextUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    if (VoiceTransTextUI.r(this.kav).getMeasuredHeight() >= VoiceTransTextUI.s(this.kav).getMeasuredHeight())
    {
      VoiceTransTextUI.r(this.kav).fullScroll(130);
      int i = VoiceTransTextUI.r(this.kav).getScrollY();
      VoiceTransTextUI.d(this.kav, VoiceTransTextUI.r(this.kav).getPaddingTop());
      VoiceTransTextUI.d(this.kav, VoiceTransTextUI.t(this.kav) - i);
      if (this.kaz)
        break label121;
      if (VoiceTransTextUI.t(this.kav) > 0)
        VoiceTransTextUI.r(this.kav).setPadding(0, VoiceTransTextUI.t(this.kav), 0, 0);
    }
    return;
    label121: VoiceTransTextUI.r(this.kav).setPadding(0, 0, 0, 0);
    VoiceTransTextUI.u(this.kav).setVisibility(8);
    VoiceTransTextUI.u(this.kav).setHeight(0);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.m
 * JD-Core Version:    0.6.2
 */