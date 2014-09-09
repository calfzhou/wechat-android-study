package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.g.a;

final class dk extends cf
{
  public dk(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void aXT()
  {
    NormalUserFooterPreference.q(this.jEw).setVisibility(8);
    NormalUserFooterPreference.r(this.jEw).setVisibility(0);
    NormalUserFooterPreference.s(this.jEw).setVisibility(8);
    NormalUserFooterPreference.e(this.jEw).setVisibility(8);
    NormalUserFooterPreference.f(this.jEw).setVisibility(8);
    NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    NormalUserFooterPreference.j(this.jEw).setVisibility(8);
    NormalUserFooterPreference.o(this.jEw).setVisibility(8);
    NormalUserFooterPreference.y(this.jEw).setOnClickListener(new dl(this));
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
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dk
 * JD-Core Version:    0.6.2
 */