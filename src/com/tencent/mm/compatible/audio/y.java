package com.tencent.mm.compatible.audio;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnErrorListener;
import com.tencent.mm.sdk.platformtools.z;

final class y
  implements MediaRecorder.OnErrorListener
{
  y(SimpleMediaRecorder paramSimpleMediaRecorder)
  {
  }

  public final void onError(MediaRecorder paramMediaRecorder, int paramInt1, int paramInt2)
  {
    if (SimpleMediaRecorder.a(this.dKP) != null)
      SimpleMediaRecorder.a(this.dKP).mj();
    try
    {
      SimpleMediaRecorder.b(this.dKP).release();
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLskZXJkW6OMABj+S90eGcuZottjO0yy3A=", localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.y
 * JD-Core Version:    0.6.2
 */