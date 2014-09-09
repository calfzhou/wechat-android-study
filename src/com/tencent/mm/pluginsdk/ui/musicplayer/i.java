package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.os.Message;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.cm;

final class i extends cm
{
  i(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 65537:
    }
    int i;
    do
    {
      return;
      i = ((Integer)paramMessage.obj).intValue();
    }
    while (MusicPlayerUI.a(this.hGL) == null);
    MusicPlayerUI.a(this.hGL).setVisibility(i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.i
 * JD-Core Version:    0.6.2
 */