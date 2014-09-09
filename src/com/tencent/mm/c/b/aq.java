package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;

public abstract class aq extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int dgm = "tagId".hashCode();
  private static final int dgn = "tagName".hashCode();
  private static final int dgo = "count".hashCode();
  private static final int dgp = "memberList".hashCode();
  private boolean dgi = true;
  private boolean dgj = true;
  private boolean dgk = true;
  private boolean dgl = true;
  public int field_count;
  public String field_memberList;
  public long field_tagId;
  public String field_tagName;

  public void b(Cursor paramCursor)
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
      if (dgm != k)
        break label57;
      this.field_tagId = paramCursor.getLong(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dgn == k)
        this.field_tagName = paramCursor.getString(i);
      else if (dgo == k)
        this.field_count = paramCursor.getInt(i);
      else if (dgp == k)
        this.field_memberList = paramCursor.getString(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dgi)
      localContentValues.put("tagId", Long.valueOf(this.field_tagId));
    if (this.field_tagName == null)
      this.field_tagName = "";
    if (this.dgj)
      localContentValues.put("tagName", this.field_tagName);
    if (this.dgk)
      localContentValues.put("count", Integer.valueOf(this.field_count));
    if (this.field_memberList == null)
      this.field_memberList = "";
    if (this.dgl)
      localContentValues.put("memberList", this.field_memberList);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.aq
 * JD-Core Version:    0.6.2
 */