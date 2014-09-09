package com.tencent.mm.ui.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import com.tencent.mm.ae.c;
import com.tencent.mm.aq.a;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;
import junit.framework.Assert;

final class ad
{
  private com.tencent.mm.ae.b iWP;

  ad(com.tencent.mm.ae.b paramb)
  {
    this.iWP = paramb;
  }

  private static Drawable a(Map paramMap, Context paramContext)
  {
    if ((paramMap == null) || (paramMap.size() <= 0))
      return null;
    String str1 = (String)paramMap.get(com.tencent.mm.platformtools.b.ac(paramContext));
    if (str1 == null)
      str1 = (String)paramMap.get(com.tencent.mm.platformtools.b.ad(paramContext));
    if (com.tencent.mm.platformtools.ap.ja(str1).length() <= 0)
      return null;
    c localc = com.tencent.mm.ae.b.hh(str1);
    if (localc == c.dBa)
      return null;
    String str2 = com.tencent.mm.ae.b.hg(str1);
    if (com.tencent.mm.platformtools.ap.ja(str2).length() <= 0)
      return null;
    while (true)
    {
      Bitmap localBitmap;
      try
      {
        if (localc == c.dAY)
        {
          localObject = com.tencent.mm.platformtools.b.a(paramContext.getAssets().open(str2), a.getDensity(paramContext));
          if (localObject == null)
          {
            z.e("!44@/B4Tb64lLpKQqptpTkWSUc829jTd6GbsS5sk+S+XIow=", "get Bitmap failed type:" + localc + " path:" + str2);
            return null;
          }
        }
        else
        {
          localObject = com.tencent.mm.platformtools.b.c(str2, a.getDensity(paramContext));
          continue;
        }
        byte[] arrayOfByte = ((Bitmap)localObject).getNinePatchChunk();
        if ((arrayOfByte != null) && (NinePatch.isNinePatchChunk(arrayOfByte)))
          return new NinePatchDrawable((Bitmap)localObject, arrayOfByte, new Rect(), null);
        DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
        localBitmap = Bitmap.createScaledBitmap((Bitmap)localObject, localDisplayMetrics.widthPixels, localDisplayMetrics.widthPixels * ((Bitmap)localObject).getHeight() / ((Bitmap)localObject).getWidth(), true);
        if (localBitmap != null)
        {
          if (localObject != localBitmap)
            ((Bitmap)localObject).recycle();
        }
        else
        {
          BitmapDrawable localBitmapDrawable = new BitmapDrawable((Bitmap)localObject);
          localBitmapDrawable.setTargetDensity(localDisplayMetrics);
          return localBitmapDrawable;
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      Object localObject = localBitmap;
    }
  }

  public final int a(ap paramap)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramap != null)
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      if (paramap.iXe == null)
        break label54;
    }
    Drawable localDrawable;
    while (true)
    {
      Assert.assertTrue(bool1);
      localDrawable = a(this.iWP.dAW, paramap.iXd.getContext());
      if (localDrawable != null)
        break label59;
      return -1;
      bool2 = false;
      break;
      label54: bool1 = false;
    }
    label59: paramap.iXd.setBackgroundDrawable(localDrawable);
    Button localButton = paramap.iXe;
    if (this.iWP.dAO);
    for (int i = 0; ; i = 8)
    {
      localButton.setVisibility(i);
      return 0;
    }
  }

  public final String getId()
  {
    return this.iWP.id;
  }

  public final String getUrl()
  {
    return this.iWP.url;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ad
 * JD-Core Version:    0.6.2
 */