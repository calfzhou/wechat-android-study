package com.tencent.mm.model;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;

final class ci
  implements Runnable
{
  ci(String paramString)
  {
  }

  public final void run()
  {
    Context localContext = ak.getContext();
    if (localContext == null)
      z.e("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "parseMsgSource context is null");
    ck localck;
    do
    {
      return;
      String str = localContext.getApplicationInfo().sourceDir;
      localck = new ck(this.dlN, str);
    }
    while (localck.type <= 0);
    if (ch.rC() == null)
      ch.a(new bp(1, "!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8"));
    ch.rC().c(localck);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ci
 * JD-Core Version:    0.6.2
 */