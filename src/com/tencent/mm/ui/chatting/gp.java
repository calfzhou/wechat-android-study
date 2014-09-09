package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import java.util.Set;

final class gp
  implements DialogInterface.OnClickListener
{
  gp(go paramgo, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.i("!56@/B4Tb64lLpKwUcOR+EdWconoT4QVe0ZHl1mqxM9m75klvg8EeRcUAA==", "delete message");
    Context localContext = this.dLL;
    Set localSet = gm.a(this.jrn.jrm).aUY();
    gm localgm = this.jrn.jrm;
    if (localContext == null)
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXeAKxqz/PXGE=", "do delete msg fail, context is null");
    while (true)
    {
      this.jrn.jrm.aVe();
      return;
      if ((localSet == null) || (localSet.isEmpty()))
      {
        z.w("!44@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXeAKxqz/PXGE=", "do delete msg fail, select ids is empty");
      }
      else
      {
        localContext.getString(com.tencent.mm.n.buo);
        cr localcr = e.a(localContext, localContext.getString(com.tencent.mm.n.bEj), false, null);
        gm.jrh.c(new bd(localSet, localcr, localgm));
        com.tencent.mm.plugin.f.c.n localn = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(4);
        arrayOfObject[1] = Integer.valueOf(localSet.size());
        localn.d(10811, arrayOfObject);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gp
 * JD-Core Version:    0.6.2
 */