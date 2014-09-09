package com.tencent.mm.app;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.ui.MMAppMgr;

final class z
  implements com.tencent.mm.o.ak
{
  z(WorkerProfile paramWorkerProfile)
  {
  }

  public final void a(com.tencent.mm.o.ac paramac, boolean paramBoolean)
  {
    if ((paramBoolean) && (!paramac.tv()))
    {
      if (!WorkerProfile.iu())
        com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "can't kill the working process");
    }
    else
      return;
    MMAppMgr.aQb();
    com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "now killing the working process....");
    if (com.tencent.mm.modelfriend.c.vq())
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "address book syncing, wait a minute please");
      return;
    }
    Context localContext = com.tencent.mm.sdk.platformtools.ak.getContext();
    localContext.stopService(new Intent(localContext, NotifyReceiver.NotifyService.class));
    com.tencent.mm.n.ac.b(new aa(this));
  }

  public final void ip()
  {
    WorkerProfile.b(this.cGV).n(WorkerProfile.a(this.cGV));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.z
 * JD-Core Version:    0.6.2
 */