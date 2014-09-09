package com.tencent.mm.ui.player;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.an;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.f.c.n;

final class c
  implements View.OnClickListener
{
  c(MusicDetailUI paramMusicDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    n.fTF.q(10231, "1");
    if (bg.ii() != null)
      bg.ii().release();
    this.jKu.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.player.c
 * JD-Core Version:    0.6.2
 */