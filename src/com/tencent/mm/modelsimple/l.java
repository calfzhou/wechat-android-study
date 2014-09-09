package com.tencent.mm.modelsimple;

import com.tencent.mm.ao.b;
import com.tencent.mm.model.cg;
import com.tencent.mm.network.n;
import com.tencent.mm.network.r;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements cg
{
  l(i parami, com.tencent.mm.protocal.l paraml)
  {
  }

  public final void a(r paramr)
  {
    if ((paramr == null) || (paramr.tE() == null) || (this.dCs.hNr.hQu == null))
    {
      z.e("!32@/B4Tb64lLpK+IBX8XDgnvv2zVnVGw39g", "[arthurdan.NetSceneAuthCrash] fatal error null == dispatcher.getAccInfo() || null == resp.rImpl.getSessionKey() !!!");
      return;
    }
    paramr.tE().l(this.dCs.hNr.hQu.aFt(), this.dCs.hNr.hQv);
    paramr.tE().e(this.dCs.hNr.hVf.getString(), i.d(this.dCq), i.e(this.dCq));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.l
 * JD-Core Version:    0.6.2
 */