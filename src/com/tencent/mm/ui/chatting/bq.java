package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.e;
import java.util.Iterator;
import java.util.List;

final class bq
  implements DialogInterface.OnClickListener
{
  bq(bo parambo, MenuItem paramMenuItem)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    List localList = this.jnY.jnR;
    label28: int i;
    if ((localList == null) || (localList.isEmpty()))
    {
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmX9VxAHtgfWqs=", "check contain only invalid send to brand service error, select item empty");
      break label72;
      i = 1;
      label31: if (i == 0)
        break label150;
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXq7Ep5GXOA3OeNRgsM3MeKw==", "only contain invalid msg, exit long click mode");
      if (this.jnY.jnX != null)
        this.jnY.jnX.aVe();
    }
    label72: 
    do
    {
      return;
      Iterator localIterator = localList.iterator();
      if (!localIterator.hasNext())
        break label28;
      ar localar = (ar)localIterator.next();
      if ((localar.aJw()) || (be.F(localar)) || (localar.aJB()) || (be.G(localar)) || (be.H(localar)) || (localar.getType() == -1879048186))
        break;
      i = 0;
      break label31;
      Context localContext = this.jnY.dLL;
      this.jnY.dLL.getString(n.buo);
      bk.a(e.a(localContext, this.jnY.dLL.getString(n.cen), false, null));
      gm.jrh.c(new br(this.jnY.dLL, this.jnY.jnR, this.jnY.jnT, this.jnZ.getTitle()));
    }
    while (this.jnY.jnX == null);
    label150: this.jnY.jnX.aVe();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bq
 * JD-Core Version:    0.6.2
 */