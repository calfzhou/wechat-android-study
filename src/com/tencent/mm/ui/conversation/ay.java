package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.tools.ei;

final class ay
  implements AdapterView.OnItemLongClickListener
{
  ay(aj paramaj)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < aj.c(this.jGZ).getHeaderViewsCount())
    {
      z.d("!24@/B4Tb64lLpIDYaNtcQaIEA==", "on long click header view");
      return true;
    }
    aj.a(this.jGZ, (r)aj.e(this.jGZ).cn(paramInt - aj.c(this.jGZ).getHeaderViewsCount()));
    aj.b(this.jGZ, aj.q(this.jGZ).getUsername());
    aj.s(this.jGZ).a(paramView, paramInt, paramLong, this.jGZ, aj.r(this.jGZ));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ay
 * JD-Core Version:    0.6.2
 */