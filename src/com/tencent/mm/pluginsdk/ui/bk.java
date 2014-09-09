package com.tencent.mm.pluginsdk.ui;

import com.tencent.mm.al.i;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.z;

final class bk
  implements i
{
  bk(VoiceSearchLayout paramVoiceSearchLayout)
  {
  }

  public final void BU()
  {
    this.hAB.reset();
    VoiceSearchLayout.q(this.hAB).a(false, null, -1L);
  }

  public final void BV()
  {
    VoiceSearchLayout.n(this.hAB);
    VoiceSearchLayout.o(this.hAB);
    if (VoiceSearchLayout.p(this.hAB) != null)
      VoiceSearchLayout.p(this.hAB).aNu();
  }

  public final void a(String[] paramArrayOfString, long paramLong)
  {
    try
    {
      z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "dkaddr onRes ");
      if (paramArrayOfString != null)
      {
        z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "dkaddr onRes size:" + paramArrayOfString.length + " " + paramArrayOfString.toString());
        int i = paramArrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          String str = paramArrayOfString[j];
          z.d("!44@/B4Tb64lLpKCGRi+LcyHSNJSF5OOP5LMoXistc7C4wY=", "search username  :" + str);
        }
      }
      this.hAB.reset();
      VoiceSearchLayout.q(this.hAB).a(true, paramArrayOfString, paramLong);
      return;
    }
    catch (Exception localException)
    {
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.bk
 * JD-Core Version:    0.6.2
 */