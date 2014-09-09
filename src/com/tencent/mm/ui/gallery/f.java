package com.tencent.mm.ui.gallery;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import com.tencent.mm.c.a.ar;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class f
  implements cm
{
  f(GestureGalleryUI paramGestureGalleryUI)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    ar localar;
    do
    {
      do
      {
        return;
        if (ap.jb(GestureGalleryUI.b(this.jJI)))
        {
          z.w("!44@/B4Tb64lLpI3qghlmlMkBkqieoUTg8Us2r04Hi9+F7o=", "share image to friend fail, imgPath is null");
          return;
        }
        Intent localIntent = new Intent(this.jJI.aPI(), MsgRetransmitUI.class);
        localIntent.putExtra("Retr_File_Name", GestureGalleryUI.b(this.jJI));
        localIntent.putExtra("Retr_Compress_Type", 0);
        localIntent.putExtra("Retr_Msg_Type", 0);
        this.jJI.startActivity(localIntent);
        return;
      }
      while ((GestureGalleryUI.b(this.jJI) == null) || (GestureGalleryUI.b(this.jJI).equals("")));
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.jJI);
        return;
      }
      bc.j(GestureGalleryUI.b(this.jJI), this.jJI);
      return;
      localar = new ar();
      if (!c.a(localar, 1, GestureGalleryUI.b(this.jJI)))
        break;
      a.aGB().g(localar);
    }
    while (localar.cHV.ret != 0);
    e.aw(this.jJI.aPI(), this.jJI.aPI().getString(n.bHR));
    return;
    e.b(this.jJI.aPI(), localar.cHU.type, n.bHn);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.f
 * JD-Core Version:    0.6.2
 */