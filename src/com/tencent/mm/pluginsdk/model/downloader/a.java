package com.tencent.mm.pluginsdk.model.downloader;

import java.io.File;

final class a
  implements Runnable
{
  a(String paramString, c paramc, File paramFile)
  {
  }

  public final void run()
  {
    b localb = new b(this.hvT, this.hvU);
    File[] arrayOfFile = new File[1];
    arrayOfFile[0] = this.dPq;
    localb.execute(arrayOfFile);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.downloader.a
 * JD-Core Version:    0.6.2
 */