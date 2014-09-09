package com.tencent.mm.modelvoice;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.mm.sdk.platformtools.z;

final class bw
  implements MediaPlayer.OnCompletionListener
{
  bw(bv parambv)
  {
  }

  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (bv.a(this.dIQ) != null)
      bv.a(this.dIQ).te();
    try
    {
      bv.b(this.dIQ).release();
      bv.a(this.dIQ, 0);
      return;
    }
    catch (Exception localException)
    {
      z.e("!24@40VYnhE9NJIehP//35gXMQ==", "setCompletion File[" + bv.c(this.dIQ) + "] ErrMsg[" + localException.getStackTrace() + "]");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bw
 * JD-Core Version:    0.6.2
 */