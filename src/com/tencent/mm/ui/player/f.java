package com.tencent.mm.ui.player;

import com.tencent.mm.c.a.ar;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.c.a.kn;
import com.tencent.mm.c.a.kp;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.protocal.a.hy;
import com.tencent.mm.protocal.a.il;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.ui.base.y;

final class f
  implements y
{
  f(e parame)
  {
  }

  public final void onClick(int paramInt)
  {
    if (paramInt != 0)
      return;
    ar localar = new ar();
    boolean bool;
    if (0L != MusicDetailUI.a(this.jKv.jKu))
      bool = c.a(localar, MusicDetailUI.a(this.jKv.jKu));
    while (bool)
    {
      localar.cHU.cHW.aLG().Aj("");
      localar.cHU.cHW.aLG().xO("");
      localar.cHU.cHW.aLG().nG(10);
      a.aGB().g(localar);
      if (localar.cHV.ret == 0)
      {
        com.tencent.mm.ui.base.e.aw(this.jKv.jKu.aPI(), this.jKv.jKu.getString(n.bHR));
        return;
        kn localkn = new kn();
        localkn.cOc.cOe = MusicDetailUI.b(this.jKv.jKu);
        localkn.cOc.cOb = localar;
        a.aGB().g(localkn);
        bool = localkn.cOd.cCM;
      }
      else
      {
        com.tencent.mm.ui.base.e.b(this.jKv.jKu.aPI(), n.bHw, n.bHn);
        return;
      }
    }
    if (localar.cHU.type == 0)
      localar.cHU.type = n.bHs;
    com.tencent.mm.ui.base.e.b(this.jKv.jKu.aPI(), localar.cHU.type, n.bHn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.f
 * JD-Core Version:    0.6.2
 */