package com.tencent.mm.plugin.c.a.c;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

final class d extends cm
{
  private WeakReference eiH = null;

  public d(Looper paramLooper, a parama)
  {
    super(paramLooper);
    this.eiH = new WeakReference(parama);
  }

  public final void handleMessage(Message paramMessage)
  {
    a locala = (a)this.eiH.get();
    if (locala == null)
    {
      z.w("!44@/B4Tb64lLpLVC0LaS5ZOdmcyBvvMz5om8QPLJsnEUbI=", "null == BluetoothSdkManager");
      return;
    }
    z.i("!44@/B4Tb64lLpLVC0LaS5ZOdmcyBvvMz5om8QPLJsnEUbI=", "handleMessage Message.What = " + paramMessage.what);
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      k localk = (k)paramMessage.obj;
      a.b(locala).c(localk.getLong(), localk.HY());
      return;
    case 4:
      g localg = (g)paramMessage.obj;
      a.b(locala).b(localg.getLong(), localg.HY());
      return;
    case 5:
      h localh = (h)paramMessage.obj;
      l locall = a.b(locala);
      long l = localh.HT();
      localh.getErrorCode();
      localh.HZ();
      locall.ai(l);
      return;
    case 1:
      i locali = (i)paramMessage.obj;
      a.b(locala).c(locali.HT(), locali.getData());
      return;
    case 2:
      a.b(locala).fA(paramMessage.arg1);
      return;
    case 3:
      j localj = (j)paramMessage.obj;
      a.b(locala).h(localj.Ia(), localj.getDeviceName(), paramMessage.arg1);
      return;
    case 6:
    }
    e locale = (e)paramMessage.obj;
    a.b(locala).a(locale.HT(), locale.HW(), locale.HX());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.c.d
 * JD-Core Version:    0.6.2
 */