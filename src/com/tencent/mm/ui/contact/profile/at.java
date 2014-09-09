package com.tencent.mm.ui.contact.profile;

import android.app.ProgressDialog;
import com.tencent.mm.model.b;
import com.tencent.mm.model.x;
import com.tencent.mm.protocal.a.up;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.cb;

final class at
  implements az
{
  at(ProgressDialog paramProgressDialog, boolean paramBoolean, cb paramcb)
  {
  }

  public final boolean kJ()
  {
    if (this.fDe != null)
      this.fDe.dismiss();
    int i = x.pO();
    int j;
    up localup;
    if (this.elC)
    {
      j = i & 0xFEFFFFFF;
      com.tencent.mm.model.bg.qW().oQ().set(34, Integer.valueOf(j));
      localup = new up();
      localup.imO = 16777216;
      if (!this.elC)
        break label159;
    }
    label159: for (int k = 0; ; k = 1)
    {
      localup.ipC = k;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(39, localup));
      if (this.elD != null)
        this.elD.a(null, null);
      return false;
      j = i | 0x1000000;
      com.tencent.mm.model.bg.qW().oQ().set(286722, "");
      com.tencent.mm.model.bg.qW().oQ().set(286721, "");
      com.tencent.mm.model.bg.qW().oQ().set(286723, "");
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.at
 * JD-Core Version:    0.6.2
 */