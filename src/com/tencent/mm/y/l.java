package com.tencent.mm.y;

import android.content.ContentValues;
import android.database.Cursor;

public final class l
{
  private int aRG;
  private int cGN = -2;
  private int cWI = 0;
  private int dny;
  private long dsA;
  private long dxi;
  private long dxj;
  private String dxk = "";
  private String dxl = "";
  private int dxm;
  private int dxn;
  private int dxo = 0;
  private String dxp = "";
  private int dxq = 1;
  private int offset;
  private int status;

  public final void O(long paramLong)
  {
    this.dsA = paramLong;
  }

  public final void P(long paramLong)
  {
    this.dxi = paramLong;
  }

  public final void b(Cursor paramCursor)
  {
    this.dxi = paramCursor.getInt(0);
    this.dxj = paramCursor.getLong(1);
    this.offset = paramCursor.getInt(2);
    this.dny = paramCursor.getInt(3);
    this.dxk = paramCursor.getString(4);
    this.dxl = paramCursor.getString(5);
    this.dxm = paramCursor.getInt(6);
    this.dsA = paramCursor.getInt(7);
    this.status = paramCursor.getInt(8);
    this.dxn = paramCursor.getInt(9);
    this.dxo = paramCursor.getInt(10);
    this.aRG = paramCursor.getInt(11);
    this.dxp = paramCursor.getString(12);
    this.cWI = paramCursor.getInt(14);
    this.dxq = paramCursor.getInt(15);
  }

  public final void bM(int paramInt)
  {
    this.cWI = 1;
  }

  public final void cZ(int paramInt)
  {
    this.dny = paramInt;
  }

  public final void dP(int paramInt)
  {
    this.dxn = paramInt;
  }

  public final void dQ(int paramInt)
  {
    this.dxm = paramInt;
  }

  public final void dR(int paramInt)
  {
    this.dxo = paramInt;
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void gM(String paramString)
  {
    this.dxk = paramString;
  }

  public final void gN(String paramString)
  {
    this.dxl = paramString;
  }

  public final void gO(String paramString)
  {
    this.dxp = paramString;
  }

  public final int getOffset()
  {
    return this.offset;
  }

  public final int getSource()
  {
    return this.aRG;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("id", Long.valueOf(this.dxi));
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("msgSvrId", Long.valueOf(this.dxj));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("offset", Integer.valueOf(this.offset));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("totalLen", Integer.valueOf(this.dny));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("bigImgPath", this.dxk);
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("thumbImgPath", this.dxl);
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("createtime", Integer.valueOf(this.dxm));
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("msglocalid", Long.valueOf(this.dsA));
    if ((0x100 & this.cGN) != 0)
      localContentValues.put("status", Integer.valueOf(this.status));
    if ((0x200 & this.cGN) != 0)
      localContentValues.put("nettimes", Integer.valueOf(this.dxn));
    if ((0x400 & this.cGN) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.dxo));
    if ((0x800 & this.cGN) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.aRG));
    if ((0x1000 & this.cGN) != 0)
      localContentValues.put("reserved3", this.dxp);
    if ((0x4000 & this.cGN) != 0)
      localContentValues.put("hashdthumb", Integer.valueOf(this.cWI));
    if ((0x8000 & this.cGN) != 0)
      if (this.offset >= this.dny)
        break label360;
    label360: for (int i = 0; ; i = 1)
    {
      localContentValues.put("iscomplete", Integer.valueOf(i));
      return localContentValues;
    }
  }

  public final long kl()
  {
    return this.dxj;
  }

  public final void p(long paramLong)
  {
    this.dxj = paramLong;
  }

  public final void setOffset(int paramInt)
  {
    this.offset = paramInt;
  }

  public final void setSource(int paramInt)
  {
    this.aRG = paramInt;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final int sp()
  {
    return this.dny;
  }

  public final int xJ()
  {
    return this.dxn;
  }

  public final int xK()
  {
    return this.dxm;
  }

  public final long xL()
  {
    return this.dsA;
  }

  public final long xM()
  {
    return this.dxi;
  }

  public final String xN()
  {
    return this.dxk;
  }

  public final String xO()
  {
    return this.dxl;
  }

  public final int xP()
  {
    return this.dxo;
  }

  public final boolean xQ()
  {
    return (this.dny != 0) && (this.dny == this.offset);
  }

  public final boolean xR()
  {
    return this.dxo > 0;
  }

  public final String xS()
  {
    return this.dxp;
  }

  public final int xT()
  {
    return this.cWI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.l
 * JD-Core Version:    0.6.2
 */