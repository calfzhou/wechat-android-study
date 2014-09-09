package com.tencent.mm.compatible.audio;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.NoiseSuppressor;
import com.tencent.mm.sdk.platformtools.z;

public final class n
  implements l
{
  private NoiseSuppressor dJY = null;

  @TargetApi(16)
  public n(AudioRecord paramAudioRecord)
  {
    boolean bool = NoiseSuppressor.isAvailable();
    z.d("!44@/B4Tb64lLpIF0puzW1Oq16BT4ojg3TONtPZ4sG974Xc=", "available  " + bool);
    if (bool)
      this.dJY = NoiseSuppressor.create(paramAudioRecord.getAudioSessionId());
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    return NoiseSuppressor.isAvailable();
  }

  @TargetApi(16)
  public final boolean mm()
  {
    if (this.dJY != null);
    try
    {
      int i = this.dJY.setEnabled(true);
      if (i == 0)
        return true;
      z.d("!44@/B4Tb64lLpIF0puzW1Oq16BT4ojg3TONtPZ4sG974Xc=", "setEnabled failed " + i);
      label43: return false;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.n
 * JD-Core Version:    0.6.2
 */