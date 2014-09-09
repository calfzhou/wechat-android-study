package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;

public final class av
{
  private int cGN = -1;
  private int dup = 0;
  private int duq = 0;
  private int dur = 0;
  private int dus = 0;
  private int dut = 0;
  private int duu = 0;
  private String duv = "";
  private String duw = "";

  public final void b(Cursor paramCursor)
  {
    this.dup = paramCursor.getInt(0);
    this.duq = paramCursor.getInt(1);
    this.dur = paramCursor.getInt(2);
    this.dus = paramCursor.getInt(3);
    this.dut = paramCursor.getInt(4);
    this.duu = paramCursor.getInt(5);
    this.duv = paramCursor.getString(6);
    this.duw = paramCursor.getString(7);
  }

  public final void dB(int paramInt)
  {
    this.dup = paramInt;
  }

  public final void dC(int paramInt)
  {
    this.duq = paramInt;
  }

  public final void dD(int paramInt)
  {
    this.dur = paramInt;
  }

  public final void dE(int paramInt)
  {
    this.dus = paramInt;
  }

  public final void dF(int paramInt)
  {
    this.dut = paramInt;
  }

  public final void dG(int paramInt)
  {
    this.duu = paramInt;
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void gA(String paramString)
  {
    this.duw = paramString;
  }

  public final void gz(String paramString)
  {
    this.duv = paramString;
  }

  public final ContentValues wG()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("grouopid", Integer.valueOf(this.dup));
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("membernum", Integer.valueOf(this.duq));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("weixinnum", Integer.valueOf(this.dur));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("insert_time", Integer.valueOf(this.dus));
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("lastupdate_time", Integer.valueOf(this.dut));
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("needupdate", Integer.valueOf(this.duu));
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("updatekey", wL());
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("groupname", wM());
    return localContentValues;
  }

  public final int wH()
  {
    return this.dup;
  }

  public final int wI()
  {
    return this.duq;
  }

  public final int wJ()
  {
    return this.dur;
  }

  public final int wK()
  {
    return this.duu;
  }

  public final String wL()
  {
    if (this.duv == null)
      return "";
    return this.duv;
  }

  public final String wM()
  {
    if (this.duw == null)
      return "";
    return this.duw;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.av
 * JD-Core Version:    0.6.2
 */