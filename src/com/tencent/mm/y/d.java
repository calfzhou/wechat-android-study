package com.tencent.mm.y;

import android.graphics.Bitmap;
import com.tencent.mm.cache.b;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

public final class d
{
  private HashMap dwU = new HashMap();

  public static void g(String paramString, Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "push fail, key is null");
      return;
    }
    b.a("local_cdn_img_cache", paramString, paramBitmap);
  }

  public static Bitmap gK(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      z.e("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "get fail, key is null");
      return null;
    }
    return (Bitmap)b.o("local_cdn_img_cache", paramString);
  }

  public final void a(String paramString, g paramg)
  {
    if (ch.jb(paramString))
      z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "do load fail, url is empty");
    Bitmap localBitmap;
    do
    {
      return;
      localBitmap = gK(paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
        break;
      z.i("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "do load ok, url[%s], bitmap exists", new Object[] { paramString });
    }
    while (paramg == null);
    paramg.c(localBitmap);
    return;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    if (localBitmap == null);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject[1] = Boolean.valueOf(bool);
      z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "try to download: url[%s], src bitmap is null[%B]", arrayOfObject);
      if (!this.dwU.containsKey(paramString))
        break;
      z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "contains url[%s]", new Object[] { paramString });
      return;
    }
    this.dwU.put(paramString, paramg);
    new f(paramString, this.dwU).start();
  }

  protected final void finalize()
  {
    super.finalize();
  }

  public final void gL(String paramString)
  {
    if (ch.jb(paramString))
    {
      z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "stop load fail, url is empty");
      return;
    }
    this.dwU.remove(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.d
 * JD-Core Version:    0.6.2
 */