package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class k
  implements Runnable
{
  k(j paramj)
  {
  }

  public final void run()
  {
    z.i("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "notify has new trans, so pull");
    if (VoiceTransTextUI.q(this.kay.kav) != null)
      VoiceTransTextUI.q(this.kay.kav).aNu();
    VoiceTransTextUI.c(this.kay.kav, p.kaF);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.k
 * JD-Core Version:    0.6.2
 */