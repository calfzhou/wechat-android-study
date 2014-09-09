package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.cb;

final class aj
  implements az
{
  aj(boolean paramBoolean, cb paramcb, cr paramcr)
  {
  }

  public final boolean kJ()
  {
    int i = x.pO();
    if (this.elC);
    for (int j = i & 0xFFFF7FFF; ; j = i | 0x8000)
    {
      bg.qW().oQ().set(34, Integer.valueOf(j));
      bg.qW().oS().a(new ca(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", j, "", 0, "", 0));
      bg.qX().d(new k(5));
      if (!this.elC)
        ai.Cc();
      if (this.elD != null)
        this.elD.a(null, null);
      if (this.elE != null)
        this.elE.dismiss();
      return true;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.aj
 * JD-Core Version:    0.6.2
 */