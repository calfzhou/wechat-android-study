package com.tencent.mm.ui.contact.profile;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import java.io.IOException;

final class y
  implements q
{
  y(x paramx)
  {
  }

  public final String DA()
  {
    return x.a(this.jDn);
  }

  public final String DB()
  {
    return x.a(this.jDn);
  }

  public final boolean DC()
  {
    return false;
  }

  public final boolean DD()
  {
    return false;
  }

  public final Bitmap DE()
  {
    return null;
  }

  public final String Dy()
  {
    return bg.qW().pp() + aj.AN(x.a(this.jDn));
  }

  public final String Dz()
  {
    return x.a(this.jDn);
  }

  public final Bitmap a(Bitmap paramBitmap, r paramr)
  {
    if (r.dUL == paramr);
    try
    {
      i.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, Dy(), false);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = paramr.toString();
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "get bitmap, from %s", arrayOfObject);
      return paramBitmap;
    }
    catch (IOException localIOException)
    {
      while (true)
        z.w("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "save bitmap fail");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.y
 * JD-Core Version:    0.6.2
 */