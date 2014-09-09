package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.g;
import com.tencent.mm.n.c;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ak;

public final class b
{
  private Bitmap djf;

  public final Bitmap b(String paramString, boolean paramBoolean)
  {
    if ((!paramBoolean) && (this.djf != null))
      this.djf.recycle();
    this.djf = null;
    Context localContext = ak.getContext();
    Object localObject;
    if ((paramBoolean) && (!com.tencent.mm.storage.i.yc(paramString)))
    {
      localObject = null;
      if (localContext != null)
      {
        boolean bool = ap.jb(paramString);
        localObject = null;
        if (!bool)
          break label70;
      }
    }
    while (true)
    {
      this.djf = ((Bitmap)localObject);
      return this.djf;
      label70: Bitmap localBitmap = c.a(paramString, false, -1);
      localObject = null;
      if (localBitmap != null)
        if (Build.VERSION.SDK_INT >= 11)
        {
          int i = localContext.getResources().getDimensionPixelSize(17104902) - localContext.getResources().getDimensionPixelSize(g.axv);
          localObject = com.tencent.mm.sdk.platformtools.i.a(com.tencent.mm.sdk.platformtools.i.a(localBitmap, i, i, false, false), false, localContext.getResources().getDimensionPixelSize(g.axe));
        }
        else
        {
          localObject = localBitmap;
        }
    }
  }

  public final Bitmap lH()
  {
    return this.djf;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.b
 * JD-Core Version:    0.6.2
 */