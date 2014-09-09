package com.tencent.mm.pluginsdk.ui.applet;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;

final class q extends Thread
{
  private cm gQj;
  private String url;

  q(String paramString, cm paramcm)
  {
    this.url = paramString;
    this.gQj = paramcm;
  }

  public final void run()
  {
    byte[] arrayOfByte = ch.xB(this.url);
    Message localMessage = Message.obtain();
    localMessage.obj = arrayOfByte;
    this.gQj.sendMessage(localMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.q
 * JD-Core Version:    0.6.2
 */