package com.tencent.mm.y;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;

final class f extends Thread
{
  private HashMap dwU;
  private String url;

  f(String paramString, HashMap paramHashMap)
  {
    this.url = paramString;
    this.dwU = paramHashMap;
  }

  public final void run()
  {
    byte[] arrayOfByte = ch.xB(this.url);
    if (arrayOfByte == null)
    {
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = this.url;
      z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "download fail: url[%s] data is null", arrayOfObject3);
      return;
    }
    try
    {
      Bitmap localBitmap2 = i.cB(arrayOfByte);
      localBitmap1 = localBitmap2;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.url;
      z.i("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "download finish, url[%s], do post job", arrayOfObject2);
      am.h(new e(this.url, localBitmap1, this.dwU));
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = this.url;
        arrayOfObject1[1] = localException.getLocalizedMessage();
        z.w("!44@/B4Tb64lLpIqiy54boRLZBxJv63zg5oBcZ6pephrpMY=", "download fail: url[%s] decode bitmap error[%s]", arrayOfObject1);
        Bitmap localBitmap1 = null;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.f
 * JD-Core Version:    0.6.2
 */