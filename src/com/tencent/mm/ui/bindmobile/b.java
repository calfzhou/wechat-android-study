package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.model.x;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.friend.cw;

final class b
  implements cw
{
  b(BindMContactIntroUI paramBindMContactIntroUI, String paramString)
  {
  }

  public final void pf(int paramInt)
  {
    if (paramInt == 1)
      if (BindMContactIntroUI.g(this.jka))
      {
        if (!x.pM())
        {
          localmk = new mk();
          localmk.cPe.cPf = true;
          localmk.cPe.cPg = true;
          com.tencent.mm.sdk.c.a.aGB().g(localmk);
        }
        BindMContactIntroUI.h(this.jka);
        localIntent2 = new Intent();
        localIntent2.addFlags(67108864);
        com.tencent.mm.plugin.a.a.dWo.d(this.jka, localIntent2);
      }
    while (paramInt != 2)
    {
      do
      {
        mk localmk;
        Intent localIntent2;
        return;
        MMWizardActivity.j(this.jka, new Intent(this.jka, BindMContactStatusUI.class).putExtra("is_bind_for_contact_sync", BindMContactIntroUI.i(this.jka)));
      }
      while (!BindMContactIntroUI.d(this.jka));
      if (BindMContactIntroUI.i(this.jka))
      {
        n localn2 = n.fTF;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(3);
        arrayOfObject2[1] = Integer.valueOf(3);
        localn2.d(11002, arrayOfObject2);
        return;
      }
      n localn1 = n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(1);
      arrayOfObject1[1] = Integer.valueOf(2);
      localn1.d(11002, arrayOfObject1);
      return;
    }
    Intent localIntent1 = new Intent(this.jka, BindMContactVerifyUI.class);
    localIntent1.putExtra("bindmcontact_mobile", this.iTP);
    localIntent1.putExtra("is_bind_for_safe_device", BindMContactIntroUI.g(this.jka));
    localIntent1.putExtra("is_bind_for_contact_sync", BindMContactIntroUI.i(this.jka));
    localIntent1.putExtra("KEnterFromBanner", BindMContactIntroUI.d(this.jka));
    MMWizardActivity.j(this.jka, localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.b
 * JD-Core Version:    0.6.2
 */