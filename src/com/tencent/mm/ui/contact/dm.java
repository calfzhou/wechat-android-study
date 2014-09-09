package com.tencent.mm.ui.contact;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.ui.base.e;
import java.util.LinkedList;

final class dm
  implements MenuItem.OnMenuItemClickListener
{
  dm(SayHiEditUI paramSayHiEditUI, String paramString, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    this.jAW.XF();
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.add(this.iIl);
    LinkedList localLinkedList2 = new LinkedList();
    localLinkedList2.add(Integer.valueOf(this.jAV));
    p localp = new p(2, localLinkedList1, localLinkedList2, SayHiEditUI.a(this.jAW), "");
    bg.qX().d(localp);
    SayHiEditUI localSayHiEditUI = this.jAW;
    ActionBarActivity localActionBarActivity = this.jAW.aPI();
    this.jAW.getString(n.buo);
    SayHiEditUI.a(localSayHiEditUI, e.a(localActionBarActivity, this.jAW.getString(n.ceq), true, new dn(this, localp)));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.dm
 * JD-Core Version:    0.6.2
 */