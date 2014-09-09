package com.tencent.mm.n;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ch;

public final class x
{
  private int cGN = -1;
  private int cOm = 0;
  private int dnF = 0;
  private String dnG = "";
  private String dnH = "";
  private int dnI = 0;
  private int dnJ = 0;
  private String username = "";

  public final void T(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.dnI = i;
      return;
    }
  }

  public final void b(Cursor paramCursor)
  {
    this.username = paramCursor.getString(0);
    this.cOm = paramCursor.getInt(1);
    this.dnF = paramCursor.getInt(2);
    this.dnH = paramCursor.getString(3);
    this.dnG = paramCursor.getString(4);
    this.dnI = paramCursor.getInt(5);
    this.dnJ = paramCursor.getInt(6);
  }

  public final void bi(int paramInt)
  {
    this.cOm = paramInt;
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void dc(int paramInt)
  {
    this.dnF = paramInt;
  }

  public final void dd(int paramInt)
  {
    this.dnJ = 0;
  }

  public final void fe(String paramString)
  {
    this.dnH = paramString;
  }

  public final void ff(String paramString)
  {
    this.dnG = paramString;
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final int ji()
  {
    return this.cOm;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final ContentValues sr()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("username", getUsername());
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("imgflag", Integer.valueOf(this.cOm));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("lastupdatetime", Integer.valueOf(this.dnF));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("reserved1", st());
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("reserved2", su());
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("reserved3", Integer.valueOf(this.dnI));
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("reserved4", Integer.valueOf(this.dnJ));
    return localContentValues;
  }

  public final int ss()
  {
    return this.cGN;
  }

  public final String st()
  {
    if (this.dnH == null)
      return "";
    return this.dnH;
  }

  public final String su()
  {
    if (this.dnG == null)
      return "";
    return this.dnG;
  }

  public final void sv()
  {
    this.dnJ = ((int)(ch.CL() / 60L));
    this.cGN = (0x40 | this.cGN);
  }

  public final boolean sw()
  {
    return ch.CL() - 60L * this.dnJ > 86400L;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.x
 * JD-Core Version:    0.6.2
 */