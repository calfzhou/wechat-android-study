package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.sdk.platformtools.z;

final class bx
  implements MediaPlayer.OnErrorListener
{
  bx(bv parambv)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    if (bv.d(this.dIQ) != null)
      bv.d(this.dIQ).mj();
    try
    {
      bv.b(this.dIQ).release();
      bv.a(this.dIQ, -1);
      return false;
    }
    catch (Exception localException)
    {
      while (true)
        z.e("!24@40VYnhE9NJIehP//35gXMQ==", "setErrorListener File[" + bv.c(this.dIQ) + "] ErrMsg[" + localException.getStackTrace() + "]");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bx
 * JD-Core Version:    0.6.2
 */