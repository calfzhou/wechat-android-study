package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends com.tencent.mm.c.b.a
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[16];
    localae.dhI = new String[17];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "appId";
    localae.iGy.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[1] = "sdkVer";
    localae.iGy.put("sdkVer", "LONG");
    localStringBuilder.append(" sdkVer LONG");
    localStringBuilder.append(", ");
    localae.dhI[2] = "mediaSvrId";
    localae.iGy.put("mediaSvrId", "TEXT");
    localStringBuilder.append(" mediaSvrId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "mediaId";
    localae.iGy.put("mediaId", "TEXT");
    localStringBuilder.append(" mediaId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "clientAppDataId";
    localae.iGy.put("clientAppDataId", "TEXT");
    localStringBuilder.append(" clientAppDataId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "type";
    localae.iGy.put("type", "LONG");
    localStringBuilder.append(" type LONG");
    localStringBuilder.append(", ");
    localae.dhI[6] = "totalLen";
    localae.iGy.put("totalLen", "LONG");
    localStringBuilder.append(" totalLen LONG");
    localStringBuilder.append(", ");
    localae.dhI[7] = "offset";
    localae.iGy.put("offset", "LONG");
    localStringBuilder.append(" offset LONG");
    localStringBuilder.append(", ");
    localae.dhI[8] = "status";
    localae.iGy.put("status", "LONG");
    localStringBuilder.append(" status LONG");
    localStringBuilder.append(", ");
    localae.dhI[9] = "isUpload";
    localae.iGy.put("isUpload", "INTEGER");
    localStringBuilder.append(" isUpload INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[10] = "createTime";
    localae.iGy.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[11] = "lastModifyTime";
    localae.iGy.put("lastModifyTime", "LONG");
    localStringBuilder.append(" lastModifyTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[12] = "fileFullPath";
    localae.iGy.put("fileFullPath", "TEXT");
    localStringBuilder.append(" fileFullPath TEXT");
    localStringBuilder.append(", ");
    localae.dhI[13] = "msgInfoId";
    localae.iGy.put("msgInfoId", "LONG");
    localStringBuilder.append(" msgInfoId LONG");
    localStringBuilder.append(", ");
    localae.dhI[14] = "netTimes";
    localae.iGy.put("netTimes", "LONG");
    localStringBuilder.append(" netTimes LONG");
    localStringBuilder.append(", ");
    localae.dhI[15] = "isUseCdn";
    localae.iGy.put("isUseCdn", "INTEGER");
    localStringBuilder.append(" isUseCdn INTEGER");
    localae.dhI[16] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public a()
  {
    this.field_netTimes = 0L;
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final boolean sl()
  {
    if (this.field_totalLen <= 0L);
    while (this.field_offset != this.field_totalLen)
      return false;
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.a
 * JD-Core Version:    0.6.2
 */