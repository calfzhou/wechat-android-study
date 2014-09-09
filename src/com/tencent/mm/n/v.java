package com.tencent.mm.n;

import android.content.ContentValues;
import android.database.Cursor;

public final class v
{
  private int cGN = -1;
  private int dnA;
  private String dnB;
  private String dnC;
  private int dnD;
  private int dnE;
  private int dnv;
  private int dnw;
  private String dnx;
  private int dny;
  private int dnz;
  private String username;

  public v()
  {
    reset();
  }

  public final void b(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.dnv = paramCursor.getInt(1);
    this.dnw = paramCursor.getInt(2);
    this.dnx = paramCursor.getString(3);
    this.dny = paramCursor.getInt(4);
    this.dnz = paramCursor.getInt(5);
    this.dnA = paramCursor.getInt(6);
    this.dnB = paramCursor.getString(7);
    this.dnC = paramCursor.getString(8);
    this.dnD = paramCursor.getInt(9);
    this.dnE = paramCursor.getInt(10);
  }

  public final void cX(int paramInt)
  {
    this.dnv = paramInt;
  }

  public final void cY(int paramInt)
  {
    this.dnw = paramInt;
  }

  public final void cZ(int paramInt)
  {
    this.dny = paramInt;
  }

  public final void da(int paramInt)
  {
    this.dnz = paramInt;
  }

  public final void fc(String paramString)
  {
    this.dnx = paramString;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    String str3;
    String str2;
    if ((0x1 & this.cGN) != 0)
    {
      if (this.username == null)
      {
        str3 = "";
        localContentValues.put("username", str3);
      }
    }
    else
    {
      if ((0x2 & this.cGN) != 0)
        localContentValues.put("imgwidth", Integer.valueOf(this.dnv));
      if ((0x4 & this.cGN) != 0)
        localContentValues.put("imgheigth", Integer.valueOf(this.dnw));
      if ((0x8 & this.cGN) != 0)
        localContentValues.put("imgformat", so());
      if ((0x10 & this.cGN) != 0)
        localContentValues.put("totallen", Integer.valueOf(this.dny));
      if ((0x20 & this.cGN) != 0)
        localContentValues.put("startpos", Integer.valueOf(this.dnz));
      if ((0x40 & this.cGN) != 0)
        localContentValues.put("headimgtype", Integer.valueOf(this.dnA));
      if ((0x80 & this.cGN) != 0)
      {
        if (this.dnB != null)
          break label284;
        str2 = "";
        label190: localContentValues.put("reserved1", str2);
      }
      if ((0x100 & this.cGN) != 0)
        if (this.dnC != null)
          break label292;
    }
    label284: label292: for (String str1 = ""; ; str1 = this.dnC)
    {
      localContentValues.put("reserved2", str1);
      if ((0x200 & this.cGN) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.dnD));
      if ((0x400 & this.cGN) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.dnE));
      return localContentValues;
      str3 = this.username;
      break;
      str2 = this.dnB;
      break label190;
    }
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final void reset()
  {
    this.username = "";
    this.dnv = 0;
    this.dnw = 0;
    this.dnx = "";
    this.dny = 0;
    this.dnz = 0;
    this.dnA = 0;
    this.dnB = "";
    this.dnC = "";
    this.dnD = 0;
    this.dnE = 0;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final boolean sl()
  {
    return this.dnz >= this.dny;
  }

  public final int sm()
  {
    return this.dnv;
  }

  public final int sn()
  {
    return this.dnw;
  }

  public final String so()
  {
    if (this.dnx == null)
      return "";
    return this.dnx;
  }

  public final int sp()
  {
    return this.dny;
  }

  public final int sq()
  {
    return this.dnz;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.v
 * JD-Core Version:    0.6.2
 */