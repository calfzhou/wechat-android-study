package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class bu
  implements MenuItem.OnMenuItemClickListener
{
  bu(bt parambt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    bt.a(this.jof).acU();
    Intent localIntent = new Intent();
    Set localSet = bt.a(this.jof).aUY();
    if (localSet != null)
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator1 = localSet.iterator();
      while (localIterator1.hasNext())
      {
        Long localLong2 = (Long)localIterator1.next();
        if (localLong2 != null)
          localArrayList.add(localLong2);
      }
      long[] arrayOfLong = new long[localArrayList.size()];
      Iterator localIterator2 = localArrayList.iterator();
      int j;
      for (int i = 0; localIterator2.hasNext(); i = j)
      {
        Long localLong1 = (Long)localIterator2.next();
        j = i + 1;
        arrayOfLong[i] = localLong1.longValue();
      }
      localIntent.putExtra("selected_message_ids", arrayOfLong);
      bt.b(this.jof).h().setResult(-1, localIntent);
      bt.b(this.jof).finish();
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bu
 * JD-Core Version:    0.6.2
 */