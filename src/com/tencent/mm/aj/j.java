package com.tencent.mm.aj;

import com.tencent.mm.c.b.am;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public class j extends am
{
  protected static Field[] dFq = am.c(j.class);
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[11];
    localae.dhI = new String[12];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "svrid";
    localae.iGy.put("svrid", "LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(" svrid LONG default '0'  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "svrid";
    localae.dhI[1] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[2] = "type";
    localae.iGy.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[3] = "scene";
    localae.iGy.put("scene", "INTEGER");
    localStringBuilder.append(" scene INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[4] = "createtime";
    localae.iGy.put("createtime", "LONG");
    localStringBuilder.append(" createtime LONG");
    localStringBuilder.append(", ");
    localae.dhI[5] = "talker";
    localae.iGy.put("talker", "TEXT");
    localStringBuilder.append(" talker TEXT");
    localStringBuilder.append(", ");
    localae.dhI[6] = "content";
    localae.iGy.put("content", "TEXT");
    localStringBuilder.append(" content TEXT");
    localStringBuilder.append(", ");
    localae.dhI[7] = "sayhiuser";
    localae.iGy.put("sayhiuser", "TEXT");
    localStringBuilder.append(" sayhiuser TEXT");
    localStringBuilder.append(", ");
    localae.dhI[8] = "sayhicontent";
    localae.iGy.put("sayhicontent", "TEXT");
    localStringBuilder.append(" sayhicontent TEXT");
    localStringBuilder.append(", ");
    localae.dhI[9] = "imgpath";
    localae.iGy.put("imgpath", "TEXT");
    localStringBuilder.append(" imgpath TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "isSend";
    localae.iGy.put("isSend", "INTEGER");
    localStringBuilder.append(" isSend INTEGER");
    localae.dhI[11] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.j
 * JD-Core Version:    0.6.2
 */