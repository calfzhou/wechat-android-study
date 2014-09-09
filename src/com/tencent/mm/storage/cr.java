package com.tencent.mm.storage;

import com.tencent.mm.c.b.at;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class cr extends at
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[3];
    localae.dhI = new String[4];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "openId";
    localae.iGy.put("openId", "TEXT PRIMARY KEY ");
    localStringBuilder.append(" openId TEXT PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "openId";
    localae.dhI[1] = "appId";
    localae.iGy.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "username";
    localae.iGy.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localae.dhI[3] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public cr()
  {
  }

  public cr(String paramString1, String paramString2, String paramString3)
  {
    this.field_appId = paramString1;
    this.field_username = paramString2;
    this.field_openId = paramString3;
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cr
 * JD-Core Version:    0.6.2
 */