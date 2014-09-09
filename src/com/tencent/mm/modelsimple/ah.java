package com.tencent.mm.modelsimple;

import com.tencent.mm.c.a.jb;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.w;
import com.tencent.mm.modelvoice.bm;
import com.tencent.mm.modelvoice.br;
import com.tencent.mm.modelvoice.cb;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.m;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.protocal.a.wp;
import com.tencent.mm.protocal.a.wq;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.n;

public final class ah extends com.tencent.mm.o.x
  implements ab
{
  private final long cDM;
  private final String dCW;
  private m dlH;
  private final com.tencent.mm.o.a dsx;

  public ah(ar paramar, String paramString)
  {
    Object localObject1 = bg.qW().oQ().get(290818, Integer.valueOf(0));
    int i = 0;
    if (localObject1 != null);
    try
    {
      int i1 = Integer.parseInt(localObject1.toString());
      i = i1;
      j = i;
      this.cDM = paramar.kk();
      this.dCW = paramString;
      int k = (int)(paramar.kn() / 1000L);
      long l = paramar.kl();
      String str1 = com.tencent.mm.model.x.pG();
      String str2 = paramar.kt();
      if (paramar.kD() != 1);
      switch (paramar.getType())
      {
      default:
        localObject2 = null;
        m = 0;
        com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
        localb.a(new wp());
        localb.b(new wq());
        localb.fi("/cgi-bin/micromsg-bin/revokemsg");
        localb.de(594);
        localb.df(0);
        localb.dg(0);
        this.dsx = localb.sU();
        wp localwp = (wp)this.dsx.sO();
        localwp.hPt = localObject2;
        localwp.irc = m;
        localwp.ird = 0;
        localwp.irf = l;
        localwp.hOV = k;
        localwp.hPq = str1;
        localwp.hPs = str2;
        localwp.ire = j;
        Object[] arrayOfObject1 = new Object[7];
        arrayOfObject1[0] = localwp.hPt;
        arrayOfObject1[1] = Integer.valueOf(localwp.irc);
        arrayOfObject1[2] = Integer.valueOf(localwp.ird);
        arrayOfObject1[3] = Integer.valueOf(localwp.hOV);
        arrayOfObject1[4] = localwp.hPq;
        arrayOfObject1[5] = localwp.hPs;
        arrayOfObject1[6] = Integer.valueOf(localwp.ire);
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][NetSceneRevokeMsg]:clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", arrayOfObject1);
        return;
      case 1:
      case 42:
      case 48:
      case 34:
      case 43:
      case 62:
      case 3:
      case 47:
      case 49:
      case 1048625:
      case 268435505:
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int j = 0;
        continue;
        int n = w.a(com.tencent.mm.model.x.pG(), paramar.kn()).hashCode();
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = Integer.valueOf(n);
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:text,newClientMsgId:%d", arrayOfObject3);
        int m = n;
        Object localObject2 = null;
        continue;
        br localbr = bm.BD().iG(paramar.kp());
        if (localbr != null)
        {
          String str7 = localbr.BN();
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:voice,clientMsgId:%s", new Object[] { str7 });
          localObject2 = str7;
          m = 0;
          continue;
          String str6 = paramar.kp();
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:video,clientMsgId:%s", new Object[] { str6 });
          localObject2 = str6;
          m = 0;
          continue;
          l locall = ap.yg().T(paramar.kk());
          String str5 = paramar.kK();
          Object[] arrayOfObject2 = new Object[4];
          arrayOfObject2[0] = paramar.kt();
          arrayOfObject2[1] = Integer.valueOf(locall.xP());
          arrayOfObject2[2] = Long.valueOf(locall.xM());
          arrayOfObject2[3] = str5;
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:img,talker:%s,hdId:%s,localId:%s,clientMsgId:%s", arrayOfObject2);
          localObject2 = str5;
          m = 0;
          continue;
          String str4 = String.valueOf(com.tencent.mm.storage.z.yW(paramar.getContent()).getTime());
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:emoji,clientMsgId:%s", new Object[] { str4 });
          localObject2 = str4;
          m = 0;
          continue;
          String str3 = bf.GP().co(paramar.kk()).field_clientAppDataId;
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSendRevokeMsg] type:app msg/emoji/img,clientMsgId:%s", new Object[] { str3 });
          localObject2 = str3;
          m = 0;
        }
      }
    }
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dsx, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object localObject;
    int i;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ar localar = bg.qW().oV().cV(this.cDM);
      if (localar.kk() != this.cDM)
        break label258;
      wq localwq = zE();
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(localar.kk());
      arrayOfObject2[1] = Long.valueOf(localar.kl());
      arrayOfObject2[2] = localwq.irh;
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "[oneliang][doSceneEnd.revokeMsg] msgId:%s,msgSvrId:%s,responseSysWording:%s", arrayOfObject2);
      localar.setContent(this.dCW);
      localar.setType(10000);
      localar.bv(0);
      localar.bI(0x4 | localar.ky());
      jb localjb = new jb();
      localjb.cNm.cDM = this.cDM;
      com.tencent.mm.sdk.c.a.aGB().g(localjb);
      bg.qW().oV().a(localar.kk(), localar);
      localObject = bg.qW().oQ().get(290818, Integer.valueOf(0));
      i = 0;
      if (localObject == null);
    }
    while (true)
    {
      try
      {
        int k = Integer.parseInt(localObject.toString());
        i = k;
        int j = i + 1;
        bg.qW().oQ().set(290818, Integer.valueOf(j));
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      catch (Exception localException)
      {
        i = 0;
        continue;
      }
      label258: Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(this.cDM);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvqDmdAuPEb3JgfjdtDBOuzg=", "cannot find the msg:%d after revoke.", arrayOfObject1);
    }
  }

  public final int getType()
  {
    return 594;
  }

  public final wq zE()
  {
    return (wq)this.dsx.sP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.ah
 * JD-Core Version:    0.6.2
 */