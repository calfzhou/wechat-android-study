package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.mm.c.a.ea;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.aa;
import com.tencent.mm.pluginsdk.ab;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.bindqq.QQGroupUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.pluginapp.ContactSearchUI;
import com.tencent.mm.ui.qrcode.ShareMicroMsgChoiceUI;
import com.tencent.mm.ui.setting.SettingsNotificationUI;
import com.tencent.mm.ui.setting.SettingsPrivacyUI;

final class ok
  implements ab
{
  ok(oj paramoj)
  {
  }

  public final void onClick(com.tencent.mm.pluginsdk.ui.applet.aq paramaq)
  {
    Object localObject;
    com.tencent.mm.storage.aq localaq1;
    if ((paramaq.data instanceof com.tencent.mm.storage.aq))
    {
      localObject = paramaq.data;
      localaq1 = (com.tencent.mm.storage.aq)localObject;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(paramaq.type);
      z.d("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "onSpanClickListener, onClick, hrefInfo type = %d", arrayOfObject);
    }
    switch (paramaq.type)
    {
    case 8:
    case 11:
    case 13:
    case 26:
    default:
    case 1:
    case 3:
    case 4:
    case 5:
    case 9:
    case 10:
    case 15:
    case 17:
    case 18:
    case 19:
    case 20:
    case 12:
    case 14:
    case 6:
    case 7:
    case 16:
    case 2:
    case 21:
    case 22:
    case 23:
    case 24:
    case 25:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  com.tencent.mm.storage.aq localaq3;
                  do
                  {
                    return;
                    localObject = null;
                    break;
                    localaq3 = ag.x("@" + paramaq.hBU, oj.a(this.jwl).getString(n.bNe));
                  }
                  while ((localaq3 != null) && (localaq3.aJt()));
                  String str1 = paramaq.hBU;
                  if (!str1.toLowerCase().startsWith("http"))
                    str1 = "http://" + str1;
                  Intent localIntent12 = new Intent();
                  localIntent12.putExtra("rawUrl", str1);
                  oq localoq = oj.b(this.jwl);
                  String str2 = null;
                  if (localoq == null);
                  while (true)
                  {
                    localIntent12.putExtra("geta8key_username", str2);
                    com.tencent.mm.am.a.b(oj.a(this.jwl), "webview", ".ui.tools.WebViewUI", localIntent12);
                    if (oj.c(this.jwl) == null)
                      break;
                    oj.c(this.jwl).onClick(paramaq);
                    return;
                    str2 = oj.b(this.jwl).getUsername();
                  }
                  Intent localIntent11 = new Intent();
                  localIntent11.setClass(oj.a(this.jwl), ContactInfoUI.class);
                  localIntent11.addFlags(268435456);
                  localIntent11.putExtra("Contact_User", paramaq.getUsername());
                  i locali = bg.qW().oT().ys(paramaq.getUsername());
                  if ((locali != null) && ((int)locali.dhv > 0) && (com.tencent.mm.g.a.cv(locali.getType())))
                    bb.c(localIntent11, paramaq.getUsername());
                  if (ch.ja(paramaq.getUsername()).length() > 0)
                    oj.a(this.jwl).startActivity(localIntent11);
                }
                while (oj.c(this.jwl) == null);
                oj.c(this.jwl).onClick(paramaq);
                return;
              }
              while (oj.c(this.jwl) == null);
              oj.c(this.jwl).onClick(paramaq);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              MMWizardActivity.j(oj.a(this.jwl), new Intent(oj.a(this.jwl), BindMContactIntroUI.class));
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              LauncherUI localLauncherUI4 = LauncherUI.aPm();
              if (localLauncherUI4 != null)
                localLauncherUI4.Bs("tab_settings");
              oj.a(this.jwl).startActivity(new Intent(oj.a(this.jwl), SettingsNotificationUI.class));
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent10 = new Intent();
              localIntent10.setClass(oj.a(this.jwl), ContactInfoUI.class);
              localIntent10.putExtra("Contact_User", "qqmail");
              oj.a(this.jwl).startActivity(localIntent10);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              LauncherUI localLauncherUI3 = LauncherUI.aPm();
              if (localLauncherUI3 != null)
                localLauncherUI3.Bs("tab_settings");
              oj.a(this.jwl).startActivity(new Intent(oj.a(this.jwl), SettingsPrivacyUI.class));
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent9 = new Intent(oj.a(this.jwl), ContactSearchUI.class);
              oj.a(this.jwl).startActivity(localIntent9);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent8 = new Intent(oj.a(this.jwl), ShareMicroMsgChoiceUI.class);
              oj.a(this.jwl).startActivity(localIntent8);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent7 = new Intent(oj.a(this.jwl), QQGroupUI.class);
              oj.a(this.jwl).startActivity(localIntent7);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent6 = new Intent(oj.a(this.jwl), MobileFriendUI.class);
              oj.a(this.jwl).startActivity(localIntent6);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              Intent localIntent5 = new Intent();
              localIntent5.setClass(oj.a(this.jwl), ContactInfoUI.class);
              localIntent5.putExtra("Contact_User", "weibo");
              oj.a(this.jwl).startActivity(localIntent5);
              return;
              if (oj.c(this.jwl) != null)
                oj.c(this.jwl).onClick(paramaq);
              com.tencent.mm.storage.aq localaq2 = ag.ea(oj.a(this.jwl).getString(n.bNd));
              Intent localIntent4 = new Intent();
              localIntent4.setClass(oj.a(this.jwl), SelectContactUI.class);
              localIntent4.putExtra("Contact_GroupFilter_Type", localaq2.getType());
              localIntent4.putExtra("Contact_GroupFilter_DisplayName", localaq2.oc());
              localIntent4.addFlags(67108864);
              LauncherUI localLauncherUI2 = LauncherUI.aPm();
              if (localLauncherUI2 != null)
                localLauncherUI2.Bs("tab_settings");
              oj.a(this.jwl).startActivity(localIntent4);
              return;
              LauncherUI localLauncherUI1 = LauncherUI.aPm();
              if (localLauncherUI1 != null)
                localLauncherUI1.Bs("tab_settings");
            }
            while (oj.c(this.jwl) == null);
            oj.c(this.jwl).onClick(paramaq);
            return;
            if (localaq1 == null)
            {
              e.o(oj.a(this.jwl), oj.a(this.jwl).getString(n.bPG), oj.a(this.jwl).getString(n.buo));
              return;
            }
            if (localaq1.getType().equals("@t.qq.com"))
            {
              if (bg.qW().oY().zX("@t.qq.com") != null);
              for (int i = 1; i == 0; i = 0)
              {
                e.o(oj.a(this.jwl), oj.a(this.jwl).getString(n.bPG), oj.a(this.jwl).getString(n.buo));
                return;
              }
            }
            if ((localaq1.getType().equals("@domain.android")) && (!ag.qu()))
            {
              e.o(oj.a(this.jwl), oj.a(this.jwl).getString(n.bPG), oj.a(this.jwl).getString(n.buo));
              return;
            }
            Intent localIntent3 = new Intent();
            localIntent3.setClass(oj.a(this.jwl), SelectContactUI.class);
            localIntent3.putExtra("Contact_GroupFilter_Type", localaq1.getType()).putExtra("Contact_GroupFilter_Str", localaq1.aJs()).putExtra("Contact_GroupFilter_DisplayName", localaq1.oc());
            localIntent3.addFlags(268435456);
            oj.a(this.jwl).startActivity(localIntent3);
          }
          while (oj.c(this.jwl) == null);
          oj.c(this.jwl).onClick(paramaq);
          return;
          this.jwl.b(paramaq.hBU, null);
        }
        while (oj.c(this.jwl) == null);
        oj.c(this.jwl).onClick(paramaq);
        return;
        this.jwl.a(paramaq.hBU, null);
      }
      while (oj.c(this.jwl) == null);
      oj.c(this.jwl).onClick(paramaq);
      return;
    case 28:
      if (oj.c(this.jwl) != null)
        oj.c(this.jwl).onClick(paramaq);
      ea localea = new ea();
      localea.cJQ.cJS = 11;
      localea.cJQ.cJT = paramaq.hBU;
      localea.cJQ.context = oj.a(this.jwl);
      com.tencent.mm.sdk.c.a.aGB().a(localea, Looper.myLooper());
      return;
    case 27:
      if (oj.c(this.jwl) != null)
        oj.c(this.jwl).onClick(paramaq);
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("rawUrl", paramaq.hBU);
      com.tencent.mm.am.a.b(oj.a(this.jwl), "webview", ".ui.tools.WebViewUI", localIntent2);
      return;
    case 29:
    }
    if (oj.c(this.jwl) != null)
      oj.c(this.jwl).onClick(paramaq);
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("entrance_scence", 3);
    localIntent1.putExtra("extra_id", (String)paramaq.data);
    localIntent1.putExtra("preceding_scence", 3);
    com.tencent.mm.am.a.b(oj.a(this.jwl), "emoji", ".ui.EmojiStoreDetailUI", localIntent1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ok
 * JD-Core Version:    0.6.2
 */