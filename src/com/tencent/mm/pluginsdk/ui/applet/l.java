package com.tencent.mm.pluginsdk.ui.applet;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.n.c;
import com.tencent.mm.ui.base.cn;

final class l
  implements Runnable
{
  l(j paramj)
  {
  }

  public final void run()
  {
    ImageView localImageView = (ImageView)j.d(this.hAS).getContentView().findViewById(com.tencent.mm.i.anp);
    if (localImageView != null)
    {
      Bitmap localBitmap = c.a(j.e(this.hAS).getUsername(), false, -1);
      if ((localBitmap != null) && (j.e(this.hAS).aIg()))
        localBitmap = com.tencent.mm.sdk.platformtools.i.a(localBitmap, false, localBitmap.getWidth() / 2);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        localImageView.setImageBitmap(localBitmap);
        localImageView.setVisibility(0);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.l
 * JD-Core Version:    0.6.2
 */