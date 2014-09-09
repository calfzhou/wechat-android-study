package com.tencent.mm.modelvoice;

import android.content.ContentValues;
import android.database.Cursor;

public final class br
{
  private int cGN = -1;
  private String dBh = "";
  private int dFM = 0;
  private String dFV = "";
  private int dFX = 0;
  private String dGY = "";
  private long dGa = 0L;
  private long dGb = 0L;
  private int dGe = 0;
  private int dGf = 0;
  private int dHf = 0;
  private int dIM = 0;
  private int dny = 0;
  private long dxj = 0L;
  private String rI = "";
  private int status = 0;
  private String user = "";

  public final String AN()
  {
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

  public final long AS()
  {
    return this.dGb;
  }

  public final int AV()
  {
    return this.dGe;
  }

  public final int AW()
  {
    return this.dGf;
  }

  public final boolean BJ()
  {
    return (this.status == 5) || (this.status == 6);
  }

  public final boolean BK()
  {
    return ((this.status > 1) && (this.status <= 3)) || (this.status == 8);
  }

  public final int BL()
  {
    return this.dHf;
  }

  public final int BM()
  {
    return this.dIM;
  }

  public final String BN()
  {
    return this.dBh;
  }

  public final String BO()
  {
    return this.dGY;
  }

  public final void V(long paramLong)
  {
    this.dGb = paramLong;
  }

  public final void b(Cursor paramCursor)
  {
    this.rI = paramCursor.getString(0);
    this.user = paramCursor.getString(1);
    this.dxj = paramCursor.getLong(2);
    this.dFM = paramCursor.getInt(3);
    this.dFX = paramCursor.getInt(4);
    this.dny = paramCursor.getInt(5);
    this.status = paramCursor.getInt(6);
    this.dGa = paramCursor.getLong(7);
    this.dGb = paramCursor.getLong(8);
    this.dBh = paramCursor.getString(9);
    this.dIM = paramCursor.getInt(10);
    this.dGe = paramCursor.getInt(11);
    this.dFV = paramCursor.getString(12);
    this.dGf = paramCursor.getInt(13);
    this.dGY = paramCursor.getString(14);
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

  public final void eK(int paramInt)
  {
    this.dGe = paramInt;
  }

  public final void eO(int paramInt)
  {
    this.dHf = paramInt;
  }

  public final void eP(int paramInt)
  {
    this.dIM = paramInt;
  }

  public final String getFileName()
  {
    return this.rI;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final String getUser()
  {
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

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("FileName", this.rI);
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("User", this.user);
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("MsgId", Long.valueOf(this.dxj));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("NetOffset", Integer.valueOf(this.dFM));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("FileNowSize", Integer.valueOf(this.dFX));
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("TotalLen", Integer.valueOf(this.dny));
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("Status", Integer.valueOf(this.status));
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("CreateTime", Long.valueOf(this.dGa));
    if ((0x100 & this.cGN) != 0)
      localContentValues.put("LastModifyTime", Long.valueOf(this.dGb));
    if ((0x200 & this.cGN) != 0)
      localContentValues.put("ClientId", this.dBh);
    if ((0x400 & this.cGN) != 0)
      localContentValues.put("VoiceLength", Integer.valueOf(this.dIM));
    if ((0x800 & this.cGN) != 0)
      localContentValues.put("MsgLocalId", Integer.valueOf(this.dGe));
    if ((0x1000 & this.cGN) != 0)
      localContentValues.put("Human", this.dFV);
    if ((0x2000 & this.cGN) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.dGf));
    if ((0x4000 & this.cGN) != 0)
      localContentValues.put("reserved2", this.dGY);
    return localContentValues;
  }

  public final void it(String paramString)
  {
    this.dBh = paramString;
  }

  public final void iu(String paramString)
  {
    this.dGY = paramString;
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
 * Qualified Name:     com.tencent.mm.modelvoice.br
 * JD-Core Version:    0.6.2
 */