package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.tools.ei;
import com.tencent.mm.ui.voicesearch.j;

final class az
  implements AdapterView.OnItemLongClickListener
{
  az(ChatroomContactUI paramChatroomContactUI)
  {
  }

  public final boolean onItemLongClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    z.d("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "onItemLongClick, targetview is SearchBar::ListView, pos = " + paramInt);
    if (paramInt < ChatroomContactUI.b(this.jyq).getHeaderViewsCount())
      z.w("!44@/B4Tb64lLpIELL9O96QoKLI7tZ4uMi2P4SCBJbIGwmU=", "on item long click, but match header view");
    String str;
    do
    {
      do
        return true;
      while ((ChatroomContactUI.d(this.jyq) != null) && (ChatroomContactUI.d(this.jyq).bcb()));
      str = ((i)ChatroomContactUI.f(this.jyq).getItem(paramInt - ChatroomContactUI.b(this.jyq).getHeaderViewsCount())).getUsername();
    }
    while ((y.dG(str)) || (y.dH(str)));
    ChatroomContactUI.c(this.jyq, str);
    ChatroomContactUI.h(this.jyq).a(paramView, paramInt, paramLong, this.jyq, ChatroomContactUI.g(this.jyq));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.az
 * JD-Core Version:    0.6.2
 */