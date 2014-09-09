package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.sdk.platformtools.z;

public final class k
{
  private l dJU = null;
  private l dJV = null;
  private l dJW = null;

  public final boolean a(AudioRecord paramAudioRecord, int paramInt)
  {
    z.d("!44@/B4Tb64lLpLjA0AEL11ABlFPDKYPJYIIv78olPSFBGo=", "api " + Build.VERSION.SDK_INT);
    if (j.cq(16))
      return false;
    if (paramAudioRecord == null)
    {
      z.d("!44@/B4Tb64lLpLjA0AEL11ABlFPDKYPJYIIv78olPSFBGo=", "audio is null");
      return false;
    }
    if (1 == paramInt)
    {
      if (v.dNG.dMW != 1)
      {
        z.d("!44@/B4Tb64lLpLjA0AEL11ABlFPDKYPJYIIv78olPSFBGo=", "disable by config");
        return false;
      }
      if (v.dNG.dMX != 2)
      {
        this.dJU = new n(paramAudioRecord);
        if ((this.dJU != null) && (this.dJU.isAvailable()))
          this.dJU.mm();
      }
      if (v.dNG.dMY != 2)
      {
        this.dJV = new d(paramAudioRecord);
        if ((this.dJV != null) && (this.dJV.isAvailable()))
          this.dJV.mm();
      }
      if (v.dNG.dMZ != 2)
      {
        this.dJW = new m(paramAudioRecord);
        if ((this.dJW != null) && (this.dJW.isAvailable()))
          this.dJW.mm();
      }
      return true;
    }
    if (v.dNG.dMD != 1)
    {
      z.d("!44@/B4Tb64lLpLjA0AEL11ABlFPDKYPJYIIv78olPSFBGo=", "disable by config");
      return false;
    }
    this.dJU = new n(paramAudioRecord);
    if ((this.dJU != null) && (this.dJU.isAvailable()))
      this.dJU.mm();
    this.dJV = new d(paramAudioRecord);
    if ((this.dJV != null) && (this.dJV.isAvailable()))
      this.dJV.mm();
    this.dJW = new m(paramAudioRecord);
    if ((this.dJW != null) && (this.dJW.isAvailable()))
      this.dJW.mm();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.k
 * JD-Core Version:    0.6.2
 */