package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class ah extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int der = "cardUserId".hashCode();
  private static final int des = "retryCount".hashCode();
  private boolean dep = true;
  private boolean deq = true;
  public String field_cardUserId;
  public int field_retryCount;

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
      if (der != k)
        break label62;
      this.field_cardUserId = paramCursor.getString(i);
      this.dep = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (des == k)
        this.field_retryCount = paramCursor.getInt(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dep)
      localContentValues.put("cardUserId", this.field_cardUserId);
    if (this.deq)
      localContentValues.put("retryCount", Integer.valueOf(this.field_retryCount));
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.ah
 * JD-Core Version:    0.6.2
 */