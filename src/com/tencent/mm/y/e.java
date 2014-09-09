package com.tencent.mm.y;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

final class e
  implements Runnable
{
  private HashMap dwU;
  private Bitmap dwV;
  private String url;

  public e(String paramString, Bitmap paramBitmap, HashMap paramHashMap)
  {
    this.url = paramString;
    this.dwV = paramBitmap;
    this.dwU = paramHashMap;
  }

  public final void run()
  {
    ap.yf();
    d.g(this.url, this.dwV);
    if (this.dwU != null)
    {
      g localg = (g)this.dwU.remove(this.url);
      if (localg != null)
        localg.c(this.dwV);
    }
    Object[] arrayOfObject = new Object[1];
    if (this.url == null);
    for (String str = "null"; ; str = this.url)
    {
      arrayOfObject[0] = str;
      z.i("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "finish download post job, url[%s]", arrayOfObject);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.e
 * JD-Core Version:    0.6.2
 */