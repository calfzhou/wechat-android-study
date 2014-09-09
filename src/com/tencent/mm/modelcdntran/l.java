package com.tencent.mm.modelcdntran;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.g;
import com.tencent.mm.protocal.a.cx;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements g
{
  l(k paramk)
  {
  }

  public final void b(cx paramcx1, cx paramcx2, cx paramcx3)
  {
    z.d("!44@/B4Tb64lLpIAhUt0Bg2QToookYEZHCVFCAb/yW4GbfY=", "cdntra infoUpdate dns info " + paramcx1.toString() + " getCore().engine:" + k.vm());
    if (k.vm() != null)
    {
      k.vm().a(paramcx1, paramcx2, paramcx3);
      bg.qQ().n(new m(this));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.l
 * JD-Core Version:    0.6.2
 */