package com.tencent.mm.booter.cache;

import android.graphics.Bitmap;
import com.tencent.mm.cache.MCacheItem;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class a extends com.tencent.mm.cache.d
{
  public static a diW;
  private final com.tencent.mm.a.d diX = new com.tencent.mm.a.d(ch.getInt(com.tencent.mm.platformtools.a.a.u(ak.getContext(), "BACKGROUND_BITMAP_CACHE_LIMIT"), 2000));

  public static void destroy()
  {
    if (diW == null)
      return;
    diW.diX.clear();
  }

  public static void prepare()
  {
    if (diW == null)
      diW = new a();
  }

  public final void a(String paramString, Bitmap paramBitmap)
  {
    z.v("!32@/B4Tb64lLpLhzJusfWXg89/gcb/GJ8Qq", "setting bitmap: %s", new Object[] { paramString });
    this.diX.b(paramString, paramBitmap);
  }

  public final Bitmap cf(String paramString)
  {
    z.v("!32@/B4Tb64lLpLhzJusfWXg89/gcb/GJ8Qq", "getting bitmap: %s", new Object[] { paramString });
    return (Bitmap)this.diX.get(paramString);
  }

  public final MCacheItem cg(String paramString)
  {
    z.v("!32@/B4Tb64lLpLhzJusfWXg89/gcb/GJ8Qq", "getting cache item: %s", new Object[] { paramString });
    return null;
  }

  public final void ch(String paramString)
  {
    z.v("!32@/B4Tb64lLpLhzJusfWXg89/gcb/GJ8Qq", "setting cache item: %s", new Object[] { paramString });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.cache.a
 * JD-Core Version:    0.6.2
 */