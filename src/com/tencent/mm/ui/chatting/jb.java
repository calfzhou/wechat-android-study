package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.a.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.n;

final class jb
  implements Runnable
{
  jb(hd paramhd, long paramLong1, int paramInt, long paramLong2)
  {
  }

  public final void run()
  {
    l locall = ap.yg().S(this.dxL);
    if (locall.xQ())
      if (!locall.xR())
        break label60;
    String str2;
    label60: for (String str1 = ap.yg().d(locall); ; str1 = locall.xN())
    {
      str2 = ap.yg().f(str1, "", "");
      if ((ch.jb(str2)) || (c.ac(str2)))
        break;
      return;
    }
    hd.e(this.jtA).post(new jc(this, str2));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jb
 * JD-Core Version:    0.6.2
 */