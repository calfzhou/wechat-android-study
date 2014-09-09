package com.tencent.mm.plugin.c.a.a;

import android.bluetooth.BluetoothAdapter;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.Iterator;

final class c
  implements Runnable
{
  c(b paramb)
  {
  }

  public final void run()
  {
    b.a(this.eik);
    b.c(this.eik).stopLeScan(b.b(this.eik));
    z.i("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "Time out for discovering. Stop it");
    synchronized (b.d(this.eik))
    {
      if (b.d(this.eik).isEmpty())
        break label149;
      Iterator localIterator = b.d(this.eik).iterator();
      while (localIterator.hasNext())
      {
        Long localLong = (Long)localIterator.next();
        z.e("!56@/B4Tb64lLpLHXwcx366fGir3flW46XdLNwWHCdhKLklKXD3NoPxEfA==", "Cannot scan out Remote device(Mac = %d), Connect Failed!!!", new Object[] { localLong });
        if (this.eik.eic != null)
          this.eik.eic.b(localLong.longValue(), false);
      }
    }
    b.d(this.eik).clear();
    label149: if (this.eik.eic != null)
      this.eik.eic.HQ();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.a.c
 * JD-Core Version:    0.6.2
 */