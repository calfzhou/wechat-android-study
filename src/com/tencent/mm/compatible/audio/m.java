package com.tencent.mm.compatible.audio;

import android.annotation.TargetApi;
import android.media.AudioRecord;
import android.media.audiofx.AutomaticGainControl;
import com.tencent.mm.sdk.platformtools.z;

public final class m
  implements l
{
  private AutomaticGainControl dJX = null;

  @TargetApi(16)
  public m(AudioRecord paramAudioRecord)
  {
    boolean bool = AutomaticGainControl.isAvailable();
    z.d("!44@/B4Tb64lLpLYS3DXP6UDjQVQTaMUfdr0rqi8WFW27Wc=", "available  " + bool);
    if (bool)
      this.dJX = AutomaticGainControl.create(paramAudioRecord.getAudioSessionId());
  }

  @TargetApi(16)
  public final boolean isAvailable()
  {
    return AutomaticGainControl.isAvailable();
  }

  @TargetApi(16)
  public final boolean mm()
  {
    if (this.dJX != null);
    try
    {
      int i = this.dJX.setEnabled(true);
      if (i == 0)
        return true;
      z.d("!44@/B4Tb64lLpLYS3DXP6UDjQVQTaMUfdr0rqi8WFW27Wc=", "setEnabled failed " + i);
      label43: return false;
    }
    catch (Exception localException)
    {
      break label43;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.m
 * JD-Core Version:    0.6.2
 */