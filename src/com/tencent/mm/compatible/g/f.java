package com.tencent.mm.compatible.g;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.mm.sdk.platformtools.z;

final class f
  implements AudioManager.OnAudioFocusChangeListener
{
  f(e parame)
  {
  }

  public final void onAudioFocusChange(int paramInt)
  {
    if (e.a(this.dOG) != null)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpLCq+BipdDzGSEj50wMwdFVuq5cXvM0LPk=", "jacks change: %d", arrayOfObject);
      e.a(this.dOG).ce(paramInt);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.g.f
 * JD-Core Version:    0.6.2
 */