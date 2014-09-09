package com.tencent.mm.storage;

import com.tencent.mm.c.b.av;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class ct extends av
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[3];
    localae.dhI = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "msgId";
    localae.iGy.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "msgId";
    localae.dhI[1] = "cmsgId";
    localae.iGy.put("cmsgId", "TEXT");
    localStringBuilder.append(" cmsgId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "content";
    localae.iGy.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    localae.dhI[3] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ct
 * JD-Core Version:    0.6.2
 */