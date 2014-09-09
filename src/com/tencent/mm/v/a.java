package com.tencent.mm.v;

import android.content.ContentValues;
import android.database.Cursor;

public final class a
{
  private int cGN = -1;
  private int dlX = 0;
  private String dlZ = "";
  private String dma = "";
  private int dtZ = 0;
  private long dvN = 0L;
  private int dvO = 0;
  private int type = 0;
  private String username = "";

  public final long CH()
  {
    return this.dvN;
  }

  public final void M(long paramLong)
  {
    this.dvN = paramLong;
  }

  public final void b(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.dvN = paramCursor.getLong(1);
    this.type = paramCursor.getInt(2);
    this.dvO = paramCursor.getInt(3);
    this.dlX = paramCursor.getInt(4);
    this.dtZ = paramCursor.getInt(5);
    this.dlZ = paramCursor.getString(6);
    this.dma = paramCursor.getString(7);
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("username", getUsername());
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("inserttime", Long.valueOf(this.dvN));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("type", Integer.valueOf(this.type));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("lastgettime", Integer.valueOf(this.dvO));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("reserved1", Integer.valueOf(this.dlX));
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("reserved2", Integer.valueOf(this.dtZ));
    String str2;
    if ((0x40 & this.cGN) != 0)
    {
      if (this.dlZ == null)
      {
        str2 = "";
        localContentValues.put("reserved3", str2);
      }
    }
    else if ((0x80 & this.cGN) != 0)
      if (this.dma != null)
        break label205;
    label205: for (String str1 = ""; ; str1 = this.dma)
    {
      localContentValues.put("reserved4", str1);
      return localContentValues;
      str2 = this.dlZ;
      break;
    }
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.v.a
 * JD-Core Version:    0.6.2
 */