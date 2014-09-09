package com.tencent.mm.ui.base;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class av extends cm
{
  av(MMFalseProgressBar paramMMFalseProgressBar, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 1000:
      MMFalseProgressBar.a(this.iYP);
      return;
    case 1001:
      MMFalseProgressBar.b(this.iYP);
      return;
    case 1002:
      MMFalseProgressBar.c(this.iYP);
      return;
    case 1003:
    }
    MMFalseProgressBar.d(this.iYP);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.av
 * JD-Core Version:    0.6.2
 */