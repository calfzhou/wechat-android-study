package com.tencent.mm.am;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class l
  implements com.tencent.mm.pluginsdk.downloader.d.b
{
  l(String paramString, Context paramContext, b paramb, c paramc)
  {
  }

  public final void a(File paramFile, String paramString)
  {
    a.a(paramFile, paramString, this.jSc, this.dLL);
    a.b(paramFile, paramString, this.jSc);
  }

  public final void a(String paramString, Exception paramException)
  {
    z.e("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "AarDownloadTask failed. plugin:%s", new Object[] { paramString });
    this.jSM.b(paramException);
  }

  public final void b(File paramFile, String paramString)
  {
    a.b(paramFile, this.jSc, paramString);
    if (this.jSL != null)
      this.jSL.onDone();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.l
 * JD-Core Version:    0.6.2
 */