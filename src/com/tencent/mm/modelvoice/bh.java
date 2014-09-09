package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.z;

final class bh
  implements MediaPlayer.OnErrorListener
{
  bh(bf parambf)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "onError");
    if (bf.a(this.dIE) != null)
      bf.a(this.dIE).nH();
    if (bf.f(this.dIE) != null)
      bf.f(this.dIE).mj();
    try
    {
      bf.a(this.dIE, -1);
      if (bf.b(this.dIE) != null)
      {
        bf.b(this.dIE).stop();
        bf.b(this.dIE).release();
        bf.c(this.dIE);
      }
    }
    catch (Exception localException)
    {
      try
      {
        bf.d(this.dIE);
        while (true)
        {
          label104: return false;
          localException = localException;
          z.e("!32@/B4Tb64lLpIhRvBTRu3E+v293mD6cw6R", "setErrorListener File[" + bf.e(this.dIE) + "] ErrMsg[" + localException.getStackTrace() + "]");
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label104;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bh
 * JD-Core Version:    0.6.2
 */