package com.tencent.mm.ui.transmit;

import com.tencent.mm.o.x;
import com.tencent.mm.ui.base.aa;

final class f
  implements com.tencent.mm.o.n
{
  f(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, x paramx)
  {
    if ((MsgRetransmitUI.b(this.jYo) == null) || (paramInt2 == 0))
      return;
    int i = paramInt1 * 100 / paramInt2;
    aa localaa = MsgRetransmitUI.b(this.jYo);
    MsgRetransmitUI localMsgRetransmitUI = this.jYo;
    int j = com.tencent.mm.n.bTk;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(MsgRetransmitUI.c(this.jYo));
    arrayOfObject[1] = Integer.valueOf(MsgRetransmitUI.d(this.jYo));
    arrayOfObject[2] = Integer.valueOf(i);
    localaa.setMessage(localMsgRetransmitUI.getString(j, arrayOfObject));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.f
 * JD-Core Version:    0.6.2
 */