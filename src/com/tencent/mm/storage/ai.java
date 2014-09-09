package com.tencent.mm.storage;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

public final class ai
{
  private final String TAG = "!44@/B4Tb64lLpKW6XSoHkFWUBNZw7JVuBRkz1obtuNKIN8=";
  private Map ijp = new HashMap();
  private Map ijq = new HashMap();

  private static void a(Map paramMap, String paramString, Bitmap paramBitmap)
  {
    if ((paramMap == null) || (paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled()));
    while (g(paramMap, paramString) == paramBitmap)
      return;
    paramMap.put(paramString, new SoftReference(paramBitmap));
  }

  private static Bitmap g(Map paramMap, String paramString)
  {
    Bitmap localBitmap;
    if ((paramMap == null) || (paramString == null))
      localBitmap = null;
    do
    {
      return localBitmap;
      SoftReference localSoftReference = (SoftReference)paramMap.get(paramString);
      if (localSoftReference == null)
        return null;
      localBitmap = (Bitmap)localSoftReference.get();
    }
    while ((localBitmap != null) && (!localBitmap.isRecycled()));
    z.d("!44@/B4Tb64lLpKW6XSoHkFWUBNZw7JVuBRkz1obtuNKIN8=", " recycle remove: %s", new Object[] { paramString });
    paramMap.remove(paramString);
    return null;
  }

  public final void q(String paramString, Bitmap paramBitmap)
  {
    a(this.ijp, paramString, paramBitmap);
  }

  public final void r(String paramString, Bitmap paramBitmap)
  {
    a(this.ijq, paramString, paramBitmap);
  }

  public final Bitmap zi(String paramString)
  {
    return g(this.ijp, paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ai
 * JD-Core Version:    0.6.2
 */