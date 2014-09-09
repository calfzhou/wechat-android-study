package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.r;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class i
  implements AdapterView.OnItemClickListener
{
  i(SearchConversationResultUI paramSearchConversationResultUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < SearchConversationResultUI.a(this.jZx).getHeaderViewsCount())
      return;
    int i = paramInt - SearchConversationResultUI.a(this.jZx).getHeaderViewsCount();
    r localr = (r)SearchConversationResultUI.b(this.jZx).getItem(i);
    if (localr == null)
    {
      z.e("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "null user at position = " + i);
      return;
    }
    z.d("!44@/B4Tb64lLpKCGRi+LcyHSL2bHGvRI18mEYwKXSwUqfk=", "username " + localr.getUsername());
    if (y.dn(localr.getUsername()))
    {
      if (x.pU())
      {
        Intent localIntent5 = new Intent().putExtra("finish_direct", true);
        com.tencent.mm.am.a.b(this.jZx.aPI(), "tmessage", ".ui.TConversationUI", localIntent5);
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dp(localr.getUsername()))
    {
      if (x.pR())
      {
        Intent localIntent4 = new Intent().putExtra("finish_direct", true);
        com.tencent.mm.am.a.b(this.jZx.aPI(), "qmessage", ".ui.QConversationUI", localIntent4);
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.jdMethod_do(localr.getUsername()))
    {
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dt(localr.getUsername()))
    {
      MMAppMgr.cb(localr.getUsername());
      if (x.pW())
      {
        com.tencent.mm.am.a.b(this.jZx, "qqsync", ".ui.QQSyncUI", new Intent().putExtra("finish_direct", true));
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dl(localr.getUsername()))
    {
      if (x.qd())
      {
        SearchConversationResultUI.a(this.jZx, ChattingUI.class, new Intent().putExtra("Chat_User", localr.getUsername()).putExtra("finish_direct", true));
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dy(localr.getUsername()))
    {
      if (x.pY())
      {
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("type", 20);
        com.tencent.mm.am.a.b(this.jZx, "readerapp", ".ui.ReaderAppUI", localIntent3);
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dF(localr.getUsername()))
    {
      if (x.pZ())
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("type", 11);
        com.tencent.mm.am.a.b(this.jZx, "readerapp", ".ui.ReaderAppUI", localIntent2);
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dq(localr.getUsername()))
    {
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dr(localr.getUsername()))
    {
      if (x.qb())
      {
        Intent localIntent1 = new Intent().putExtra("finish_direct", true);
        com.tencent.mm.am.a.b(this.jZx, "masssend", ".ui.MassSendHistoryUI", localIntent1);
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if (y.dx(localr.getUsername()))
    {
      if (x.pV())
      {
        SearchConversationResultUI.b(this.jZx, ChattingUI.class, new Intent().putExtra("Chat_User", localr.getUsername()).putExtra("finish_direct", true));
        return;
      }
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
      return;
    }
    if ((y.dv(SearchConversationResultUI.c(this.jZx))) || (y.dw(SearchConversationResultUI.c(this.jZx))) || (y.ds(SearchConversationResultUI.c(this.jZx))) || (y.dz(SearchConversationResultUI.c(this.jZx))) || (y.dA(SearchConversationResultUI.c(this.jZx))) || (y.dm(SearchConversationResultUI.c(this.jZx))) || (y.dI(SearchConversationResultUI.c(this.jZx))))
    {
      this.jZx.startActivity(new Intent(this.jZx, ContactInfoUI.class).putExtra("Contact_User", SearchConversationResultUI.c(this.jZx)));
      return;
    }
    SearchConversationResultUI.c(this.jZx, ChattingUI.class, new Intent().putExtra("Chat_User", localr.getUsername()).putExtra("finish_direct", true));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.i
 * JD-Core Version:    0.6.2
 */