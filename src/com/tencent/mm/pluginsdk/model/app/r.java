package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.ai.a;
import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;

public final class r extends ah
{
  public static final String[] dmc = arrayOfString;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(a.dhu, "AppMessage");
  }

  public r(af paramaf)
  {
    super(paramaf, a.dhu, "AppMessage", null);
  }

  public final a cp(long paramLong)
  {
    a locala = new a();
    locala.field_msgId = paramLong;
    if (super.c(locala, new String[0]))
      return locala;
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.r
 * JD-Core Version:    0.6.2
 */