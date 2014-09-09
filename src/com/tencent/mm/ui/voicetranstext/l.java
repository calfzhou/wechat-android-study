package com.tencent.mm.ui.voicetranstext;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class l extends cm
{
  l(VoiceTransTextUI paramVoiceTransTextUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = paramMessage.what;
    if (i == 1)
      VoiceTransTextUI.b(this.kav, true);
    while (i != 2)
      return;
    VoiceTransTextUI.b(this.kav, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.l
 * JD-Core Version:    0.6.2
 */