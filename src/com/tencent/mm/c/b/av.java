package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class av extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cRX = "msgId".hashCode();
  private static final int cUU;
  private static final int dhm = "cmsgId".hashCode();
  private boolean cRS = true;
  private boolean cUE = true;
  private boolean dhl = true;
  public String field_cmsgId;
  public String field_content;
  public long field_msgId;

  static
  {
    cUU = "content".hashCode();
  }

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
      if (cRX != k)
        break label62;
      this.field_msgId = paramCursor.getLong(i);
      this.cRS = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dhm == k)
        this.field_cmsgId = paramCursor.getString(i);
      else if (cUU == k)
        this.field_content = paramCursor.getString(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRS)
      localContentValues.put("msgId", Long.valueOf(this.field_msgId));
    if (this.dhl)
      localContentValues.put("cmsgId", this.field_cmsgId);
    if (this.field_content == null)
      this.field_content = "";
    if (this.cUE)
      localContentValues.put("content", this.field_content);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.av
 * JD-Core Version:    0.6.2
 */