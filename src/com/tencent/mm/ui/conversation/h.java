package com.tencent.mm.ui.conversation;

import android.os.Message;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.s;
import java.util.LinkedList;

final class h extends cm
{
  h(BizConversationUI paramBizConversationUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage != null) && (paramMessage.what == 1) && (this.jFf != null) && (!this.jFf.isFinishing()))
    {
      int i = BizConversationUI.c(this.jFf).getCount();
      LinkedList localLinkedList = new LinkedList();
      for (int j = 0; j < i; j++)
      {
        com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)BizConversationUI.c(this.jFf).getItem(j);
        if ((localr != null) && (!y.di(localr.getUsername())))
        {
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = localr.getUsername();
          z.d("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "checkEnterpriseChildConv delete conv %s", arrayOfObject);
          localLinkedList.add(localr.getUsername());
        }
      }
      if (localLinkedList.size() > 0)
      {
        bg.qW().oW().W(localLinkedList);
        BizConversationUI.c(this.jFf).closeCursor();
        BizConversationUI.c(this.jFf).DW();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.h
 * JD-Core Version:    0.6.2
 */