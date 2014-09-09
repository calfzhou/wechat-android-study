package com.tencent.mm.pluginsdk.ui.musicplayer;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.model.an;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;

final class n
  implements ao
{
  n(MusicPlayerUI paramMusicPlayerUI)
  {
  }

  public final void mj()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback error");
    this.hGL.aDa();
  }

  public final void onFinish()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback finish");
    this.hGL.aDa();
  }

  public final void onPause()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback pause");
    if (q.hGQ == this.hGL.ajT())
    {
      ((ImageView)MusicPlayerUI.c(this.hGL)).setImageResource(h.YM);
      this.hGL.hGA = p.hGM;
    }
    while (true)
    {
      this.hGL.aDa();
      return;
      ((TextView)MusicPlayerUI.c(this.hGL)).setText(com.tencent.mm.n.bTq);
    }
  }

  public final void onResume()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback resume");
    ((ImageView)MusicPlayerUI.c(this.hGL)).setImageResource(h.abs);
    this.hGL.hGA = p.hGO;
  }

  public final void onStart()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback start");
    ((ImageView)MusicPlayerUI.c(this.hGL)).setImageResource(h.abs);
    this.hGL.hGA = p.hGO;
    this.hGL.c(bg.ii().la());
    MusicPlayerUI.e(this.hGL);
    MusicPlayerUI.f(this.hGL);
  }

  public final void onStop()
  {
    z.d("!32@/B4Tb64lLpICIarghhJ+OutWbicE5vXX", "player callback stop");
    this.hGL.aDa();
  }

  public final void w(int paramInt1, int paramInt2)
  {
    if ((MusicPlayerUI.d(this.hGL)) || (this.hGL.hGC.aCQ() == null))
      return;
    this.hGL.hGC.i(paramInt1, paramInt2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.musicplayer.n
 * JD-Core Version:    0.6.2
 */