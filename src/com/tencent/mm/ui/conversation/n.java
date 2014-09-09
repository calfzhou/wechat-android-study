package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.ChattingUI;

final class n
  implements AdapterView.OnItemClickListener
{
  n(BizConversationUI paramBizConversationUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)BizConversationUI.c(this.jFf).getItem(paramInt);
    if (localr == null)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(paramInt);
      arrayOfObject[1] = Integer.valueOf(BizConversationUI.c(this.jFf).getCount());
      z.e("!44@/B4Tb64lLpIMw+dFbL21OiX21bsyOnJqkPvIR1gSqXw=", "user should not be null. position:%d, size:%d", arrayOfObject);
      BizConversationUI.c(this.jFf).notifyDataSetChanged();
      return;
    }
    Intent localIntent = new Intent(this.jFf, ChattingUI.class);
    localIntent.addFlags(67108864);
    localIntent.putExtra("finish_direct", true);
    localIntent.putExtra("Chat_User", localr.getUsername());
    this.jFf.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.n
 * JD-Core Version:    0.6.2
 */