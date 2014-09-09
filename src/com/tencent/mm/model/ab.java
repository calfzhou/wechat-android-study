package com.tencent.mm.model;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.cm;

final class ab extends cm
{
  ab(aa paramaa, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    try
    {
      if (this.dks.dkr != null)
      {
        ae localae = (ae)paramMessage.obj;
        int i = c.ab(localae.filename);
        if (i > 0)
          at.qy().x(i, 0);
        am.h(new ac(this, localae, paramMessage));
      }
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ab
 * JD-Core Version:    0.6.2
 */