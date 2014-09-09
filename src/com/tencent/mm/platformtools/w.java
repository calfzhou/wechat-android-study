package com.tencent.mm.platformtools;

import android.graphics.Bitmap;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.z;

final class w
  implements br
{
  private q dUX;
  public Bitmap dnb = null;

  public w(q paramq)
  {
    if (!s.c(paramq))
      throw new IllegalArgumentException("from sdcard, picture strategy here must be validity");
    this.dUX = paramq;
  }

  public final boolean rD()
  {
    this.dnb = u.jA(this.dUX.Dy());
    if (this.dnb != null)
      this.dnb = u.dUP.a(this.dUX, this.dnb);
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = this.dUX.Dz();
    arrayOfObject[1] = this.dUX.Dy();
    Bitmap localBitmap = this.dnb;
    boolean bool = false;
    if (localBitmap != null)
      bool = true;
    arrayOfObject[2] = Boolean.valueOf(bool);
    z.v("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "get url[%s] from[%s] result[%B]", arrayOfObject);
    return true;
  }

  public final boolean rE()
  {
    if (this.dnb == null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.dUX.Dz();
      z.d("!32@/B4Tb64lLpI9x0Y3l+KjNcgr8YiEJ3lN", "can not find bitmap on sdCard, url=%s, try to download it", arrayOfObject);
      if ((u.a(u.dUP) == null) || (u.a(u.dUP).aNy()))
        u.a(u.dUP, new bp(1, "readerapp-pic-logic-download", 3));
      u.a(u.dUP).c(new v(this.dUX));
      return false;
    }
    u.a(u.dUP, this.dUX.Dz(), this.dUX.DA(), this.dnb);
    this.dnb = null;
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.w
 * JD-Core Version:    0.6.2
 */