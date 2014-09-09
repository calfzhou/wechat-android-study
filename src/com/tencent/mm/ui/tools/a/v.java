package com.tencent.mm.ui.tools.a;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class v extends cm
{
  v(Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    if (u.bbw() == null);
    while (true)
    {
      return;
      switch (paramMessage.what)
      {
      default:
        throw new AssertionError("Unknown handler message received: " + paramMessage.what);
      case 3:
        a locala = (a)paramMessage.obj;
        u.bbw().ah(locala.jWr.get());
        z.d("!12@Lf5YQiC4qMQ=", "current action queue size: " + u.bbw().jXa.size());
        return;
      case 8:
      }
      Iterator localIterator = ((List)paramMessage.obj).iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        u.bbu().d(locald);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.v
 * JD-Core Version:    0.6.2
 */