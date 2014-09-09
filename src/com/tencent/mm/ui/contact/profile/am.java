package com.tencent.mm.ui.contact.profile;

import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;

final class am extends cm
{
  am(boolean paramBoolean, cb paramcb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool = this.elC;
    int i = x.pO();
    if (bool);
    for (int j = i & 0xFF7FFFFF; ; j = i | 0x800000)
    {
      bg.qW().oQ().set(34, Integer.valueOf(j));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      if (!this.elC)
      {
        bg.qW().oQ().set(208903, "");
        bg.qW().oQ().set(208901, "");
        bg.qW().oQ().set(208902, "");
        bg.qW().oQ().set(208905, Boolean.valueOf(true));
      }
      if (this.elD != null)
        this.elD.a(null, null);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.am
 * JD-Core Version:    0.6.2
 */