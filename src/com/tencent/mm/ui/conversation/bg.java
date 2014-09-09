package com.tencent.mm.ui.conversation;

import android.widget.ListView;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class bg extends g
{
  private final long jHf = 3000L;
  private long jHg = 0L;
  private int jHh = -1;

  bg(aj paramaj)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "trigger double tab");
    aj.c(this.jGZ).postDelayed(new bh(this), 100L);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.bg
 * JD-Core Version:    0.6.2
 */