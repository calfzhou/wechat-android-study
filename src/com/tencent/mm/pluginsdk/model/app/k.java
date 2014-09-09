package com.tencent.mm.pluginsdk.model.app;

import android.content.ContentValues;
import com.tencent.mm.c.b.b;
import com.tencent.mm.sdk.f.ae;
import com.tencent.mm.sdk.platformtools.ch;
import java.lang.reflect.Field;
import java.util.Map;

public final class k extends b
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[23];
    localae.dhI = new String[24];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "appId";
    localae.iGy.put("appId", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" appId TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "appId";
    localae.dhI[1] = "appName";
    localae.iGy.put("appName", "TEXT");
    localStringBuilder.append(" appName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "appDiscription";
    localae.iGy.put("appDiscription", "TEXT");
    localStringBuilder.append(" appDiscription TEXT");
    localStringBuilder.append(", ");
    localae.dhI[3] = "appIconUrl";
    localae.iGy.put("appIconUrl", "TEXT");
    localStringBuilder.append(" appIconUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[4] = "appStoreUrl";
    localae.iGy.put("appStoreUrl", "TEXT");
    localStringBuilder.append(" appStoreUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[5] = "appVersion";
    localae.iGy.put("appVersion", "INTEGER");
    localStringBuilder.append(" appVersion INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "appWatermarkUrl";
    localae.iGy.put("appWatermarkUrl", "TEXT");
    localStringBuilder.append(" appWatermarkUrl TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "packageName";
    localae.iGy.put("packageName", "TEXT");
    localStringBuilder.append(" packageName TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[9] = "signature";
    localae.iGy.put("signature", "TEXT");
    localStringBuilder.append(" signature TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "modifyTime";
    localae.iGy.put("modifyTime", "LONG");
    localStringBuilder.append(" modifyTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[11] = "appName_en";
    localae.iGy.put("appName_en", "TEXT");
    localStringBuilder.append(" appName_en TEXT");
    localStringBuilder.append(", ");
    localae.dhI[12] = "appName_tw";
    localae.iGy.put("appName_tw", "TEXT");
    localStringBuilder.append(" appName_tw TEXT");
    localStringBuilder.append(", ");
    localae.dhI[13] = "appDiscription_en";
    localae.iGy.put("appDiscription_en", "TEXT");
    localStringBuilder.append(" appDiscription_en TEXT");
    localStringBuilder.append(", ");
    localae.dhI[14] = "appDiscription_tw";
    localae.iGy.put("appDiscription_tw", "TEXT");
    localStringBuilder.append(" appDiscription_tw TEXT");
    localStringBuilder.append(", ");
    localae.dhI[15] = "appType";
    localae.iGy.put("appType", "TEXT");
    localStringBuilder.append(" appType TEXT");
    localStringBuilder.append(", ");
    localae.dhI[16] = "openId";
    localae.iGy.put("openId", "TEXT");
    localStringBuilder.append(" openId TEXT");
    localStringBuilder.append(", ");
    localae.dhI[17] = "authFlag";
    localae.iGy.put("authFlag", "INTEGER");
    localStringBuilder.append(" authFlag INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[18] = "appInfoFlag";
    localae.iGy.put("appInfoFlag", "INTEGER default '-1' ");
    localStringBuilder.append(" appInfoFlag INTEGER default '-1' ");
    localStringBuilder.append(", ");
    localae.dhI[19] = "lvbuff";
    localae.iGy.put("lvbuff", "BLOB");
    localStringBuilder.append(" lvbuff BLOB");
    localStringBuilder.append(", ");
    localae.dhI[20] = "serviceAppType";
    localae.iGy.put("serviceAppType", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppType INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[21] = "serviceAppInfoFlag";
    localae.iGy.put("serviceAppInfoFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceAppInfoFlag INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[22] = "serviceShowFlag";
    localae.iGy.put("serviceShowFlag", "INTEGER default '0' ");
    localStringBuilder.append(" serviceShowFlag INTEGER default '0' ");
    localae.dhI[23] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public k()
  {
    this.field_appId = "";
    this.field_appName = "";
    this.field_appDiscription = "";
    this.field_appIconUrl = "";
    this.field_appStoreUrl = "";
    this.field_appVersion = 0;
    this.field_appWatermarkUrl = "";
    this.field_packageName = "";
    this.field_status = 4;
    this.field_signature = "";
    this.field_modifyTime = 0L;
    this.field_appName_en = "";
    this.field_appName_tw = "";
    this.field_appDiscription_en = "";
    this.field_appDiscription_tw = "";
    this.field_appInfoFlag = 0;
    this.field_appType = "";
    this.field_openId = "";
    this.field_authFlag = 0;
    this.field_appInfoFlag = 0;
    az("");
    ay("");
    ax("");
    aA("");
    aB("");
    aG("");
    aH("");
    aI("");
  }

  public final boolean avN()
  {
    if (ch.jb(this.field_appType));
    while (true)
    {
      return false;
      String[] arrayOfString = this.field_appType.split(",");
      if ((arrayOfString != null) && (arrayOfString.length != 0))
      {
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
          if (arrayOfString[j].equals("1"))
            return true;
      }
    }
  }

  public final boolean ayE()
  {
    return this.field_serviceAppType != 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == null);
    do
    {
      return false;
      if (paramObject == this)
        return true;
    }
    while (!(paramObject instanceof k));
    return ((k)paramObject).field_appId.equals(this.field_appId);
  }

  public final int hashCode()
  {
    if (!ch.jb(this.field_appId))
      return this.field_appId.hashCode();
    return super.hashCode();
  }

  public final ContentValues ir()
  {
    if ((!ch.jb(this.field_appType)) && (this.field_appType.startsWith("1")))
      this.field_appType = ("," + this.field_appType);
    return super.ir();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.k
 * JD-Core Version:    0.6.2
 */