package com.tencent.mm.protocal;

import com.tencent.mm.ao.b;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.vo;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class l extends q
  implements o
{
  public te hNr = new te();

  public final int getCmdId()
  {
    return 1000000178;
  }

  public final int r(byte[] paramArrayOfByte)
  {
    this.hNr = new te().ce(paramArrayOfByte);
    m.a(this, this.hNr.hRz);
    j.cz(this.hNr.inW);
    b localb;
    if (this.hNr.hRz.hQw == 0)
      if (this.hNr.hQv != 0)
      {
        localb = this.hNr.hQu;
        if (localb != null)
          break label112;
      }
    label112: for (String str = null; ; str = localb.aFt())
    {
      if (ch.jb(str))
      {
        z.e("!24@/B4Tb64lLpIZFt1xb4C2yA==", "retcode 0 but invalid uin or invalid session");
        this.hNr.hRz.hQw = -1;
      }
      return this.hNr.hRz.hQw;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.l
 * JD-Core Version:    0.6.2
 */