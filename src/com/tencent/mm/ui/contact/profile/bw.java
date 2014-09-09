package com.tencent.mm.ui.contact.profile;

import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.model.x;
import com.tencent.mm.protocal.a.up;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;

final class bw extends cm
{
  bw(boolean paramBoolean, cb paramcb)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    int i = x.pO();
    int j;
    up localup;
    if (this.elC)
    {
      j = i & 0xFFBFFFFF;
      com.tencent.mm.model.bg.qW().oQ().set(34, Integer.valueOf(j));
      localup = new up();
      localup.imO = 4194304;
      if (!this.elC)
        break label109;
    }
    label109: for (int k = 0; ; k = 1)
    {
      localup.ipC = k;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(39, localup));
      if (this.elD != null)
        this.elD.a(null, null);
      return;
      j = i | 0x400000;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.bw
 * JD-Core Version:    0.6.2
 */