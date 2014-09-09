package com.tencent.mm.ui.gallery;

import android.content.res.Resources;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.ui.applet.aa;
import com.tencent.mm.pluginsdk.y;
import com.tencent.mm.ui.base.e;

final class g
  implements aa
{
  g(GestureGalleryUI paramGestureGalleryUI, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (paramBoolean)
    {
      if (am.ayf() != null)
      {
        am.ayf().aP(this.dVk, paramString);
        am.ayf().alX();
      }
      e.aw(this.jJI, this.jJI.getResources().getString(n.bun));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.g
 * JD-Core Version:    0.6.2
 */