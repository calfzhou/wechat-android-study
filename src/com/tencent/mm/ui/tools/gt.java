package com.tencent.mm.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.am.a;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;
import java.util.List;

final class gt
  implements MenuItem.OnMenuItemClickListener
{
  gt(ShowImageUI paramShowImageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    LinkedList localLinkedList1 = new LinkedList();
    LinkedList localLinkedList2 = new LinkedList();
    if ((ShowImageUI.a(this.jVa)) && (a.to("favorite")))
    {
      localLinkedList2.add(Integer.valueOf(0));
      localLinkedList1.add(this.jVa.getString(n.cai));
      localLinkedList2.add(Integer.valueOf(1));
      localLinkedList1.add(this.jVa.getString(n.bUO));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(this.jVa.getString(n.cca));
    }
    while (true)
    {
      e.a(this.jVa, "", localLinkedList1, localLinkedList2, "", false, new gu(this));
      return true;
      localLinkedList2.add(Integer.valueOf(0));
      localLinkedList1.add(this.jVa.getString(n.cai));
      localLinkedList2.add(Integer.valueOf(2));
      localLinkedList1.add(this.jVa.getString(n.cca));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.gt
 * JD-Core Version:    0.6.2
 */