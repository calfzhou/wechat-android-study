package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.am.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.plugin.voicereminder.a.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;

final class ax
  implements AdapterView.OnItemClickListener
{
  ax(aj paramaj)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt < aj.c(this.jGZ).getHeaderViewsCount());
    label1052: 
    while (true)
    {
      return;
      int i = paramInt - aj.c(this.jGZ).getHeaderViewsCount();
      com.tencent.mm.storage.r localr = (com.tencent.mm.storage.r)aj.e(this.jGZ).cn(i);
      if (localr == null)
      {
        z.e("!24@/B4Tb64lLpIDYaNtcQaIEA==", "null user at position = " + i);
        return;
      }
      int j;
      if (y.dn(localr.getUsername()))
        if (x.pT())
        {
          a.l(this.jGZ.agh(), "tmessage", ".ui.TConversationUI");
          j = 0;
        }
      while (true)
      {
        if (j == 0)
          break label1052;
        com.tencent.mm.plugin.f.c.n.fTF.js(9);
        LauncherUI localLauncherUI = LauncherUI.aPm();
        if (localLauncherUI == null)
          break;
        localLauncherUI.Br(localr.getUsername());
        return;
        this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
        j = 0;
        continue;
        if (y.dp(localr.getUsername()))
        {
          if (x.pP())
          {
            a.l(this.jGZ.agh(), "qmessage", ".ui.QConversationUI");
            j = 0;
          }
          else
          {
            this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
            j = 0;
          }
        }
        else if (y.jdMethod_do(localr.getUsername()))
        {
          if (x.pS())
          {
            a.l(this.jGZ.agh(), "bottle", ".ui.BottleConversationUI");
            j = 0;
          }
          else
          {
            this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
            j = 0;
          }
        }
        else if (y.dt(localr.getUsername()))
        {
          MMAppMgr.cb(localr.getUsername());
          if (x.pW())
          {
            a.l(this.jGZ.agh(), "qqsync", ".ui.QQSyncUI");
            j = 0;
          }
          else
          {
            this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
            j = 0;
          }
        }
        else
        {
          if (y.dl(localr.getUsername()))
          {
            if (ch.a((Integer)bg.qW().oQ().get(17)) == 1);
            for (int k = 1; ; k = 0)
            {
              if (k != 0)
                break label887;
              this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
              j = 0;
              break;
            }
          }
          if (y.dy(localr.getUsername()))
          {
            if (x.pY())
            {
              Intent localIntent4 = new Intent();
              localIntent4.addFlags(67108864);
              localIntent4.putExtra("type", 20);
              a.b(this.jGZ.agh(), "readerapp", ".ui.ReaderAppUI", localIntent4);
              j = 0;
            }
            else
            {
              this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
              j = 0;
            }
          }
          else if (y.dF(localr.getUsername()))
          {
            if (x.pZ())
            {
              Intent localIntent3 = new Intent();
              localIntent3.addFlags(67108864);
              localIntent3.putExtra("type", 11);
              a.b(this.jGZ.agh(), "readerapp", ".ui.ReaderAppUI", localIntent3);
              j = 0;
            }
            else
            {
              this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
              j = 0;
            }
          }
          else if (y.dq(localr.getUsername()))
          {
            this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
            j = 0;
          }
          else if (y.dr(localr.getUsername()))
          {
            if (x.qb())
            {
              Intent localIntent2 = new Intent().addFlags(67108864);
              a.b(this.jGZ.agh(), "masssend", ".ui.MassSendHistoryUI", localIntent2);
              j = 0;
            }
            else
            {
              this.jGZ.startActivity(new Intent(this.jGZ.agh(), ContactInfoUI.class).putExtra("Contact_User", localr.getUsername()));
              j = 0;
            }
          }
          else
          {
            if (y.dE(localr.getUsername()))
              ((f)bg.qF().eA(f.class.getName())).tf(localr.getUsername());
            label887: 
            do
            {
              j = 1;
              break;
              if (y.dG(localr.getUsername()))
              {
                this.jGZ.startActivity(new Intent(this.jGZ.agh(), BizConversationUI.class));
                j = 0;
                break;
              }
            }
            while ((!y.dj(localr.getUsername())) || (!com.tencent.mm.q.r.fF(localr.getUsername())));
            if (!y.di(localr.getUsername()))
            {
              com.tencent.mm.ui.base.e.aw(this.jGZ.agh(), this.jGZ.getString(com.tencent.mm.n.cBU));
              return;
            }
            Intent localIntent1 = new Intent(this.jGZ.agh(), BizConversationUI.class);
            localIntent1.putExtra("enterprise_biz_name", localr.getUsername());
            localIntent1.putExtra("enterprise_biz_display_name", y.dh(localr.getUsername()));
            this.jGZ.startActivity(localIntent1);
            j = 0;
          }
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ax
 * JD-Core Version:    0.6.2
 */