package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.sdk.f.af;
import com.tencent.mm.sdk.f.ah;
import com.tencent.mm.sdk.platformtools.ch;

public final class b extends ah
{
  public static final String[] dmc = arrayOfString;
  private af dtV;

  static
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = ah.a(a.dhu, "appattach");
  }

  public b(af paramaf)
  {
    super(paramaf, a.dhu, "appattach", null);
    this.dtV = paramaf;
  }

  public final void cn(long paramLong)
  {
    String str = " update appattach set status = 198" + " , lastModifyTime = " + ch.CL() + " where rowid = " + paramLong;
    this.dtV.bp("appattach", str);
    Bo();
  }

  public final a co(long paramLong)
  {
    a locala = new a();
    locala.field_msgInfoId = paramLong;
    if (c(locala, new String[] { "msgInfoId" }))
      return locala;
    return null;
  }

  public final a uU(String paramString)
  {
    a locala = new a();
    locala.field_mediaSvrId = paramString;
    if (c(locala, new String[] { "mediaSvrId" }));
    while (c(locala, new String[] { "mediaId" }))
      return locala;
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.b
 * JD-Core Version:    0.6.2
 */