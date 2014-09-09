package com.tencent.mm.pluginsdk.downloader.d;

import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.pluginsdk.downloader.b.b;
import com.tencent.mm.pluginsdk.downloader.c.a;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.net.URL;

public final class f
  implements h
{
  private final b htY;

  public f(b paramb)
  {
    this.htY = paramb;
  }

  public final InputStream b(URL paramURL)
  {
    z.d("!32@8aq08KPU7QXbTVvn38HXhGKn8pnJIAlh", "start to down load url:%s", new Object[] { paramURL });
    return this.htY.a(paramURL);
  }

  public final void b(InputStream paramInputStream, File paramFile)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramFile.getAbsolutePath();
    z.d("!32@8aq08KPU7QXbTVvn38HXhGKn8pnJIAlh", "save Plugin from inputStream to :%s", arrayOfObject);
    a.a(paramInputStream, paramFile);
  }

  public final PluginDescription c(URL paramURL)
  {
    byte[] arrayOfByte = a.e(this.htY.a(paramURL));
    z.d("!32@8aq08KPU7QXbTVvn38HXhGKn8pnJIAlh", "config:" + new String(arrayOfByte, "UTF-8"));
    return null;
  }

  public final void i(File paramFile)
  {
    try
    {
      FileWriter localFileWriter = new FileWriter(paramFile);
      a.b(localFileWriter);
      return;
    }
    finally
    {
      a.b(null);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.d.f
 * JD-Core Version:    0.6.2
 */