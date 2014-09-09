package com.tencent.mm.plugin.ext.provider;

import com.tencent.mm.c.a.bw;
import com.tencent.mm.c.a.by;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;

final class d
  implements Runnable
{
  d(ExtControlProviderMsg paramExtControlProviderMsg, i parami, String[] paramArrayOfString, com.tencent.mm.pluginsdk.d.a.a parama)
  {
  }

  public final void run()
  {
    bw localbw = new bw();
    localbw.cIK.cIM = this.eMr.getUsername();
    localbw.cIK.content = this.eMp[1];
    localbw.cIK.type = y.dR(this.eMr.getUsername());
    localbw.cIK.flags = 0;
    if (!com.tencent.mm.sdk.c.a.aGB().g(localbw))
    {
      this.eMq.hg(4);
      this.eMc.countDown();
      return;
    }
    x localx = localbw.cIL.cIN;
    try
    {
      e locale = new e(this, com.tencent.mm.plugin.ext.a.a.aS(localbw.cIL.cDM));
      bg.qX().a(522, locale);
      bg.qX().d(localx);
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
      this.eMq.hg(4);
      this.eMc.countDown();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.d
 * JD-Core Version:    0.6.2
 */