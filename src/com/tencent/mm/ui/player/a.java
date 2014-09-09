package com.tencent.mm.ui.player;

import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.tb;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class a
  implements Runnable
{
  a(MainMusicPlayerUI paramMainMusicPlayerUI)
  {
  }

  public final void run()
  {
    int i = 1;
    if ((MainMusicPlayerUI.a(this.jKq) == null) || (ch.jb(MainMusicPlayerUI.b(this.jKq).inj)))
    {
      bg.ii().lb();
      if (bg.ii().ld() <= 0)
      {
        z.e("!44@/B4Tb64lLpKonzmIA9mIAHSkogrEXNfFBPqtq2ZixFE=", "can't get songId ");
        n.fTF.q(10911, "1");
        i = 0;
      }
    }
    while (true)
    {
      MainMusicPlayerUI localMainMusicPlayerUI = this.jKq;
      int j = 0;
      if (i != 0)
        j = 8;
      MainMusicPlayerUI.a(localMainMusicPlayerUI, j);
      return;
      MainMusicPlayerUI.a(this.jKq, bg.ii().la());
      MainMusicPlayerUI.a(this.jKq, new com.tencent.mm.ac.a(MainMusicPlayerUI.c(this.jKq).idq, MainMusicPlayerUI.d(this.jKq).ini));
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = Integer.valueOf(bg.ii().ld());
      z.d("!44@/B4Tb64lLpKonzmIA9mIAHSkogrEXNfFBPqtq2ZixFE=", "request syn lyric..: songid: %d", arrayOfObject);
      bg.qX().a(520, this.jKq);
      bg.qX().d(MainMusicPlayerUI.e(this.jKq));
      continue;
      i = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.a
 * JD-Core Version:    0.6.2
 */