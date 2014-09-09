package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.cc;
import com.tencent.mm.c.a.cd;
import com.tencent.mm.modelvoice.ac;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class p extends g
{
  ac elZ;

  public p()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    int i = 1;
    if (!(parame instanceof cc))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      i = 0;
    }
    cc localcc;
    do
    {
      return i;
      localcc = (cc)parame;
      if (localcc.cIQ.op == i)
      {
        if (this.elZ == null)
          this.elZ = new ac(ak.getContext());
        while (true)
        {
          localcc.cIR.cCM = this.elZ.k(localcc.cIQ.rI, localcc.cIQ.cDS);
          return i;
          if (this.elZ.isPlaying())
            this.elZ.stop();
        }
      }
    }
    while ((localcc.cIQ.op != 2) || (this.elZ == null));
    this.elZ.stop();
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.p
 * JD-Core Version:    0.6.2
 */