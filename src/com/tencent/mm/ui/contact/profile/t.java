package com.tencent.mm.ui.contact.profile;

import android.view.MenuItem;
import com.tencent.mm.ar.a;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;

final class t
  implements cm
{
  t(i parami)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return;
    case 1:
      i.g(this.jDl);
      return;
    case 2:
      MMActivity localMMActivity = i.c(this.jDl);
      int i = n.bKg;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = i.d(this.jDl).od();
      a.Bb(localMMActivity.getString(i, arrayOfObject));
      e.a(i.c(this.jDl), i.c(this.jDl).getString(n.bBf), "", i.c(this.jDl).getString(n.bBe), i.c(this.jDl).getString(n.bsK), new u(this), null);
      return;
    case 3:
      i.i(this.jDl);
      return;
    case 4:
    }
    i.j(this.jDl);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.t
 * JD-Core Version:    0.6.2
 */