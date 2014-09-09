package com.tencent.mm.pluginsdk.downloader.d;

import com.tencent.mm.sdk.platformtools.z;

public final class c extends e
{
  private final d htV;

  public final String ayo()
  {
    return "ConfigFileDownload_";
  }

  public final void run()
  {
    super.run();
    z.i("!32@WVXlI8+rNDMVAOy3QEkvlUZrNGm/VhWj", "-->Start downloading config file");
    try
    {
      this.htE.c(this.url);
      this.htE.i(this.htX);
      this.htV.e(null);
      z.i("!32@WVXlI8+rNDMVAOy3QEkvlUZrNGm/VhWj", "<--End downloading config file");
      return;
    }
    catch (Exception localException)
    {
      while (true)
        this.htV.a(this.htW, localException);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.c
 * JD-Core Version:    0.6.2
 */