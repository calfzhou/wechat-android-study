package com.tencent.mm.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.LinkedList;

final class x extends cm
{
  long iIL;
  private final int iIM = 0x776 | hashCode();
  private final int iIN = 0x77A | hashCode();
  long lastUpdateTime;

  public x(u paramu, Looper paramLooper)
  {
    super(paramLooper);
    u.a(paramu, new LinkedList());
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == this.iIN)
    {
      removeMessages(this.iIM);
      l = System.currentTimeMillis();
      if ((l - this.iIL > this.iIH.iIy.iIq) || (l - this.iIL < 0L) || ((this.lastUpdateTime != 0L) && (l - this.lastUpdateTime > this.iIH.iIy.iIr)) || (l - this.lastUpdateTime < 0L))
      {
        u.c(this.iIH);
        this.iIL = l;
      }
    }
    while (paramMessage.what != this.iIM)
      while (true)
      {
        long l;
        return;
        sendEmptyMessageDelayed(this.iIM, this.iIH.iIy.iIq);
      }
    u.c(this.iIH);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.x
 * JD-Core Version:    0.6.2
 */