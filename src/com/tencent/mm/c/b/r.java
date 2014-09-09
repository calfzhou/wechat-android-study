package com.tencent.mm.c.b;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.f.ad;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public abstract class r extends ad
{
  public static final String[] cKz = new String[0];
  private static final int cQA = "rowid".hashCode();
  private static final int cYs = "configId".hashCode();
  private static final int cYt = "value".hashCode();
  private boolean cYq = true;
  private boolean cYr = true;
  public int field_configId;
  public String field_value;

  public static ae jV()
  {
    ae localae = new ae();
    localae.dFq = new Field[2];
    localae.dhI = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "configId";
    localae.iGy.put("configId", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" configId INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "configId";
    localae.dhI[1] = "value";
    localae.iGy.put("value", "TEXT");
    localStringBuilder.append(" value TEXT");
    localae.dhI[2] = "rowid";
    localae.dlP = localStringBuilder.toString();
    return localae;
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
      if (cYs != k)
        break label62;
      this.field_configId = paramCursor.getInt(i);
      this.cYq = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (cYt == k)
        this.field_value = paramCursor.getString(i);
      else if (cQA == k)
        this.iGx = paramCursor.getLong(i);
    }
  }

  public final ContentValues ir()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.cYq)
      localContentValues.put("configId", Integer.valueOf(this.field_configId));
    if (this.cYr)
      localContentValues.put("value", this.field_value);
    if (this.iGx > 0L)
      localContentValues.put("rowid", Long.valueOf(this.iGx));
    return localContentValues;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.c.b.r
 * JD-Core Version:    0.6.2
 */