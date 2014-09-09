package com.tencent.mm.plugin.voicereminder.a;

import com.tencent.mm.c.b.au;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class n extends au
{
  protected static ae dhu = localae;
  private int cGN = -1;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[17];
    localae.dhI = new String[18];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "filename";
    localae.iGy.put("filename", "TEXT");
    localStringBuilder.append(" filename TEXT");
    localStringBuilder.append(", ");
    localae.dhI[1] = "user";
    localae.iGy.put("user", "TEXT");
    localStringBuilder.append(" user TEXT");
    localStringBuilder.append(", ");
    localae.dhI[2] = "msgid";
    localae.iGy.put("msgid", "LONG");
    localStringBuilder.append(" msgid LONG");
    localStringBuilder.append(", ");
    localae.dhI[3] = "offset";
    localae.iGy.put("offset", "INTEGER");
    localStringBuilder.append(" offset INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[4] = "filenowsize";
    localae.iGy.put("filenowsize", "INTEGER");
    localStringBuilder.append(" filenowsize INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[5] = "totallen";
    localae.iGy.put("totallen", "INTEGER");
    localStringBuilder.append(" totallen INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[6] = "status";
    localae.iGy.put("status", "INTEGER");
    localStringBuilder.append(" status INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[7] = "createtime";
    localae.iGy.put("createtime", "LONG");
    localStringBuilder.append(" createtime LONG");
    localStringBuilder.append(", ");
    localae.dhI[8] = "lastmodifytime";
    localae.iGy.put("lastmodifytime", "LONG");
    localStringBuilder.append(" lastmodifytime LONG");
    localStringBuilder.append(", ");
    localae.dhI[9] = "clientid";
    localae.iGy.put("clientid", "TEXT");
    localStringBuilder.append(" clientid TEXT");
    localStringBuilder.append(", ");
    localae.dhI[10] = "voicelenght";
    localae.iGy.put("voicelenght", "INTEGER");
    localStringBuilder.append(" voicelenght INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[11] = "msglocalid";
    localae.iGy.put("msglocalid", "INTEGER");
    localStringBuilder.append(" msglocalid INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[12] = "human";
    localae.iGy.put("human", "TEXT");
    localStringBuilder.append(" human TEXT");
    localStringBuilder.append(", ");
    localae.dhI[13] = "voiceformat";
    localae.iGy.put("voiceformat", "INTEGER");
    localStringBuilder.append(" voiceformat INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[14] = "nettimes";
    localae.iGy.put("nettimes", "INTEGER");
    localStringBuilder.append(" nettimes INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[15] = "reserved1";
    localae.iGy.put("reserved1", "INTEGER");
    localStringBuilder.append(" reserved1 INTEGER");
    localStringBuilder.append(", ");
    localae.dhI[16] = "reserved2";
    localae.iGy.put("reserved2", "TEXT");
    localStringBuilder.append(" reserved2 TEXT");
    localae.dhI[17] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  public final boolean BK()
  {
    return ((this.field_status > 1) && (this.field_status <= 3)) || (this.field_status == 8);
  }

  public final void db(int paramInt)
  {
    this.cGN = paramInt;
  }

  protected final ae nF()
  {
    return dhu;
  }

  public final int ss()
  {
    return this.cGN;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.n
 * JD-Core Version:    0.6.2
 */