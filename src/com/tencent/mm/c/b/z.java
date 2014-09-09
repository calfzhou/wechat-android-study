package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class z extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int daU = "reqType".hashCode();
  private static final int daW = "cache".hashCode();
  private boolean daS = true;
  private boolean daT = true;
  public byte[] field_cache;
  public int field_reqType;

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
      if (daU != k)
        break label62;
      this.field_reqType = paramCursor.getInt(i);
      this.daS = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (daW == k)
        this.field_cache = paramCursor.getBlob(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.daS)
      localContentValues.put("reqType", Integer.valueOf(this.field_reqType));
    if (this.daT)
      localContentValues.put("cache", this.field_cache);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.z
 * JD-Core Version:    0.6.2
 */