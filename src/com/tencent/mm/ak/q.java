package com.tencent.mm.ak;

import android.content.ContentValues;
import android.database.Cursor;

public final class q
{
  private int cGN = -1;
  private String dBh = "";
  private String dFB = "";
  private int dFM = 0;
  private String dFV = "";
  private int dFX = 0;
  private int dFY = 0;
  private int dFZ = 0;
  private long dGa = 0L;
  private long dGb = 0L;
  private long dGc = 0L;
  private int dGd = 0;
  private int dGe = 0;
  private int dGf = 0;
  private int dGg = 0;
  private int dGh = 0;
  private int dGi = 0;
  private String dGj = "";
  private int dSL = 0;
  private int dny = 0;
  private long dxj = 0L;
  private String rI = "";
  private int status = 0;
  private String user = "";

  public final String AN()
  {
    if (this.dFV == null)
      return "";
    return this.dFV;
  }

  public final int AO()
  {
    return this.dFM;
  }

  public final int AP()
  {
    return this.dFX;
  }

  public final int AQ()
  {
    return this.dFY;
  }

  public final int AR()
  {
    return this.dFZ;
  }

  public final long AS()
  {
    return this.dGb;
  }

  public final long AT()
  {
    return this.dGc;
  }

  public final int AU()
  {
    return this.dGd;
  }

  public final int AV()
  {
    return this.dGe;
  }

  public final int AW()
  {
    return this.dGf;
  }

  public final int AX()
  {
    return this.dGh;
  }

  public final int AY()
  {
    return this.dGi;
  }

  public final String AZ()
  {
    if (this.dGj == null)
      return "";
    return this.dGj;
  }

  public final int CP()
  {
    return this.dSL;
  }

  public final void V(long paramLong)
  {
    this.dGb = paramLong;
  }

  public final void W(long paramLong)
  {
    this.dGc = paramLong;
  }

  public final void b(Cursor paramCursor)
  {
    this.rI = paramCursor.getString(0);
    this.dBh = paramCursor.getString(1);
    this.dxj = paramCursor.getLong(2);
    this.dFM = paramCursor.getInt(3);
    this.dFX = paramCursor.getInt(4);
    this.dny = paramCursor.getInt(5);
    this.dFY = paramCursor.getInt(6);
    this.dFZ = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.dGa = paramCursor.getLong(9);
    this.dGb = paramCursor.getLong(10);
    this.dGc = paramCursor.getLong(11);
    this.dGd = paramCursor.getInt(12);
    this.dGe = paramCursor.getInt(13);
    this.dGf = paramCursor.getInt(14);
    this.dGg = paramCursor.getInt(15);
    this.user = paramCursor.getString(16);
    this.dFV = paramCursor.getString(17);
    this.dGh = paramCursor.getInt(18);
    this.dGi = paramCursor.getInt(19);
    this.dFB = paramCursor.getString(20);
    this.dGj = paramCursor.getString(21);
    this.dSL = paramCursor.getInt(22);
  }

  public final void cZ(int paramInt)
  {
    this.dny = paramInt;
  }

