package com.tencent.mm.ui.setting;

import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;

final class ao
  implements m
{
  ao(SettingsAboutMicroMsgUI paramSettingsAboutMicroMsgUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!56@/B4Tb64lLpJkrm2DE1IrT1DU+2yVjipbPtDNNwKiPzypQCikwVy6nw==", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramx.getType());
    am.h(new ap(this, paramx, paramInt2, paramInt1));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ao
 * JD-Core Version:    0.6.2
 */