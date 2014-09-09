package com.tencent.mm.booter;

import android.os.Process;
import com.tencent.mm.network.be;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.z;

final class ap
  implements Runnable
{
  ap(ao paramao)
  {
  }

  public final void run()
  {
    long l = com.tencent.mm.platformtools.ap.CM();
    Process.setThreadPriority(10);
    String str = this.diV.lC();
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = Thread.currentThread().getName();
    arrayOfObject1[1] = Integer.valueOf(Process.getThreadPriority(Process.myTid()));
    arrayOfObject1[2] = str;
    z.i("!32@/B4Tb64lLpJ/45nhhxB3sW7Az8rKLsSk", "tryReport thread:%s pri:%d  Url[%s] ", arrayOfObject1);
    if (com.tencent.mm.platformtools.ap.jb(str));
    while (true)
    {
      return;
      be localbe = null;
      try
      {
        localbe = k.jr(str);
        if (localbe == null)
        {
          z.e("!32@/B4Tb64lLpJ/45nhhxB3sW7Az8rKLsSk", "tryReport ERR: genHttpConnection is null url[%s]", new Object[] { str });
          return;
        }
      }
      catch (Exception localException)
      {
        z.e("!32@/B4Tb64lLpJ/45nhhxB3sW7Az8rKLsSk", "tryReport error url[%s]", new Object[] { str });
      }
      while (localbe != null)
      {
        localbe.disconnect();
        return;
        localbe.setConnectTimeout(10000);
        localbe.setReadTimeout(10000);
        localbe.connect();
        int i = localbe.getResponseCode();
        if (i == 200)
          this.diV.r(l.cFn, a.hrn);
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = Long.valueOf(com.tencent.mm.platformtools.ap.ac(l));
        arrayOfObject2[1] = Integer.valueOf(i);
        arrayOfObject2[2] = str;
        z.d("!32@/B4Tb64lLpJ/45nhhxB3sW7Az8rKLsSk", "report FIN time:%d resp:%d url[%s]", arrayOfObject2);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ap
 * JD-Core Version:    0.6.2
 */