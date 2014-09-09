package com.tencent.mm.y;

import com.tencent.mm.a.f;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.mg;
import com.tencent.mm.protocal.a.mh;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.e;
import java.io.File;
import java.util.Map;
import junit.framework.Assert;

public final class ac extends com.tencent.mm.o.x
  implements ab
{
  private String TAG = "!44@/B4Tb64lLpK+IBX8XDgnvq5YCi4zR2oeswdjTNvYmx0=";
  private ar cCp = null;
  private long cDM = -1L;
  private int dSs = -1;
  private m dlH;
  private final a dmI;
  private int dny = 0;
  private long dsz;
  private final com.tencent.mm.o.n dyf;
  private final long dyg;
  private int dyh;
  private int dyi;
  private com.tencent.mm.modelstat.c dyj = null;
  private String dyk = "";
  private int dyl = 0;
  private String dym = "";
  private String dyn = "";
  private int dyo = -1;
  private boolean dyp = false;
  private o dyq = new ae(this);
  private int startOffset = -1;
  private long startTime = 0L;
  private int token = -1;

  public ac(long paramLong1, long paramLong2, int paramInt, com.tencent.mm.o.n paramn)
  {
    this(paramLong1, paramLong2, paramInt, paramn, -1);
  }

  public ac(long paramLong1, long paramLong2, int paramInt1, com.tencent.mm.o.n paramn, int paramInt2)
  {
    boolean bool;
    l locall1;
    if ((paramLong1 >= 0L) && (paramLong2 >= 0L) && (paramn != null))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.dyf = paramn;
      this.dyi = paramInt1;
      this.dyg = paramLong1;
      this.dsz = paramLong1;
      this.cDM = paramLong2;
      this.dSs = paramInt2;
      locall1 = ap.yg().Q(this.dsz);
      if (paramInt1 != 1)
        break label540;
      this.dsz = locall1.xP();
    }
    label540: for (l locall2 = ap.yg().Q(this.dsz); ; locall2 = locall1)
    {
      this.TAG = (this.TAG + "[" + this.dsz + "]");
      com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
      localb.a(new mg());
      localb.b(new mh());
      localb.fi("/cgi-bin/micromsg-bin/getmsgimg");
      localb.de(109);
      localb.df(10);
      localb.dg(1000000010);
      this.dmI = localb.sU();
      mg localmg = (mg)this.dmI.sO();
      this.cCp = bg.qW().oV().cV(paramLong2);
      localmg.hUu = locall2.getOffset();
      localmg.hQk = locall2.sp();
      String str = this.TAG;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(locall2.getOffset());
      arrayOfObject[1] = Integer.valueOf(locall2.sp());
      arrayOfObject[2] = ch.aHN();
      z.d(str, "cdntra offset:%d total:%d stack:[%s]", arrayOfObject);
      localmg.hOY = this.cCp.kl();
      localmg.hOP = new vt().wF(this.cCp.kt());
      localmg.hOQ = new vt().wF((String)bg.qW().oQ().get(2));
      localmg.icN = paramInt1;
      if (locall2.getOffset() == 0)
        this.dyj = new com.tencent.mm.modelstat.c(109, false, locall2.sp());
      this.dyh = 8192;
      if (paramn != null)
        am.h(new ad(this, paramn, locall2.getOffset(), locall2.sp()));
      return;
      bool = false;
      break;
    }
  }

  private boolean a(l paraml, int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    paraml.cZ(paramInt1);
    paraml.setOffset(paramInt2 + paramInt3);
    this.dyh = paramInt3;
    if (ap.yg().a(this.dsz, paraml) < 0)
    {
      z.e(this.TAG, "onGYNetEnd : update img fail");
      this.dlH.a(3, -1, "", this);
      return false;
    }
    if (paramArrayOfByte != null)
      com.tencent.mm.a.c.a(this.dyn, paramArrayOfByte);
    String str1 = this.TAG;
    String str2 = "onGYNetEnd : offset = " + paraml.getOffset() + " totalLen = " + paraml.sp() + " stack:[%s]";
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = ch.aHN();
    z.d(str1, str2, arrayOfObject1);
    if (this.dyf != null)
      am.h(new af(this, paraml));
    String str3 = this.TAG;
    Object[] arrayOfObject2 = new Object[2];
    arrayOfObject2[0] = Boolean.valueOf(paraml.xQ());
    arrayOfObject2[1] = this.dyk;
    z.d(str3, "cdntra check iscompleted :%b clientid:%s", arrayOfObject2);
    String str4;
    String str5;
    if (paraml.xQ())
    {
      if (ch.jb(this.dyk))
      {
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject5 = new Object[7];
        arrayOfObject5[0] = Integer.valueOf(0);
        arrayOfObject5[1] = Integer.valueOf(2);
        arrayOfObject5[2] = Long.valueOf(this.startTime);
        arrayOfObject5[3] = Long.valueOf(ch.CM());
        arrayOfObject5[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject5[5] = Integer.valueOf(this.dyl);
        arrayOfObject5[6] = Integer.valueOf(paramInt1 - this.startOffset);
        localn.d(10420, arrayOfObject5);
      }
      str4 = this.dyn;
      if ((str4 == null) || (str4.equals("")))
        str5 = null;
    }
    while (true)
    {
      String str6 = ap.yg().f(this.dym, null, str5);
      String str7 = this.TAG;
      Object[] arrayOfObject3 = new Object[4];
      arrayOfObject3[0] = str5;
      arrayOfObject3[1] = this.dym;
      arrayOfObject3[2] = this.dyn;
      arrayOfObject3[3] = str6;
      z.i(str7, "sceneEndproc ext:%s tmp:%s tmpfull:%s full:%s ", arrayOfObject3);
      new File(this.dyn).renameTo(new File(str6));
      paraml.gM(this.dym + str5);
      int i = this.dyo;
      boolean bool = false;
      if (i > 0)
        bool = ap.yg().a(str6, paraml.xO(), this.dyo, 1);
      if (bool)
      {
        paraml.bM(1);
        bg.qW().oV().a(this.cCp.kk(), this.cCp);
      }
      ap.yg().a(this.dsz, paraml);
      String str8 = this.TAG;
      Object[] arrayOfObject4 = new Object[4];
      arrayOfObject4[0] = str5;
      arrayOfObject4[1] = this.dyn;
      arrayOfObject4[2] = str6;
      arrayOfObject4[3] = paraml.xN();
      z.d(str8, "cdntra ext:[%s] tmp:[%s] full:[%s] bigimg:[%s]", arrayOfObject4);
      if (this.dyj != null)
        this.dyj.U(paraml.sp());
      this.dlH.a(0, 0, "", this);
      return false;
      byte[] arrayOfByte = com.tencent.mm.a.c.a(str4, 0, 2);
      if ((arrayOfByte == null) || (arrayOfByte.length < 2))
      {
        str5 = null;
      }
      else
      {
        int j = arrayOfByte[0];
        if (j < 0)
          j += 256;
        int k = arrayOfByte[1];
        if (k < 0)
          k += 256;
        if ((j == 66) && (k == 77))
        {
          str5 = ".bmp";
        }
        else if ((j == 255) && (k == 216))
        {
          str5 = ".jpg";
        }
        else if ((j == 137) && (k == 80))
        {
          str5 = ".png";
        }
        else if ((j == 71) && (k == 73))
        {
          str5 = ".gif";
          continue;
          return true;
        }
        else
        {
          str5 = ".jpg";
        }
      }
    }
  }

  public final String CI()
  {
    return this.dyn;
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    mg localmg = (mg)this.dmI.sO();
    l locall = ap.yg().Q(this.dsz);
    if (locall.getStatus() != 0)
    {
      String str12 = this.TAG;
      Object[] arrayOfObject8 = new Object[2];
      arrayOfObject8[0] = Long.valueOf(locall.xM());
      arrayOfObject8[1] = Integer.valueOf(locall.getStatus());
      z.e(str12, "doSceneError, id:%d, status:%d", arrayOfObject8);
      return -1;
    }
    String str1 = locall.xN();
    int j;
    label307: int i;
    if (str1.startsWith("SERVERID://"))
    {
      this.dym = f.d(locall.xN().getBytes());
      this.dyn = ap.yg().f(this.dym, null, ".temp");
      locall.gM(this.dym + ".temp");
      ap.yg().a(this.dsz, locall);
      String str2 = this.TAG;
      Object[] arrayOfObject1 = new Object[7];
      arrayOfObject1[0] = Long.valueOf(locall.xM());
      arrayOfObject1[1] = Integer.valueOf(this.dyi);
      arrayOfObject1[2] = Integer.valueOf(locall.getOffset());
      arrayOfObject1[3] = Integer.valueOf(locall.sp());
      arrayOfObject1[4] = str1;
      arrayOfObject1[5] = this.dym;
      arrayOfObject1[6] = this.dyn;
      z.i(str2, "doscene id:%d comp:%d off:%d total:%d name:%s tmp:%s full:%s", arrayOfObject1);
      if (this.startTime == 0L)
      {
        this.startTime = ch.CM();
        this.startOffset = locall.getOffset();
        if (this.dyi != 1)
          break label406;
        j = CdnTransportEngine.drw;
        this.dyl = j;
      }
      localmg.hOP.getString();
      if (!ch.jb(locall.xS()))
        break label414;
      i = 0;
    }
    while (true)
    {
      if (i == 0)
        break label919;
      String str7 = this.TAG;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = this.dyk;
      z.d(str7, "cdntra this img use cdn : %s", arrayOfObject4);
      return 0;
      this.dym = locall.xN();
      this.dyn = ap.yg().f(this.dym, null, "");
      break;
      label406: j = CdnTransportEngine.drx;
      break label307;
      label414: Map localMap = com.tencent.mm.sdk.platformtools.x.bB(locall.xS(), "msg");
      if (localMap == null)
      {
        String str11 = this.TAG;
        Object[] arrayOfObject7 = new Object[1];
        arrayOfObject7[0] = locall.xS();
        z.e(str11, "parse cdnInfo failed. [%s]", arrayOfObject7);
        i = 0;
      }
      else
      {
        this.dny = 0;
        String str10;
        if (this.dyi != 1)
        {
          str10 = (String)localMap.get(".msg.img.$cdnmidimgurl");
          this.dny = ch.getInt((String)localMap.get(".msg.img.$length"), 0);
        }
        String str3;
        for (Object localObject = str10; ; localObject = str3)
        {
          String str4 = this.TAG;
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = Integer.valueOf(this.dyi);
          arrayOfObject2[1] = Integer.valueOf(this.dny);
          arrayOfObject2[2] = localObject;
          z.d(str4, "cdntra read xml  comptype:%d totallen:%d url:[%s]", arrayOfObject2);
          if (!ch.jb((String)localObject))
            break label639;
          z.e(this.TAG, "cdntra get cdnUrlfailed.");
          i = 0;
          break;
          str3 = (String)localMap.get(".msg.img.$cdnbigimgurl");
          this.dny = ch.getInt((String)localMap.get(".msg.img.$hdlength"), 0);
        }
        label639: String str5 = (String)localMap.get(".msg.img.$aeskey");
        if (ch.jb(str5))
        {
          z.e(this.TAG, "cdntra get aes key failed.");
          i = 0;
        }
        else
        {
          this.dyk = i.a("downimg", locall.xK(), this.cCp.kt(), this.cCp.kk());
          if (ch.jb(this.dyk))
          {
            String str9 = this.TAG;
            Object[] arrayOfObject6 = new Object[1];
            arrayOfObject6[0] = Long.valueOf(this.dsz);
            z.w(str9, "cdntra genClientId failed not use cdn imgLocalId:%d", arrayOfObject6);
            i = 0;
          }
          else
          {
            com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
            localn.field_mediaId = this.dyk;
            localn.field_fullpath = this.dyn;
            localn.field_fileType = this.dyl;
            localn.field_totalLen = this.dny;
            localn.field_aesKey = str5;
            localn.field_fileId = ((String)localObject);
            localn.field_priority = CdnTransportEngine.dru;
            localn.dsw = this.dyq;
            if (!k.vl().a(localn, this.dSs))
            {
              String str8 = this.TAG;
              Object[] arrayOfObject5 = new Object[1];
              arrayOfObject5[0] = this.dyk;
              z.e(str8, "addRecvTask failed :%s", arrayOfObject5);
              this.dyk = "";
              i = 0;
            }
            else
            {
              z.d(this.TAG, "add recv task");
              i = 1;
            }
          }
        }
      }
    }
    label919: String str6 = this.TAG;
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = this.dyk;
    z.d(str6, "cdntra this img NOT USE CDN: %s", arrayOfObject3);
    locall.gO("");
    locall.db(4096);
    ap.yg().a(this.dsz, locall);
    localmg.hUu = locall.getOffset();
    localmg.hQs = this.dyh;
    localmg.hQk = locall.sp();
    if (this.dyj != null)
      this.dyj.zS();
    return a(paramr, this.dmI, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 3) && (paramInt3 == -1) && (!ch.jb(this.dyk)))
    {
      String str = this.TAG;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.dyk;
      z.w(str, "cdntra using cdn trans,  wait cdn service callback! clientid:%s", arrayOfObject3);
    }
    mh localmh;
    l locall;
    do
    {
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        if (paramInt2 == 4)
        {
          com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject1 = new Object[7];
          arrayOfObject1[0] = Integer.valueOf(paramInt3);
          arrayOfObject1[1] = Integer.valueOf(2);
          arrayOfObject1[2] = Long.valueOf(this.startTime);
          arrayOfObject1[3] = Long.valueOf(ch.CM());
          arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
          arrayOfObject1[5] = Integer.valueOf(this.dyl);
          arrayOfObject1[6] = Integer.valueOf(this.dny - this.startOffset);
          localn1.d(10420, arrayOfObject1);
        }
        this.dlH.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      localmh = (mh)((a)paramaj).sP();
      locall = ap.yg().Q(this.dsz);
      int i;
      if (localmh.hQs <= 0)
      {
        z.e(this.TAG, "flood control, malformed data_len");
        i = -1;
      }
      while (i != 0)
      {
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[7];
        arrayOfObject2[0] = Integer.valueOf(-1);
        arrayOfObject2[1] = Integer.valueOf(2);
        arrayOfObject2[2] = Long.valueOf(this.startTime);
        arrayOfObject2[3] = Long.valueOf(ch.CM());
        arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject2[5] = Integer.valueOf(this.dyl);
        arrayOfObject2[6] = Integer.valueOf(this.dny - this.startOffset);
        localn2.d(10420, arrayOfObject2);
        this.dlH.a(4, -1, "", this);
        return;
        if ((localmh.hQi == null) || (localmh.hQs != localmh.hQi.aLK()))
        {
          z.e(this.TAG, "flood control, malformed data is null or dataLen not match with data buf length");
          i = -1;
        }
        else if ((localmh.hUu < 0) || (localmh.hUu + localmh.hQs > localmh.hQk))
        {
          z.e(this.TAG, "flood control, malformed start pos");
          i = -1;
        }
        else if (localmh.hUu != locall.getOffset())
        {
          z.e(this.TAG, "flood control, malformed start_pos");
          i = -1;
        }
        else
        {
          int j = localmh.hQk;
          i = 0;
          if (j <= 0)
          {
            z.e(this.TAG, "flood control, malformed total_len");
            i = -1;
          }
        }
      }
    }
    while ((!a(locall, localmh.hQk, localmh.hUu, localmh.hQs, localmh.hQi.aLL().getBytes())) || (a(tp(), this.dlH) >= 0));
    this.dlH.a(3, -1, "", this);
  }

  protected final void cancel()
  {
    if ((!ch.jb(this.dyk)) && (k.vl() != null))
    {
      z.d(this.TAG, "cancel recv task");
      k.vl().fP(this.dyk);
    }
    super.cancel();
  }

  public final void dO(int paramInt)
  {
    this.dyo = paramInt;
  }

  public final int getType()
  {
    return 109;
  }

  protected final int sB()
  {
    if (this.dyi == 0)
      return 100;
    return 1280;
  }

  public final boolean xZ()
  {
    return this.dyp;
  }

  public final long ya()
  {
    return this.dyg;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ac
 * JD-Core Version:    0.6.2
 */