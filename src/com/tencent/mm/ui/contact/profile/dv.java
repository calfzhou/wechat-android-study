package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.e;

final class dv
  implements View.OnClickListener
{
  dv(dt paramdt)
  {
  }

  public final void onClick(View paramView)
  {
    if (NormalUserFooterPreference.a(this.jEJ.jEw).xI())
    {
      y.d(NormalUserFooterPreference.a(this.jEJ.jEw));
      NormalUserFooterPreference.a(this.jEJ.jEw).oL();
      bg.qX().d(new k(5));
      this.jEJ.aXT();
      return;
    }
    e.a(this.jEJ.jEw.getContext(), this.jEJ.jEw.getContext().getString(n.bCj), this.jEJ.jEw.getContext().getString(n.bCi), new dw(this), null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dv
 * JD-Core Version:    0.6.2
 */