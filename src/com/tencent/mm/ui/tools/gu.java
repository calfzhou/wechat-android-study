package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.c.a.ar;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.c;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.base.e;

final class gu
  implements com.tencent.mm.ui.base.z
{
  gu(gt paramgt)
  {
  }

  public final void onClick(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default:
      return;
    case 0:
      ShowImageUI.b(this.jVb.jVa);
      return;
    case 1:
      ShowImageUI localShowImageUI = this.jVb.jVa;
      ar localar = new ar();
      long l = localShowImageUI.getIntent().getLongExtra("key_message_id", -1L);
      if (-1L == l)
        com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpL/S4mvETx9l9B/T4NcFgMX", "msg id error, try fav simple data");
      for (boolean bool = c.a(localar, localShowImageUI.getIntent().getIntExtra("key_favorite_source_type", 1), localShowImageUI.getIntent().getStringExtra("key_image_path")); ; bool = c.a(localar, l))
      {
        if (!bool)
          break label171;
        a.aGB().g(localar);
        if (localar.cHV.ret != 0)
          break;
        e.aw(localShowImageUI.aPI(), localShowImageUI.aPI().getString(n.bHR));
        return;
      }
      label171: e.b(localShowImageUI.aPI(), localar.cHU.type, n.bHn);
      return;
    case 2:
    }
    ShowImageUI.c(this.jVb.jVa);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gu
 * JD-Core Version:    0.6.2
 */