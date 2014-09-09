package com.tencent.mm.ui.contact.profile;

import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.p;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.cb;

final class ag extends cm
{
  ag(boolean paramBoolean, cb paramcb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = x.pO();
    if (this.elC);
    for (int j = i & 0xFFFFDFFF; ; j = i | 0x2000)
    {
      bg.qW().oQ().set(34, Integer.valueOf(j));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      if (!this.elC)
      {
        az.xa().vT();
        bg.qW().oQ().set(65828, "");
        bg.qW().oW().yC("facebookapp");
        bg.qW().oV().zw("facebookapp");
      }
      if (this.elD != null)
        this.elD.a(null, null);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ag
 * JD-Core Version:    0.6.2
 */