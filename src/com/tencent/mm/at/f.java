package com.tencent.mm.at;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

final class f extends cm
{
  public final void handleMessage(Message paramMessage)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramMessage.what);
    z.i("!44@/B4Tb64lLpJIMaaRtK4LLtb0dXv/4DByk4tlG3jBVb0=", "TRACE handle msg :%d ", arrayOfObject);
    if (paramMessage.what == 0)
      d.iHx.b((h)paramMessage.obj);
    while (true)
    {
      super.handleMessage(paramMessage);
      return;
      if (paramMessage.what == 1)
      {
        if (d.c(d.iHx) != null)
        {
          i locali = (i)d.c(d.iHx).get();
          if (locali != null)
            locali.aOb();
        }
      }
      else
        d.a(d.iHx, (h)paramMessage.obj);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.f
 * JD-Core Version:    0.6.2
 */