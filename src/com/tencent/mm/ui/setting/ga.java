package com.tencent.mm.ui.setting;

import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class ga
  implements m
{
  ga(SettingsUI paramSettingsUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpJkrm2DE1IrTwd4KebLGflW", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    am.h(new gb(this, paramx, paramInt2, paramInt1));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ga
 * JD-Core Version:    0.6.2
 */