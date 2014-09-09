package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.mm.c.b.z;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class ap extends z
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[2];
    localae.dhI = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "reqType";
    localae.iGy.put("reqType", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" reqType INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "reqType";
    localae.dhI[1] = "cache";
    localae.iGy.put("cache", "BLOB default '' ");
    localStringBuilder.append(" cache BLOB default '' ");
    localae.dhI[2] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public ap(int paramInt, byte[] paramArrayOfByte)
  {
    this.field_reqType = paramInt;
    this.field_cache = paramArrayOfByte;
  }

  public ap(Cursor paramCursor)
  {
    if (paramCursor == null)
      return;
    b(paramCursor);
  }

  protected final ae nF()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ap
 * JD-Core Version:    0.6.2
 */