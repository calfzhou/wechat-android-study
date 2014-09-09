package com.tencent.mm.ui.player;

import com.tencent.mm.model.ao;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements ao
{
  d(MusicDetailUI paramMusicDetailUI)
  {
  }

  public final void mj()
  {
    this.jKu.finish();
  }

  public final void onFinish()
  {
    this.jKu.finish();
  }

  public final void onPause()
  {
  }

  public final void onResume()
  {
  }

  public final void onStart()
  {
  }

  public final void onStop()
  {
  }

  public final void w(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    z.d("!32@/B4Tb64lLpI2gCRxPerxnaIhKsNxuVy0", "pos:%d  duration:%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.d
 * JD-Core Version:    0.6.2
 */