package com.tencent.mm.pluginsdk.downloader.d;

import com.tencent.mm.compatible.loader.PluginDescription;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public abstract interface h
{
  public abstract InputStream b(URL paramURL);

  public abstract void b(InputStream paramInputStream, File paramFile);

  public abstract PluginDescription c(URL paramURL);

  public abstract void i(File paramFile);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.h
 * JD-Core Version:    0.6.2
 */