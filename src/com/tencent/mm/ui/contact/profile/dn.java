package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;

final class dn extends cf
{
  public dn(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void aXT()
  {
    NormalUserFooterPreference.q(this.jEw).setVisibility(8);
    NormalUserFooterPreference.e(this.jEw).setVisibility(0);
    if ((!this.jEw.aXS()) && (!NormalUserFooterPreference.a(this.jEw).getUsername().equals(x.pG())) && (!y.dP(NormalUserFooterPreference.a(this.jEw).getUsername())) && (!y.dK(NormalUserFooterPreference.a(this.jEw).getUsername())))
      NormalUserFooterPreference.g(this.jEw).setVisibility(0);
    while (true)
    {
      NormalUserFooterPreference.e(this.jEw).setText(n.bCW);
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
      NormalUserFooterPreference.r(this.jEw).setVisibility(8);
      NormalUserFooterPreference.o(this.jEw).setVisibility(8);
      return;
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    }
  }

  protected final void aXV()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dn
 * JD-Core Version:    0.6.2
 */