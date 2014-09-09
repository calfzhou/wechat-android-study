package com.tencent.mm.storage;

import com.tencent.mm.c.b.i;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends i
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[6];
    localae.dhI = new String[7];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "labelID";
    localae.iGy.put("labelID", "INTEGER PRIMARY KEY ");
    localStringBuilder.append(" labelID INTEGER PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "labelID";
    localae.dhI[1] = "labelName";
    localae.iGy.put("labelName", "TEXT");
    localStringBuilder.append(" labelName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "labelPYFull";
    localae.iGy.put("labelPYFull", "TEXT");
    localStringBuilder.append(" labelPYFull TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "labelPYShort";
    localae.iGy.put("labelPYShort", "TEXT");
    localStringBuilder.append(" labelPYShort TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "createTime";
    localae.iGy.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[5] = "isTemporary";
    localae.iGy.put("isTemporary", "INTEGER");
    localStringBuilder.append(" isTemporary INTEGER");
    localae.dhI[6] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.k
 * JD-Core Version:    0.6.2
 */