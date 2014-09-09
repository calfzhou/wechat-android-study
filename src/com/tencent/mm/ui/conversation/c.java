package com.tencent.mm.ui.conversation;

import com.tencent.mm.ab.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.dl;

final class c
  implements dl
{
  c(BizConversationUI paramBizConversationUI)
  {
  }

  public final void S(Object paramObject)
  {
    if (paramObject == null)
    {
      z.e("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "onItemDel object null");
      return;
    }
    String str = paramObject.toString();
    BizConversationUI.b(this.jFf, str);
    bg.qW().oW().yC(str);
    bg.qX().d(new k(5));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.c
 * JD-Core Version:    0.6.2
 */