package com.tencent.mm.plugin.c.a.a;

import android.bluetooth.BluetoothGatt;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

final class l extends cm
{
  private final WeakReference eiH;

  public l(Looper paramLooper, g paramg)
  {
    super(paramLooper);
    this.eiH = new WeakReference(paramg);
  }

  public final void handleMessage(Message paramMessage)
  {
    g localg = (g)this.eiH.get();
    if (localg == null)
    {
      z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLSkiFyoJyQvqUCKAMXC86Iw==", "null == BluetoothLESession");
      return;
    }
    switch (paramMessage.what)
    {
    default:
      return;
    case 0:
      g.a(localg);
      return;
    case 4:
      g.a(localg, paramMessage.arg1);
      return;
    case 5:
      g.a(localg, (BluetoothGatt)paramMessage.obj, paramMessage.arg1);
      return;
    case 6:
      g.b(localg, paramMessage.arg1);
      return;
    case 1:
      g.b(localg);
      return;
    case 3:
      g.a(localg, (byte[])paramMessage.obj);
      return;
    case 7:
      g.c(localg, paramMessage.arg1);
      return;
    case 8:
      g.b(localg, (byte[])paramMessage.obj);
      return;
    case 2:
    }
    g.c(localg);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.l
 * JD-Core Version:    0.6.2
 */