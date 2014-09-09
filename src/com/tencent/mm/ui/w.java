package com.tencent.mm.ui;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class w extends cm
{
  private boolean iII;
  public final int iIJ = 0x1 | hashCode();
  public final int iIK = 0x2 | hashCode();

  public w(u paramu, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void clear()
  {
    this.iII = true;
    removeMessages(this.iIJ);
    removeMessages(this.iIK);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (this.iII);
    do
    {
      return;
      synchronized (this.iIH)
      {
        u.b(this.iIH, u.d(this.iIH));
        String str = this.iIH.iIy.TAG;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(u.e(this.iIH));
        z.i(str, "newcursor updateWorkerRefresh status %d", arrayOfObject);
        if (paramMessage.what == this.iIJ)
        {
          n.d(this.iIH.iIy);
          return;
        }
      }
    }
    while (paramMessage.what != this.iIK);
    n.a(this.iIH.iIy, (s)paramMessage.obj, false, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.w
 * JD-Core Version:    0.6.2
 */