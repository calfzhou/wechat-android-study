package com.tencent.mm.plugin.exdevice.service;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;

final class b extends cm
{
  public b(a parama, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
      return;
    case 2:
      a.a(this.eJX).f(2, null, null);
      return;
    case 1:
      d locald = (d)paramMessage.obj;
      a.a(this.eJX).f(1, locald.Ia(), locald.getDeviceName());
      return;
    case 3:
      f localf = (f)paramMessage.obj;
      a.a(this.eJX).b(localf.Pz(), localf.PA(), localf.Py(), localf.tP());
      return;
    case 4:
      e locale = (e)paramMessage.obj;
      a.a(this.eJX).b(locale.HW(), locale.Pw(), locale.Px(), locale.Py());
      return;
    case 5:
      c localc = (c)paramMessage.obj;
      a.a(this.eJX).a(paramMessage.arg1, localc.HW(), localc.Pu(), localc.Pv(), localc.Pt());
      return;
    case 6:
      a.a(this.eJX, paramMessage.arg1);
      return;
    case 7:
      a.gT(paramMessage.arg1);
      return;
    case 10:
      g localg = (g)paramMessage.obj;
      a.a(this.eJX, localg.PB(), localg.getData());
      return;
    case 8:
      h localh = (h)paramMessage.obj;
      a.a(this.eJX, localh.Pz(), localh.PC());
      return;
    case 9:
      a.aw(((Long)paramMessage.obj).longValue());
      return;
    case 11:
      a.a(this.eJX, ((Long)paramMessage.obj).longValue());
      return;
    case 12:
    }
    a.b(this.eJX, ((Long)paramMessage.obj).longValue());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b
 * JD-Core Version:    0.6.2
 */