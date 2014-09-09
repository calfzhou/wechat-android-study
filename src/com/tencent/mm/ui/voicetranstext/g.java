package com.tencent.mm.ui.voicetranstext;

import android.text.ClipboardManager;
import android.widget.TextView;
import com.tencent.mm.ui.base.y;

final class g
  implements y
{
  g(f paramf)
  {
  }

  public final void onClick(int paramInt)
  {
    if ((paramInt == 0) && (VoiceTransTextUI.a(this.kaw.kav) != null) && (VoiceTransTextUI.b(this.kaw.kav) != null))
      VoiceTransTextUI.a(this.kaw.kav).setText(VoiceTransTextUI.b(this.kaw.kav).getText());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.g
 * JD-Core Version:    0.6.2
 */