package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import com.tencent.mm.c.a.am;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.cm;

final class db
  implements cm
{
  db(ImageGalleryUI paramImageGalleryUI)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
      do
      {
        return;
        ImageGalleryUI.e(this.jSA).qQ(this.jSA.eXF.W());
        return;
        ImageGalleryUI.e(this.jSA).qR(this.jSA.eXF.W());
        return;
      }
      while (!com.tencent.mm.am.a.to("favorite"));
      ImageGalleryUI.e(this.jSA).qS(this.jSA.eXF.W());
      return;
    case 3:
    }
    z.i("!32@/B4Tb64lLpJSmuQVFTi9B2JvKOm4MTV5", "request deal QBAR string");
    am localam = new am();
    localam.cHQ.cHB = this.jSA;
    localam.cHQ.cHA = ImageGalleryUI.d(this.jSA);
    com.tencent.mm.sdk.c.a.aGB().g(localam);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.db
 * JD-Core Version:    0.6.2
 */