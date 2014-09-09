package com.tencent.mm.storage;

import com.tencent.mm.c.b.w;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class an extends w
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[13];
    localae.dhI = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "downloadId";
    localae.iGy.put("downloadId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" downloadId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "downloadId";
    localae.dhI[1] = "downloadKey";
    localae.iGy.put("downloadKey", "TEXT");
    localStringBuilder.append(" downloadKey TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "fileName";
    localae.iGy.put("fileName", "TEXT");
    localStringBuilder.append(" fileName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "filePath";
    localae.iGy.put("filePath", "TEXT");
    localStringBuilder.append(" filePath TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "status";
    localae.iGy.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[5] = "isNotified";
    localae.iGy.put("isNotified", "INTEGER default '0' ");
    localStringBuilder.append(" isNotified INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[6] = "md5";
    localae.iGy.put("md5", "TEXT default '0' ");
    localStringBuilder.append(" md5 TEXT default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[7] = "downloadUrl";
    localae.iGy.put("downloadUrl", "TEXT default '0' ");
    localStringBuilder.append(" downloadUrl TEXT default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[8] = "source";
    localae.iGy.put("source", "INTEGER default '0' ");
    localStringBuilder.append(" source INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[9] = "filePathFromURI";
    localae.iGy.put("filePathFromURI", "TEXT default '' ");
    localStringBuilder.append(" filePathFromURI TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[10] = "isGameFile";
    localae.iGy.put("isGameFile", "INTEGER default '0' ");
    localStringBuilder.append(" isGameFile INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "autoInstall";
    localae.iGy.put("autoInstall", "INTEGER default '0' ");
    localStringBuilder.append(" autoInstall INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[12] = "fromAppId";
    localae.iGy.put("fromAppId", "TEXT");
    localStringBuilder.append(" fromAppId TEXT");
    localae.dhI[13] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public an()
  {
    this.field_downloadId = -1L;
    this.field_downloadKey = "";
    this.field_fileName = "";
    this.field_filePath = "";
    this.field_isNotified = 0;
    this.field_md5 = "";
    this.field_status = 64;
    this.field_downloadUrl = "";
    this.field_isGameFile = 0;
    this.field_autoInstall = 0;
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.an
 * JD-Core Version:    0.6.2
 */