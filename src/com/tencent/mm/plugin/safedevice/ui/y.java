package com.tencent.mm.plugin.safedevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ai;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.x;
import com.tencent.mm.ui.base.e;

final class y
  implements View.OnClickListener
{
  y(SecurityAccountIntroUI paramSecurityAccountIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    if (!SecurityAccountIntroUI.a(this.fUu));
    for (Object localObject = new ai(SecurityAccountIntroUI.b(this.fUu), 10, "", 0, "", SecurityAccountIntroUI.c(this.fUu)); ; localObject = new ak(SecurityAccountIntroUI.b(this.fUu), 10, "", 0, ""))
    {
      bg.qX().d((x)localObject);
      SecurityAccountIntroUI localSecurityAccountIntroUI1 = this.fUu;
      SecurityAccountIntroUI localSecurityAccountIntroUI2 = this.fUu;
      this.fUu.getString(n.buo);
      SecurityAccountIntroUI.a(localSecurityAccountIntroUI1, e.a(localSecurityAccountIntroUI2, this.fUu.getString(n.cbU), true, new z(this, (x)localObject)));
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.y
 * JD-Core Version:    0.6.2
 */