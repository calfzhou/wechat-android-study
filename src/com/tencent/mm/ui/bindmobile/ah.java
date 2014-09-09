package com.tencent.mm.ui.bindmobile;

import android.content.Intent;
import android.widget.CheckBox;
import com.tencent.mm.c.a.mk;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.friend.cw;

final class ah
  implements cw
{
  ah(BindMContactUI paramBindMContactUI, String paramString)
  {
  }

  public final void pf(int paramInt)
  {
    if (paramInt == 1)
      if (BindMContactUI.h(this.jkl))
      {
        if (!x.pM())
        {
          localmk = new mk();
          localmk.cPe.cPf = true;
          localmk.cPe.cPg = true;
          com.tencent.mm.sdk.c.a.aGB().g(localmk);
        }
        BindMContactUI.i(this.jkl);
        localIntent2 = new Intent();
        localIntent2.addFlags(67108864);
        com.tencent.mm.plugin.a.a.dWo.d(this.jkl, localIntent2);
      }
    label237: 
    while (paramInt != 2)
    {
      mk localmk;
      Intent localIntent2;
      return;
      if (BindMContactUI.j(this.jkl))
      {
        BindMContactUI localBindMContactUI = this.jkl;
        String str = this.jkl.getString(com.tencent.mm.n.cbu);
        e.aw(localBindMContactUI, str);
        MMWizardActivity.j(this.jkl, new Intent(this.jkl, BindMContactStatusUI.class));
        return;
      }
      if (BindMContactUI.k(this.jkl))
      {
        if (!BindMContactUI.l(this.jkl))
          break label237;
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(3);
        arrayOfObject2[1] = Integer.valueOf(3);
        localn2.d(11002, arrayOfObject2);
      }
      while (true)
      {
        MMWizardActivity.j(this.jkl, new Intent(this.jkl, BindMContactStatusUI.class));
        return;
        com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(1);
        arrayOfObject1[1] = Integer.valueOf(2);
        localn1.d(11002, arrayOfObject1);
      }
    }
    Intent localIntent1 = new Intent(this.jkl, BindMContactVerifyUI.class);
    localIntent1.putExtra("bindmcontact_mobile", this.iTP);
    localIntent1.putExtra("is_bind_for_safe_device", BindMContactUI.h(this.jkl));
    localIntent1.putExtra("is_bind_for_contact_sync", BindMContactUI.l(this.jkl));
    localIntent1.putExtra("is_bind_for_change_mobile", BindMContactUI.j(this.jkl));
    localIntent1.putExtra("KEnterFromBanner", BindMContactUI.k(this.jkl));
    if (BindMContactUI.m(this.jkl) != null)
      localIntent1.putExtra("BIND_FIND_ME_BY_MOBILE", BindMContactUI.m(this.jkl).isChecked());
    localIntent1.putExtra("BIND_FOR_QQ_REG", BindMContactUI.n(this.jkl));
    MMWizardActivity.j(this.jkl, localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.ah
 * JD-Core Version:    0.6.2
 */