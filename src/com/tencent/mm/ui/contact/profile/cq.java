package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.plugin.base.a.a;
import com.tencent.mm.storage.i;

final class cq
  implements Runnable
{
  cq(cf paramcf)
  {
  }

  public final void run()
  {
    a.x(NormalUserFooterPreference.b(this.jEy.jEw), NormalUserFooterPreference.a(this.jEy.jEw).getUsername());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.cq
 * JD-Core Version:    0.6.2
 */