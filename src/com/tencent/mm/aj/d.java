package com.tencent.mm.aj;

import com.tencent.mm.c.a.cu;
import com.tencent.mm.c.a.cw;
import com.tencent.mm.model.u;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.x;
import com.tencent.mm.n.y;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;

public final class d extends u
{
  protected final ar a(q paramq, String paramString1, String paramString2, String paramString3)
  {
    String str = ai.a(paramq.hOS);
    if ((str == null) || (str.length() <= 0))
    {
      z.e("!44@/B4Tb64lLpISOYcLaKm7W+16VCy6SmHvJ6VHvzODq8o=", "possible friend msg : content is null");
      return null;
    }
    as localas = as.zl(str);
    if (((localas.aJS() != null) || (localas.aJV() != null)) && ((localas.Ew() == 10) || (localas.Ew() == 11)))
    {
      cu localcu = new cu();
      localcu.cJf.cJh = localas.aJS();
      localcu.cJf.cJi = localas.aJV();
      com.tencent.mm.sdk.c.a.aGB().g(localcu);
      if (localcu.cJg.cJj)
      {
        z.v("!44@/B4Tb64lLpISOYcLaKm7W+16VCy6SmHvJ6VHvzODq8o=", "possible mobile friend is not in local address book");
        return null;
      }
    }
    if (localas.aJT() > 0L)
      c.c(localas.aJT(), localas.aJR());
    if (ch.ja(localas.aJQ()).length() > 0)
    {
      x localx = new x();
      localx.setUsername(localas.aJQ());
      localx.bi(3);
      localx.T(true);
      localx.db(-1);
      localx.fe(localas.aJO());
      localx.ff(localas.aJP());
      localx.db(-1);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = localas.aJQ();
      arrayOfObject[1] = localx.st();
      arrayOfObject[2] = localx.su();
      z.d("!44@/B4Tb64lLpISOYcLaKm7W+16VCy6SmHvJ6VHvzODq8o=", "dkhurl user:[%s] big:[%s] sm:[%s]", arrayOfObject);
      af.sJ().a(localx);
    }
    f localf = new f();
    localf.field_createTime = e.b(paramString1, paramq.hOV);
    localf.field_isSend = 0;
    localf.field_msgContent = ai.a(paramq.hOS);
    localf.field_svrId = paramq.hOY;
    localf.field_talker = localas.aJQ();
    localf.field_type = 0;
    a locala = l.AF().hF(localf.field_talker);
    if (locala != null)
    {
      z.d("!44@/B4Tb64lLpISOYcLaKm7W+16VCy6SmHvJ6VHvzODq8o=", "getByEncryptTalker success. encryptTalker = " + localf.field_talker + " , real talker = " + locala.field_talker);
      localf.field_encryptTalker = localf.field_talker;
      localf.field_talker = locala.field_talker;
    }
    l.AE().a(localf);
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.d
 * JD-Core Version:    0.6.2
 */