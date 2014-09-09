package com.tencent.mm.ad;

import android.content.ContentValues;
import android.database.Cursor;

public final class l
{
  private int cGN = -1;
  private String dAx = this.id + "_" + this.dAz;
  private String dAy = "";
  private int dAz = 0;
  private String dnB = "";
  private String dnC = "";
  private int dnD = 0;
  private int dnE = 0;
  private int id = 0;
  private String name = "";
  private int size = 0;
  private int status = 0;
  private int version = 0;

  public final void b(Cursor paramCursor)
  {
    this.version = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.size = paramCursor.getInt(4);
    this.dAy = paramCursor.getString(5);
    this.status = paramCursor.getInt(6);
    this.dnB = paramCursor.getString(8);
    this.dnC = paramCursor.getString(9);
    this.dAz = paramCursor.getInt(7);
    this.dnE = paramCursor.getInt(11);
    this.id = paramCursor.getInt(1);
    this.dnD = paramCursor.getInt(10);
    this.dAx = paramCursor.getString(0);
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void ea(int paramInt)
  {
    this.dAz = paramInt;
  }

  public final int getId()
  {
    return this.id;
  }

  public final int getSize()
  {
    return this.size;
  }

  public final int getStatus()
  {
    return this.status;
  }

  public final int getVersion()
  {
    return this.version;
  }

  public final void hf(String paramString)
  {
    this.dAy = paramString;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("id", Integer.valueOf(this.id));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("version", Integer.valueOf(this.version));
    String str4;
    String str3;
    label125: String str2;
    if ((0x8 & this.cGN) != 0)
    {
      if (this.name == null)
      {
        str4 = "";
        localContentValues.put("name", str4);
      }
    }
    else
    {
      if ((0x10 & this.cGN) != 0)
        localContentValues.put("size", Integer.valueOf(this.size));
      if ((0x20 & this.cGN) != 0)
      {
        if (this.dAy != null)
          break label339;
        str3 = "";
        localContentValues.put("packname", str3);
      }
      if ((0x40 & this.cGN) != 0)
        localContentValues.put("status", Integer.valueOf(this.status));
      if ((0x80 & this.cGN) != 0)
        localContentValues.put("type", Integer.valueOf(this.dAz));
      if ((0x100 & this.cGN) != 0)
      {
        if (this.dnB != null)
          break label348;
        str2 = "";
        label201: localContentValues.put("reserved1", str2);
      }
      if ((0x200 & this.cGN) != 0)
        if (this.dnC != null)
          break label356;
    }
    label339: label348: label356: for (String str1 = ""; ; str1 = this.dnC)
    {
      localContentValues.put("reserved2", str1);
      if ((0x400 & this.cGN) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.dnD));
      if ((0x800 & this.cGN) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.dnE));
      if ((0x1 & this.cGN) != 0)
        localContentValues.put("localId", this.id + "_" + this.dAz);
      return localContentValues;
      str4 = this.name;
      break;
      str3 = this.dAy;
      break label125;
      str2 = this.dnB;
      break label201;
    }
  }

  public final void setId(int paramInt)
  {
    this.id = paramInt;
  }

  public final void setName(String paramString)
  {
    this.name = paramString;
  }

  public final void setSize(int paramInt)
  {
    this.size = paramInt;
  }

  public final void setStatus(int paramInt)
  {
    this.status = paramInt;
  }

  public final void setVersion(int paramInt)
  {
    this.version = paramInt;
  }

  public final int yJ()
  {
    return this.dAz;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.l
 * JD-Core Version:    0.6.2
 */