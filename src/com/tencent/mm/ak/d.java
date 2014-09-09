package com.tencent.mm.ak;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.protocal.a.fx;
import com.tencent.mm.protocal.a.fy;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Map;
import junit.framework.Assert;

public final class d extends com.tencent.mm.o.x
  implements ab
{
  private int cIm = 0;
  private q dFF = null;
  private boolean dFG = false;
  private com.tencent.mm.o.m dlH;
  private a dmI;
  private ay dmV = new ay(new f(this), false);
  private int dny = 0;
  private String dyk = "";
  private o dyq = new e(this);
  private String rI;
  private int startOffset = 0;
  private long startTime = 0L;

  public d(String paramString)
  {
    boolean bool = false;
    if (paramString != null)
      bool = true;
    Assert.assertTrue(bool);
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "NetSceneDownloadVideo:  file:" + paramString);
    this.rI = paramString;
  }

  public final int AJ()
  {
    return this.cIm;
  }

  protected final int a(aj paramaj)
  {
    fx localfx = (fx)((a)paramaj).sO();
    if ((localfx.hOY <= 0L) || (localfx.hUu < 0) || (localfx.hQk <= 0) || (localfx.hQk <= localfx.hUu))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: SECURITY CHECK FAILED [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      return aa.doN;
    }
    return aa.doM;
  }

  public final int a(com.tencent.mm.network.r paramr, com.tencent.mm.o.m paramm)
  {
    this.dlH = paramm;
    this.dFF = v.ij(this.rI);
    if (this.dFF == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: Get INFO FAILED :" + this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    if (this.startTime == 0L)
    {
      this.startTime = ch.CM();
      this.startOffset = this.dFF.AP();
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "parseVideoMsgXML content:" + this.dFF.AZ());
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(this.dFF.AZ(), "msg");
    int i;
    if (localMap == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra parse video recv xml failed");
      i = 0;
    }
    while (i != 0)
    {
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = this.rI;
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra use cdn return -1 for onGYNetEnd clientid:%s", arrayOfObject1);
      return 0;
      String str1 = (String)localMap.get(".msg.videomsg.$cdnvideourl");
      if (ch.jb(str1))
      {
        com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra parse video recv xml failed");
        i = 0;
      }
      else
      {
        String str2 = (String)localMap.get(".msg.videomsg.$aeskey");
        this.dny = Integer.valueOf((String)localMap.get(".msg.videomsg.$length")).intValue();
        this.dyk = i.a("downvideo", this.dFF.kn(), this.dFF.getUser(), this.dFF.getFileName());
        if (ch.jb(this.dyk))
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.dFF.getFileName();
          com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra genClientId failed not use cdn file:%s", arrayOfObject2);
          i = 0;
        }
        else
        {
          String str3 = m.AL().ib(this.rI) + ".tmp";
          com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
          localn.field_mediaId = this.dyk;
          localn.field_fullpath = str3;
          localn.field_fileType = CdnTransportEngine.drz;
          localn.field_totalLen = this.dny;
          localn.field_aesKey = str2;
          localn.field_fileId = str1;
          localn.field_priority = CdnTransportEngine.dru;
          localn.dsw = this.dyq;
          if (!com.tencent.mm.modelcdntran.k.vl().a(localn))
          {
            com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra addSendTask failed.");
            this.dyk = "";
            i = 0;
          }
          else
          {
            if (this.dFF.AY() != 1)
            {
              this.dFF.eM(1);
              this.dFF.db(524288);
              v.d(this.dFF);
            }
            i = 1;
          }
        }
      }
    }
    if (this.dFF.getStatus() != 112)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: STATUS: " + this.dFF.getStatus() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "]");
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "start doScene  [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "]  filesize:" + this.dFF.AP() + " file:" + this.dFF.sp() + " netTimes:" + this.dFF.AW());
    if (!v.ie(this.rI))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: NET TIMES: " + this.dFF.AW() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    if (this.dFF.kl() <= 0L)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: MSGSVRID: " + this.dFF.kl() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    if ((this.dFF.AP() < 0) || (this.dFF.sp() <= this.dFF.AP()) || (this.dFF.sp() <= 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: fileSize:" + this.dFF.AP() + " total:" + this.dFF.sp() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      return -1;
    }
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new fx());
    localb.b(new fy());
    localb.fi("/cgi-bin/micromsg-bin/downloadvideo");
    localb.de(150);
    localb.df(40);
    localb.dg(1000000040);
    this.dmI = localb.sU();
    fx localfx = (fx)this.dmI.sO();
    localfx.hOY = this.dFF.kl();
    localfx.hUu = this.dFF.AP();
    localfx.hQk = this.dFF.sp();
    if (bm.ab(ak.getContext()));
    for (int j = 1; ; j = 2)
    {
      localfx.hVF = j;
      return a(paramr, this.dmI, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if (this.dFG)
    {
      com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "onGYNetEnd Call Stop by Service  [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
      return;
    }
    fy localfy = (fy)((a)paramaj).sP();
    fx localfx = (fx)((a)paramaj).sO();
    this.dFF = v.ij(this.rI);
    if (this.dFF == null)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd Get INFO FAILED :" + this.rI);
      this.cIm = (-10000 + (0 - com.tencent.mm.compatible.g.k.nJ()));
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dFF.getStatus() == 113)
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "onGYNetEnd STATUS PAUSE [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dFF.getStatus() != 112)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd STATUS ERR: status:" + this.dFF.getStatus() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 == 4) && (paramInt3 != 0) && (paramInt3 != -13) && (paramInt3 != -6))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd SERVER FAILED errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[7];
      arrayOfObject2[0] = Integer.valueOf(paramInt3);
      arrayOfObject2[1] = Integer.valueOf(2);
      arrayOfObject2[2] = Long.valueOf(this.startTime);
      arrayOfObject2[3] = Long.valueOf(ch.CM());
      arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drz);
      arrayOfObject2[6] = Integer.valueOf(this.dny - this.startOffset);
      localn2.d(10420, arrayOfObject2);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd SERVER FAILED (SET PAUSE) errtype:" + paramInt2 + " errCode:" + paramInt3 + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dFF.setStatus(113);
      v.d(this.dFF);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (ch.B(localfy.hQi.aLL().getBytes()))
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd Recv BUF ZERO length  [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (localfy.hUu != localfx.hUu)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd OFFSET ERROR respStartPos:" + localfy.hUu + " reqStartPos:" + localfx.hUu + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (localfy.hQk != localfx.hQk)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd respTotal:" + localfy.hQk + " reqTotal:" + localfx.hQk + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (localfx.hQk < localfy.hUu)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd respTotal:" + localfy.hQk + " respStartPos:" + localfx.hUu + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (localfy.hOY != localfx.hOY)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd respMsgId:" + localfy.hOY + " reqMsgId:" + localfx.hOY + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    com.tencent.mm.sdk.platformtools.z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "onGYNetEnd respBuf:" + localfy.hQi.aLK() + " reqStartPos:" + localfx.hUu + " totallen:" + localfx.hQk + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
    int i = r.a(m.AL().ib(this.rI), localfx.hUu, localfy.hQi.aLL().toByteArray());
    if (i < 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd WRITEFILE RET:" + i + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (i > this.dFF.sp())
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd WRITEFILE newOffset:" + i + " totalLen:" + this.dFF.sp() + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      v.jdMethod_if(this.rI);
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    int j = v.r(this.rI, i);
    if (j < 0)
    {
      com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "ERR: onGYNetEnd updateAfterRecv Ret:" + j + " newOffset :" + i + " [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "] ");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (j == 1)
    {
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[7];
      arrayOfObject1[0] = Integer.valueOf(0);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Long.valueOf(this.startTime);
      arrayOfObject1[3] = Long.valueOf(ch.CM());
      arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.drz);
      arrayOfObject1[6] = Integer.valueOf(this.dny - this.startOffset);
      localn1.d(10420, arrayOfObject1);
      com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "!!!FIN [" + this.rI + "," + this.dFF.kl() + "," + this.dFF.AN() + "," + this.dFF.getUser() + "]");
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    if (this.dFG)
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dmV.cP(0L);
  }

  protected final void a(com.tencent.mm.o.z paramz)
  {
    v.jdMethod_if(this.rI);
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getType()
  {
    return 150;
  }

  protected final int sB()
  {
    return 2500;
  }

  public final void stop()
  {
    if (com.tencent.mm.modelcdntran.k.vl() != null)
      com.tencent.mm.modelcdntran.k.vl().fP(this.rI);
    this.dFG = true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.d
 * JD-Core Version:    0.6.2
 */