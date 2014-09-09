package com.tencent.mm.pluginsdk.downloader;

import android.content.Context;
import android.widget.Toast;
import com.tencent.mm.ad.w;
import com.tencent.mm.compatible.loader.PluginDescription;
import com.tencent.mm.compatible.loader.p;
import com.tencent.mm.pluginsdk.downloader.d.f;
import com.tencent.mm.pluginsdk.downloader.d.g;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public final class c extends com.tencent.mm.pluginsdk.downloader.a.b
{
  private static c jRW = null;
  private com.tencent.mm.pluginsdk.model.downloader.n htB;
  private long htC = 0L;
  private com.tencent.mm.pluginsdk.downloader.d.d jRX;
  private String jRY;
  public final a jRZ = new a();

  private c(com.tencent.mm.pluginsdk.downloader.a.a parama)
  {
    super(parama);
  }

  private static void CL(String paramString)
  {
    Toast.makeText(ak.getContext(), paramString, 0).show();
  }

  private static boolean a(PluginDescription paramPluginDescription1, PluginDescription paramPluginDescription2)
  {
    if (paramPluginDescription1 != null);
    try
    {
      boolean bool1;
      if (p.a(paramPluginDescription2).exists())
      {
        boolean bool2 = paramPluginDescription2.cHL.equalsIgnoreCase(com.tencent.mm.pluginsdk.downloader.c.a.h(p.a(paramPluginDescription2)));
        bool1 = false;
        if (bool2);
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    catch (IOException localIOException)
    {
      z.e("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "need DownlaodPlugin exception:%s", new Object[] { localIOException });
      return true;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
        z.e("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "need DownlaodPlugin exception:%s", new Object[] { localNoSuchAlgorithmException });
    }
  }

  public static c bcs()
  {
    if (jRW == null);
    try
    {
      jRW = new c(new com.tencent.mm.pluginsdk.downloader.a.a(new g(), new f(new com.tencent.mm.pluginsdk.downloader.b.a())));
      return jRW;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String uL(String paramString)
  {
    if (paramString.equals("shoot"))
      paramString = ak.getContext().getString(com.tencent.mm.n.cDN);
    return paramString;
  }

  public final void a(String paramString, com.tencent.mm.pluginsdk.downloader.d.b paramb)
  {
    PluginDescription localPluginDescription = p.uu(paramString);
    z.i("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "startDownloadPluginIfNecessary name: %s", new Object[] { paramString });
    if (this.htF == com.tencent.mm.pluginsdk.downloader.a.c.htI)
    {
      e locale = new e(this, localPluginDescription, paramString, paramb);
      this.jRY = paramString;
      this.jRX = locale;
      z.i("!44@/B4Tb64lLpJVwK899MjSHkgJWTIHf/+q/8VnyBTv2XM=", "updateDescription %s", new Object[] { paramString });
      w.ajw().a(new d(this));
      w.ajw().update();
      return;
    }
    switch (g.jSf[(-1 + this.htF)])
    {
    default:
      return;
    case 1:
    }
    CL(ak.getContext().getString(com.tencent.mm.n.fBC));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.downloader.c
 * JD-Core Version:    0.6.2
 */