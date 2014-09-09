package com.tencent.mm.pluginsdk.ui.tools;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class ap extends cm
{
  ap(ao paramao, Looper paramLooper, ag paramag)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    ao.a(this.hLM, paramMessage.obj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ap
 * JD-Core Version:    0.6.2
 */