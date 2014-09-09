package com.tencent.mm.ui.f;

import android.os.Message;
import c.a.d.c;
import c.a.d.g;
import c.a.e.b;
import com.tencent.mm.sdk.platformtools.cm;

final class d extends Thread
{
  d(a parama)
  {
  }

  public final void run()
  {
    j localj = j.jZe;
    if (a.e(this.jZb) == null)
      localj = j.jZf;
    while (true)
    {
      Message localMessage = a.d(this.jZb).obtainMessage(1010, localj);
      a.d(this.jZb).sendMessage(localMessage);
      return;
      c localc = new c(c.a.d.j.kmq, "https://api.twitter.com/1.1/account/verify_credentials.json");
      a.b(this.jZb).a(a.e(this.jZb), localc);
      if (localc.bfI().GC() != 200)
        localj = j.jZf;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.d
 * JD-Core Version:    0.6.2
 */