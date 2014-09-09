package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;

final class jq
  implements AdapterView.OnItemClickListener
{
  jq(hd paramhd)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    ar localar = (ar)hd.K(this.jtA).getItem(paramInt);
    if ((localar != null) && (!ch.jb(localar.kt())))
    {
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(1);
      localn.d(10450, arrayOfObject);
      Intent localIntent = new Intent(this.jtA.agh(), ChattingUI.class);
      localIntent.putExtra("Chat_User", localar.kt());
      localIntent.putExtra("finish_direct", true);
      localIntent.putExtra("show_search_chat_content_result", true);
      localIntent.putExtra("msg_local_id", localar.kk());
      this.jtA.startActivity(localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.jq
 * JD-Core Version:    0.6.2
 */