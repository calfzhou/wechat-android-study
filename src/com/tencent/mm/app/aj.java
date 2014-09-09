package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.mm.am.a;
import com.tencent.mm.booter.notification.c;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.ui.applet.r;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import com.tencent.mm.ui.CheckCanSubscribeBizUI;
import com.tencent.mm.ui.ExposeWithProofUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.LoginHistoryUI;
import com.tencent.mm.ui.account.LoginIndepPass;
import com.tencent.mm.ui.account.LoginUI;
import com.tencent.mm.ui.account.RegByMobileVoiceVerifyUI;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.bindmobile.BindMContactUI;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.cf;
import com.tencent.mm.ui.chatting.AppAttachDownloadUI;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.oj;
import com.tencent.mm.ui.contact.ModRemarkNameUI;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.SnsAddressUI;
import com.tencent.mm.ui.contact.SnsTagContactListUI;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.dm;
import com.tencent.mm.ui.gallery.GestureGalleryUI;
import com.tencent.mm.ui.openapi.AddAppUI;
import com.tencent.mm.ui.pluginapp.ContactSearchUI;
import com.tencent.mm.ui.setting.EditSignatureUI;
import com.tencent.mm.ui.setting.SelfQRCodeUI;
import com.tencent.mm.ui.setting.SendFeedBackUI;
import com.tencent.mm.ui.setting.SettingsLanguageUI;
import com.tencent.mm.ui.tools.CountryCodeUI;
import com.tencent.mm.ui.tools.CropImageNewUI;
import com.tencent.mm.ui.tools.MultiStageCitySelectUI;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.video.VideoPlayerUI;

