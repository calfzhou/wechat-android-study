package com.tencent.mm.plugin.ext;

import com.tencent.mm.c.a.cf;
import com.tencent.mm.c.a.cg;
import com.tencent.mm.c.a.ch;
import com.tencent.mm.modelvoice.aj;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public final class q extends g
{
  aj eLO;
  String rI = "";

  public q()
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    if (!(parame instanceof cf))
    {
      z.f("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "mismatched event");
      return false;
    }
    cf localcf = (cf)parame;
    if (localcf.cIS.op == 1)
    {
      if (this.eLO == null)
        this.eLO = new aj(ak.getContext());
      localcf.cIT.cCM = this.eLO.fj(localcf.cIS.username);
      this.rI = this.eLO.getFileName();
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(localcf.cIS.op);
      arrayOfObject2[1] = Boolean.valueOf(localcf.cIT.cCM);
      z.d("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "data.op = [%s], ret = [%s]", arrayOfObject2);
    }
    while (true)
    {
      return true;
      if ((localcf.cIS.op == 2) && (this.eLO != null))
      {
        localcf.cIT.rI = this.rI;
        localcf.cIT.cCM = this.eLO.md();
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(localcf.cIS.op);
        arrayOfObject1[1] = this.rI;
        arrayOfObject1[2] = Boolean.valueOf(localcf.cIT.cCM);
        z.d("!44@/B4Tb64lLpIAhUt0Bg2QThuc37pqTsjLtAkd+Z5MTHc=", "data.op = [%s], fileName = [%s], ret = [%s]", arrayOfObject1);
        this.rI = "";
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.q
 * JD-Core Version:    0.6.2
 */