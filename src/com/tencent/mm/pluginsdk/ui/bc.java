package com.tencent.mm.pluginsdk.ui;

import android.view.View;
import android.widget.ListAdapter;
import com.tencent.mm.sdk.platformtools.z;

final class bc extends bf
  implements Runnable
{
  private bc(SmileySubGrid paramSmileySubGrid)
  {
    super(paramSmileySubGrid, (byte)0);
  }

  public final void run()
  {
    int i = this.hAj.hzN;
    View localView = this.hAj.getChildAt(i - this.hAj.getFirstVisiblePosition());
    if (localView != null)
    {
      int j = this.hAj.hzN;
      long l = this.hAj.getAdapter().getItemId(this.hAj.hzN);
      if (aAv())
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(j);
        arrayOfObject[1] = Long.valueOf(l);
        z.d("!32@/B4Tb64lLpJwTdf0UnldbM1CCN2N7ccr", "CheckForLongPress performLongPress position:[%d] id:[%d]", arrayOfObject);
        SmileySubGrid.a(this.hAj, localView, i);
        this.hAj.hzM = -1;
        this.hAj.hzL = 5;
        this.hAj.aI(false);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.bc
 * JD-Core Version:    0.6.2
 */