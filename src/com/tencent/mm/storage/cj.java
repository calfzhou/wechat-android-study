package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;

public final class cj
{
  private int cGN = 135;
  private ck ikR = null;
  private int ikS;
  private String name = "";
  private int status;

  public cj()
  {
    this.ikR = null;
    this.name = "";
    this.status = 0;
    this.ikS = 0;
  }

  public cj(String paramString, boolean paramBoolean, int paramInt)
  {
    this.ikR = new ck(paramString);
    this.name = paramString;
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      this.status = (i | 0x2);
      this.ikS = paramInt;
      return;
    }
  }

  public final boolean aJt()
  {
    return (0x1 & this.status) != 0;
  }

  public final boolean aKE()
  {
    return (0x2 & this.status) != 0;
  }

  public final boolean aKF()
  {
    return this.ikS == 1;
  }

  public final ck aKG()
  {
    return this.ikR;
  }

  public final void b(Cursor paramCursor)
  {
    if ((0x2 & this.cGN) != 0)
    {
      this.name = paramCursor.getString(1);
      if (this.ikR == null)
        this.ikR = new ck(this.name);
    }
    if ((0x4 & this.cGN) != 0)
      this.status = paramCursor.getInt(2);
    if ((0x80 & this.cGN) != 0)
      this.ikS = paramCursor.getInt(7);
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  public final void ei(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = this.status;
      if (paramBoolean);
      for (int j = 1; ; j = 0)
      {
        this.status = (j | i);
        return;
      }
    }
    this.status = (0xFFFFFFFE & this.status);
  }

  public final void ej(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      int i = this.status;
      if (paramBoolean);
      for (int j = 2; ; j = 0)
      {
        this.status = (j | i);
        return;
      }
    }
    this.status = (0xFFFFFFFD & this.status);
  }

  public final String getName()
  {
    return this.name;
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if ((0x2 & this.cGN) != 0)
      localContentValues.put("name", this.name);
    if ((0x4 & this.cGN) != 0)
      localContentValues.put("status", Integer.valueOf(this.status));
    if ((0x80 & this.cGN) != 0)
      localContentValues.put("int_reserved1", Integer.valueOf(this.ikS));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cj
 * JD-Core Version:    0.6.2
 */