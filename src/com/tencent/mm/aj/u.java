package com.tencent.mm.aj;

import com.tencent.mm.c.a.hk;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n.af;
import com.tencent.mm.n.y;
import com.tencent.mm.o.j;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.av;

public final class u
  implements j
{
  public final com.tencent.mm.o.k a(q paramq)
  {
    String str1 = ai.a(paramq.hOP);
    if (!"fmessage".equals(str1))
      return null;
    String str2 = ai.a(paramq.hOS);
    av localav = av.zp(str2);
    z.d("!44@/B4Tb64lLpKDVwx5Tec2QoNQuzVRaXcz10nDg4xRyck=", "onPreAddMessage, verify scene = " + localav.Ew());
    String str3 = com.tencent.mm.model.x.pG();
    if ((localav.aJQ() != null) && (localav.aJQ().equals(str3)))
    {
      z.e("!44@/B4Tb64lLpKDVwx5Tec2QoNQuzVRaXcz10nDg4xRyck=", "fromUserName is self, simply drop this msg");
      return null;
    }
    com.tencent.mm.n.x localx = new com.tencent.mm.n.x();
    localx.setUsername(localav.aJQ());
    localx.bi(3);
    localx.T(true);
    localx.db(-1);
    localx.fe(localav.aJO());
    localx.ff(localav.aJP());
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = localav.aJQ();
    arrayOfObject[1] = localx.st();
    arrayOfObject[2] = localx.su();
    z.d("!44@/B4Tb64lLpKDVwx5Tec2QoNQuzVRaXcz10nDg4xRyck=", "dkhurl user:[%s] big:[%s] sm:[%s]", arrayOfObject);
    af.sJ().a(localx);
    if (!ch.jb(localav.aJQ()))
    {
      if (localav.Ew() == 18)
      {
        l.AG().a(paramq, localav);
        bg.qW().oQ().set(73729, Integer.valueOf(1));
        return null;
      }
      if (bw.cM(localav.Ew()))
      {
        l.AH().a(paramq, localav);
        bg.qW().oQ().set(73730, Integer.valueOf(1));
        return null;
      }
      if (localav.Ew() == 48)
      {
        hk localhk = new hk();
        localhk.cMc.cJr = str2;
        localhk.cMc.cEh = localav.aJQ();
        com.tencent.mm.sdk.c.a.aGB().g(localhk);
      }
    }
    f localf = new f();
    localf.field_createTime = e.b(str1, paramq.hOV);
    localf.field_isSend = 0;
    localf.field_msgContent = ai.a(paramq.hOS);
    localf.field_svrId = paramq.hOY;
    localf.field_talker = localav.aJQ();
    switch (localav.aKj())
    {
    case 3:
    case 4:
    default:
      localf.field_type = 1;
    case 2:
    case 5:
    case 6:
    }
    while (!ch.jb(localav.aKk()))
    {
      localf.field_encryptTalker = localav.aKk();
      if (l.AF().hD(localav.aKk()) != null)
      {
        l.AE().R(localf.field_encryptTalker, localf.field_talker);
        l.AF().hG(localf.field_encryptTalker);
      }
      l.AE().a(localf);
      return null;
      localf.field_type = 1;
      continue;
      localf.field_type = 2;
      continue;
      localf.field_type = 3;
    }
    z.e("!44@/B4Tb64lLpKDVwx5Tec2QoNQuzVRaXcz10nDg4xRyck=", "it should not go in here");
    a locala = l.AF().hF(localf.field_talker);
    if (locala != null)
    {
      localf.field_encryptTalker = locala.field_talker;
      localf.field_talker = locala.field_talker;
    }
    l.AE().a(localf);
    return null;
  }

  public final void d(ar paramar)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.u
 * JD-Core Version:    0.6.2
 */