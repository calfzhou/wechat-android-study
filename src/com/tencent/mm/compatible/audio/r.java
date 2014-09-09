package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public final class r extends w
{
  private boolean dKg;
  private AudioRecord dKi;
  private q dKj;
  private HandlerThread dKp = null;
  private byte[] dKq = null;
  private int dKr;
  private int dKs;
  private boolean dKt;
  private AudioRecord.OnRecordPositionUpdateListener dKu = new s(this);

  public r(AudioRecord paramAudioRecord, q paramq, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    this.dKi = paramAudioRecord;
    this.dKj = paramq;
    this.dKg = paramBoolean;
    this.dKr = paramInt1;
    this.dKs = paramInt2;
  }

  public final void af(boolean paramBoolean)
  {
    this.dKt = paramBoolean;
  }

  public final boolean mB()
  {
    if (this.dKp != null)
    {
      z.e("!56@/B4Tb64lLpLd7hlw6y+1ySBfLlWWvoJ8IrbIM/Of1OSEqUpWJTRUbg==", "alreay started record");
      return false;
    }
    this.dKp = new HandlerThread("MMPcmRecorder", 10);
    this.dKp.start();
    this.dKi.setRecordPositionUpdateListener(this.dKu, cm.fetchFreeHandler(this.dKp.getLooper()));
    this.dKi.setPositionNotificationPeriod(this.dKr);
    if ((this.dKg) || (this.dKq == null))
      this.dKq = new byte[this.dKs];
    int i = this.dKi.read(this.dKq, 0, this.dKs);
    z.d("!56@/B4Tb64lLpLd7hlw6y+1ySBfLlWWvoJ8IrbIM/Of1OSEqUpWJTRUbg==", "startRecord, read ret: " + i);
    if ((this.dKj != null) && (i > 0))
      this.dKj.e(this.dKq, i);
    return true;
  }

  public final void mE()
  {
    this.dKi.setRecordPositionUpdateListener(null);
    this.dKi = null;
    this.dKp.quit();
    this.dKp = null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.r
 * JD-Core Version:    0.6.2
 */