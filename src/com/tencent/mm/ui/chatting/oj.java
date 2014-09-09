package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.d;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.pluginsdk.aa;
import com.tencent.mm.pluginsdk.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindmobile.MobileFriendUI;
import com.tencent.mm.ui.bindqq.QQGroupUI;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.VoipAddressUI;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.friend.FMessageConversationUI;
import com.tencent.mm.ui.pluginapp.AddMoreFriendsUI;
import com.tencent.mm.ui.pluginapp.ContactSearchUI;
import com.tencent.mm.ui.qrcode.ShareMicroMsgChoiceUI;
import com.tencent.mm.ui.setting.SettingsAboutSystemUI;
import com.tencent.mm.ui.setting.SettingsAccountInfoUI;
import com.tencent.mm.ui.setting.SettingsNotificationUI;
import com.tencent.mm.ui.setting.SettingsPersonalInfoUI;
import com.tencent.mm.ui.setting.SettingsPluginsUI;
import com.tencent.mm.ui.setting.SettingsPrivacyUI;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public class oj
  implements com.tencent.mm.pluginsdk.z
{
  private static final Pattern dXz = Pattern.compile(arrayOfString[0]);
  private static final String[] jwb;
  protected static final Pattern jwc = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~%\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
  protected static final Pattern jwd = Pattern.compile("[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9][@#][a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9] *\\. *[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]");
  protected static final Pattern jwe = Pattern.compile("\\+?(\\d{2,8}([- ]?\\d{3,8}){2,6}|\\d{5,20})");
  protected static final Pattern jwf = Pattern.compile("weixin://wxpay/\\S+");
  private static final d jwk = new d(500);
  private final Context context;
  private aa jwg;
  private List jwh;
  private oq jwi;
  public final ab jwj = new ok(this);

  static
  {
    String[] arrayOfString = { "<a.+?href\\s*=\\s*[\"|']\\s*(.+?)\\s*[\"|']\\s*>(.+?)</a>" };
    jwb = arrayOfString;
  }

  public oj(Context paramContext, aa paramaa)
  {
    this(paramContext, paramaa, null);
  }

  public oj(Context paramContext, aa paramaa, oq paramoq)
  {
    this.context = paramContext;
    this.jwg = paramaa;
    this.jwi = paramoq;
  }

  private void a(TextView paramTextView, boolean paramBoolean)
  {
    T(paramTextView.getText().toString(), paramBoolean);
  }

  private static boolean a(ArrayList paramArrayList, os paramos)
  {
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
      if (os.a((os)localIterator.next(), paramos))
        return true;
    return false;
  }

  public static boolean aA(Context paramContext, String paramString)
  {
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "open SpecificView url is null");
      return false;
    }
    Intent localIntent1 = new Intent();
    localIntent1.addFlags(268435456);
    String str = paramString.replace("weixin://openSpecificView/", "");
    if (str.equalsIgnoreCase("contacts"))
    {
      localIntent1.addFlags(67108864);
      localIntent1.putExtra("preferred_tab", 2);
      paramContext.startActivity(localIntent1.setClass(paramContext, LauncherUI.class));
    }
    while (true)
    {
      return true;
      if (str.equalsIgnoreCase("newfriend"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, FMessageConversationUI.class));
      }
      else if (str.equalsIgnoreCase("addfriend"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, AddMoreFriendsUI.class));
      }
      else if (str.equalsIgnoreCase("searchbrand"))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("Contact_Scene", 39);
        com.tencent.mm.am.a.b(paramContext, "brandservice", ".ui.SearchOrRecommendBizUI", localIntent2);
      }
      else if (str.equalsIgnoreCase("discover"))
      {
        localIntent1.addFlags(67108864);
        localIntent1.putExtra("preferred_tab", 1);
        paramContext.startActivity(localIntent1.setClass(paramContext, LauncherUI.class));
      }
      else if (str.equalsIgnoreCase("timeline"))
      {
        com.tencent.mm.am.a.b(paramContext, "sns", ".ui.SnsTimeLineUI", localIntent1);
      }
      else if (str.equalsIgnoreCase("scan"))
      {
        com.tencent.mm.am.a.b(paramContext, "scanner", ".ui.BaseScanUI", localIntent1);
      }
      else if (str.equalsIgnoreCase("myprofile"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, SettingsPersonalInfoUI.class));
      }
      else if (str.equalsIgnoreCase("myaccount"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, SettingsAccountInfoUI.class));
      }
      else if (str.equalsIgnoreCase("bindphone"))
      {
        MMWizardActivity.j(paramContext, localIntent1.setClass(paramContext, BindMContactIntroUI.class));
      }
      else if (str.equalsIgnoreCase("privacy"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, SettingsPrivacyUI.class));
      }
      else if (str.equalsIgnoreCase("general"))
      {
        paramContext.startActivity(localIntent1.setClass(paramContext, SettingsAboutSystemUI.class));
      }
      else
      {
        if (!str.equalsIgnoreCase("invitevoip"))
          break;
        VoipAddressUI.ct(paramContext);
      }
    }
  }

  public static boolean aWB()
  {
    boolean bool1 = ch.ys();
    boolean bool2 = false;
    if (!bool1)
    {
      int i = ch.getInt(com.tencent.mm.f.e.or().getValue("ShowWeixinPBIntro"), 0);
      bool2 = false;
      if (i == 0)
      {
        boolean bool3 = com.tencent.mm.pluginsdk.model.app.u.d(ak.getContext(), "com.tencent.pb");
        bool2 = false;
        if (!bool3)
          bool2 = true;
      }
    }
    return bool2;
  }

  private boolean aWC()
  {
    if (Build.VERSION.SDK_INT <= 4);
    while ((!aWD()) && (!aWE()))
      return false;
    return true;
  }

  private boolean aWD()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT");
    localIntent.setType("vnd.android.cursor.dir/contact");
    localIntent.putExtra("phone", "10086");
    return ch.i(this.context, localIntent);
  }

  private boolean aWE()
  {
    Intent localIntent = new Intent("android.intent.action.PICK", ContactsContract.Contacts.CONTENT_URI);
    return ch.i(this.context, localIntent);
  }

  public static void b(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    if (paramString1.toLowerCase().startsWith("http"))
    {
      localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
      localIntent.addFlags(268435456);
    }
    while (c(paramContext, paramString1, paramBoolean, paramString2))
      try
      {
        Intent localIntent;
        paramContext.startActivity(localIntent);
        return;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "jumpToUrl fail, ex = " + localException.getMessage());
        return;
      }
    com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "no such link");
  }

  private static boolean c(Context paramContext, String paramString1, boolean paramBoolean, String paramString2)
  {
    int i = 1;
    if (paramContext != null)
    {
      int j = i;
      Assert.assertTrue("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86 jumpToActivity, context is null.", j);
      if (paramString1 != null)
        break label43;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "jumpToActivity uri is null");
      i = 0;
    }
    label43: label689: String str6;
    label1566: 
    do
    {
      do
      {
        LauncherUI localLauncherUI4;
        do
        {
          return i;
          int k = 0;
          break;
          if ((paramString1.equals("weixin://contacts/microblog/")) || (paramString1.equals("weixin://contacts/micromessenger/")) || (paramString1.equals("weixin://contacts/all/")))
          {
            com.tencent.mm.storage.aq localaq1 = ag.eb(paramContext.getString(com.tencent.mm.n.bNg));
            if (paramString1.equals("weixin://contacts/microblog/"))
              localaq1 = ag.eb(paramContext.getString(com.tencent.mm.n.bNf));
            if (paramString1.equals("weixin://contacts/micromessenger/"))
              localaq1 = ag.eb(paramContext.getString(com.tencent.mm.n.bNg));
            if (paramString1.equals("weixin://contacts/all/"))
              localaq1 = ag.eb(paramContext.getString(com.tencent.mm.n.bNc));
            Intent localIntent1 = new Intent();
            localIntent1.setClass(paramContext, SelectContactUI.class);
            localIntent1.putExtra("Contact_GroupFilter_Type", localaq1.getType()).putExtra("Contact_GroupFilter_Str", localaq1.aJs()).putExtra("Contact_GroupFilter_DisplayName", localaq1.oc());
            localIntent1.addFlags(268435456);
            return i;
          }
          if (paramString1.startsWith("weixin://jump/mainframe/"))
          {
            int i3 = paramString1.trim().lastIndexOf("/");
            if ((i3 >= 0) && (i3 < -1 + paramString1.trim().length()))
            {
              String str8 = paramString1.trim().substring(i3 + 1);
              if (y.dc(str8))
              {
                i locali2 = bg.qW().oT().ys(str8);
                if ((locali2 == null) || ((int)locali2.dhv == 0))
                {
                  i locali3 = new i();
                  locali3.setUsername(str8);
                  bg.qW().oT().F(locali3);
                }
              }
              Intent localIntent23 = new Intent(paramContext, ChattingUI.class).putExtra("Chat_User", str8).putExtra("Chat_Mode", i);
              if ((paramContext instanceof Service))
                localIntent23.addFlags(268435456);
              paramContext.startActivity(localIntent23);
              return i;
            }
          }
          if (paramString1.startsWith("weixin://contacts/profile/"))
          {
            String str7 = paramString1.trim().replace("weixin://contacts/profile/", "").replace("/", "");
            if (ch.jb(str7))
            {
              com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "jumpToActivity fail, user is null");
              return i;
            }
            Intent localIntent22 = new Intent();
            localIntent22.setClass(paramContext, ContactInfoUI.class);
            localIntent22.addFlags(268435456);
            localIntent22.putExtra("Contact_User", str7);
            i locali1 = bg.qW().oT().ys(str7);
            if ((locali1 != null) && ((int)locali1.dhv > 0) && (com.tencent.mm.g.a.cv(locali1.getType())))
              com.tencent.mm.ui.contact.bb.c(localIntent22, str7);
            paramContext.startActivity(localIntent22);
            return i;
          }
          if (paramString1.equals("weixin://setting/bindphone"))
          {
            Intent localIntent2 = new Intent(paramContext, BindMContactIntroUI.class);
            if ((paramContext instanceof Service))
              localIntent2.addFlags(268435456);
            MMWizardActivity.j(paramContext, localIntent2);
            return i;
          }
          if (paramString1.equals("weixin://setting/setheadimage"))
          {
            Intent localIntent3 = new Intent(paramContext, ContactInfoUI.class);
            localIntent3.putExtra("Contact_User", x.pG());
            localIntent3.putExtra("Contact_Nick", x.pI());
            localIntent3.putExtra("User_Avatar", i);
            if ((paramContext instanceof Service))
              localIntent3.addFlags(268435456);
            paramContext.startActivity(localIntent3);
            return i;
          }
          if (!paramString1.equals("weixin://flowstat"))
            break label689;
          localLauncherUI4 = LauncherUI.aPm();
        }
        while (localLauncherUI4 == null);
        localLauncherUI4.Bs("tab_settings");
        return i;
        if (paramString1.equals("weixin://setting/notify"))
        {
          LauncherUI localLauncherUI3 = LauncherUI.aPm();
          if (localLauncherUI3 != null)
            localLauncherUI3.Bs("tab_settings");
          Intent localIntent21 = new Intent(paramContext, SettingsNotificationUI.class);
          localIntent21.addFlags(67108864);
          if ((paramContext instanceof Service))
            localIntent21.addFlags(268435456);
          paramContext.startActivity(localIntent21);
          return i;
        }
        if (paramString1.equals("weixin://setting/plugin/qqmail"))
        {
          Intent localIntent4 = new Intent();
          localIntent4.setClass(paramContext, ContactInfoUI.class);
          localIntent4.putExtra("Contact_User", "qqmail");
          if ((paramContext instanceof Service))
            localIntent4.addFlags(268435456);
          paramContext.startActivity(localIntent4);
          return i;
        }
        if (paramString1.equals("weixin://setting/plugin/lomo"))
        {
          Intent localIntent5 = new Intent();
          localIntent5.setClass(paramContext, ContactInfoUI.class);
          localIntent5.putExtra("Contact_User", "weibo");
          if ((paramContext instanceof Service))
            localIntent5.addFlags(268435456);
          paramContext.startActivity(localIntent5);
          return i;
        }
        if (paramString1.equals("weixin://setting/blacklist"))
        {
          com.tencent.mm.storage.aq localaq2 = ag.ea(paramContext.getString(com.tencent.mm.n.bNd));
          Intent localIntent20 = new Intent();
          localIntent20.setClass(paramContext, AddressUI.class);
          localIntent20.putExtra("Contact_GroupFilter_Type", localaq2.getType());
          localIntent20.putExtra("Contact_GroupFilter_DisplayName", localaq2.oc());
          localIntent20.addFlags(67108864);
          if ((paramContext instanceof Service))
            localIntent20.addFlags(268435456);
          LauncherUI localLauncherUI2 = LauncherUI.aPm();
          if (localLauncherUI2 != null)
            localLauncherUI2.Bs("tab_settings");
          paramContext.startActivity(localIntent20);
          return i;
        }
        if (paramString1.equals("weixin://setting/privacy"))
        {
          LauncherUI localLauncherUI1 = LauncherUI.aPm();
          if (localLauncherUI1 != null)
            localLauncherUI1.Bs("tab_settings");
          Intent localIntent19 = new Intent(paramContext, SettingsPrivacyUI.class);
          if ((paramContext instanceof Service))
            localIntent19.addFlags(268435456);
          paramContext.startActivity(localIntent19);
          return i;
        }
        if (paramString1.equals("weixin://plugin"))
        {
          Intent localIntent6 = new Intent(paramContext, SettingsPluginsUI.class);
          if ((paramContext instanceof Service))
            localIntent6.addFlags(268435456);
          paramContext.startActivity(localIntent6);
          return i;
        }
        if (paramString1.equals("weixin://findfriend/search"))
        {
          Intent localIntent7 = new Intent(paramContext, ContactSearchUI.class);
          if ((paramContext instanceof Service))
            localIntent7.addFlags(268435456);
          paramContext.startActivity(localIntent7);
          return i;
        }
        if (paramString1.equals("weixin://findfriend/share"))
        {
          Intent localIntent8 = new Intent(paramContext, ShareMicroMsgChoiceUI.class);
          if ((paramContext instanceof Service))
            localIntent8.addFlags(268435456);
          paramContext.startActivity(localIntent8);
          return i;
        }
        if (paramString1.equals("weixin://findfriend/qq"))
        {
          Intent localIntent9 = new Intent(paramContext, QQGroupUI.class);
          if ((paramContext instanceof Service))
            localIntent9.addFlags(268435456);
          paramContext.startActivity(localIntent9);
          return i;
        }
        if (paramString1.equals("weixin://findfriend/mobile"))
        {
          Intent localIntent10 = new Intent(paramContext, MobileFriendUI.class);
          if ((paramContext instanceof Service))
            localIntent10.addFlags(268435456);
          paramContext.startActivity(localIntent10);
          return i;
        }
        if (paramString1.equals("weixin://scanqrcode/"))
        {
          if (!paramBoolean)
          {
            com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "jumpToActivity, scan qrcode permission fail");
            return i;
          }
          Intent localIntent18 = new Intent();
          localIntent18.putExtra("BaseScanUI_select_scan_mode", i);
          localIntent18.addFlags(67108864);
          if ((paramContext instanceof Service))
            localIntent18.addFlags(268435456);
          com.tencent.mm.am.a.b(paramContext, "scanner", ".ui.BaseScanUI", localIntent18);
          return i;
        }
        if (!paramString1.toLowerCase().startsWith("weixin://jump/"))
          break label1652;
        String[] arrayOfString2 = paramString1.split("/");
        str6 = arrayOfString2[(-1 + arrayOfString2.length)];
        if ("mainframe".equalsIgnoreCase(str6))
        {
          Intent localIntent15 = new Intent(paramContext, LauncherUI.class);
          if ((paramContext instanceof Service))
            localIntent15.addFlags(268435456);
          localIntent15.addFlags(67108864);
          paramContext.startActivity(localIntent15);
          return i;
        }
        if (!"shake".equalsIgnoreCase(str6))
          break label1566;
        com.tencent.mm.plugin.f.c.n.fTF.q(10221, "1");
        Intent localIntent17 = new Intent();
        localIntent17.addFlags(67108864);
        if ((paramContext instanceof Service))
          localIntent17.addFlags(268435456);
        com.tencent.mm.am.a.b(paramContext, "shake", ".ui.ShakeReportUI", localIntent17);
      }
      while ((paramContext == null) || (!(paramContext instanceof Activity)));
      ((Activity)paramContext).finish();
      return i;
    }
    while (!"scanqrcode".equalsIgnoreCase(str6));
    Intent localIntent16 = new Intent();
    localIntent16.putExtra("BaseScanUI_select_scan_mode", i);
    localIntent16.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 2);
    localIntent16.setFlags(65536);
    localIntent16.addFlags(67108864);
    if ((paramContext instanceof Service))
      localIntent16.addFlags(268435456);
    com.tencent.mm.am.a.b(paramContext, "scanner", ".ui.BaseScanUI", localIntent16);
    return i;
    label1652: if (paramString1.equals("weixin://setting/account/safedevice"))
    {
      String str4 = (String)bg.qW().oQ().get(6, "");
      String str5 = (String)bg.qW().oQ().get(4097, "");
      if (!ch.jb(str4))
      {
        Intent localIntent12 = new Intent();
        if ((paramContext instanceof Service))
          localIntent12.addFlags(268435456);
        com.tencent.mm.am.a.l(paramContext, "safedevice", ".ui.MySafeDeviceListUI");
        return i;
      }
      if (!ch.jb(str5))
      {
        Intent localIntent13 = new Intent(paramContext, BindMContactIntroUI.class);
        localIntent13.putExtra("is_bind_for_safe_device", i);
        if ((paramContext instanceof Service))
          localIntent13.addFlags(268435456);
        MMWizardActivity.j(paramContext, localIntent13);
        return i;
      }
      Intent localIntent14 = new Intent();
      if ((paramContext instanceof Service))
        localIntent14.addFlags(268435456);
      com.tencent.mm.am.a.a(paramContext, "safedevice", ".ui.BindSafeDeviceUI", localIntent14);
      return i;
    }
    if (paramString1.toLowerCase().startsWith("weixin://linkedin/"))
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString1;
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "linkedin bind url %s", arrayOfObject);
      Bundle localBundle = new Bundle();
      for (String str3 : paramString1.substring(19).split("\\&"))
      {
        int i2 = str3.indexOf('=');
        if (i2 != -1)
          localBundle.putString(str3.substring(0, i2), URLDecoder.decode(str3.substring(i2 + 1)));
      }
      Intent localIntent11 = new Intent();
      localIntent11.putExtra("qrcode_bundle", localBundle);
      com.tencent.mm.am.a.b(paramContext, "accountsync", "com.tencent.mm.ui.bindlinkedin.BindLinkedInUI", localIntent11);
      return i;
    }
    String str1;
    int m;
    if (paramString1.startsWith("wxpay://"))
    {
      if (ch.jb(paramString2))
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "SERVICE_JUMP_TO_PAY fail, null username");
        return false;
      }
      str1 = paramString1.substring(8);
      if (str1.indexOf("&") > 0)
        str1 = str1.split("&")[0];
      m = str1.indexOf("=");
      if (m < 0)
        break label2131;
    }
    label2131: for (String str2 = str1.substring(m + 1); ; str2 = "")
    {
      if (ch.getInt(str2, 0) == i)
      {
        com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpJWUEVQofdatc9bKGrX6V86", "hakon TODO jumpto transfer");
        com.tencent.mm.pluginsdk.wallet.c.a(paramContext, 2, paramString2);
        return i;
      }
      Toast.makeText(paramContext, paramContext.getString(com.tencent.mm.n.cet), 0).show();
      return false;
      return false;
    }
  }

  public static void d(Context paramContext, String paramString, boolean paramBoolean)
  {
    b(paramContext, paramString, true, null);
  }

  public static boolean e(Context paramContext, String paramString, boolean paramBoolean)
  {
    return c(paramContext, paramString, false, null);
  }

  public static void release()
  {
    com.tencent.mm.ar.a.release();
    jwk.clear();
    com.tencent.mm.ar.b.release();
  }

  private static String z(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString3 == null) || (paramString1 == null) || (paramString2 == null))
      return null;
    StringBuffer localStringBuffer = new StringBuffer("");
    while (true)
    {
      int i = paramString3.indexOf(paramString1);
      if (i == -1)
        break;
      localStringBuffer.append(paramString3.substring(0, i) + paramString2);
      paramString3 = paramString3.substring(i + paramString1.length());
      paramString3.indexOf(paramString1);
    }
    localStringBuffer.append(paramString3);
    return localStringBuffer.toString();
  }

  protected final List T(String paramString, boolean paramBoolean)
  {
    ArrayList localArrayList1 = new ArrayList();
    Matcher localMatcher1 = jwd.matcher(paramString);
    if (this.jwh == null)
      this.jwh = new LinkedList();
    while (localMatcher1.find())
    {
      int i3 = localMatcher1.start();
      int i4 = localMatcher1.end();
      com.tencent.mm.pluginsdk.ui.applet.aq localaq4 = new com.tencent.mm.pluginsdk.ui.applet.aq(i3, i4, localMatcher1.group(), 24, null);
      this.jwh.add(localaq4);
      localArrayList1.add(new os(this, i3, i4));
    }
    Matcher localMatcher2 = jwc.matcher(paramString.toLowerCase());
    ArrayList localArrayList2 = new ArrayList();
    while (localMatcher2.find())
    {
      int i1 = localMatcher2.start();
      int i2 = localMatcher2.end();
      if (!a(localArrayList1, new os(this, i1, i2)))
      {
        com.tencent.mm.pluginsdk.ui.applet.aq localaq3 = new com.tencent.mm.pluginsdk.ui.applet.aq(i1, i2, paramString.substring(i1, i2), 1, null);
        this.jwh.add(localaq3);
        localArrayList2.add(new os(this, i1, i2));
      }
    }
    Matcher localMatcher3 = jwf.matcher(paramString);
    while (localMatcher3.find())
    {
      int m = localMatcher3.start();
      int n = localMatcher3.end();
      if ((!a(localArrayList2, new os(this, m, n))) && (!a(localArrayList1, new os(this, m, n))))
      {
        com.tencent.mm.pluginsdk.ui.applet.aq localaq2 = new com.tencent.mm.pluginsdk.ui.applet.aq(m, n, paramString.substring(m, n), 28, null);
        this.jwh.add(localaq2);
      }
    }
    if (paramBoolean)
    {
      Matcher localMatcher4 = jwe.matcher(paramString);
      while (localMatcher4.find())
      {
        int i = localMatcher4.start();
        int j = localMatcher4.end();
        String str = localMatcher4.group();
        int k = j - i;
        if (str.startsWith("+"))
          k--;
        if (((k != 6) && (k != 5)) || (("+12110+12395+12121+12117+12119+95555+95566+95533+95588+95558+95599+95568+95595+95559+95508+95528+95501+95577+95561+10086+10010+10000+17951+17911+17900+118114+116114+950718+95598+12318+12315+12358+12365+12310+12369+12333+12366+95518+95519+95511+95500+95522+95567".contains(str)) && (!a(localArrayList2, new os(this, i, j))) && (!a(localArrayList1, new os(this, i, j)))))
        {
          com.tencent.mm.pluginsdk.ui.applet.aq localaq1 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str, 25, null);
          this.jwh.add(localaq1);
        }
      }
    }
    return this.jwh;
  }

  public final SpannableString a(TextView paramTextView, Context paramContext)
  {
    int i = (int)(1.0F * paramTextView.getTextSize());
    if (i <= 0);
    String str;
    for (int j = (int)paramTextView.getTextSize(); ; j = i)
    {
      str = paramTextView.getText().toString() + "@" + j;
      SpannableString localSpannableString1 = (SpannableString)jwk.get(str);
      if (localSpannableString1 == null)
        break;
      return localSpannableString1;
    }
    this.jwh = new LinkedList();
    CharSequence localCharSequence1 = com.tencent.mm.compatible.g.u.n(paramTextView.getText().toString());
    if (!localCharSequence1.equals(paramTextView.getText().toString()))
      paramTextView.setText(localCharSequence1);
    CharSequence localCharSequence2 = paramTextView.getText();
    SpannableString localSpannableString2 = com.tencent.mm.ar.b.b(paramTextView.getContext(), localCharSequence2 + " ", j, true);
    a(paramTextView, true);
    Iterator localIterator = this.jwh.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.pluginsdk.ui.applet.aq localaq = (com.tencent.mm.pluginsdk.ui.applet.aq)localIterator.next();
      localSpannableString2.setSpan(new com.tencent.mm.pluginsdk.ui.applet.bb(localaq, paramContext, this.jwj), localaq.dBS, localaq.dBT, 33);
    }
    jwk.b(str, localSpannableString2);
    return localSpannableString2;
  }

  public final SpannableString a(TextView paramTextView, String paramString, Context paramContext)
  {
    SpannableString localSpannableString1;
    if (ch.jb(paramString))
    {
      localSpannableString1 = new SpannableString("");
      return localSpannableString1;
    }
    int i = (int)(1.0F * paramTextView.getTextSize());
    if (i <= 0);
    String str;
    SpannableString localSpannableString2;
    for (int j = (int)paramTextView.getTextSize(); ; j = i)
    {
      str = paramString + "@" + j;
      localSpannableString1 = (SpannableString)jwk.get(str);
      if (localSpannableString1 != null)
        break;
      this.jwh = new LinkedList();
      CharSequence localCharSequence = com.tencent.mm.compatible.g.u.n(paramString.toString());
      if (!localCharSequence.equals(paramString))
        paramTextView.setText(localCharSequence);
      localSpannableString2 = com.tencent.mm.ar.b.a(paramTextView.getContext(), paramString + " ", j, str);
      T(paramString.toString(), true);
      Iterator localIterator = this.jwh.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.pluginsdk.ui.applet.aq localaq = (com.tencent.mm.pluginsdk.ui.applet.aq)localIterator.next();
        localSpannableString2.setSpan(new com.tencent.mm.pluginsdk.ui.applet.bb(localaq, paramContext, this.jwj), localaq.dBS, localaq.dBT, 33);
      }
    }
    jwk.b(str, localSpannableString2);
    return localSpannableString2;
  }

  public final void a(TextView paramTextView, int paramInt)
  {
    a(paramTextView, (int)paramTextView.getTextSize(), paramInt, true, true);
    paramTextView.invalidate();
  }

  public final void a(TextView paramTextView, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramInt1 <= 0)
      paramInt1 = (int)paramTextView.getTextSize();
    String str1 = paramTextView.getText().toString() + "@" + paramInt1;
    if (!paramBoolean2)
    {
      SpannableString localSpannableString2 = (SpannableString)jwk.get(str1);
      if (localSpannableString2 != null)
      {
        paramTextView.setText(localSpannableString2);
        paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
        paramTextView.setFocusable(false);
        return;
      }
    }
    this.jwh = new LinkedList();
    Object localObject1 = com.tencent.mm.compatible.g.u.n(paramTextView.getText().toString());
    if (!localObject1.equals(paramTextView.getText().toString()))
      paramTextView.setText((CharSequence)localObject1);
    Object localObject2 = dXz.matcher((CharSequence)localObject1);
    while (true)
    {
      CharSequence localCharSequence2;
      Matcher localMatcher;
      if (((Matcher)localObject2).find())
      {
        String str4 = ((Matcher)localObject2).group(0);
        String str5 = ((Matcher)localObject2).group(1);
        String str6 = ((Matcher)localObject2).group(2);
        String str7 = ((CharSequence)localObject1).toString();
        paramTextView.setText(z(str4, " " + str6 + " ", str7));
        localCharSequence2 = paramTextView.getText();
        int i = 1 + ((Matcher)localObject2).start(0);
        int j = i + str6.length();
        localMatcher = dXz.matcher(localCharSequence2);
        if (str5.length() >= 2)
        {
          if (str5.trim().toLowerCase().startsWith("http"))
          {
            com.tencent.mm.pluginsdk.ui.applet.aq localaq2 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 1, null);
            this.jwh.add(localaq2);
          }
          while (true)
          {
            label311: String str9;
            int n;
            for (int k = 1; ; k = 0)
            {
              if (k == 0)
                break label1853;
              localObject2 = localMatcher;
              localObject1 = localCharSequence2;
              break;
              if (str5.trim().equals("weixin://contacts/all/"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq3 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 23, new com.tencent.mm.storage.aq("@all.android", null, this.context.getString(com.tencent.mm.n.bNc), null, true, true));
                this.jwh.add(localaq3);
                break label311;
              }
              if (str5.trim().equals("weixin://contacts/microblog/"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq4 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 22, ag.eb(this.context.getString(com.tencent.mm.n.bNf)));
                this.jwh.add(localaq4);
                break label311;
              }
              if (str5.trim().equals("weixin://contacts/micromessenger/"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq5 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 2, new com.tencent.mm.storage.aq("@micromsg.qq.com", null, this.context.getString(com.tencent.mm.n.bNg), null, true, true));
                this.jwh.add(localaq5);
                break label311;
              }
              if (str5.trim().startsWith("weixin://contacts/profile/"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq6 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 3, str5.trim().replace("weixin://contacts/profile/", "").replace("/", ""));
                this.jwh.add(localaq6);
                break label311;
              }
              if (str5.trim().startsWith("weixin://findfriend/verifycontact"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq7 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 4, null);
                this.jwh.add(localaq7);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/bindphone"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq8 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 5, null);
                this.jwh.add(localaq8);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/setheadimage"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq9 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 6, null);
                this.jwh.add(localaq9);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/bindemail"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq10 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 7, null);
                this.jwh.add(localaq10);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/notify"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq11 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 9, null);
                this.jwh.add(localaq11);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/plugin/qqmail"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq12 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 10, null);
                this.jwh.add(localaq12);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/plugin/sxmsg"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq13 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 11, null);
                this.jwh.add(localaq13);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/plugin/lomo"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq14 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 12, null);
                this.jwh.add(localaq14);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/plugin/qqmsg"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq15 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 13, null);
                this.jwh.add(localaq15);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/blacklist"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq16 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 14, null);
                this.jwh.add(localaq16);
                break label311;
              }
              if (str5.trim().startsWith("weixin://setting/privacy"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq17 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 15, null);
                this.jwh.add(localaq17);
                break label311;
              }
              if (str5.trim().startsWith("weixin://plugin"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq18 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 26, null);
                this.jwh.add(localaq18);
                break label311;
              }
              if (str5.trim().startsWith("weixin://flowstat"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq19 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 16, null);
                this.jwh.add(localaq19);
                break label311;
              }
              if (str5.trim().startsWith("weixin://findfriend/search"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq20 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 17, null);
                this.jwh.add(localaq20);
                break label311;
              }
              if (str5.trim().startsWith("weixin://findfriend/share"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq21 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 18, null);
                this.jwh.add(localaq21);
                break label311;
              }
              if (str5.trim().startsWith("weixin://findfriend/qq"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq22 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 19, null);
                this.jwh.add(localaq22);
                break label311;
              }
              if (str5.trim().startsWith("weixin://findfriend/mobile"))
              {
                com.tencent.mm.pluginsdk.ui.applet.aq localaq23 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 20, null);
                this.jwh.add(localaq23);
                break label311;
              }
              if (!str5.trim().startsWith("weixin://contacts/"))
                break label1522;
              str9 = str5.trim().substring(0, -1 + str5.trim().length());
              n = str9.lastIndexOf("/");
              if (n != -1)
                break label1448;
            }
            label1448: String str10 = str9.substring(n + 1);
            com.tencent.mm.pluginsdk.ui.applet.aq localaq27 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 21, ag.x("@" + str10, this.context.getString(com.tencent.mm.n.bNe)));
            this.jwh.add(localaq27);
            continue;
            label1522: if (str5.trim().startsWith("weixin://wxpay"))
            {
              com.tencent.mm.pluginsdk.ui.applet.aq localaq24 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 28, null);
              this.jwh.add(localaq24);
            }
            else if (str5.trim().startsWith("weixin://emoticonstore/"))
            {
              int m = str5.lastIndexOf("/");
              String str8 = "";
              if (m != -1)
                str8 = str5.substring(m + 1);
              com.tencent.mm.pluginsdk.ui.applet.aq localaq26 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 29, str8);
              this.jwh.add(localaq26);
            }
            else
            {
              com.tencent.mm.pluginsdk.ui.applet.aq localaq25 = new com.tencent.mm.pluginsdk.ui.applet.aq(i, j, str5, 27, null);
              this.jwh.add(localaq25);
            }
          }
        }
      }
      else
      {
        CharSequence localCharSequence1 = paramTextView.getText();
        Context localContext = paramTextView.getContext();
        String str2 = localCharSequence1 + " ";
        if (paramBoolean2);
        SpannableString localSpannableString1;
        for (String str3 = ""; ; str3 = str1)
        {
          localSpannableString1 = com.tencent.mm.ar.b.a(localContext, str2, paramInt1, paramInt2, str3);
          a(paramTextView, paramBoolean1);
          Iterator localIterator = this.jwh.iterator();
          while (localIterator.hasNext())
          {
            com.tencent.mm.pluginsdk.ui.applet.aq localaq1 = (com.tencent.mm.pluginsdk.ui.applet.aq)localIterator.next();
            localSpannableString1.setSpan(new or(paramTextView, this.jwj, localaq1), localaq1.dBS, localaq1.dBT, 33);
          }
        }
        if (!paramBoolean2)
          jwk.b(str1, localSpannableString1);
        paramTextView.setText(localSpannableString1);
        paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
        paramTextView.setFocusable(false);
        return;
      }
      label1853: localObject2 = localMatcher;
      localObject1 = localCharSequence2;
    }
  }

  protected final void a(String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    String[] arrayOfString;
    if (aWC())
      arrayOfString = this.context.getResources().getStringArray(com.tencent.mm.c.Nr);
    while (true)
    {
      if (aWB())
      {
        List localList = ch.b(arrayOfString);
        localList.add(this.context.getResources().getString(com.tencent.mm.n.bzT));
        arrayOfString = (String[])localList.toArray(new String[localList.size()]);
      }
      String str = this.context.getResources().getString(com.tencent.mm.n.bzU);
      com.tencent.mm.ui.base.e.b(this.context, paramString + str, arrayOfString, "", new ol(this, paramString, paramOnDismissListener));
      return;
      arrayOfString = new String[2];
      arrayOfString[0] = this.context.getResources().getString(com.tencent.mm.n.bzW);
      arrayOfString[1] = this.context.getResources().getString(com.tencent.mm.n.bzS);
    }
  }

  public final void akP()
  {
    release();
    com.tencent.mm.ar.b.release();
  }

  public final void b(TextView paramTextView, int paramInt, boolean paramBoolean)
  {
    a(paramTextView, (int)paramTextView.getTextSize(), paramInt, true, false);
    paramTextView.invalidate();
  }

  protected final void b(String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    if ((0x1 & x.pO()) == 0);
    for (int i = 1; i != 0; i = 0)
    {
      String[] arrayOfString2 = this.context.getResources().getStringArray(com.tencent.mm.c.Na);
      com.tencent.mm.ui.base.e.b(this.context, paramString, arrayOfString2, "", new on(this, paramOnDismissListener, paramString));
      return;
    }
    String[] arrayOfString1 = new String[1];
    arrayOfString1[0] = this.context.getResources().getString(com.tencent.mm.n.byI);
    com.tencent.mm.ui.base.e.b(this.context, paramString, arrayOfString1, "", new oo(this, paramOnDismissListener, paramString));
  }

  public final boolean b(Context paramContext, String paramString, boolean paramBoolean)
  {
    return c(paramContext, paramString, paramBoolean, null);
  }

  public final void c(Context paramContext, String paramString, boolean paramBoolean)
  {
    b(paramContext, paramString, paramBoolean, null);
  }

  public final void c(TextView paramTextView)
  {
    b(paramTextView, 0, false);
    paramTextView.invalidate();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oj
 * JD-Core Version:    0.6.2
 */