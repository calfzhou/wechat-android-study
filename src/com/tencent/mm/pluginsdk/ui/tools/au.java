package com.tencent.mm.pluginsdk.ui.tools;

import android.graphics.Bitmap;
import android.widget.ImageView;

final class au
  implements Runnable
{
  private ImageView eEg;
  private Bitmap eXB;

  private au(ag paramag)
  {
  }

  public final void run()
  {
    if (this.eEg != null)
    {
      if ((this.eXB == null) || (!this.eXB.isRecycled()))
        break label54;
      at.b(this.eEg, null);
    }
    while (true)
    {
      this.eEg = null;
      this.eXB = null;
      ag.a(this.hLE).s(this);
      return;
      label54: at.b(this.eEg, this.eXB);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.au
 * JD-Core Version:    0.6.2
 */