package com.tencent.mm.modelfriend;

import com.tencent.mm.model.u;
import com.tencent.mm.n.af;
import com.tencent.mm.n.x;
import com.tencent.mm.n.y;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;

public final class l extends u
{
  protected final ar a(q paramq, String paramString1, String paramString2, String paramString3)
  {
    String str = ai.a(paramq.hOS);
    if ((str == null) || (str.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpL1dEr9MTsZoH470szkdgdrgFUdKsSMXFM=", "possible friend msg : content is null");
      return null;
    }
    as localas = as.zl(str);
    if (ch.ja(localas.aJQ()).length() > 0)
    {
      x localx = new x();
      localx.setUsername(localas.aJQ());
      localx.bi(3);
      localx.T(true);
      localx.fe(localas.aJO());
      localx.ff(localas.aJP());
      localx.db(-1);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localas.aJQ();
      arrayOfObject[1] = localx.st();
      arrayOfObject[2] = localx.su();
      z.d("!44@/B4Tb64lLpL1dEr9MTsZoH470szkdgdrgFUdKsSMXFM=", "dkhurl user:[%s] big:[%s] sm:[%s]", arrayOfObject);
      af.sJ().a(localx);
    }
    return super.a(paramq, paramString1, paramString2, paramString3);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.l
 * JD-Core Version:    0.6.2
 */