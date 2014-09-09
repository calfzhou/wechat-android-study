package com.tencent.mm.ui.bindqq;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.modelfriend.av;
import com.tencent.mm.ui.cb;
import com.tencent.mm.ui.friend.QQFriendUI;

final class r
  implements AdapterView.OnItemClickListener
{
  r(QQGroupUI paramQQGroupUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    av localav = (av)QQGroupUI.d(this.jld).getItem(paramInt);
    Intent localIntent = new Intent(this.jld, QQFriendUI.class);
    localIntent.putExtra("qqgroup_id", localav.wH());
    localIntent.putExtra("qqgroup_name", localav.wM());
    localIntent.putExtra("qqgroup_sendmessage", this.jld.getIntent().getBooleanExtra("qqgroup_sendmessage", false));
    this.jld.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.r
 * JD-Core Version:    0.6.2
 */