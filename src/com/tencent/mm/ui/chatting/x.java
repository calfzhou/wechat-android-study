package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.ai.b;
import com.tencent.mm.pluginsdk.ac;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.ad;
import com.tencent.mm.pluginsdk.model.app.au;

final class x
  implements DialogInterface.OnClickListener
{
  x(u paramu, b paramb, String paramString, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ad localad = new ad(2, new au(this.jmx.appId, 0, "1"));
    u.a(this.jmv, localad);
    ac localac = g.axX();
    if (localac != null)
    {
      u.a(this.jmv).h();
      localac.a(this.jmt, this.jmx.appId, this.jmx.type, this.jmy, this.jmx.mediaTagName, 1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.x
 * JD-Core Version:    0.6.2
 */