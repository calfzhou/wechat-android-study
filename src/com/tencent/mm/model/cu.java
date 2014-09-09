package com.tencent.mm.model;

import com.tencent.mm.o.j;
import com.tencent.mm.o.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.e;
import java.util.Map;
import junit.framework.Assert;

public final class cu
  implements j
{
  public final k a(q paramq)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramq != null)
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      if (paramq.hOS == null)
        break label90;
    }
    while (true)
    {
      Assert.assertTrue(bool1);
      String str = (String)x.bB(ai.a(paramq.hOS), "tips").get(".tips.tip.url");
      z.v("!44@/B4Tb64lLpKlRg6vINul8YyaOL4ccEjxhNngZRwSf28=", "url:" + str);
      bg.qW().oQ().set(12308, str);
      return null;
      bool2 = false;
      break;
      label90: bool1 = false;
    }
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cu
 * JD-Core Version:    0.6.2
 */