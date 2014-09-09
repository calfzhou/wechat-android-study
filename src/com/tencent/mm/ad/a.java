package com.tencent.mm.ad;

import android.content.ContentValues;
import android.database.Cursor;

public final class a
{
  private int cGN = -1;
  private int dAe = 0;
  private String dnB = "";
  private String dnC = "";
  private int dnD = 0;
  private int dnE = 0;
  private String path = "";
  private String username = "";

  public final void b(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.dAe = paramCursor.getInt(1);
    this.path = paramCursor.getString(2);
    this.dnB = paramCursor.getString(3);
    this.dnC = paramCursor.getString(4);
    this.dnD = paramCursor.getInt(5);
    this.dnE = paramCursor.getInt(6);
  }

  public final void dZ(int paramInt)
  {
    this.dAe = paramInt;
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
      localContentValues.put("bgflag", Integer.valueOf(this.dAe));
    String str3;
    String str2;
    if ((0x4 & this.cGN) != 0)
    {
      if (this.path == null)
      {
        str3 = "";
        localContentValues.put("path", str3);
      }
    }
    else
    {
      if ((0x8 & this.cGN) != 0)
      {
        if (this.dnB != null)
          break label188;
        str2 = "";
        label97: localContentValues.put("reserved1", str2);
      }
      if ((0x10 & this.cGN) != 0)
        if (this.dnC != null)
          break label196;
    }
    label188: label196: for (String str1 = ""; ; str1 = this.dnC)
    {
      localContentValues.put("reserved2", str1);
      if ((0x20 & this.cGN) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.dnD));
      if ((0x40 & this.cGN) != 0)
        localContentValues.put("reserved4", Integer.valueOf(this.dnE));
      return localContentValues;
      str3 = this.path;
      break;
      str2 = this.dnB;
      break label97;
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

  public final int yE()
  {
    return this.dAe;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ad.a
 * JD-Core Version:    0.6.2
 */