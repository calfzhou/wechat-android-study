package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.widget.ListAdapter;
import com.tencent.mm.sdk.platformtools.z;

final class bd extends bf
  implements Runnable
{
  View hAk;
  int hAl;

  private bd(SmileySubGrid paramSmileySubGrid)
  {
    super(paramSmileySubGrid, (byte)0);
  }

  public final void run()
  {
    ListAdapter localListAdapter = this.hAj.getAdapter();
    int i = this.hAl;
    if ((localListAdapter != null) && (this.hAj.getCount() > 0) && (i != -1) && (i < localListAdapter.getCount()) && (aAv()))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(i);
      arrayOfObject[1] = Long.valueOf(localListAdapter.getItemId(i));
      z.d("!32@/B4Tb64lLpJwTdf0UnldbM1CCN2N7ccr", "PerformClick performItemClick position:[%d] id:[%d] ", arrayOfObject);
      this.hAj.performItemClick(this.hAk, i, localListAdapter.getItemId(i));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.bd
 * JD-Core Version:    0.6.2
 */