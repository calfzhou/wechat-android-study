package com.tencent.mm.ai;

import com.tencent.mm.c.b.c;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends c
{
  public static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[7];
    localae.dhI = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "msgId";
    localae.iGy.put("msgId", "LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "msgId";
    localae.dhI[1] = "xml";
    localae.iGy.put("xml", "TEXT");
    localStringBuilder.append(" xml TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "appId";
    localae.iGy.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "title";
    localae.iGy.put("title", "TEXT");
    localStringBuilder.append(" title TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "description";
    localae.iGy.put("description", "TEXT");
    localStringBuilder.append(" description TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "source";
    localae.iGy.put("source", "TEXT");
    localStringBuilder.append(" source TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "type";
    localae.iGy.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localae.dhI[7] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.a
 * JD-Core Version:    0.6.2
 */