package com.tencent.mm.ui.setting;

import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n.c;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.z;

final class ek
  implements Runnable
{
  ek(SettingsPersonalInfoUI paramSettingsPersonalInfoUI)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Boolean.valueOf(bg.oE());
    arrayOfObject1[1] = x.pG();
    z.d("!44@/B4Tb64lLpJkrm2DE1IrT3Y9IGxzqR8LWx0lkoXfqyE=", "updateHeadImg hasUin:%b user:%s", arrayOfObject1);
    if (bg.oE())
      bf.dkH.y("last_avatar_path", c.eL(x.pG()));
    SettingsPersonalInfoUI.a(this.jNM);
    if (SettingsPersonalInfoUI.b(this.jNM))
    {
      n localn = n.fTF;
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(4);
      arrayOfObject2[1] = Integer.valueOf(4);
      localn.d(11002, arrayOfObject2);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.ek
 * JD-Core Version:    0.6.2
 */