package com.tencent.mm.modelvoice;

import android.media.MediaRecorder.OnErrorListener;
import com.tencent.mm.sdk.platformtools.z;

final class g
  implements MediaRecorder.OnErrorListener
{
  g(MediaRecorder paramMediaRecorder)
  {
  }

  public final void onError(android.media.MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    if (MediaRecorder.a(this.dGG) != null)
      MediaRecorder.a(this.dGG).mj();
    try
    {
      MediaRecorder.b(this.dGG).release();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpK60LPuHpvAbeoZfbhAzgyZ", localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.g
 * JD-Core Version:    0.6.2
 */