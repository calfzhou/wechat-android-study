package com.tencent.mm.app;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.pluginsdk.ui.ab;
import com.tencent.mm.pluginsdk.ui.ad;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.i;
import java.io.IOException;

final class a
  implements ad
{
  private Bitmap cFI = null;
  m cFJ;

  public a()
  {
    try
    {
      this.cFI = i.a(ak.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.aq.a.getDensity(null));
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public final void a(ab paramab)
  {
    if ((paramab instanceof p))
      af.sh().a((p)paramab);
  }

  public final Bitmap ao(String paramString)
  {
    return c.a(paramString, false, -1);
  }

  public final Bitmap ap(String paramString)
  {
    if (this.cFJ == null)
      this.cFJ = af.sh();
    return m.eR(paramString);
  }

  public final Bitmap c(String paramString, int paramInt1, int paramInt2)
  {
    return c.a(paramString, paramInt1, paramInt2, 1);
  }

  public final Bitmap hK()
  {
    return this.cFI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.a
 * JD-Core Version:    0.6.2
 */