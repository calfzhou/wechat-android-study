package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;

final class i
  implements az
{
  i(VoiceTransTextUI paramVoiceTransTextUI, int paramInt)
  {
  }

  public final boolean kJ()
  {
    if (VoiceTransTextUI.m(this.kav))
      return false;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.kax);
    z.d("!44@/B4Tb64lLpJSXpfhstDS95++mWTUEpjt6Fx5SFp9Yf8=", "timmer get, delay:%d", arrayOfObject);
    VoiceTransTextUI.c(this.kav, p.kaF);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.i
 * JD-Core Version:    0.6.2
 */