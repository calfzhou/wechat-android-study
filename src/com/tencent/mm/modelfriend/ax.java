package com.tencent.mm.modelfriend;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.platformtools.ch;

public final class ax
{
  private int cGN = -1;
  private String dkC = "";
  private String dnB = "";
  private String dnC = "";
  private int dnD = 0;
  private int dnE = 0;
  private String duA = "";
  private String duB = "";
  private String duC = "";
  private String duD = "";
  private String duE = "";
  private String duF = "";
  private String duG = "";
  private String duH = "";
  private long dux = 0L;
  private int duy = 0;
  private int duz = 0;
  private String username = "";

  public final void J(long paramLong)
  {
    this.dux = paramLong;
  }

  public final boolean a(ax paramax)
  {
    if (!ch.g(Long.valueOf(this.dux), Long.valueOf(paramax.dux)));
    while ((!ch.g(Integer.valueOf(this.duy), Integer.valueOf(paramax.duy))) || (!ch.g(Integer.valueOf(this.duz), Integer.valueOf(paramax.duz))) || (!ch.g(this.username, paramax.username)) || (!ch.g(this.duA, paramax.duA)) || (!ch.g(this.duB, paramax.duB)) || (!ch.g(this.dkC, paramax.dkC)) || (!ch.g(this.duC, paramax.duC)) || (!ch.g(this.duD, paramax.duD)) || (!ch.g(this.duE, paramax.duE)) || (!ch.g(this.duF, paramax.duF)) || (!ch.g(this.duG, paramax.duG)) || (!ch.g(this.duH, paramax.duH)) || (!ch.g(this.dnB, paramax.dnB)) || (!ch.g(this.dnC, paramax.dnC)) || (!ch.g(Integer.valueOf(this.dnD), Integer.valueOf(paramax.dnD))) || (!ch.g(Integer.valueOf(this.dnE), Integer.valueOf(paramax.dnE))))
      return false;
    return true;
  }

  public final void aU(String paramString)
  {
    this.duA = paramString;
  }

  public final void aV(String paramString)
  {
    this.duB = paramString;
  }

  public final void aW(String paramString)
  {
    this.dkC = paramString;
  }

  public final void b(Cursor paramCursor)
  {
    this.dux = paramCursor.getLong(0);
    int i = paramCursor.getInt(1);
    if (i == 65536);
    for (this.duy = 0; ; this.duy = i)
    {
      this.duz = paramCursor.getInt(2);
      this.username = paramCursor.getString(3);
      this.duA = paramCursor.getString(4);
      this.duB = paramCursor.getString(5);
      this.dkC = paramCursor.getString(6);
      this.duC = paramCursor.getString(7);
      this.duD = paramCursor.getString(8);
      this.duE = paramCursor.getString(9);
      this.duF = paramCursor.getString(10);
      this.duG = paramCursor.getString(11);
      this.duH = paramCursor.getString(12);
      this.dnB = paramCursor.getString(13);
      this.dnC = paramCursor.getString(14);
      this.dnD = paramCursor.getInt(15);
      this.dnE = paramCursor.getInt(16);
      return;
    }
  }

  public final void dJ(int paramInt)
  {
    this.duy = paramInt;
  }

  public final void dK(int paramInt)
  {
    this.duz = paramInt;
  }

  public final void gB(String paramString)
  {
    this.duC = paramString;
  }

  public final void gC(String paramString)
  {
    this.duD = paramString;
  }

  public final void gD(String paramString)
  {
    this.duE = paramString;
  }

  public final void gE(String paramString)
  {
    this.duF = paramString;
  }

  public final void gF(String paramString)
  {
    this.duG = paramString;
  }

  public final void gG(String paramString)
  {
    this.duH = paramString;
  }

  public final String getDisplayName()
  {
    if ((wU() == null) || (wU().length() <= 0))
      return wR();
    return wU();
  }

  public final String getUsername()
  {
    if (this.username == null)
      return "";
    return this.username;
  }

  public final String iV()
  {
    if (this.duA == null)
      return "";
    return this.duA;
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final void setUsername(String paramString)
  {
    this.username = paramString;
  }

  public final ContentValues wO()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("qq", Long.valueOf(this.dux));
    int i;
    String str2;
    if ((0x2 & this.cGN) != 0)
    {
      i = this.duy;
      if (i == 0)
        localContentValues.put("wexinstatus", Integer.valueOf(65536));
    }
    else
    {
      if ((0x4 & this.cGN) != 0)
        localContentValues.put("groupid", Integer.valueOf(this.duz));
      if ((0x8 & this.cGN) != 0)
        localContentValues.put("username", getUsername());
      if ((0x10 & this.cGN) != 0)
        localContentValues.put("nickname", iV());
      if ((0x20 & this.cGN) != 0)
      {
        if (this.duB != null)
          break label342;
        str2 = "";
        label143: localContentValues.put("pyinitial", str2);
      }
      if ((0x40 & this.cGN) != 0)
        if (this.dkC != null)
          break label350;
    }
    label342: label350: for (String str1 = ""; ; str1 = this.dkC)
    {
      localContentValues.put("quanpin", str1);
      if ((0x80 & this.cGN) != 0)
        localContentValues.put("qqnickname", wR());
      if ((0x100 & this.cGN) != 0)
        localContentValues.put("qqpyinitial", wS());
      if ((0x200 & this.cGN) != 0)
        localContentValues.put("qqquanpin", wT());
      if ((0x400 & this.cGN) != 0)
        localContentValues.put("qqremark", wU());
      if ((0x800 & this.cGN) != 0)
        localContentValues.put("qqremarkpyinitial", wV());
      if ((0x1000 & this.cGN) != 0)
        localContentValues.put("qqremarkquanpin", wW());
      if ((0x8000 & this.cGN) != 0)
        localContentValues.put("reserved3", Integer.valueOf(this.dnD));
      return localContentValues;
      localContentValues.put("wexinstatus", Integer.valueOf(i));
      break;
      str2 = this.duB;
      break label143;
    }
  }

  public final long wP()
  {
    return this.dux;
  }

  public final int wQ()
  {
    return this.duy;
  }

  public final String wR()
  {
    if (this.duC == null)
      return "";
    return this.duC;
  }

  public final String wS()
  {
    if (this.duD == null)
      return "";
    return this.duD;
  }

  public final String wT()
  {
    if (this.duE == null)
      return "";
    return this.duE;
  }

  public final String wU()
  {
    if (this.duF == null)
      return "";
    return this.duF;
  }

  public final String wV()
  {
    if (this.duG == null)
      return "";
    return this.duG;
  }

  public final String wW()
  {
    if (this.duH == null)
      return "";
    return this.duH;
  }

  public final void wX()
  {
    this.dnD = (0x1 | this.dnD);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.ax
 * JD-Core Version:    0.6.2
 */