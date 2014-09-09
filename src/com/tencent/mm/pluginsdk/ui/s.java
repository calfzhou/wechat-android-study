package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.mm.c;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.tools.dx;

final class s
  implements dx
{
  private s(GetHdHeadImageGalleryView paramGetHdHeadImageGalleryView)
  {
  }

  public final void aAe()
  {
    if ((GetHdHeadImageGalleryView.b(this.hys) != null) && (GetHdHeadImageGalleryView.c(this.hys) != null))
    {
      String[] arrayOfString = this.hys.getContext().getResources().getStringArray(c.Ng);
      e.b(this.hys.getContext(), null, arrayOfString, "", new t(this));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.s
 * JD-Core Version:    0.6.2
 */