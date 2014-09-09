package com.tencent.mm.plugin.c.a.b;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

final class i extends cm
{
  private WeakReference eiH = null;

  public i(Looper paramLooper, h paramh)
  {
    super(paramLooper);
    this.eiH = new WeakReference(paramh);
  }

  public final void handleMessage(Message paramMessage)
  {
    h localh = (h)this.eiH.get();
    if (localh == null)
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLS4b6dRLTY212lcTwoa8tIw==", "null == connectTread");
      return;
    }
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      h.a(localh);
      return;
    case 1:
    }
    h.b(localh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.i
 * JD-Core Version:    0.6.2
 */