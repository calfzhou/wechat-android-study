package com.tencent.mm.model;

import com.tencent.mm.platformtools.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.s;

final class bq
  implements q
{
  bq(bg parambg)
  {
  }

  public final void a(o paramo, i parami)
  {
    String str = parami.getUsername();
    if (i.yc(parami.getUsername()))
      parami.setUsername(i.ye(parami.getUsername()));
    if (ch.jb(parami.iW()))
      parami.aV(f.jw(parami.iV()));
    if (ch.jb(parami.iX()))
      parami.aW(f.jv(parami.iV()));
    if (ch.jb(parami.jh()))
      parami.ba(f.jw(parami.ja()));
    if (ch.jb(parami.jg()))
      parami.aZ(f.jv(parami.ja()));
    if (y.a(parami))
    {
      parami.be(43);
      parami.aV(f.jw(parami.oc()));
      parami.aW(f.jv(parami.oc()));
      parami.aZ(f.jv(parami.od()));
      parami.ba(parami.od());
      return;
    }
    ap localap;
    if (y.dP(str))
    {
      parami.oz();
      parami.bi(4);
      parami.be(33);
      localap = bg.g(this.dlm);
      if (localap != null)
        if (parami != null)
          break label388;
    }
    label388: for (i locali = new i(); ; locali = parami)
    {
      locali.setUsername(str);
      locali.oz();
      aq localaq = localap.a(str, ak.getContext());
      if (localaq != null)
      {
        locali.aU(localaq.dkB);
        locali.aV(localaq.dkA);
        locali.aW(localaq.dkC);
        locali.tD();
      }
      if (parami.zV())
        parami.be(parami.ox());
      if (y.dG(str))
      {
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(31);
        z.i("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "update official account helper showhead %d", arrayOfObject2);
        parami.be(31);
      }
      if (parami.xI())
        bg.qW().oW().c(new String[] { str }, "@blacklist");
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = parami.getUsername();
      arrayOfObject1[1] = parami.iW();
      z.d("!24@/B4Tb64lLpKk+n5Gbwo3Rw==", "onPreInsertContact2: %s, %s", arrayOfObject1);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bq
 * JD-Core Version:    0.6.2
 */