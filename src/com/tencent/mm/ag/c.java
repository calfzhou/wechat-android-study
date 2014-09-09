package com.tencent.mm.ag;

import android.graphics.Bitmap;
import com.tencent.mm.a.f;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public final class c
{
  private static c dBk;
  private String dBj;
  private bp dBl = null;

  private c(String paramString)
  {
    this.dBj = paramString;
  }

  public static c yU()
  {
    if (dBk == null)
      dBk = new c(bg.qW().pd());
    return dBk;
  }

  public final void a(String paramString1, String paramString2, d paramd)
  {
    if ((!ch.jb(paramString2)) && (!hl(paramString1)))
    {
      if ((this.dBl == null) || (this.dBl.aNy()))
        this.dBl = new bp(1, "download-remark-img", 1);
      this.dBl.c(new e(this, paramString1, paramString2, paramd));
    }
  }

  public final String hk(String paramString)
  {
    if (ch.jb(paramString))
      return null;
    return o.a(this.dBj, "remark_", f.d((paramString + "ZnVjaw==").getBytes()), ".png", 1);
  }

  public final boolean hl(String paramString)
  {
    String str = hk(paramString);
    z.d("!44@/B4Tb64lLpLJl92Qo3QYpuoqF/rR6MgYAIg0AEetmbQ=", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    return new File(str).exists();
  }

  public final boolean hm(String paramString)
  {
    String str = hk(paramString);
    z.d("!44@/B4Tb64lLpLJl92Qo3QYpuoqF/rR6MgYAIg0AEetmbQ=", "remove remark image: %s, path:%s", new Object[] { paramString, str });
    return com.tencent.mm.a.c.deleteFile(str);
  }

  public final Bitmap hn(String paramString)
  {
    Bitmap localBitmap = i.o(hk(paramString), 0, 0);
    int i = 0;
    if (localBitmap != null)
    {
      boolean bool = localBitmap.isRecycled();
      i = 0;
      if (!bool)
        i = 1;
    }
    if (i != 0)
      return localBitmap;
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ag.c
 * JD-Core Version:    0.6.2
 */