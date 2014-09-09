package com.tencent.mm.o;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.compatible.g.m;
import com.tencent.mm.model.bg;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.n;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.a;
import com.tencent.mm.protocal.a.td;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.p;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cm;
import com.tencent.mm.storage.d;
import junit.framework.Assert;

public abstract class v
  implements aj
{
  private p dov;
  private boolean dow = false;

  private static void a(p paramp)
  {
    paramp.fo(com.tencent.mm.compatible.c.v.nh());
    paramp.fn(a.hrg);
    paramp.dh(a.hrn);
    e locale = f.sX();
    if (locale == null);
    for (int i = 0; ; i = locale.oD())
    {
      paramp.bk(i);
      return;
    }
  }

  public final aj a(n paramn, PString paramPString)
  {
    z.d("!32@/B4Tb64lLpK7gMQeegHmy/7B7HWXYc5z", "build rr for autoauth, accInfo=" + paramn);
    Assert.assertNotNull("acc info should not be null", paramn);
    u localu = new u();
    com.tencent.mm.protocal.k localk = (com.tencent.mm.protocal.k)localu.tk();
    a(localk);
    boolean bool1 = ((Boolean)f.c(256, Boolean.valueOf(false))).booleanValue();
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Boolean.valueOf(bool1);
    z.d("!32@/B4Tb64lLpK7gMQeegHmy/7B7HWXYc5z", "dkwt Read forceManual :%b", arrayOfObject1);
    if (bool1)
      localk.di(1);
    e locale;
    while (true)
    {
      localk.hNq.inu = 0;
      locale = f.sX();
      if (locale != null)
        break;
      z.e("!32@/B4Tb64lLpK7gMQeegHmy/7B7HWXYc5z", "get auth rr failed, no available acc");
      return localu;
      localk.di(2);
    }
    if (paramn.oD() != locale.oD())
      z.w("!32@/B4Tb64lLpK7gMQeegHmy/7B7HWXYc5z", "different uin while building auth rr");
    String str1 = com.tencent.mm.sdk.platformtools.ch.ja((String)locale.cE(3));
    String str2 = com.tencent.mm.sdk.platformtools.ch.ja((String)locale.cE(2));
    int i = aw.fr(str2);
    com.tencent.mm.a.k localk1 = new com.tencent.mm.a.k(com.tencent.mm.sdk.platformtools.ch.a((Integer)locale.cE(9), 0));
    aw localaw = f.sY();
    long l2;
    boolean bool3;
    if ((i == 1) && (localk1.longValue() != 0L) && (localaw != null))
    {
      l2 = localk1.longValue();
      if (localk.tJ() == 1)
        bool3 = true;
    }
    for (byte[] arrayOfByte = localaw.a(l2, str1, bool3); ; arrayOfByte = null)
    {
      localk.hNq.hVf = new vt().wF(str2);
      label401: String str3;
      label645: Object[] arrayOfObject2;
      boolean bool2;
      if (com.tencent.mm.sdk.platformtools.ch.B(arrayOfByte))
      {
        localk.hNq.iem = new vt().wF(str1);
        localk.hNq.hRw = com.tencent.mm.sdk.platformtools.ch.ja((String)locale.cE(19));
        localk.hNq.inv = com.tencent.mm.sdk.platformtools.ch.ja((String)locale.cE(32));
        localk.hNq.inw = com.tencent.mm.sdk.platformtools.ch.ja((String)locale.cE(33));
        localk.hNq.eJu = com.tencent.mm.sdk.platformtools.ch.aHI();
        localk.hNq.eJv = y.aGW();
        localk.hNq.inx = com.tencent.mm.compatible.c.v.ng();
        localk.hNq.ien = new vt();
        localk.hNq.jdField_int = new vt();
        localk.hNq.hRC = new vt();
        localk.hNq.hRD = new ws().cl(com.tencent.mm.sdk.platformtools.ch.jg((String)locale.cE(47)));
        localk.hNq.hSn = a.hrh;
        localk.hNq.hSm = a.hri;
        localk.hNq.inA = a.hrj;
        localk.hNq.ieD = cm.aKL();
        paramn.e(str2, localk.hNq.iem.getString(), localk.hNq.hRw);
        localk.hNq.dtg = com.tencent.mm.sdk.platformtools.ch.bK(ak.getContext());
        td localtd = localk.hNq;
        paramn.oD();
        str3 = (String)bg.qP().get(32);
        if (com.tencent.mm.sdk.platformtools.ch.jb(str3))
          break label927;
        localtd.inC = str3;
        Long localLong = Long.valueOf(com.tencent.mm.sdk.platformtools.ch.a((Long)locale.cE(76), 0L));
        long l1 = System.currentTimeMillis() / 1000L;
        if (l1 - localLong.longValue() > 86400L)
        {
          localk.hNq.inB = com.tencent.mm.model.ch.rz();
          locale.N(Long.valueOf(l1));
        }
        arrayOfObject2 = new Object[8];
        arrayOfObject2[0] = str2;
        arrayOfObject2[1] = Integer.valueOf(i);
        if (localaw == null)
          break label955;
        bool2 = true;
        label750: arrayOfObject2[2] = Boolean.valueOf(bool2);
        arrayOfObject2[3] = localk1;
        if (arrayOfByte != null)
          break label961;
      }
      label927: label955: label961: for (int j = -1; ; j = arrayOfByte.length)
      {
        arrayOfObject2[4] = Integer.valueOf(j);
        arrayOfObject2[5] = localk.hNq.inC;
        arrayOfObject2[6] = localk.hNq.eJu;
        arrayOfObject2[7] = localk.hNq.eJv;
        z.i("!32@/B4Tb64lLpK7gMQeegHmy/7B7HWXYc5z", "dkwt autoauth username :%s nextauthtype:%d wtloginMgr:%b qq:%s loginBuf:%d aat:%s zone:%s lan:%s", arrayOfObject2);
        paramPString.value = localk.hNq.inC;
        return localu;
        bool3 = false;
        break;
        localk.hNq.inD = new ws().cl(arrayOfByte);
        localk.hNq.iem = new vt().wF("");
        localk.hNq.hRw = "";
        localk.hNq.inv = "";
        localk.hNq.inw = "";
        break label401;
        str3 = ak.getContext().getSharedPreferences("ticket_prefs", m.nN()).getString("_auth_ticket", "");
        break label645;
        bool2 = false;
        break label750;
      }
    }
  }

  protected abstract p sR();

  public final p tk()
  {
    if (this.dov == null)
    {
      this.dov = sR();
      a(this.dov);
    }
    return this.dov;
  }

  public int tl()
  {
    return 0;
  }

  public final boolean tm()
  {
    return this.dow;
  }

  public final void tn()
  {
    this.dow = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.v
 * JD-Core Version:    0.6.2
 */