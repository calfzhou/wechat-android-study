package com.tencent.mm.ui.base;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;

final class et
{
  public static int jcZ = 0;
  private static Toast toast = null;

  public static void H(Context paramContext, int paramInt)
  {
    Context localContext = paramContext.getApplicationContext();
    if (jcZ != paramInt)
    {
      toast = null;
      jcZ = paramInt;
    }
    if (toast == null)
      toast = Toast.makeText(localContext, "", 1);
    View localView = View.inflate(localContext, k.bme, null);
    if (paramInt == 1)
      ((TextView)localView.findViewById(i.aNf)).setText(n.bSq);
    while (true)
    {
      toast.setView(localView);
      toast.show();
      return;
      if (paramInt == 3)
        ((TextView)localView.findViewById(i.aNf)).setText(n.bSr);
      else
        ((TextView)localView.findViewById(i.aNf)).setText(n.bSs);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.et
 * JD-Core Version:    0.6.2
 */