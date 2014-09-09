package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class h extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cSo = "username".hashCode();
  private static final int cUp = "cmdbuf".hashCode();
  private boolean cSc = true;
  private boolean cUo = true;
  public byte[] field_cmdbuf;
  public String field_username;

  public final void b(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = 0;
    int j = arrayOfString.length;
    label18: int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (cSo != k)
        break label62;
      this.field_username = paramCursor.getString(i);
      this.cSc = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (cUp == k)
        this.field_cmdbuf = paramCursor.getBlob(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null)
      this.field_username = "";
    if (this.cSc)
      localContentValues.put("username", this.field_username);
    if (this.cUo)
      localContentValues.put("cmdbuf", this.field_cmdbuf);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.h
 * JD-Core Version:    0.6.2
 */