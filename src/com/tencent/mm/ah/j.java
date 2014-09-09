package com.tencent.mm.ah;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

final class j
  implements m
{
  j(e parame, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!12@nLQl5Xo8bwA=", "onSceneEnd " + ((a)paramx).getFileName() + " filepath " + this.dDE + " errCode " + paramInt2);
    File localFile;
    if (((a)paramx).getFileName().equals(this.dDE))
    {
      bg.qX().b(240, e.c(this.dDB));
      e.d(this.dDB);
      if (paramInt2 == 0)
      {
        c.zI();
        c.zJ();
      }
      localFile = new File(this.dDE);
    }
    try
    {
      boolean bool = localFile.delete();
      z.d("!12@nLQl5Xo8bwA=", "delete " + this.dDE + " delete " + bool + " errCode " + paramInt2);
      e.zQ().start();
      return;
    }
    catch (Exception localException)
    {
      e.zQ().start();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.j
 * JD-Core Version:    0.6.2
 */