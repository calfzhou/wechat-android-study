package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.mm.a.f;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.platformtools.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.sdk.platformtools.ak;

public final class bb
  implements q
{
  private String eNy;
  private String url;

  public bb(String paramString)
  {
    this(paramString, paramString);
  }

  private bb(String paramString1, String paramString2)
  {
    this.eNy = paramString1;
    this.url = paramString2;
  }

  public final String DA()
  {
    return this.eNy;
  }

  public final String DB()
  {
    return this.eNy;
  }

  public final boolean DC()
  {
    return true;
  }

  public final boolean DD()
  {
    return false;
  }

  public final Bitmap DE()
  {
    return BitmapFactory.decodeResource(ak.getContext().getResources(), h.Xu);
  }

  public final String Dy()
  {
    return bg.qW().pa() + "/" + f.d(this.url.getBytes());
  }

  public final String Dz()
  {
    return this.url;
  }

  public final Bitmap a(Bitmap paramBitmap, r paramr)
  {
    return paramBitmap;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bb
 * JD-Core Version:    0.6.2
 */