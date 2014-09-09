package com.tencent.mm.plugin.accountsync.model;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.au;
import com.tencent.mm.modelfriend.h;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements h
{
  e(ContactsSyncService paramContactsSyncService)
  {
  }

  public final void Z(boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(paramBoolean);
    z.i("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "performSync end, succ:%b", arrayOfObject);
    if (!paramBoolean)
    {
      ContactsSyncService.a(this.dWI);
      return;
    }
    bg.qX().a(133, this.dWI);
    System.currentTimeMillis();
    au localau = new au(aa.vN(), aa.wh());
    bg.qX().d(localau);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.e
 * JD-Core Version:    0.6.2
 */