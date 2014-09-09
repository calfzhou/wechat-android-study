package com.tencent.mm.ui.contact.profile;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.storage.i;
import junit.framework.Assert;

final class dm extends cf
{
  public dm(NormalUserFooterPreference paramNormalUserFooterPreference)
  {
    super(paramNormalUserFooterPreference);
  }

  protected final void aXT()
  {
    boolean bool1 = true;
    boolean bool2;
    if (!x.cY(NormalUserFooterPreference.a(this.jEw).getUsername()))
    {
      bool2 = bool1;
      Assert.assertTrue(bool2);
      if (y.dP(NormalUserFooterPreference.a(this.jEw).getUsername()))
        break label134;
    }
    while (true)
    {
      Assert.assertTrue(bool1);
      NormalUserFooterPreference.q(this.jEw).setVisibility(8);
      NormalUserFooterPreference.r(this.jEw).setVisibility(8);
      NormalUserFooterPreference.e(this.jEw).setText(n.bCX);
      NormalUserFooterPreference.e(this.jEw).setVisibility(0);
      NormalUserFooterPreference.g(this.jEw).setVisibility(8);
      NormalUserFooterPreference.s(this.jEw).setVisibility(8);
      NormalUserFooterPreference.o(this.jEw).setVisibility(8);
      return;
      bool2 = false;
      break;
      label134: bool1 = false;
    }
  }

  public final void aXV()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dm
 * JD-Core Version:    0.6.2
 */