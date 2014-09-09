package com.tencent.mm.plugin.safedevice.a;

import com.tencent.mm.c.b.ak;
import com.tencent.mm.protocal.a.wu;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class c extends ak
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[4];
    localae.dhI = new String[5];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "uid";
    localae.iGy.put("uid", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" uid TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "uid";
    localae.dhI[1] = "name";
    localae.iGy.put("name", "TEXT default '' ");
    localStringBuilder.append(" name TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "devicetype";
    localae.iGy.put("devicetype", "TEXT default '' ");
    localStringBuilder.append(" devicetype TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "createtime";
    localae.iGy.put("createtime", "LONG default '0' ");
    localStringBuilder.append(" createtime LONG default '0' ");
    localae.dhI[4] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public c()
  {
    this.field_uid = "0";
    this.field_name = "";
    this.field_devicetype = "";
    this.field_createtime = 0L;
  }

  public c(wu paramwu)
  {
    this.field_createtime = paramwu.hOV;
    this.field_devicetype = paramwu.ieD;
    this.field_name = paramwu.KH;
    this.field_uid = paramwu.hVl;
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.c
 * JD-Core Version:    0.6.2
 */