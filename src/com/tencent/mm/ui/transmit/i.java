package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ag;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;

final class i
  implements DialogInterface.OnClickListener
{
  i(h paramh)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (MsgRetransmitUI.e(this.jYp.jYo) != null)
    {
      int i = MsgRetransmitUI.e(this.jYp.jYo).yb();
      l locall = ap.yg().dT(i);
      ap.yg().dS(i);
      bg.qW().oV().cW(locall.xL());
      bg.qX().c(MsgRetransmitUI.e(this.jYp.jYo));
    }
    Toast.makeText(this.jYp.jYo, com.tencent.mm.n.bTf, 1).show();
    this.jYp.jYo.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.i
 * JD-Core Version:    0.6.2
 */