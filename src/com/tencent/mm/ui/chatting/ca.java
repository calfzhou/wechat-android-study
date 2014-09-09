package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class ca
  implements Runnable
{
  ca(bw parambw)
  {
  }

  public final void run()
  {
    synchronized (bw.g(this.jor))
    {
      if (bw.h(this.jor))
      {
        z.i("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "jacks already stop before begin!!");
        return;
      }
      bw.i(this.jor);
      bw.b(this.jor).cP(100L);
      bw.a(this.jor, false);
      bw.c(this.jor).cP(200L);
      bw.d(this.jor).mP(bw.j(this.jor).getHeight());
      bw.e(this.jor).aUq();
      bw.k(this.jor);
      this.jor.acquireWakeLock();
      bw.f(this.jor).qm(3);
      bw.f(this.jor).keepSignalling();
      bw.aUM();
      bw.f(this.jor).fn(true);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ca
 * JD-Core Version:    0.6.2
 */