package com.tencent.mm.compatible.audio;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import com.tencent.mm.sdk.platformtools.z;

public final class d
  implements l
{
  private AcousticEchoCanceler dJM = null;

  @TargetApi(16)
  public d(AudioRecord paramAudioRecord)
  {
    boolean bool = AcousticEchoCanceler.isAvailable();
    z.d("!44@/B4Tb64lLpL5ajg1luquwxbRxlpfDxTzO5sucSMwiuU=", "available  " + bool);
    if (bool)
      this.dJM = AcousticEchoCanceler.create(paramAudioRecord.getAudioSessionId());
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    return AcousticEchoCanceler.isAvailable();
  }

  @TargetApi(16)
  public final boolean mm()
  {
    if (this.dJM != null);
    try
    {
      int i = this.dJM.setEnabled(true);
      if (i == 0)
        return true;
      z.d("!44@/B4Tb64lLpL5ajg1luquwxbRxlpfDxTzO5sucSMwiuU=", "setEnabled failed " + i);
      label43: return false;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.d
 * JD-Core Version:    0.6.2
 */