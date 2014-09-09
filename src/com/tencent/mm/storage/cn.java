package com.tencent.mm.storage;

import com.tencent.mm.c.b.ar;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class cn extends ar
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[4];
    localae.dhI = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "encryptUsername";
    localae.iGy.put("encryptUsername", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" encryptUsername TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "encryptUsername";
    localae.dhI[1] = "conRemark";
    localae.iGy.put("conRemark", "TEXT default '' ");
    localStringBuilder.append(" conRemark TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "contactLabels";
    localae.iGy.put("contactLabels", "TEXT default '' ");
    localStringBuilder.append(" contactLabels TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "conDescription";
    localae.iGy.put("conDescription", "TEXT default '' ");
    localStringBuilder.append(" conDescription TEXT default '' ");
    localae.dhI[4] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public cn()
  {
    this.field_encryptUsername = "";
    this.field_conRemark = "";
  }

  public cn(String paramString1, String paramString2)
  {
    this();
    if (paramString1 == null)
      paramString1 = "";
    this.field_encryptUsername = paramString1;
    if (paramString2 == null)
      paramString2 = "";
    this.field_conRemark = paramString2;
  }

  protected final Object clone()
  {
    return super.clone();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cn
 * JD-Core Version:    0.6.2
 */