package com.tencent.mm.ui.chatting;

import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class ce
  implements Runnable
{
  ce(bw parambw, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    int i = bw.j(this.jor).getLastVisiblePosition();
    int j = -1 + bw.j(this.jor).getCount();
    z.v("!56@/B4Tb64lLpKwUcOR+EdWcty+WvCaqY0r1h+IytP2caAOFJMyUBO6MA==", "last visible/adapter=" + i + "/" + j + " " + this.jos);
    if ((i >= j - 1) || (this.jos))
    {
      int k = bw.o(this.jor).getCount();
      if ((k > 1) && (((ar)bw.o(this.jor).getItem(k - 2)).isSystem()))
      {
        int m = j - 1;
        ListView localListView2 = bw.j(this.jor);
        md.a(localListView2, m, 0);
      }
    }
    else
    {
      return;
    }
    ListView localListView1 = bw.j(this.jor);
    md.c(localListView1, j);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ce
 * JD-Core Version:    0.6.2
 */