package com.tencent.mm.n;

import android.graphics.Bitmap;
import com.tencent.mm.a.d;

final class a
{
  private d dmL;

  public a(int paramInt)
  {
    this.dmL = new d(paramInt, new b(this));
  }

  public final void b(String paramString, Bitmap paramBitmap)
  {
    if (this.dmL != null)
    {
      this.dmL.b(paramString, paramBitmap);
      return;
    }
    com.tencent.mm.cache.b.a("avatar_cache", paramString, paramBitmap);
  }

  public final Bitmap eD(String paramString)
  {
    if (this.dmL != null)
      return (Bitmap)this.dmL.get(paramString);
    return (Bitmap)com.tencent.mm.cache.b.o("avatar_cache", paramString);
  }

  public final void remove(String paramString)
  {
    if (this.dmL != null)
    {
      this.dmL.remove(paramString);
      return;
    }
    com.tencent.mm.cache.b.p("avatar_cache", paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.a
 * JD-Core Version:    0.6.2
 */