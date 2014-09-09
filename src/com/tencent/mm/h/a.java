package com.tencent.mm.h;

import com.tencent.mm.c.b.j;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public class a extends j
{
  public static final String dPB = null;
  public static ae dhu;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[18];
    localae.dhI = new String[19];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "username";
    localae.iGy.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "username";
    localae.dhI[1] = "unReadCount";
    localae.iGy.put("unReadCount", "INTEGER default '0' ");
    localStringBuilder.append(" unReadCount INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[2] = "chatmode";
    localae.iGy.put("chatmode", "INTEGER default '0' ");
    localStringBuilder.append(" chatmode INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[3] = "status";
    localae.iGy.put("status", "INTEGER default '0' ");
    localStringBuilder.append(" status INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[4] = "isSend";
    localae.iGy.put("isSend", "INTEGER default '0' ");
    localStringBuilder.append(" isSend INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[5] = "conversationTime";
    localae.iGy.put("conversationTime", "LONG default '0' ");
    localStringBuilder.append(" conversationTime LONG default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[6] = "content";
    localae.iGy.put("content", "TEXT default '' ");
    localStringBuilder.append(" content TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[7] = "msgType";
    localae.iGy.put("msgType", "TEXT default '' ");
    localStringBuilder.append(" msgType TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[8] = "customNotify";
    localae.iGy.put("customNotify", "TEXT default '' ");
    localStringBuilder.append(" customNotify TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[9] = "showTips";
    localae.iGy.put("showTips", "INTEGER default '0' ");
    localStringBuilder.append(" showTips INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[10] = "flag";
    localae.iGy.put("flag", "LONG default '0' ");
    localStringBuilder.append(" flag LONG default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[11] = "digest";
    localae.iGy.put("digest", "TEXT default '' ");
    localStringBuilder.append(" digest TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[12] = "digestUser";
    localae.iGy.put("digestUser", "TEXT default '' ");
    localStringBuilder.append(" digestUser TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[13] = "hasTrunc";
    localae.iGy.put("hasTrunc", "INTEGER default '0' ");
    localStringBuilder.append(" hasTrunc INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[14] = "parentRef";
    localae.iGy.put("parentRef", "TEXT");
    localStringBuilder.append(" parentRef TEXT");
    localStringBuilder.append(", ");
    localae.dhI[15] = "attrflag";
    localae.iGy.put("attrflag", "INTEGER default '0' ");
    localStringBuilder.append(" attrflag INTEGER default '0' ");
    localStringBuilder.append(", ");
    localae.dhI[16] = "editingMsg";
    localae.iGy.put("editingMsg", "TEXT default '' ");
    localStringBuilder.append(" editingMsg TEXT default '' ");
    localStringBuilder.append(", ");
    localae.dhI[17] = "atCount";
    localae.iGy.put("atCount", "INTEGER default '0' ");
    localStringBuilder.append(" atCount INTEGER default '0' ");
    localae.dhI[18] = "rowid";
    localae.dlP = localStringBuilder.toString();
    dhu = localae;
  }

  public a()
  {
  }

  public a(String paramString)
  {
    setUsername(paramString);
  }

  public final void Ab()
  {
    by(0x200000 | jS());
  }

  public final boolean cw(int paramInt)
  {
    return (paramInt & jS()) != 0;
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.h.a
 * JD-Core Version:    0.6.2
 */