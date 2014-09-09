package com.tencent.mm.storage;

import com.tencent.mm.c.b.m;
import java.lang.reflect.Field;
import java.util.Map;

public final class ae extends m
{
  protected static com.tencent.mm.sdk.f.ae dhu = localae;

  static
  {
    com.tencent.mm.sdk.f.ae localae = new com.tencent.mm.sdk.f.ae();
    localae.dFq = new Field[7];
    localae.dhI = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "md5_lang";
    localae.iGy.put("md5_lang", "TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(" md5_lang TEXT PRIMARY KEY  COLLATE NOCASE ");
    localStringBuilder.append(", ");
    localae.ihb = "md5_lang";
    localae.dhI[1] = "md5";
    localae.iGy.put("md5", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" md5 TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "lang";
    localae.iGy.put("lang", "TEXT COLLATE NOCASE ");
    localStringBuilder.append(" lang TEXT COLLATE NOCASE ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "desc";
    localae.iGy.put("desc", "TEXT");
    localStringBuilder.append(" desc TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "groupId";
    localae.iGy.put("groupId", "TEXT default '' ");
    localStringBuilder.append(" groupId TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[5] = "click_flag";
    localae.iGy.put("click_flag", "INTEGER");
    localStringBuilder.append(" click_flag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "download_flag";
    localae.iGy.put("download_flag", "INTEGER");
    localStringBuilder.append(" download_flag INTEGER");
    localae.dhI[7] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final com.tencent.mm.sdk.f.ae nF()
  {
    return null;
  }

  public final String vu()
  {
    if (this.field_md5 == null)
      return "";
    return this.field_md5;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ae
 * JD-Core Version:    0.6.2
 */