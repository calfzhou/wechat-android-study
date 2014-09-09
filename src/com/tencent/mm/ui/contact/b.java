package com.tencent.mm.ui.contact;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.dj;
import com.tencent.mm.ui.base.dl;
import java.util.HashMap;

final class b
  implements View.OnClickListener
{
  b(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    z.v("!32@/B4Tb64lLpJvPADYHZ60V72QCl639+9L", "on delView clicked");
    this.jxu.ekC.aoN();
    if (this.jxu.frR != null)
      this.jxu.frR.S(((ViewStub)a.a(this.jxu).get(paramView)).getTag());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.b
 * JD-Core Version:    0.6.2
 */