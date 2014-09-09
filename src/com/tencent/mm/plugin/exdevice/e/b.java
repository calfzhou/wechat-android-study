package com.tencent.mm.plugin.exdevice.e;

import com.tencent.mm.c.b.ab;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class b extends ab
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[13];
    localae.dhI = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "deviceID";
    localae.iGy.put("deviceID", "TEXT");
    localStringBuilder.append(" deviceID TEXT");
    localStringBuilder.append(", ");
    localae.dhI[1] = "brandName";
    localae.iGy.put("brandName", "TEXT");
    localStringBuilder.append(" brandName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "mac";
    localae.iGy.put("mac", "LONG PRIMARY KEY ");
    localStringBuilder.append(" mac LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "mac";
    localae.dhI[3] = "deviceType";
    localae.iGy.put("deviceType", "TEXT");
    localStringBuilder.append(" deviceType TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "connProto";
    localae.iGy.put("connProto", "TEXT");
    localStringBuilder.append(" connProto TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "connStrategy";
    localae.iGy.put("connStrategy", "INTEGER");
    localStringBuilder.append(" connStrategy INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "closeStrategy";
    localae.iGy.put("closeStrategy", "INTEGER");
    localStringBuilder.append(" closeStrategy INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[7] = "md5Str";
    localae.iGy.put("md5Str", "TEXT");
    localStringBuilder.append(" md5Str TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "authKey";
    localae.iGy.put("authKey", "TEXT");
    localStringBuilder.append(" authKey TEXT");
    localStringBuilder.append(", ");
    localae.dhI[9] = "sessionKey";
    localae.iGy.put("sessionKey", "BLOB");
    localStringBuilder.append(" sessionKey BLOB");
    localStringBuilder.append(", ");
    localae.dhI[10] = "sessionBuf";
    localae.iGy.put("sessionBuf", "BLOB");
    localStringBuilder.append(" sessionBuf BLOB");
    localStringBuilder.append(", ");
    localae.dhI[11] = "authBuf";
    localae.iGy.put("authBuf", "BLOB");
    localStringBuilder.append(" authBuf BLOB");
    localStringBuilder.append(", ");
    localae.dhI[12] = "lvbuffer";
    localae.iGy.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localae.dhI[13] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.e.b
 * JD-Core Version:    0.6.2
 */