package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.view.View.OnClickListener;

final class bg
  implements View.OnClickListener
{
  bg(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final void onClick(View paramView)
  {
    if (VoiceSearchLayout.a(this.hAB))
    {
      if (VoiceSearchLayout.b(this.hAB) == 0)
      {
        if (VoiceSearchLayout.c(this.hAB))
        {
          this.hAB.aAA();
          return;
        }
        this.hAB.G();
        return;
      }
      this.hAB.aAA();
      return;
    }
    this.hAB.mv(VoiceSearchLayout.b(this.hAB));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.bg
 * JD-Core Version:    0.6.2
 */