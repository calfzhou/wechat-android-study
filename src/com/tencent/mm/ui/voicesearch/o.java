package com.tencent.mm.ui.voicesearch;

import java.util.ArrayList;
import java.util.List;

final class o
  implements Runnable
{
  o(j paramj, List paramList)
  {
  }

  public final void run()
  {
    if (j.a(this.jZD) == null)
      j.a(this.jZD, new ArrayList());
    j.a(this.jZD).clear();
    j.a(this.jZD).addAll(this.jZE);
    j.a(this.jZD).add("officialaccounts");
    j.a(this.jZD).add("helper_entry");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.o
 * JD-Core Version:    0.6.2
 */