package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.ui.base.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ef
  implements MenuItem.OnMenuItemClickListener
{
  ef(SelectContactUI paramSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    ArrayList localArrayList = SelectContactUI.g(this.jBX).aXv();
    if ((localArrayList != null) && (localArrayList.size() != 0))
    {
      if (!SelectContactUI.h(this.jBX))
        break label89;
      if (localArrayList.size() != 1)
        break label61;
      SelectContactUI.a(this.jBX, SelectContactUI.i(this.jBX), localArrayList);
    }
    label61: label89: 
    do
    {
      do
        return true;
      while (SelectContactUI.s(this.jBX));
      SelectContactUI.a(this.jBX, true);
      SelectContactUI.t(this.jBX);
      return true;
      if (SelectContactUI.u(this.jBX))
      {
        ActionBarActivity localActionBarActivity = this.jBX.aPI();
        String str = SelectContactUI.v(this.jBX);
        Iterator localIterator = localArrayList.iterator();
        while (localIterator.hasNext())
        {
          h localh = new h(str, fp.CH((String)localIterator.next()), 42);
          bg.qX().d(localh);
        }
        e.aw(localActionBarActivity, localActionBarActivity.getString(com.tencent.mm.n.bON));
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = str;
        arrayOfObject[1] = Integer.valueOf(3);
        arrayOfObject[2] = Integer.valueOf(localArrayList.size());
        localn.d(11003, arrayOfObject);
        localActionBarActivity.setResult(-1);
        localActionBarActivity.finish();
        return true;
      }
      if (localArrayList.size() == 1)
      {
        SelectContactUI.b(this.jBX, (String)localArrayList.get(0));
        return true;
      }
    }
    while (SelectContactUI.s(this.jBX));
    SelectContactUI.a(this.jBX, true);
    SelectContactUI.t(this.jBX);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ef
 * JD-Core Version:    0.6.2
 */