package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.y;
import com.tencent.mm.storage.i;
import junit.framework.Assert;

final class di extends cf
{
  public di(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void aXT()
  {
    Assert.assertTrue(y.du(NormalUserFooterPreference.a(this.jEw).getUsername()));
    NormalUserFooterPreference.q(this.jEw).setVisibility(8);
    NormalUserFooterPreference.r(this.jEw).setVisibility(8);
    NormalUserFooterPreference.s(this.jEw).setVisibility(8);
    NormalUserFooterPreference.e(this.jEw).setVisibility(0);
    NormalUserFooterPreference.f(this.jEw).setVisibility(8);
    NormalUserFooterPreference.g(this.jEw).setVisibility(8);
    NormalUserFooterPreference.j(this.jEw).setVisibility(8);
    NormalUserFooterPreference.o(this.jEw).setVisibility(8);
  }

  protected final void aXV()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.di
 * JD-Core Version:    0.6.2
 */