package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.au;
import com.tencent.mm.modelfriend.h;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class bt
  implements h
{
  bt(MobileFriendUI paramMobileFriendUI)
  {
  }

  public final void Z(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.i("!32@/B4Tb64lLpLFDma4Qh7ELOVLkIWClC8Q", "syncAddrBookAndUpload onSyncEnd suc:%b", arrayOfObject);
    if (!paramBoolean)
    {
      if (MobileFriendUI.b(this.jkQ) != null)
      {
        MobileFriendUI.b(this.jkQ).dismiss();
        MobileFriendUI.c(this.jkQ);
      }
      return;
    }
    System.currentTimeMillis();
    au localau = new au(aa.vN(), aa.wh());
    bg.qX().d(localau);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.bt
 * JD-Core Version:    0.6.2
 */