package com.tencent.mm.compatible.b;

import android.annotation.TargetApi;
import android.media.AudioManager;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
{
  @TargetApi(8)
  public static boolean a(AudioManager paramAudioManager)
  {
    if (j.cq(8));
    while (bi.ta())
      return false;
    if ((v.dNG.dMv == 1) || (v.dNG.dMw == -1))
      paramAudioManager.setBluetoothScoOn(false);
    if ((v.dNG.dMv == 1) || (v.dNG.dMw == -1))
      paramAudioManager.stopBluetoothSco();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.a
 * JD-Core Version:    0.6.2
 */