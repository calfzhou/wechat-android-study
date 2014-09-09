package com.tencent.mm.pluginsdk.downloader;

import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.pluginsdk.downloader.d.b;
import com.tencent.mm.pluginsdk.downloader.d.d;
import java.io.File;

final class e
  implements d
{
  e(c paramc, PluginDescription paramPluginDescription, String paramString, b paramb)
  {
  }

  public final void a(String paramString, Exception paramException)
  {
    File localFile = c.d(this.jSb);
    if ((localFile != null) && (this.jSb.cHL != null))
      this.jSd.b(localFile, this.jSb.cHL);
    while (true)
    {
      this.jSa.htF = com.tencent.mm.pluginsdk.downloader.a.c.htI;
      return;
      this.jSd.a(paramString, paramException);
    }
  }

  public final void e(PluginDescription paramPluginDescription)
  {
    c.a(this.jSa, paramPluginDescription, this.jSb, this.jSc, this.jSd);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.e
 * JD-Core Version:    0.6.2
 */