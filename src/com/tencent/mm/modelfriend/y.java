package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;

public final class y
{
  private int cGN = -1;
  private String cOA = "";
  private int cOn = 0;
  private int cOx = 0;
  private String cOy = "";
  private String cOz = "";
  private String username = "";

  public final void b(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.cOn = paramCursor.getInt(1);
    this.cOx = paramCursor.getInt(2);
    this.cOz = paramCursor.getString(3);
    this.cOA = paramCursor.getString(4);
    this.cOy = paramCursor.getString(5);
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
      localContentValues.put("sex", Integer.valueOf(this.cOn));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("personalcard", Integer.valueOf(this.cOx));
    String str3;
    String str2;
    if ((0x8 & this.cGN) != 0)
    {
      if (this.cOz == null)
      {
        str3 = "";
        localContentValues.put("province", str3);
      }
    }
    else
    {
      if ((0x10 & this.cGN) != 0)
      {
        if (this.cOA != null)
          break label165;
        str2 = "";
        label120: localContentValues.put("city", str2);
      }
      if ((0x20 & this.cGN) != 0)
        if (this.cOy != null)
          break label173;
    }
    label165: label173: for (String str1 = ""; ; str1 = this.cOy)
    {
      localContentValues.put("signature", str1);
      return localContentValues;
      str3 = this.cOz;
      break;
      str2 = this.cOA;
      break label120;
    }
  }

  public final int jj()
  {
    return this.cOn;
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
 * Qualified Name:     com.tencent.mm.modelfriend.y
 * JD-Core Version:    0.6.2
 */