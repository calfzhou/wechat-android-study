package com.tencent.mm.pluginsdk.downloader.a;

import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public abstract class b
{
  public static final String[] htG = { "shoot" };
  public volatile int htF = c.htI;
  public final a htH;

  protected b(a parama)
  {
    this.htH = parama;
  }

  protected static File c(PluginDescription paramPluginDescription)
  {
    File localFile = p.a(paramPluginDescription);
    if ((paramPluginDescription == null) || (localFile == null) || (paramPluginDescription.cHL == null))
      localFile = null;
    while (true)
    {
      return localFile;
      try
      {
        boolean bool = paramPluginDescription.cHL.equalsIgnoreCase(com.tencent.mm.pluginsdk.downloader.c.a.h(localFile));
        if (bool)
          continue;
        return null;
      }
      catch (IOException localIOException)
      {
        z.e("!24@qEYChq9cGaw2suaLx4NVxg==", "tryLoadPluginFromLocal %s", new Object[] { localIOException });
        return null;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        while (true)
          z.e("!24@qEYChq9cGaw2suaLx4NVxg==", "tryLoadPluginFromLocal %s", new Object[] { localNoSuchAlgorithmException });
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.a.b
 * JD-Core Version:    0.6.2
 */