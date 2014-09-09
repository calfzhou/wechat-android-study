package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements Runnable
{
  int hFV = 5;

  private d(LyricView paramLyricView)
  {
  }

  public final void run()
  {
    this.hFV = (-1 + this.hFV);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(this.hFV);
    z.i("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "auto refresh bg, cur times [%d]", arrayOfObject1);
    if (this.hFV < 0)
      z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "auto refresh bg job finish, try times 0");
    do
    {
      return;
      LyricView.b(this.hFU);
      if (LyricView.c(this.hFU) != null)
        try
        {
          Canvas localCanvas = this.hFU.getHolder().lockCanvas();
          LyricView.a(LyricView.c(this.hFU), localCanvas, new Rect());
          LyricView.a(LyricView.d(this.hFU), localCanvas);
          this.hFU.getHolder().unlockCanvasAndPost(localCanvas);
          z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "auto refresh bg job finish, bgBmp not null");
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = localException.getLocalizedMessage();
            z.w("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "auto refresh bg error: %s", arrayOfObject2);
          }
        }
    }
    while (LyricView.a(this.hFU) == null);
    LyricView.a(this.hFU).postDelayed(this, 1500L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.d
 * JD-Core Version:    0.6.2
 */