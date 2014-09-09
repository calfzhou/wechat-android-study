package com.tencent.mm.pluginsdk.ui.musicplayer;

import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class c
  implements Runnable
{
  long hFS;
  long hFT;

  public c(LyricView paramLyricView, long paramLong1, long paramLong2)
  {
    this.hFS = paramLong1;
    this.hFT = paramLong2;
  }

  public final void run()
  {
    if (this.hFS < this.hFT)
    {
      this.hFS = (80L + this.hFS);
      this.hFU.i(this.hFS, this.hFT);
      if (LyricView.a(this.hFU) != null)
      {
        LyricView.a(this.hFU).postDelayed(this, 80L);
        return;
      }
    }
    this.hFU.setKeepScreenOn(false);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Long.valueOf(this.hFT);
    cm localcm = LyricView.a(this.hFU);
    boolean bool = false;
    if (localcm == null)
      bool = true;
    arrayOfObject[1] = Boolean.valueOf(bool);
    z.d("!32@/B4Tb64lLpKLTg+RhqEt7h8agXSu+Fyh", "auto play job finish length[%d], uiHandler is null[%B]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.c
 * JD-Core Version:    0.6.2
 */