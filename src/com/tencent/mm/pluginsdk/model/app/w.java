package com.tencent.mm.pluginsdk.model.app;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;

final class w extends Thread
{
  private String appId = null;
  private int dSC = 0;
  private cm gQj = null;
  private String url = null;

  public w(cm paramcm, String paramString1, int paramInt, String paramString2)
  {
    this.gQj = paramcm;
    this.appId = paramString1;
    this.dSC = paramInt;
    this.url = paramString2;
  }

  public final void run()
  {
    if ((this.appId == null) || (this.appId.length() == 0) || (this.url == null) || (this.url.length() == 0))
      return;
    byte[] arrayOfByte = ch.xB(this.url);
    y localy = new y(this.appId, this.dSC, arrayOfByte);
    Message localMessage = Message.obtain();
    localMessage.obj = localy;
    this.gQj.sendMessage(localMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.w
 * JD-Core Version:    0.6.2
 */