  public final void dP(int paramInt)
  {
    this.dGf = paramInt;
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void eF(int paramInt)
  {
    this.dFM = paramInt;
  }

  public final void eG(int paramInt)
  {
    this.dFX = paramInt;
  }

  public final void eH(int paramInt)
  {
    this.dFY = paramInt;
  }

  public final void eI(int paramInt)
  {
    this.dFZ = paramInt;
  }

  public final void eJ(int paramInt)
  {
    this.dGd = paramInt;
  }

  public final void eK(int paramInt)
  {
    this.dGe = paramInt;
  }

  public final void eL(int paramInt)
  {
    this.dGh = paramInt;
  }

  public final void eM(int paramInt)
  {
    this.dGi = 1;
  }

  public final void ep(int paramInt)
  {
    this.dSL = paramInt;
  }

  public final String getFileName()
  {
    if (this.rI == null)
      return "";
    return this.rI;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final String getUser()
  {
    if (this.user == null)
      return "";
    return this.user;
  }

  public final void hT(String paramString)
  {
    this.rI = paramString;
  }

  public final void hU(String paramString)
  {
    this.dFV = paramString;
  }

  public final void hV(String paramString)
  {
    this.dFB = paramString;
  }

  public final void hW(String paramString)
  {
    this.dGj = paramString;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("filename", getFileName());
    String str2;
    if ((0x2 & this.cGN) != 0)
    {
      if (this.dBh == null)
      {
        str2 = "";
        localContentValues.put("clientid", str2);
      }
    }
    else
    {
      if ((0x4 & this.cGN) != 0)
        localContentValues.put("msgsvrid", Long.valueOf(this.dxj));
      if ((0x8 & this.cGN) != 0)
        localContentValues.put("netoffset", Integer.valueOf(this.dFM));
      if ((0x10 & this.cGN) != 0)
        localContentValues.put("filenowsize", Integer.valueOf(this.dFX));
      if ((0x20 & this.cGN) != 0)
        localContentValues.put("totallen", Integer.valueOf(this.dny));
      if ((0x40 & this.cGN) != 0)
        localContentValues.put("thumbnetoffset", Integer.valueOf(this.dFY));
      if ((0x80 & this.cGN) != 0)
        localContentValues.put("thumblen", Integer.valueOf(this.dFZ));
      if ((0x100 & this.cGN) != 0)
        localContentValues.put("status", Integer.valueOf(this.status));
      if ((0x200 & this.cGN) != 0)
        localContentValues.put("createtime", Long.valueOf(this.dGa));
      if ((0x400 & this.cGN) != 0)
        localContentValues.put("lastmodifytime", Long.valueOf(this.dGb));
      if ((0x800 & this.cGN) != 0)
        localContentValues.put("downloadtime", Long.valueOf(this.dGc));
      if ((0x1000 & this.cGN) != 0)
        localContentValues.put("videolength", Integer.valueOf(this.dGd));
      if ((0x2000 & this.cGN) != 0)
        localContentValues.put("msglocalid", Integer.valueOf(this.dGe));
      if ((0x4000 & this.cGN) != 0)
        localContentValues.put("nettimes", Integer.valueOf(this.dGf));
      if ((0x8000 & this.cGN) != 0)
        localContentValues.put("cameratype", Integer.valueOf(this.dGg));
      if ((0x10000 & this.cGN) != 0)
        localContentValues.put("user", getUser());
      if ((0x20000 & this.cGN) != 0)
        localContentValues.put("human", AN());
      if ((0x40000 & this.cGN) != 0)
        localContentValues.put("reserved1", Integer.valueOf(this.dGh));
      if ((0x80000 & this.cGN) != 0)
        localContentValues.put("reserved2", Integer.valueOf(this.dGi));
      if ((0x100000 & this.cGN) != 0)
        if (this.dFB != null)
          break label548;
    }
    label548: for (String str1 = ""; ; str1 = this.dFB)
    {
      localContentValues.put("reserved3", str1);
      if ((0x200000 & this.cGN) != 0)
        localContentValues.put("reserved4", AZ());
      if ((0x400000 & this.cGN) != 0)
        localContentValues.put("videofuncflag", Integer.valueOf(this.dSL));
      return localContentValues;
      str2 = this.dBh;
      break;
    }
  }

  public final long kl()
  {
    return this.dxj;
  }

  public final long kn()
  {
    return this.dGa;
  }

  public final void p(long paramLong)
  {
    this.dxj = paramLong;
  }

  public final void q(long paramLong)
  {
    this.dGa = paramLong;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final void setUser(String paramString)
  {
    this.user = paramString;
  }

  public final int sp()
  {
    return this.dny;
  }

  public final int ss()
  {
    return this.cGN;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.q
 * JD-Core Version:    0.6.2
 */