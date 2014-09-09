package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class i
{
  private String Ks = "";
  private String Kt = "";
  private int cGN = -1;
  private String cHL = "";
  private String cOq = "";
  private String dkB = "";
  private String dnB = "";
  private String dsU = "";
  private long dsV = 0L;
  private String dsW = "";
  private String dsX = "";
  private String dsY = "";
  private String dsZ = "";
  private String dta = "";
  private String dtb = "";
  private int dtc = 0;
  public byte[] dtd;
  private String dte = "";
  private int dtf = 0;
  private String dtg = "";
  private int dth = 0;
  private String dti = "";
  private int dtj = 0;
  private int dtk = 0;
  private String dtl = "";
  private String dtm = "";
  private String dtn = "";
  private int dto = -1;
  private String dtp = "";
  private long dtq = -1L;
  private int dtr = -1;
  private String dts = "";
  private String dtt = "";
  private String dtu = "";
  private long dtv = 0L;
  private int id = 0;
  private int status = 0;
  private int type = 0;
  private String username = "";

  public static int fR(String paramString)
  {
    long l1 = 0L;
    try
    {
      long l2 = Long.parseLong(paramString.substring(0, 8), 16);
      l1 = l2;
      return (int)l1;
    }
    catch (Exception localException)
    {
      while (true)
        z.printErrStackTrace("!32@/B4Tb64lLpL3lTzROgXSiflgPRAWEmdi", localException, "md5: %s", new Object[] { paramString });
    }
  }

  private byte[] vt()
  {
    try
    {
      ad localad = new ad();
      localad.aNq();
      localad.AM(this.dte);
      localad.ot(this.dtf);
      localad.AM(this.Ks);
      localad.AM(this.Kt);
      localad.AM(this.dtg);
      localad.ot(this.dth);
      localad.AM(this.dti);
      localad.ot(this.dtj);
      localad.ot(this.dtk);
      localad.AM(this.dtl);
      localad.AM(this.dtm);
      localad.AM(this.dtn);
      localad.ot(this.dto);
      localad.AM(this.dtp);
      localad.cO(this.dtq);
      localad.ot(this.dtr);
      localad.AM(this.dts);
      localad.AM(this.dtt);
      localad.AM(this.dtu);
      localad.cO(this.dtv);
      byte[] arrayOfByte = localad.aNr();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final void F(long paramLong)
  {
    this.dsV = paramLong;
  }

  public final void G(long paramLong)
  {
    this.dtq = paramLong;
  }

  public final void H(long paramLong)
  {
    this.dtv = paramLong;
  }

  public final void aR(String paramString)
  {
    this.dti = paramString;
  }

  public final void b(Cursor paramCursor)
  {
    fS(paramCursor.getString(1));
    this.dsU = paramCursor.getString(2);
    this.dsV = paramCursor.getLong(3);
    this.dsW = paramCursor.getString(4);
    this.dsX = paramCursor.getString(5);
    this.dsY = paramCursor.getString(6);
    this.username = paramCursor.getString(7);
    this.dkB = paramCursor.getString(8);
    this.dsZ = paramCursor.getString(9);
    this.dta = paramCursor.getString(10);
    this.type = paramCursor.getInt(11);
    this.dtb = paramCursor.getString(12);
    this.cOq = paramCursor.getString(13);
    int i = paramCursor.getInt(14);
    if (i == 65536)
      this.status = 0;
    while (true)
    {
      this.dtc = paramCursor.getInt(17);
      this.dnB = paramCursor.getString(15);
      this.dtd = paramCursor.getBlob(19);
      byte[] arrayOfByte;
      if (!ch.B(this.dtd))
        arrayOfByte = this.dtd;
      try
      {
        ad localad = new ad();
        int j = localad.cQ(arrayOfByte);
        if (j != 0)
        {
          z.e("!32@/B4Tb64lLpL3lTzROgXSiflgPRAWEmdi", "parse LVBuffer error:" + j);
          return;
          this.status = i;
        }
        else
        {
          this.dte = localad.getString();
          this.dtf = localad.getInt();
          this.Ks = localad.getString();
          this.Kt = localad.getString();
          this.dtg = localad.getString();
          this.dth = localad.getInt();
          this.dti = localad.getString();
          this.dtj = localad.getInt();
          this.dtk = localad.getInt();
          this.dtl = localad.getString();
          this.dtm = localad.getString();
          this.dtn = localad.getString();
          this.dto = localad.getInt();
          this.dtp = localad.getString();
          this.dtq = localad.getLong();
          this.dtr = localad.getInt();
          this.dts = localad.getString();
          this.dtt = localad.getString();
          this.dtu = localad.getString();
          this.dtv = localad.getLong();
          return;
        }
      }
      catch (Exception localException)
      {
      }
    }
  }

  public final void bd(String paramString)
  {
    this.cOq = paramString;
  }

  public final void bh(String paramString)
  {
    this.dtg = paramString;
  }

  public final void bi(String paramString)
  {
    this.Ks = paramString;
  }

  public final void bj(int paramInt)
  {
    this.dtf = paramInt;
  }

  public final void bj(String paramString)
  {
    this.Kt = paramString;
  }

  public final void bo(int paramInt)
  {
    this.dth = paramInt;
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void dn(int paramInt)
  {
    this.dto = paramInt;
  }

  public final void jdMethod_do(int paramInt)
  {
    this.dtr = paramInt;
  }

  public final void dp(int paramInt)
  {
    this.dtj = paramInt;
  }

  public final void dq(int paramInt)
  {
    this.dtk = paramInt;
  }

  public final void fS(String paramString)
  {
    this.cHL = paramString;
    this.id = fR(paramString);
  }

  public final void fT(String paramString)
  {
    this.dsU = paramString;
  }

  public final void fU(String paramString)
  {
    this.dsW = paramString;
  }

  public final void fV(String paramString)
  {
    this.dsX = paramString;
  }

  public final void fW(String paramString)
  {
    this.dsY = paramString;
  }

  public final void fX(String paramString)
  {
    this.dkB = paramString;
  }

  public final void fY(String paramString)
  {
    this.dsZ = paramString;
  }

  public final void fZ(String paramString)
  {
    this.dta = paramString;
  }

  public final void ga(String paramString)
  {
    this.dtb = paramString;
  }

  public final void gb(String paramString)
  {
    this.dte = paramString;
  }

  public final void gc(String paramString)
  {
    this.dtn = paramString;
  }

  public final void gd(String paramString)
  {
    this.dtp = paramString;
  }

  public final void ge(String paramString)
  {
    this.dts = paramString;
  }

  public final String getCountry()
  {
    return this.dtm;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final int getType()
  {
    return this.type;
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final void gf(String paramString)
  {
    this.dtt = paramString;
  }

  public final void gg(String paramString)
  {
    this.dtu = paramString;
  }

  public final void gh(String paramString)
  {
    this.dtl = paramString;
  }

  public final void gi(String paramString)
  {
    this.dtm = paramString;
  }

  public final void gj(String paramString)
  {
    this.dnB = paramString;
  }

  public final String iS()
  {
    return this.dti;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("id", Integer.valueOf(this.id));
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("md5", vu());
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("peopleid", vv());
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("uploadtime", Long.valueOf(this.dsV));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("realname", vw());
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("realnamepyinitial", vx());
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("realnamequanpin", vy());
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("username", getUsername());
    if ((0x100 & this.cGN) != 0)
      localContentValues.put("nickname", vz());
    if ((0x200 & this.cGN) != 0)
      localContentValues.put("nicknamepyinitial", vA());
    if ((0x400 & this.cGN) != 0)
      localContentValues.put("nicknamequanpin", vB());
    if ((0x800 & this.cGN) != 0)
      localContentValues.put("type", Integer.valueOf(this.type));
    if ((0x1000 & this.cGN) != 0)
      localContentValues.put("moblie", vC());
    if ((0x2000 & this.cGN) != 0)
      localContentValues.put("email", vD());
    int i;
    if ((0x4000 & this.cGN) != 0)
    {
      i = this.status;
      if (i != 0)
        break label426;
      localContentValues.put("status", Integer.valueOf(65536));
    }
    while (true)
    {
      if ((0x8000 & this.cGN) != 0)
        localContentValues.put("reserved1", this.dnB);
      if ((0x20000 & this.cGN) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.dtc));
      if ((0x80000 & this.cGN) != 0)
      {
        this.dtd = vt();
        localContentValues.put("lvbuf", this.dtd);
      }
      return localContentValues;
      label426: localContentValues.put("status", Integer.valueOf(i));
    }
  }

  public final int jj()
  {
    return this.dtf;
  }

  public final String jo()
  {
    return this.dtg;
  }

  public final String jp()
  {
    return this.Ks;
  }

  public final String jq()
  {
    return this.Kt;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final void setType(int paramInt)
  {
    this.type = paramInt;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final String vA()
  {
    if (this.dsZ == null)
      return "";
    return this.dsZ;
  }

  public final String vB()
  {
    if (this.dta == null)
      return "";
    return this.dta;
  }

  public final String vC()
  {
    if (this.dtb == null)
      return "";
    return this.dtb;
  }

  public final String vD()
  {
    if (this.cOq == null)
      return "";
    return this.cOq;
  }

  public final void vE()
  {
    this.dtc = (0xFFFFFFFE & this.dtc);
  }

  public final void vF()
  {
    this.dtc = (0x1 | this.dtc);
  }

  public final boolean vG()
  {
    return (0x1 & this.dtc) == 0;
  }

  public final String vH()
  {
    return this.dte;
  }

  public final long vI()
  {
    return this.dtv;
  }

  public final String vJ()
  {
    return this.dnB;
  }

  public final String vu()
  {
    if (this.cHL == null)
      return "";
    return this.cHL;
  }

  public final String vv()
  {
    if (this.dsU == null)
      return "";
    return this.dsU;
  }

  public final String vw()
  {
    if (this.dsW == null)
      return "";
    return this.dsW;
  }

  public final String vx()
  {
    if (this.dsX == null)
      return "";
    return this.dsX;
  }

  public final String vy()
  {
    if (this.dsY == null)
      return "";
    return this.dsY;
  }

  public final String vz()
  {
    if (this.dkB == null)
      return "";
    return this.dkB;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.i
 * JD-Core Version:    0.6.2
 */