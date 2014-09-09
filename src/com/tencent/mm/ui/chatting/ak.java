package com.tencent.mm.ui.chatting;

import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.en;

final class ak
  implements az
{
  ak(af paramaf, boolean paramBoolean)
  {
  }

  public final boolean kJ()
  {
    if (!this.jmP)
    {
      z.v("sensor", "speaker off");
      this.jmN.fg(false);
      this.jmN.aUs();
      return false;
    }
    z.v("sensor", "speaker true");
    af.c(this.jmN);
    af.a(this.jmN, en.a(af.b(this.jmN).h(), af.b(this.jmN).getString(n.bKZ), 2000L));
    this.jmN.fg(true);
    this.jmN.aUw();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ak
 * JD-Core Version:    0.6.2
 */