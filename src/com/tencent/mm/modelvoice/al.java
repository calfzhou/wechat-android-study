package com.tencent.mm.modelvoice;

import android.os.Message;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class al extends cm
{
  al(aj paramaj)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    z.d("!44@/B4Tb64lLpJjyqE6YDnApwOwHOAz5sGPSEN1mjztZrA=", "dkbt Recorder handleMessage");
    if (aj.i(this.dHM))
      return;
    bg.qY().b(this.dHM);
    bg.qY().mr();
    this.dHM.bY(200);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.al
 * JD-Core Version:    0.6.2
 */