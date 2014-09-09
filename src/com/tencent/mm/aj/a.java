package com.tencent.mm.aj;

import com.tencent.mm.c.b.o;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class a extends o
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[17];
    localae.dhI = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "talker";
    localae.iGy.put("talker", "TEXT default '0'  PRIMARY KEY ");
    localStringBuilder.append(" talker TEXT default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "talker";
    localae.dhI[1] = "encryptTalker";
    localae.iGy.put("encryptTalker", "TEXT default '' ");
    localStringBuilder.append(" encryptTalker TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "displayName";
    localae.iGy.put("displayName", "TEXT default '' ");
    localStringBuilder.append(" displayName TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "state";
    localae.iGy.put("state", "INTEGER default '0' ");
    localStringBuilder.append(" state INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[4] = "lastModifiedTime";
    localae.iGy.put("lastModifiedTime", "LONG default '0' ");
    localStringBuilder.append(" lastModifiedTime LONG default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[5] = "isNew";
    localae.iGy.put("isNew", "INTEGER default '0' ");
    localStringBuilder.append(" isNew INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[6] = "addScene";
    localae.iGy.put("addScene", "INTEGER default '0' ");
    localStringBuilder.append(" addScene INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[7] = "fmsgSysRowId";
    localae.iGy.put("fmsgSysRowId", "LONG default '0' ");
    localStringBuilder.append(" fmsgSysRowId LONG default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[8] = "fmsgIsSend";
    localae.iGy.put("fmsgIsSend", "INTEGER default '0' ");
    localStringBuilder.append(" fmsgIsSend INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[9] = "fmsgType";
    localae.iGy.put("fmsgType", "INTEGER default '0' ");
    localStringBuilder.append(" fmsgType INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[10] = "fmsgContent";
    localae.iGy.put("fmsgContent", "TEXT default '' ");
    localStringBuilder.append(" fmsgContent TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "recvFmsgType";
    localae.iGy.put("recvFmsgType", "INTEGER default '0' ");
    localStringBuilder.append(" recvFmsgType INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[12] = "contentFromUsername";
    localae.iGy.put("contentFromUsername", "TEXT default '' ");
    localStringBuilder.append(" contentFromUsername TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[13] = "contentNickname";
    localae.iGy.put("contentNickname", "TEXT default '' ");
    localStringBuilder.append(" contentNickname TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[14] = "contentPhoneNumMD5";
    localae.iGy.put("contentPhoneNumMD5", "TEXT default '' ");
    localStringBuilder.append(" contentPhoneNumMD5 TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[15] = "contentFullPhoneNumMD5";
    localae.iGy.put("contentFullPhoneNumMD5", "TEXT default '' ");
    localStringBuilder.append(" contentFullPhoneNumMD5 TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[16] = "contentVerifyContent";
    localae.iGy.put("contentVerifyContent", "TEXT default '' ");
    localStringBuilder.append(" contentVerifyContent TEXT default '' ");
    localae.dhI[17] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.a
 * JD-Core Version:    0.6.2
 */