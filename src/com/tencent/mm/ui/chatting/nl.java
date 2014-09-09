package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.mm.a.c;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.tools.ImageGalleryUI;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

final class nl
  implements cm
{
  nl(ar paramar, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str1 = paramMenuItem.getTitle();
    if (this.dxM.kk() > 0L);
    for (l locall1 = ap.yg().T(this.dxM.kk()); ; locall1 = null)
    {
      if (((locall1 == null) || (locall1.xM() <= 0L)) && (this.dxM.kl() > 0L));
      for (l locall2 = ap.yg().S(this.dxM.kl()); ; locall2 = locall1)
      {
        if (locall2 == null)
        {
          z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "showAcceptImgConnector: try get imgInfo fail");
          return;
        }
        if ((locall2.getOffset() >= locall2.sp()) && (locall2.sp() != 0))
        {
          int j;
          int i;
          if (this.dxM.jK() == 1)
            if (locall2.xR())
            {
              j = 1;
              i = j;
            }
          while (true)
          {
            String str2 = x.pG();
            String str3 = ap.yg().f(m.c(locall2), "", "");
            if (!ch.jb(str3))
            {
              z.i("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "connector click[img]: to[%s] fileName[%s]", new Object[] { str1, str3 });
              ag localag = new ag(4, str2, str1, str3, i, null, 0, "", "", true, h.Ti);
              bg.qX().d(localag);
              cx.rV().a(cx.dmq, null);
            }
            com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = Integer.valueOf(3);
            arrayOfObject[1] = Integer.valueOf(4);
            arrayOfObject[2] = str1;
            localn.d(10424, arrayOfObject);
            e.aw(this.dLL, this.dLL.getString(com.tencent.mm.n.bue));
            return;
            j = 0;
            break;
            if (!locall2.xR())
              i = 0;
            else if (!c.ac(m.a(locall2).xN()))
              i = 0;
            else
              i = 1;
          }
        }
        Intent localIntent = new Intent(this.dLL, ImageGalleryUI.class);
        localIntent.putExtra("img_gallery_msg_id", this.dxM.kk());
        localIntent.putExtra("img_gallery_msg_svr_id", this.dxM.kl());
        localIntent.putExtra("img_gallery_talker", this.dxM.kt());
        localIntent.putExtra("img_gallery_chatroom_name", this.dxM.kt());
        localIntent.putExtra("img_gallery_is_restransmit_after_download", true);
        localIntent.putExtra("img_gallery_directly_send_name", str1);
        localIntent.putExtra("start_chatting_ui", false);
        this.dLL.startActivity(localIntent);
        return;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nl
 * JD-Core Version:    0.6.2
 */