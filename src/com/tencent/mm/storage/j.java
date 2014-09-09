package com.tencent.mm.storage;

import com.tencent.mm.c.b.h;
import com.tencent.mm.sdk.f.ae;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends h
{
  protected static ae dhu = localae;

  static
  {
    ae localae = new ae();
    localae.dFq = new Field[2];
    localae.dhI = new String[3];
    StringBuilder localStringBuilder = new StringBuilder();
    localae.dhI[0] = "username";
    localae.iGy.put("username", "TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(" username TEXT default ''  PRIMARY KEY ");
    localStringBuilder.append(", ");
    localae.ihb = "username";
    localae.dhI[1] = "cmdbuf";
    localae.iGy.put("cmdbuf", "BLOB default '' ");
    localStringBuilder.append(" cmdbuf BLOB default '' ");
    localae.dhI[2] = "rowid";
    localae.dlP = localStringBuilder.toString();
  }

  protected final ae nF()
  {
    return dhu;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.j
 * JD-Core Version:    0.6.2
 */