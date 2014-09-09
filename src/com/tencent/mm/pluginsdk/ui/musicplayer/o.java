package com.tencent.mm.pluginsdk.ui.musicplayer;

import com.tencent.mm.n;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.sdk.platformtools.z;

final class o
  implements Runnable
{
  o(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final void run()
  {
    z.i("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "refresh ui");
    if ((this.hGL.hGC.aCQ() == null) && (this.hGL.aDd() != null))
    {
      z.i("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "refresh ui == lyricview");
      a locala = a.bh(this.hGL.aDd().inj, this.hGL.getString(n.bTt));
      this.hGL.hGC.a(locala);
      z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "end refresh lyricView");
    }
    MusicPlayerUI.e(this.hGL);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.o
 * JD-Core Version:    0.6.2
 */