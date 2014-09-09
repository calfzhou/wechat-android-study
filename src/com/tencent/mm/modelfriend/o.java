package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;

public final class o
{
  private int cGN = -1;
  private String cOA = "";
  private int cOn = 0;
  private long cOp = 0L;
  private String cOq = "";
  private int cOx = 0;
  private String cOy = "";
  private String cOz = "";
  private String dkB = "";
  private String dsZ = "";
  private String dta = "";
  private String dtw = "";
  private int dtx = 0;
  private int status = 0;
  private int type = 0;
  private String username = "";
  private String wP = "";

  public final void aR(String paramString)
  {
    this.wP = paramString;
  }

  public final void b(Cursor paramCursor)
  {
    this.cOp = paramCursor.getLong(0);
    this.dtw = paramCursor.getString(1);
    this.dtx = paramCursor.getInt(2);
    this.status = paramCursor.getInt(3);
    this.username = paramCursor.getString(4);
    this.dkB = paramCursor.getString(5);
    this.dsZ = paramCursor.getString(6);
    this.dta = paramCursor.getString(7);
    this.cOn = paramCursor.getInt(8);
    this.cOx = paramCursor.getInt(9);
    this.cOz = paramCursor.getString(10);
    this.cOA = paramCursor.getString(11);
    this.cOy = paramCursor.getString(12);
    this.wP = paramCursor.getString(13);
    this.type = paramCursor.getInt(14);
    this.cOq = paramCursor.getString(15);
  }

  public final void bh(String paramString)
  {
    this.cOy = paramString;
  }

  public final void bi(String paramString)
  {
    this.cOz = paramString;
  }

  public final void bj(int paramInt)
  {
    this.cOn = paramInt;
  }

  public final void bj(String paramString)
  {
    this.cOA = paramString;
  }

  public final void bo(int paramInt)
  {
    this.cOx = paramInt;
  }

  public final void dr(int paramInt)
  {
    this.dtx = paramInt;
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

  public final int getStatus()
  {
    return this.status;
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final void gp(String paramString)
  {
    this.dtw = paramString;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("fbid", Long.valueOf(this.cOp));
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("fbname", vS());
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("fbimgkey", Integer.valueOf(this.dtx));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("status", Integer.valueOf(this.status));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("username", getUsername());
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("nickname", vz());
    String str7;
    String str6;
    label185: String str5;
    label263: String str4;
    label293: String str3;
    label323: String str2;
    if ((0x40 & this.cGN) != 0)
    {
      if (this.dsZ == null)
      {
        str7 = "";
        localContentValues.put("nicknamepyinitial", str7);
      }
    }
    else
    {
      if ((0x80 & this.cGN) != 0)
      {
        if (this.dta != null)
          break label421;
        str6 = "";
        localContentValues.put("nicknamequanpin", str6);
      }
      if ((0x100 & this.cGN) != 0)
        localContentValues.put("sex", Integer.valueOf(this.cOn));
      if ((0x200 & this.cGN) != 0)
        localContentValues.put("personalcard", Integer.valueOf(this.cOx));
      if ((0x400 & this.cGN) != 0)
      {
        if (this.cOz != null)
          break label430;
        str5 = "";
        localContentValues.put("province", str5);
      }
      if ((0x800 & this.cGN) != 0)
      {
        if (this.cOA != null)
          break label439;
        str4 = "";
        localContentValues.put("city", str4);
      }
      if ((0x1000 & this.cGN) != 0)
      {
        if (this.cOy != null)
          break label448;
        str3 = "";
        localContentValues.put("signature", str3);
      }
      if ((0x2000 & this.cGN) != 0)
      {
        if (this.wP != null)
          break label457;
        str2 = "";
        label352: localContentValues.put("alias", str2);
      }
      if ((0x4000 & this.cGN) != 0)
        localContentValues.put("type", Integer.valueOf(this.type));
      if ((0x8000 & this.cGN) != 0)
        if (this.cOq != null)
          break label465;
    }
    label421: label430: label439: label448: label457: label465: for (String str1 = ""; ; str1 = this.cOq)
    {
      localContentValues.put("email", str1);
      return localContentValues;
      str7 = this.dsZ;
      break;
      str6 = this.dta;
      break label185;
      str5 = this.cOz;
      break label263;
      str4 = this.cOA;
      break label293;
      str3 = this.cOy;
      break label323;
      str2 = this.wP;
      break label352;
    }
  }

  public final void j(long paramLong)
  {
    this.cOp = paramLong;
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final int ss()
  {
    return this.cGN;
  }

  public final long vR()
  {
    return this.cOp;
  }

  public final String vS()
  {
    if (this.dtw == null)
      return "";
    return this.dtw;
  }

  public final String vz()
  {
    if (this.dkB == null)
      return "";
    return this.dkB;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.o
 * JD-Core Version:    0.6.2
 */