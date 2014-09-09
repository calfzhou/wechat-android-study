package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.util.Iterator;
import java.util.List;

final class bg
  implements DialogInterface.OnClickListener
{
  bg(List paramList, gm paramgm, Context paramContext, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    List localList = this.jnR;
    if (localList == null)
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check contain only invalid send to friend msg error, select item empty");
    label16: for (int i = 1; ; i = 0)
    {
      if (i == 0)
        break label124;
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXNIwXR+/wPCUtE4pSafxclQ==", "only contain invalid msg, exit long click mode");
      if (this.jnS != null)
        this.jnS.aVe();
      return;
      Iterator localIterator = localList.iterator();
      if (!localIterator.hasNext())
        break label16;
      ar localar = (ar)localIterator.next();
      if ((localar.aJw()) || (be.F(localar)) || (be.G(localar)) || (be.H(localar)) || (localar.getType() == -1879048186))
        break;
    }
    label124: bf.c(this.dLL, this.jnR, this.jnT, this.jnS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bg
 * JD-Core Version:    0.6.2
 */