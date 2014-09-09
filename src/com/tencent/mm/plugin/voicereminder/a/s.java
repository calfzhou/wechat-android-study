package com.tencent.mm.plugin.voicereminder.a;

import android.os.Message;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class s extends cm
{
  s(p paramp)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    z.d("!44@/B4Tb64lLpLcQwGQMRj/JcgrnZCee5Q2WnorMdoOdjs=", " Recorder handleMessage");
    if (p.b(this.gSS))
      return;
    bg.qY().b(this.gSS);
    bg.qY().mr();
    this.gSS.bY(200);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.a.s
 * JD-Core Version:    0.6.2
 */