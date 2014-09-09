package com.tencent.mm.ui.tools;

import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.y.ag;
import java.util.ArrayList;
import java.util.Iterator;

final class gi
  implements Runnable
{
  gi(gh paramgh, cr paramcr)
  {
  }

  public final void run()
  {
    String str1 = x.pG();
    Iterator localIterator = this.jUO.jUL.baS().iterator();
    String str2 = null;
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      z.d("!32@/B4Tb64lLpIPG1BmaCV8Is7taXfvmBXB", "toSend, %s", new Object[] { str3 });
      ag localag = new ag(5, str1, str3, ShareImageUI.a(this.jUO.jUM), 0, null, 0, "", str2, true, h.Ti);
      bg.qX().d(localag);
      if (localag.yc() != null)
        str2 = localag.yc().kp();
    }
    this.jUN.dismiss();
    this.jUO.jUM.setResult(-1);
    this.jUO.jUM.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gi
 * JD-Core Version:    0.6.2
 */