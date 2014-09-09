package com.tencent.mm.model;

import android.content.ContentValues;
import android.database.Cursor;
import junit.framework.Assert;

public final class co
{
  private int cGN = -1;
  private String djA = "";
  private String djy = "";
  private String dlQ = "";
  private String dlR = "";
  private String dlS = "";
  private long dlT = 0L;
  private String dlU = "";
  private String dlV = "";
  private int dlW = 0;
  private int dlX = 0;
  private long dlY = 0L;
  private String dlZ = "";
  private String dma = "";
  private String name = "";
  private long time = 0L;
  private String title = "";
  private int type = 0;
  private String url = "";

  public static String cN(int paramInt)
  {
    if (paramInt == 20)
      return "newsapp";
    if (paramInt == 11)
      return "blogapp";
    Assert.assertTrue("INFO TYPE NEITHER NEWS NOR WEIBO", false);
    return null;
  }

  public final void b(Cursor paramCursor)
  {
    this.dlQ = paramCursor.getString(0);
    this.time = paramCursor.getLong(1);
    this.type = paramCursor.getInt(2);
    this.name = paramCursor.getString(3);
    this.title = paramCursor.getString(4);
    this.url = paramCursor.getString(5);
    this.dlR = paramCursor.getString(6);
    this.dlS = paramCursor.getString(7);
    this.dlT = paramCursor.getLong(8);
    this.dlU = paramCursor.getString(9);
    this.dlV = paramCursor.getString(10);
    this.dlW = paramCursor.getInt(11);
    this.djy = paramCursor.getString(12);
    this.djA = paramCursor.getString(13);
    this.dlX = paramCursor.getInt(14);
    this.dlY = paramCursor.getLong(15);
    this.dlZ = paramCursor.getString(16);
    this.dma = paramCursor.getString(17);
  }

  public final void bu(String paramString)
  {
    this.djA = paramString;
  }

  public final void cO(int paramInt)
  {
    this.dlX = paramInt;
  }

  public final void cP(int paramInt)
  {
    this.dlW = 1;
  }

  public final void er(String paramString)
  {
    this.dlQ = paramString;
  }

  public final void es(String paramString)
  {
    this.dlR = paramString;
  }

  public final void et(String paramString)
  {
    this.dlS = paramString;
  }

  public final void eu(String paramString)
  {
    this.dlU = paramString;
  }

  public final void ev(String paramString)
  {
    this.dlV = paramString;
  }

  public final void ew(String paramString)
  {
    this.djy = paramString;
  }

  public final String getName()
  {
    if (this.name == null)
      return "";
    return this.name;
  }

  public final long getTime()
  {
    return this.time;
  }

  public final String getTitle()
  {
    if (this.title == null)
      return "";
    return this.title;
  }

  public final int getType()
  {
    return this.type;
  }

  public final String getUrl()
  {
    if (this.url == null)
      return "";
    return this.url;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x1 & this.cGN) != 0)
      localContentValues.put("tweetid", rI());
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("time", Long.valueOf(this.time));
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("type", Integer.valueOf(this.type));
    if ((0x8 & this.cGN) != 0)
      localContentValues.put("name", getName());
    if ((0x10 & this.cGN) != 0)
      localContentValues.put("title", getTitle());
    if ((0x20 & this.cGN) != 0)
      localContentValues.put("url", getUrl());
    if ((0x40 & this.cGN) != 0)
      localContentValues.put("shorturl", rJ());
    String str3;
    String str2;
    if ((0x80 & this.cGN) != 0)
    {
      if (this.dlS == null)
      {
        str3 = "";
        localContentValues.put("longurl", str3);
      }
    }
    else
    {
      if ((0x100 & this.cGN) != 0)
        localContentValues.put("pubtime", Long.valueOf(this.dlT));
      if ((0x200 & this.cGN) != 0)
        localContentValues.put("sourcename", rL());
      if ((0x400 & this.cGN) != 0)
        localContentValues.put("sourceicon", rM());
      if ((0x800 & this.cGN) != 0)
        localContentValues.put("istop", Integer.valueOf(this.dlW));
      if ((0x1000 & this.cGN) != 0)
        localContentValues.put("cover", rN());
      if ((0x2000 & this.cGN) != 0)
        localContentValues.put("digest", jL());
      if ((0x4000 & this.cGN) != 0)
        localContentValues.put("reserved1", Integer.valueOf(this.dlX));
      if ((0x8000 & this.cGN) != 0)
        localContentValues.put("reserved2", Long.valueOf(this.dlY));
      if ((0x10000 & this.cGN) != 0)
      {
        if (this.dlZ != null)
          break label425;
        str2 = "";
        label380: localContentValues.put("reserved3", str2);
      }
      if ((0x20000 & this.cGN) != 0)
        if (this.dma != null)
          break label433;
    }
    label425: label433: for (String str1 = ""; ; str1 = this.dma)
    {
      localContentValues.put("reserved4", str1);
      return localContentValues;
      str3 = this.dlS;
      break;
      str2 = this.dlZ;
      break label380;
    }
  }

  public final String jL()
  {
    if (this.djA == null)
      return "";
    return this.djA;
  }

  public final void rF()
  {
    this.cGN = -1;
  }

  public final long rG()
  {
    return this.dlY;
  }

  public final boolean rH()
  {
    return this.dlX == 1;
  }

  public final String rI()
  {
    if (this.dlQ == null)
      return "";
    return this.dlQ;
  }

  public final String rJ()
  {
    if (this.dlR == null)
      return "";
    return this.dlR;
  }

  public final long rK()
  {
    return this.dlT;
  }

  public final String rL()
  {
    if (this.dlU == null)
      return "";
    return this.dlU;
  }

  public final String rM()
  {
    if (this.dlV == null)
      return "";
    return this.dlV;
  }

  public final String rN()
  {
    if (this.djy != null)
    {
      String[] arrayOfString = this.djy.split("\\|");
      if ((arrayOfString != null) && (arrayOfString.length > 0))
        return arrayOfString[0];
      return "";
    }
    return "";
  }

  public final void setName(String paramString)
  {
    this.name = paramString;
  }

  public final void setTime(long paramLong)
  {
    this.time = paramLong;
  }

  public final void setTitle(String paramString)
  {
    this.title = paramString;
  }

  public final void setType(int paramInt)
  {
    this.type = paramInt;
  }

  public final void setUrl(String paramString)
  {
    this.url = paramString;
  }

  public final void w(long paramLong)
  {
    this.dlY = paramLong;
  }

  public final void x(long paramLong)
  {
    this.dlT = paramLong;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.co
 * JD-Core Version:    0.6.2
 */