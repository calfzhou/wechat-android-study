package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.model.p;
import com.tencent.mm.sdk.platformtools.z;
import java.util.LinkedList;
import java.util.List;

final class f
  implements DialogInterface.OnClickListener
{
  f(a parama, x paramx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    z.d("!32@/B4Tb64lLpKN6K/THdLZybvP+afE3jBu", "dealwith verify relation out of date");
    LinkedList localLinkedList = ((p)this.dpb).ayz();
    List localList = ((p)this.dpb).ayv();
    if ((localList != null) && (localList.size() > 0))
      this.hAM.f((String)localList.get(0), localLinkedList);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.f
 * JD-Core Version:    0.6.2
 */