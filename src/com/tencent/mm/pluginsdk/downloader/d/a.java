package com.tencent.mm.pluginsdk.downloader.d;

import com.tencent.mm.sdk.platformtools.z;
import java.io.InputStream;

public final class a extends e
{
  private final b htT;
  private final String htU;

  public final String ayo()
  {
    return "AarDownload_";
  }

  public final void run()
  {
    super.run();
    z.i("!24@eb88BT8oBE2uae+4yK+BlA==", "-->start download aarFileTask");
    try
    {
      InputStream localInputStream = this.htE.b(this.url);
      this.htE.b(localInputStream, this.htX);
      String str1 = this.htU;
      String str2 = com.tencent.mm.pluginsdk.downloader.c.a.h(this.htX);
      z.i("!24@eb88BT8oBE2uae+4yK+BlA==", "verifyPlugin,description hash:%s, file hash:%s.", new Object[] { str1, str2 });
      if (str1.equalsIgnoreCase(str2))
        this.htT.a(this.htX, this.htU);
      while (true)
      {
        z.i("!24@eb88BT8oBE2uae+4yK+BlA==", "<--end download aarFileTask");
        return;
        this.htT.a(this.htW, new IllegalArgumentException("Plugin Verify Error"));
      }
    }
    catch (Exception localException)
    {
      while (true)
        this.htT.a(this.htW, localException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.a
 * JD-Core Version:    0.6.2
 */