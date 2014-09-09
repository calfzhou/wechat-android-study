package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.b;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.bc;
import com.tencent.mm.ui.contact.da;

final class q
  implements AdapterView.OnItemClickListener
{
  q(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < SelectConversationUI.b(this.jYz).getHeaderViewsCount())
    {
      if (SelectConversationUI.c(this.jYz))
      {
        SelectConversationUI.d(this.jYz);
        return;
      }
      if (SelectConversationUI.e(this.jYz))
      {
        SelectConversationUI.f(this.jYz);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.setClass(this.jYz, SelectContactUI.class);
      localIntent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
      localIntent.putExtra("List_Type", 5);
      localIntent.putExtra("Need_Result", true);
      localIntent.putExtra("Need_Group_Item", true);
      if ((0x8 & SelectConversationUI.g(this.jYz)) == 0);
      for (boolean bool = true; ; bool = false)
      {
        localIntent.putExtra("Disable_Spuser_Medianote", bool);
        localIntent.putExtra("MMActivity.OverrideEnterAnimation", b.Mv);
        localIntent.putExtra("MMActivity.OverrideExitAnimation", b.MB);
        this.jYz.aPI().startActivityForResult(localIntent, 1);
        this.jYz.overridePendingTransition(b.MD, b.Mw);
        return;
      }
    }
    int i = paramInt - SelectConversationUI.b(this.jYz).getHeaderViewsCount();
    String str = ((bc)SelectConversationUI.a(this.jYz).getItem(i)).elz.getUsername();
    SelectConversationUI.a(this.jYz, str);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.q
 * JD-Core Version:    0.6.2
 */