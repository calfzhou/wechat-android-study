package com.tencent.mm.ui.setting;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class cc
  implements m
{
  cc(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT9i3uRwaMkPPp8f7BpAb59k=", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    bg.qX().b(255, SettingsAliasUI.g(this.jNd));
    am.h(new cd(this, paramx, paramInt2, paramInt1));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.cc
 * JD-Core Version:    0.6.2
 */