package com.tencent.mm.storage;

import com.tencent.mm.c.b.af;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class ch extends af
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[6];
    localae.dhI = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "appId";
    localae.iGy.put("appId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "appId";
    localae.dhI[1] = "packageName";
    localae.iGy.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "status";
    localae.iGy.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "sceneFlag";
    localae.iGy.put("sceneFlag", "INTEGER default '0' ");
    localStringBuilder.append(" sceneFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[4] = "msgTypeFlag";
    localae.iGy.put("msgTypeFlag", "INTEGER default '0' ");
    localStringBuilder.append(" msgTypeFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[5] = "msgState";
    localae.iGy.put("msgState", "INTEGER default '0' ");
    localStringBuilder.append(" msgState INTEGER default '0' ");
    localae.dhI[6] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ch
 * JD-Core Version:    0.6.2
 */