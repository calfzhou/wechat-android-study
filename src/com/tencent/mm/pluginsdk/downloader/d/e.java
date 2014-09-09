package com.tencent.mm.pluginsdk.downloader.d;

import java.io.File;
import java.net.URL;

public abstract class e
  implements Runnable
{
  protected final h htE;
  protected final String htW;
  protected final File htX;
  protected final URL url;

  public abstract String ayo();

  public void run()
  {
    Thread.currentThread().setName(ayo() + this.htW);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.e
 * JD-Core Version:    0.6.2
 */