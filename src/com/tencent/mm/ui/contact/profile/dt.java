package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.g.a;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMActivity;

final class dt extends do
  implements m
{
  public dt(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    super.a(paramInt1, paramInt2, paramString, paramx);
  }

  protected final void aXT()
  {
    super.aXT();
    NormalUserFooterPreference.q(this.jEw).setVisibility(0);
    NormalUserFooterPreference.s(this.jEw).setVisibility(8);
    NormalUserFooterPreference.e(this.jEw).setVisibility(8);
    NormalUserFooterPreference.f(this.jEw).setVisibility(8);
    NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    NormalUserFooterPreference.j(this.jEw).setVisibility(8);
    NormalUserFooterPreference.r(this.jEw).setVisibility(8);
    NormalUserFooterPreference.o(this.jEw).setVisibility(8);
    switch (NormalUserFooterPreference.k(this.jEw))
    {
    default:
      NormalUserFooterPreference.h(this.jEw).setVisibility(8);
      NormalUserFooterPreference.v(this.jEw).setVisibility(8);
      if (NormalUserFooterPreference.a(this.jEw).xI())
      {
        NormalUserFooterPreference.w(this.jEw).setText(NormalUserFooterPreference.b(this.jEw).getString(n.bCk));
        NormalUserFooterPreference.o(this.jEw).setVisibility(0);
      }
      break;
    case 1:
    case 2:
    case 3:
    case 12:
    case 13:
    case 18:
    case 22:
    case 23:
    case 24:
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 34:
    case 58:
    case 59:
    case 60:
    }
    while (true)
    {
      NormalUserFooterPreference.x(this.jEw).setOnClickListener(new du(this));
      NormalUserFooterPreference.w(this.jEw).setOnClickListener(new dv(this));
      return;
      NormalUserFooterPreference.h(this.jEw).setVisibility(0);
      NormalUserFooterPreference.v(this.jEw).setVisibility(0);
      break;
      NormalUserFooterPreference.w(this.jEw).setText(NormalUserFooterPreference.b(this.jEw).getString(n.bCi));
    }
  }

  protected final void aXV()
  {
    if ((NormalUserFooterPreference.a(this.jEw) != null) && (a.cv(NormalUserFooterPreference.a(this.jEw).getType())))
    {
      aXU();
      return;
    }
    y(false, true);
  }

  protected final void aXZ()
  {
    super.aXZ();
  }

  protected final void onDetach()
  {
    super.onDetach();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dt
 * JD-Core Version:    0.6.2
 */