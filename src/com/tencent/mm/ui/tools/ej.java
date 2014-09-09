package com.tencent.mm.ui.tools;

import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cg;
import com.tencent.mm.ui.base.ch;
import java.util.Iterator;
import java.util.List;

final class ej
  implements AdapterView.OnItemLongClickListener
{
  ej(ei paramei, View.OnCreateContextMenuListener paramOnCreateContextMenuListener)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ei.a(this.jTS).clear();
    z.v("!44@/B4Tb64lLpLsoKMPiL0xLC429fVkFuxXeqosDHFYUTE=", "registerForContextMenu AbsListView long click");
    AdapterView.AdapterContextMenuInfo localAdapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(paramView, paramInt, paramLong);
    this.jTR.onCreateContextMenu(ei.a(this.jTS), paramView, localAdapterContextMenuInfo);
    Iterator localIterator = ei.a(this.jTS).aSj().iterator();
    while (localIterator.hasNext())
      ((ch)localIterator.next()).a(localAdapterContextMenuInfo);
    this.jTS.baG();
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ej
 * JD-Core Version:    0.6.2
 */