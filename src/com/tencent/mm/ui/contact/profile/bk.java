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

final class bk extends cm
{
  bk(boolean paramBoolean, cb paramcb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool = this.elC;
    int i = x.pO();
    if (bool);
    for (int j = i & 0xFFFFEFFF; ; j = i | 0x1000)
    {
      bg.qW().oQ().set(34, Integer.valueOf(j));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      if (this.elD != null)
        this.elD.a(null, null);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bk
 * JD-Core Version:    0.6.2
 */