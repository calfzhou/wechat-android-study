package com.tencent.mm.app;

import android.content.res.Resources;
import com.tencent.mm.ab.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.pluginsdk.ui.applet.aa;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

final class ak
  implements aa
{
  ak(aj paramaj, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, MMActivity paramMMActivity)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    if (!paramBoolean)
      return;
    s.a(this.cHa, this.cHb, this.cHc, this.cHd, 3, null);
    if (!ch.jb(paramString))
    {
      h localh = new h(this.cHd, paramString, y.dR(this.cHd));
      bg.qX().d(localh);
    }
    e.aw(this.cHe, this.cHe.getResources().getString(com.tencent.mm.n.bun));
    com.tencent.mm.plugin.f.c.n.fTF.a(false, 10910, "2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ak
 * JD-Core Version:    0.6.2
 */