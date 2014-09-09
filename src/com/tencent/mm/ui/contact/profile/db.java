package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.model.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;

final class db extends cf
{
  public db(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void aXT()
  {
    NormalUserFooterPreference.q(this.jEw).setVisibility(8);
    if ((!a.cv(NormalUserFooterPreference.a(this.jEw).getType())) || ((a.cv(NormalUserFooterPreference.a(this.jEw).getType())) && (i.yc(NormalUserFooterPreference.a(this.jEw).getUsername()))))
    {
      NormalUserFooterPreference.r(this.jEw).setVisibility(0);
      NormalUserFooterPreference.e(this.jEw).setVisibility(8);
      NormalUserFooterPreference.f(this.jEw).setVisibility(8);
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    }
    while (true)
    {
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
      NormalUserFooterPreference.j(this.jEw).setVisibility(8);
      NormalUserFooterPreference.o(this.jEw).setVisibility(8);
      NormalUserFooterPreference.y(this.jEw).setOnClickListener(new dc(this));
      return;
      NormalUserFooterPreference.r(this.jEw).setVisibility(8);
      NormalUserFooterPreference.e(this.jEw).setVisibility(0);
      if ((this.jEw.aXS()) || (NormalUserFooterPreference.a(this.jEw).getUsername().equals(x.pG())))
        break;
      NormalUserFooterPreference.g(this.jEw).setVisibility(0);
    }
  }

  protected final void aXV()
  {
    if (NormalUserFooterPreference.a(this.jEw) == null)
    {
      z.e("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "contact is null in NearByFriendHandler");
      return;
    }
    if ((!a.cv(NormalUserFooterPreference.a(this.jEw).getType())) || ((a.cv(NormalUserFooterPreference.a(this.jEw).getType())) && (i.yc(NormalUserFooterPreference.a(this.jEw).getUsername()))))
    {
      if (i.yc(NormalUserFooterPreference.a(this.jEw).getUsername()))
      {
        y(true, true);
        return;
      }
      y(false, true);
      return;
    }
    aXU();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.db
 * JD-Core Version:    0.6.2
 */