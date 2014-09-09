package com.tencent.mm.ai;

import java.lang.reflect.Field;
import java.util.Map;

public class e extends com.tencent.mm.c.b.ae
{
  protected static com.tencent.mm.sdk.f.ae dhu = localae;

  static
  {
    com.tencent.mm.sdk.f.ae localae = new com.tencent.mm.sdk.f.ae();
    localae.dFq = new Field[13];
    localae.dhI = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "msgId";
    localae.iGy.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "msgId";
    localae.dhI[1] = "msgSvrId";
    localae.iGy.put("msgSvrId", "LONG");
    localStringBuilder.append(" msgSvrId LONG");
    localStringBuilder.append(", ");
    localae.dhI[2] = "type";
    localae.iGy.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[3] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[4] = "isSend";
    localae.iGy.put("isSend", "INTEGER");
    localStringBuilder.append(" isSend INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[5] = "isShowTimer";
    localae.iGy.put("isShowTimer", "INTEGER");
    localStringBuilder.append(" isShowTimer INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "createTime";
    localae.iGy.put("createTime", "LONG");
    localStringBuilder.append(" createTime LONG");
    localStringBuilder.append(", ");
    localae.dhI[7] = "talker";
    localae.iGy.put("talker", "TEXT");
    localStringBuilder.append(" talker TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "content";
    localae.iGy.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[9] = "imgPath";
    localae.iGy.put("imgPath", "TEXT");
    localStringBuilder.append(" imgPath TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "reserved";
    localae.iGy.put("reserved", "TEXT");
    localStringBuilder.append(" reserved TEXT");
    localStringBuilder.append(", ");
    localae.dhI[11] = "lvbuffer";
    localae.iGy.put("lvbuffer", "BLOB");
    localStringBuilder.append(" lvbuffer BLOB");
    localStringBuilder.append(", ");
    localae.dhI[12] = "transContent";
    localae.iGy.put("transContent", "TEXT default '' ");
    localStringBuilder.append(" transContent TEXT default '' ");
    localae.dhI[13] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final com.tencent.mm.sdk.f.ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.e
 * JD-Core Version:    0.6.2
 */