public final class aj
  implements d
{
  public final aa a(Runnable paramRunnable, MMActivity paramMMActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    return dm.a(paramRunnable, paramMMActivity, paramInt1, paramInt2, paramIntent);
  }

  public final void a(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, CropImageNewUI.class);
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }

  public final void a(Activity paramActivity, Intent paramIntent1, Intent paramIntent2, String paramString, int paramInt)
  {
    if (paramActivity != null)
    {
      paramIntent2.setClass(paramActivity, CropImageNewUI.class);
      l.b(paramActivity, paramIntent1, paramIntent2, paramString, paramInt);
    }
  }

  public final void a(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    if ((paramContext == null) || (paramIntent1 == null));
    int i;
    do
    {
      return;
      i = paramIntent1.getIntExtra("from_source", 1);
      if (i == 1)
      {
        paramIntent1.setClass(paramContext, LoginUI.class);
        paramContext.startActivity(paramIntent1);
        return;
      }
      if (i == 2)
      {
        paramIntent1.setClass(paramContext, LoginHistoryUI.class);
        paramContext.startActivity(paramIntent1);
        return;
      }
      if (i == 3)
      {
        paramIntent1.setClass(paramContext, SimpleLoginUI.class);
        if (paramIntent2 != null)
        {
          MMWizardActivity.b(paramContext, paramIntent1, paramIntent2);
          return;
        }
        MMWizardActivity.j(paramContext, paramIntent1);
        return;
      }
      if (i == 5)
      {
        paramIntent1.setClass(paramContext, LoginIndepPass.class);
        paramContext.startActivity(paramIntent1);
        return;
      }
    }
    while (i != 6);
    paramIntent1.setClass(paramContext, MobileInputUI.class);
    paramIntent1.putExtra("mobile_input_purpose", 5);
    paramContext.startActivity(paramIntent1);
  }

  public final void a(Intent paramIntent, int paramInt, Activity paramActivity)
  {
    if (paramActivity != null)
      a.a(paramActivity, "location", ".ui.RedirectUI", paramIntent, 4097);
  }

  public final void a(Intent paramIntent, int paramInt, MMActivity paramMMActivity)
  {
    paramIntent.setClass(paramMMActivity, SelectConversationUI.class);
    paramMMActivity.startActivityForResult(paramIntent, paramInt);
  }

  public final void a(Intent paramIntent1, int paramInt, MMActivity paramMMActivity, Intent paramIntent2)
  {
    if (paramMMActivity != null)
    {
      paramIntent1.setClass(paramMMActivity, CropImageNewUI.class);
      l.b(paramMMActivity, paramIntent2, paramIntent1, bg.qW().pa(), paramInt);
    }
  }

  public final void a(Intent paramIntent, int paramInt, cf paramcf, MMActivity paramMMActivity)
  {
    if (paramMMActivity != null)
    {
      paramIntent.setClass(paramMMActivity, SelectConversationUI.class);
      paramMMActivity.a(paramcf, paramIntent, paramInt);
    }
  }

  public final void a(Intent paramIntent, Activity paramActivity)
  {
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, ModRemarkNameUI.class);
      paramActivity.startActivityForResult(paramIntent, 2);
    }
  }

  public final void a(Intent paramIntent, Activity paramActivity, int paramInt)
  {
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, SelectContactUI.class);
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }

  public final void a(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    paramIntent.setClass(paramContext, MultiStageCitySelectUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void a(MMActivity paramMMActivity, String paramString1, WXMediaMessage paramWXMediaMessage, String paramString2, String paramString3)
  {
    r.a(paramMMActivity.aPC(), paramWXMediaMessage.thumbData, paramWXMediaMessage.title, paramWXMediaMessage.description, paramString3, true, 2, new ak(this, paramWXMediaMessage, paramString1, paramString3, paramString2, paramMMActivity));
  }

  public final void a(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    if (paramMMWizardActivity == null)
      return;
    paramIntent.setClass(paramMMWizardActivity, MobileInputUI.class);
    MMWizardActivity.j(paramMMWizardActivity, paramIntent);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, Context paramContext, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramBoolean1) || (paramBoolean2))
    {
      if (!VideoPlayerUI.a(paramString, paramContext, paramBoolean2))
        Toast.makeText(paramContext, paramContext.getString(n.coa), 0).show();
      return;
    }
    Intent localIntent = new Intent(paramContext, VideoPlayerUI.class);
    localIntent.putExtra("VideoPlayer_File_nam", paramString);
    localIntent.putExtra("VideoRecorder_VideoLength", paramInt1);
    localIntent.putExtra("VideoRecorder_VideoSize", paramInt2);
    paramContext.startActivity(localIntent);
  }

  public final void b(Context paramContext, Intent paramIntent)
  {
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, ShowImageUI.class);
      paramContext.startActivity(paramIntent);
    }
  }

  public final void b(Intent paramIntent, Activity paramActivity)
  {
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, CountryCodeUI.class);
      paramActivity.startActivityForResult(paramIntent, 100);
    }
  }

  public final void b(Intent paramIntent, Activity paramActivity, int paramInt)
  {
    if (paramActivity != null)
    {
      paramIntent.setClass(paramActivity, SnsAddressUI.class);
      paramActivity.startActivityForResult(paramIntent, paramInt);
    }
  }

  public final void b(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    paramIntent.setClass(paramContext, EditSignatureUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void b(Intent paramIntent, cf paramcf, MMActivity paramMMActivity)
  {
    if (paramMMActivity != null)
    {
      paramIntent.setClass(paramMMActivity, CheckCanSubscribeBizUI.class);
      paramMMActivity.a(paramcf, paramIntent, 8);
    }
  }

  public final void b(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    if ((paramMMWizardActivity == null) || (paramIntent == null))
      return;
    paramIntent.setClass(paramMMWizardActivity, BindMContactUI.class);
    MMWizardActivity.j(paramMMWizardActivity, paramIntent);
  }

  public final void b(String paramString, Context paramContext)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("Ksnsupload_type", 0);
    localIntent.putExtra("sns_kemdia_path", paramString);
    a.b(paramContext, "sns", ".ui.SnsUploadUI", localIntent);
  }

  public final void b(String paramString1, String paramString2, String paramString3)
  {
    y.a(38, paramString1, paramString2, paramString3, null, null);
  }

  public final void c(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null)
      return;
    paramIntent.setClass(paramContext, ExposeWithProofUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void c(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    paramIntent.setClass(paramContext, ContactInfoUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void cb(String paramString)
  {
    c.lE().ci(paramString);
  }

  public final void d(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null)
      return;
    a.b(paramContext, "safedevice", ".ui.MySafeDeviceListUI", paramIntent);
  }

  public final void d(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    String str = paramIntent.getStringExtra("Contact_User");
    if (str != null)
      bb.c(paramIntent, str);
    paramIntent.setClass(paramContext, ChattingUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void e(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null)
      return;
    paramIntent.setClass(paramContext, RegByMobileVoiceVerifyUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void e(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    paramIntent.setClass(paramContext, ChattingUI.class);
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramIntent, 1);
      return;
    }
    paramContext.startActivity(paramIntent);
  }

  public final void f(Context paramContext, Intent paramIntent)
  {
    if (paramContext == null)
      return;
    a.a(paramContext, "safedevice", ".ui.SecurityAccountIntroUI", paramIntent);
  }

  public final void f(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    paramIntent.setClass(paramContext, BindQQUI.class);
    MMWizardActivity.j(paramContext, paramIntent);
  }

  public final boolean f(Context paramContext, String paramString)
  {
    return oj.e(paramContext, paramString, false);
  }

  public final void g(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null))
      return;
    a.b(paramContext, "game", ".ui.GameRankUI", paramIntent);
  }

  public final void g(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
    paramContext.startActivity(paramIntent);
  }

  public final boolean g(Context paramContext, String paramString)
  {
    return oj.aA(paramContext, paramString);
  }

  public final void h(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    if (paramIntent == null)
      paramIntent = new Intent();
    a.b(paramContext, "webview", ".ui.tools.WebViewUI", paramIntent);
  }

  public final void hY()
  {
    MMAppMgr.hY();
  }

  public final void i(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      if (paramIntent.getIntExtra("Retr_Msg_Type", -1) < 0)
        paramIntent.putExtra("Retr_Msg_Type", 4);
      paramIntent.setClass(paramContext, MsgRetransmitUI.class);
      paramContext.startActivity(paramIntent);
    }
  }

  public final aa j(Context paramContext)
  {
    return MMAppMgr.j(paramContext);
  }

  public final void j(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 1);
      a.b(paramContext, "sns", ".ui.SnsUploadUI", paramIntent);
    }
  }

  public final Intent k(Context paramContext)
  {
    return new Intent(paramContext, LauncherUI.class).addFlags(67108864);
  }

  public final void k(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.putExtra("Ksnsupload_type", 2);
      a.b(paramContext, "sns", ".ui.SnsUploadUI", paramIntent);
    }
  }

  public final void l(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, SelfQRCodeUI.class));
  }

  public final void l(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
      a.b(paramContext, "location", ".ui.RedirectUI", paramIntent);
  }

  public final void m(Context paramContext)
  {
    paramContext.startActivity(new Intent(paramContext, AddAppUI.class));
  }

  public final void m(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.putExtra("kintent_hint", paramContext.getString(n.cfY));
      a.b(paramContext, "accountsync", "com.tencent.mm.ui.account.RegByMobileSetPwdUI", paramIntent);
    }
  }

  public final void n(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, SettingsLanguageUI.class);
      paramContext.startActivity(paramIntent);
    }
  }

  public final void o(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      paramIntent.setClass(paramContext, LauncherUI.class).addFlags(67108864);
      paramContext.startActivity(paramIntent);
    }
  }

  public final void p(Intent paramIntent, Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, GestureGalleryUI.class);
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0)
      localIntent.addFlags(paramIntent.getFlags());
    paramContext.startActivity(localIntent);
  }

  public final void q(Intent paramIntent, Context paramContext)
  {
    Intent localIntent = new Intent(paramContext, SendFeedBackUI.class);
    localIntent.putExtras(paramIntent.getExtras());
    if (paramIntent.getFlags() != 0)
      localIntent.addFlags(paramIntent.getFlags());
    paramContext.startActivity(localIntent);
  }

  public final void r(Intent paramIntent, Context paramContext)
  {
    if (paramContext != null)
    {
      Intent localIntent = new Intent(paramContext, ContactSearchUI.class);
      localIntent.putExtras(paramIntent.getExtras());
      if (paramIntent.getFlags() != 0)
        localIntent.addFlags(paramIntent.getFlags());
      paramContext.startActivity(localIntent);
    }
  }

  public final void s(Intent paramIntent, Context paramContext)
  {
    paramIntent.setClass(paramContext, SnsTagContactListUI.class);
    paramContext.startActivity(paramIntent);
  }

  public final void t(Intent paramIntent, Context paramContext)
  {
    if (paramContext == null)
      return;
    paramIntent.setClass(paramContext, AppAttachDownloadUI.class);
    paramContext.startActivity(paramIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.aj
 * JD-Core Version:    0.6.2
 */