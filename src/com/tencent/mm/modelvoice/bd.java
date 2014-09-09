package com.tencent.mm.modelvoice;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.sdk.platformtools.z;

final class bd
  implements MediaPlayer.OnErrorListener
{
  bd(bb parambb)
  {
  }

  public final boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    z.d("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "onError");
    if (bb.a(this.dIp) != null)
      bb.a(this.dIp).nH();
    if (bb.f(this.dIp) != null)
      bb.f(this.dIp).mj();
    try
    {
      bb.a(this.dIp, -1);
      if (bb.b(this.dIp) != null)
      {
        bb.b(this.dIp).stop();
        bb.b(this.dIp).release();
        bb.c(this.dIp);
      }
    }
    catch (Exception localException)
    {
      try
      {
        bb.d(this.dIp);
        while (true)
        {
          label104: return false;
          localException = localException;
          z.e("!32@/B4Tb64lLpI6G0A88lJp/HYDGO4/YhIU", "setErrorListener File[" + bb.e(this.dIp) + "] ErrMsg[" + localException.getStackTrace() + "]");
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
 * Qualified Name:     com.tencent.mm.modelvoice.bd
 * JD-Core Version:    0.6.2
 */