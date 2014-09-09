package com.tencent.mm.ui.tools.a;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

final class o extends cm
{
  public WeakReference jWS;

  public o(Looper paramLooper, n paramn)
  {
    super(paramLooper);
    this.jWS = new WeakReference(paramn);
  }

  public final void handleMessage(Message paramMessage)
  {
    n localn = (n)this.jWS.get();
    if (localn != null);
    a locala2;
    switch (paramMessage.what)
    {
    case 3:
    case 5:
    default:
      throw new AssertionError("Unknown handler message received: " + paramMessage.what);
    case 1:
      locala2 = (a)paramMessage.obj;
      d locald2 = (d)localn.jWP.get(locala2.dqq);
      if (locald2 != null)
        locald2.a(locala2);
    case 2:
      a locala1;
      String str;
      d locald1;
      do
      {
        do
          return;
        while (localn.jWO.isShutdown());
        d locald3 = d.a(localn.context, localn, localn.jWB, locala2);
        locald3.jWD = localn.jWO.submit(locald3);
        localn.jWP.put(locala2.dqq, locald3);
        return;
        locala1 = (a)paramMessage.obj;
        str = locala1.dqq;
        locald1 = (d)localn.jWP.get(str);
      }
      while (locald1 == null);
      locald1.jWC.remove(locala1);
      if ((locald1.jWC.isEmpty()) && (locald1.jWD != null) && (locald1.jWD.cancel(false)));
      for (int i = 1; i != 0; i = 0)
      {
        localn.jWP.remove(str);
        return;
      }
    case 4:
      localn.a((d)paramMessage.obj);
      return;
    case 6:
      localn.b((d)paramMessage.obj);
      return;
    case 7:
    }
    ArrayList localArrayList = new ArrayList(localn.jWR);
    localn.jWR.clear();
    localn.jWQ.sendMessageAtFrontOfQueue(localn.jWQ.obtainMessage(8, localArrayList));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.o
 * JD-Core Version:    0.6.2
 */