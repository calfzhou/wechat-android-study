package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;

final class ay extends cm
{
  ay(boolean paramBoolean, Context paramContext, cb paramcb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if (this.elC)
      au.fI(true);
    int i = x.pO();
    if (this.elC);
    for (int j = i & 0xFFFFFFEF; ; j = i | 0x10)
    {
      bg.qW().oQ().set(34, Integer.valueOf(j));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      if (!this.elC)
        au.cu(this.dLL);
      if (this.elD != null)
        this.elD.a(null, null);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ay
 * JD-Core Version:    0.6.2
 */