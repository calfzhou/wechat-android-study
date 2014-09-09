package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class ag extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cRX = "msgId".hashCode();
  private static final int daw;
  private static final int deo = "msgContentXml".hashCode();
  private boolean cRS = true;
  private boolean dan = true;
  private boolean den = true;
  public String field_isRead;
  public String field_msgContentXml;
  public String field_msgId;

  static
  {
    daw = "isRead".hashCode();
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
      this.field_msgId = paramCursor.getString(i);
      this.cRS = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (deo == k)
        this.field_msgContentXml = paramCursor.getString(i);
      else if (daw == k)
        this.field_isRead = paramCursor.getString(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cRS)
      localContentValues.put("msgId", this.field_msgId);
    if (this.den)
      localContentValues.put("msgContentXml", this.field_msgContentXml);
    if (this.dan)
      localContentValues.put("isRead", this.field_isRead);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.ag
 * JD-Core Version:    0.6.2
 */