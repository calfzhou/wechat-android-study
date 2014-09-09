package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.a.xm;
import com.tencent.mm.protocal.a.xn;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import junit.framework.Assert;

public final class ap extends com.tencent.mm.o.x
  implements ab
{
  private long cDM = 0L;
  private ar cMM = null;
  private m dlH;
  private a dmI;
  private String dyk = "";
  private o dyq = new aq(this);
  private long startTime = 0L;

  public ap(long paramLong)
  {
    this.cDM = paramLong;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new xm());
    localb.b(new xn());
    localb.fi("/cgi-bin/micromsg-bin/sendappmsg");
    localb.de(222);
    localb.df(107);
    localb.dg(1000000107);
    this.dmI = localb.sU();
  }

  protected final int a(aj paramaj)
  {
    return com.tencent.mm.o.aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    if (this.startTime == 0L)
      this.startTime = ch.CM();
    this.cMM = bg.qW().oV().cV(this.cDM);
    if ((this.cMM == null) || (this.cMM.kk() != this.cDM))
      return -1;
    com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(this.cMM.getContent());
    if (localb1 == null);
    for (com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.iS(com.tencent.mm.storage.z.yW(this.cMM.getContent()).aIO()); ; localb2 = localb1)
    {
      String str1 = "content != null [[" + this.cMM.getContent() + "]]";
      if (localb2 != null);
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(str1, bool);
        if (localb2 != null)
          break;
        this.cMM = null;
        return -1;
      }
      if (!ch.jb(this.cMM.kp()));
      for (String str2 = com.tencent.mm.y.ap.yg().gR(this.cMM.kp()); ; str2 = "")
      {
        int i;
        if ((localb2.type == 8) || (localb2.type == 9) || (localb2.type == 6))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(localb2.type);
          com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra cdn not support Emoji or voiceremind now type:%d", arrayOfObject1);
          i = 0;
        }
        while (i != 0)
        {
          Object[] arrayOfObject3 = new Object[1];
          arrayOfObject3[0] = this.dyk;
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra use cdn return -1 for onGYNetEnd clientId:%s", arrayOfObject3);
          return 0;
          if (ch.jb(str2))
          {
            Object[] arrayOfObject8 = new Object[1];
            arrayOfObject8[0] = Integer.valueOf(localb2.type);
            com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra cdn not support no thumb msg type:%d", arrayOfObject8);
            i = 0;
          }
          else
          {
            int k = com.tencent.mm.a.c.ab(str2);
            if (k >= CdnTransportEngine.drH)
            {
              Object[] arrayOfObject7 = new Object[2];
              arrayOfObject7[0] = str2;
              arrayOfObject7[1] = Integer.valueOf(k);
              com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra thumb[%s][%d] Too Big Not Use CDN TRANS", arrayOfObject7);
              i = 0;
            }
            else if (!ch.jb(localb2.dQY))
            {
              Object[] arrayOfObject6 = new Object[1];
              arrayOfObject6[0] = Long.valueOf(this.cDM);
              com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra attach has been upload by cdn msgid:%d", arrayOfObject6);
              i = 0;
            }
            else
            {
              k.vl();
              if (!com.tencent.mm.modelcdntran.c.vf())
              {
                Object[] arrayOfObject5 = new Object[1];
                k.vl();
                arrayOfObject5[0] = Boolean.valueOf(com.tencent.mm.modelcdntran.c.vf());
                com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra not use cdn flag:%b ", arrayOfObject5);
                i = 0;
              }
              else
              {
                this.dyk = i.a("upappmsg", this.cMM.kn(), this.cMM.kt(), this.cMM.kk());
                if (ch.jb(this.dyk))
                {
                  Object[] arrayOfObject4 = new Object[1];
                  arrayOfObject4[0] = Long.valueOf(this.cMM.kk());
                  com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra genClientId failed not use cdn msgid:%d", arrayOfObject4);
                  i = 0;
                }
                else
                {
                  com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
                  localn.dsw = this.dyq;
                  localn.field_mediaId = this.dyk;
                  localn.field_fullpath = "";
                  localn.field_thumbpath = str2;
                  localn.field_fileType = CdnTransportEngine.dry;
                  localn.field_talker = this.cMM.kt();
                  localn.field_priority = CdnTransportEngine.dru;
                  localn.field_needStorage = false;
                  localn.field_isStreamMedia = false;
                  localn.dsw = this.dyq;
                  if (!k.vl().b(localn))
                  {
                    com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra addSendTask failed.");
                    this.dyk = "";
                    i = 0;
                  }
                  else
                  {
                    i = 1;
                  }
                }
              }
            }
          }
        }
        xm localxm = (xm)this.dmI.sO();
        com.tencent.mm.protocal.a.aa localaa = new com.tencent.mm.protocal.a.aa();
        localaa.hOd = localb2.appId;
        localaa.hPt = (this.cMM.kt() + this.cMM.kk() + "T" + this.cMM.kn());
        localaa.fxG = com.tencent.mm.ai.b.a(localb2, null, null, 0, 0);
        localaa.hOV = ((int)ch.CL());
        localaa.hPs = this.cMM.kt();
        localaa.hPq = com.tencent.mm.model.x.pG();
        localaa.ewb = localb2.type;
        localaa.hPr = localb2.sdkVer;
        localaa.hPv = localb2.dRa;
        if (!ch.jb(str2))
        {
          byte[] arrayOfByte = com.tencent.mm.a.c.a(str2, 0, -1);
          if (!ch.B(arrayOfByte))
            localaa.hPu = new ws().cl(arrayOfByte);
        }
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = str2;
        if (localaa.hPu != null);
        for (int j = localaa.hPu.aLK(); ; j = -1)
        {
          arrayOfObject2[1] = Integer.valueOf(j);
          com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "doScene thumbFile:[%s] thumbdata:%d", arrayOfObject2);
          localxm.irD = localaa;
          return a(paramr, this.dmI, this);
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.cMM.setStatus(5);
      bg.qW().oV().a(this.cMM.kk(), this.cMM);
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "send app msg failed, err=" + paramInt2 + "," + paramInt3);
      if (paramInt2 == 4)
      {
        com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject1 = new Object[7];
        arrayOfObject1[0] = Integer.valueOf(paramInt3);
        arrayOfObject1[1] = Integer.valueOf(1);
        arrayOfObject1[2] = Long.valueOf(this.startTime);
        arrayOfObject1[3] = Long.valueOf(ch.CM());
        arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.dry);
        arrayOfObject1[6] = Integer.valueOf(0);
        localn1.d(10420, arrayOfObject1);
      }
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    xn localxn = (xn)((a)paramaj).sP();
    xm localxm = (xm)((a)paramaj).sO();
    this.cMM.setStatus(2);
    this.cMM.p(localxn.hOY);
    bg.qW().oV().a(this.cMM.kk(), this.cMM);
    if (localxm.irD.hPu != null)
    {
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[7];
      arrayOfObject2[0] = Integer.valueOf(0);
      arrayOfObject2[1] = Integer.valueOf(1);
      arrayOfObject2[2] = Long.valueOf(this.startTime);
      arrayOfObject2[3] = Long.valueOf(ch.CM());
      arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.dry);
      arrayOfObject2[6] = Integer.valueOf(localxm.irD.hPu.aLK());
      localn2.d(10420, arrayOfObject2);
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 222;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ap
 * JD-Core Version:    0.6.2
 */