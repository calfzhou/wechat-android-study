package com.tencent.mm.compatible.audio;

import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Arrays;

final class s
  implements AudioRecord.OnRecordPositionUpdateListener
{
  s(r paramr)
  {
  }

  public final void onMarkerReached(AudioRecord paramAudioRecord)
  {
  }

  public final void onPeriodicNotification(AudioRecord paramAudioRecord)
  {
    if (r.a(this.dKv) != null)
    {
      if ((r.b(this.dKv)) || (r.c(this.dKv) == null))
        r.a(this.dKv, new byte[r.d(this.dKv)]);
      int i = r.a(this.dKv).read(r.c(this.dKv), 0, r.d(this.dKv));
      z.d("!56@/B4Tb64lLpLd7hlw6y+1ySBfLlWWvoJ8IrbIM/Of1OSEqUpWJTRUbg==", "OnRecordPositionUpdateListener, read ret: " + i);
      if (this.dKv.dKn != null)
        this.dKv.dKn.b(i, r.c(this.dKv));
      if (i > r.c(this.dKv).length)
        i = r.c(this.dKv).length;
      if ((r.e(this.dKv)) && (i > 0))
        Arrays.fill(r.c(this.dKv), 0, i, (byte)0);
      if ((r.f(this.dKv) != null) && (i > 0))
        r.f(this.dKv).e(r.c(this.dKv), i);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.s
 * JD-Core Version:    0.6.2
 */