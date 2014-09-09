package com.tencent.mm.ui.contact.profile;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.ab.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.FacebookAuthUI;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;
import com.tencent.mm.ui.bindqq.BindQQUI;
import com.tencent.mm.ui.chatting.ChattingUI;
import junit.framework.Assert;

public final class aa
  implements a
{
  private Context context;
  private cr dWq = null;
  private o dXi;
  private boolean ekQ = false;
  private i elz;
  private boolean fDb;
  private cb jDo;
  private int status;

  public aa(Context paramContext)
  {
    this.context = paramContext;
    this.jDo = new by(paramContext);
    this.status = -1;
  }

  private void c(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXajw1oYKAJxyZZTPkZ6n53E=", "switch change : open = " + paramBoolean + " item value = " + paramInt1 + " functionId = " + paramInt2);
    if (paramBoolean)
    {
      this.status = (paramInt1 | this.status);
      bg.qW().oQ().set(7, Integer.valueOf(this.status));
      if (!paramBoolean)
        break label113;
    }
    label113: for (int i = 1; ; i = 2)
    {
      bg.qW().oS().a(new bn(paramInt2, i));
      return;
      this.status &= (paramInt1 ^ 0xFFFFFFFF);
      break;
    }
  }

  private boolean fb(int paramInt)
  {
    return (paramInt & this.status) != 0;
  }

  public final boolean ID()
  {
    bg.qX().d(new k(5));
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.dXi.BU("contact_info_header_helper");
    if (localHelperHeaderPreference != null)
      localHelperHeaderPreference.onDetach();
    return true;
  }

  public final boolean a(o paramo, i parami, boolean paramBoolean, int paramInt)
  {
    boolean bool1;
    boolean bool2;
    label19: CheckBoxPreference localCheckBoxPreference1;
    CheckBoxPreference localCheckBoxPreference2;
    CheckBoxPreference localCheckBoxPreference3;
    boolean bool3;
    label125: boolean bool4;
    label145: boolean bool5;
    label163: int i;
    label212: label249: int j;
    if (paramo != null)
    {
      bool1 = true;
      Assert.assertTrue(bool1);
      if (parami == null)
        break label365;
      bool2 = true;
      Assert.assertTrue(bool2);
      Assert.assertTrue(y.dm(parami.getUsername()));
      this.dXi = paramo;
      this.fDb = paramBoolean;
      this.elz = parami;
      if (this.status == -1)
        this.status = x.pK();
      paramo.addPreferencesFromResource(q.czg);
      localCheckBoxPreference1 = (CheckBoxPreference)paramo.BU("contact_info_recommend_qqfriends_to_me");
      localCheckBoxPreference2 = (CheckBoxPreference)paramo.BU("contact_info_recommend_mobilefriends_to_me");
      localCheckBoxPreference3 = (CheckBoxPreference)paramo.BU("contact_info_recommend_fbfriends_to_me");
      if (fb(256))
        break label371;
      bool3 = true;
      localCheckBoxPreference2.setChecked(bool3);
      if (fb(128))
        break label377;
      bool4 = true;
      localCheckBoxPreference1.setChecked(bool4);
      if ((0x4 & x.pL()) == 0)
        break label383;
      bool5 = true;
      localCheckBoxPreference3.setChecked(bool5);
      ((HelperHeaderPreference)paramo.BU("contact_info_header_helper")).a(parami, this.jDo);
      if (ap.a((Integer)bg.qW().oQ().get(9)) == 0)
        break label389;
      i = 1;
      if (i == 0)
        break label395;
      paramo.b(paramo.BU("contact_info_bind_qq_entry"));
      paramo.b(paramo.BU("contact_info_bind_qq_entry_tip"));
      if (com.tencent.mm.modelfriend.aa.wb() != com.tencent.mm.modelfriend.ab.dtS)
        break label445;
      j = 1;
      label261: if (j == 0)
        break label451;
      paramo.b(paramo.BU("contact_info_bind_mobile_entry"));
      paramo.b(paramo.BU("contact_info_bind_mobile_entry_tip"));
    }
    while (true)
    {
      int k = 0x2000 & x.pO();
      int m = 0;
      if (k == 0)
        m = 1;
      if (m == 0)
        break label495;
      boolean bool6 = x.qc();
      paramo.b(localCheckBoxPreference3);
      if (bool6)
        break label478;
      paramo.BU("contact_info_bind_fb_entry").setSummary(n.cfk);
      return true;
      bool1 = false;
      break;
      label365: bool2 = false;
      break label19;
      label371: bool3 = false;
      break label125;
      label377: bool4 = false;
      break label145;
      label383: bool5 = false;
      break label163;
      label389: i = 0;
      break label212;
      label395: paramo.b(localCheckBoxPreference1);
      if (com.tencent.mm.z.b.yo())
        break label249;
      paramo.b(paramo.BU("contact_info_bind_qq_entry"));
      paramo.b(paramo.BU("contact_info_bind_qq_entry_tip"));
      break label249;
      label445: j = 0;
      break label261;
      label451: paramo.b(localCheckBoxPreference2);
      paramo.BU("contact_info_bind_mobile_entry").setSummary(n.cfk);
    }
    label478: paramo.BU("contact_info_bind_fb_entry").setSummary(n.bBw);
    return true;
    label495: paramo.b(paramo.BU("contact_info_bind_fb_entry"));
    paramo.b(paramo.BU("contact_info_bind_fb_entry_tip"));
    paramo.b(localCheckBoxPreference3);
    return true;
  }

  public final boolean ky(String paramString)
  {
    z.d("!44@/B4Tb64lLpLSOpQlr7qYXajw1oYKAJxyZZTPkZ6n53E=", "handlerEvent : key = " + paramString);
    if (ap.ja(paramString).length() <= 0)
      return false;
    if (paramString.equals("contact_info_recommend_qqfriends_to_me"))
    {
      if (!((CheckBoxPreference)this.dXi.BU("contact_info_recommend_qqfriends_to_me")).isChecked());
      for (boolean bool4 = true; ; bool4 = false)
      {
        c(bool4, 128, 6);
        return true;
      }
    }
    if (paramString.equals("contact_info_recommend_mobilefriends_to_me"))
    {
      boolean bool2 = ((CheckBoxPreference)this.dXi.BU("contact_info_recommend_mobilefriends_to_me")).isChecked();
      boolean bool3 = false;
      if (!bool2)
        bool3 = true;
      c(bool3, 256, 7);
      return true;
    }
    if (paramString.equals("contact_info_recommend_fbfriends_to_me"))
    {
      boolean bool1 = ((CheckBoxPreference)this.dXi.BU("contact_info_recommend_fbfriends_to_me")).isChecked();
      z.d("!44@/B4Tb64lLpLSOpQlr7qYXajw1oYKAJxyZZTPkZ6n53E=", "switch change : open = " + bool1 + " item value = 4 functionId = 18");
      int i = x.pL();
      int j;
      if (bool1)
      {
        j = i | 0x4;
        bg.qW().oQ().set(40, Integer.valueOf(j));
        if (!bool1)
          break label265;
      }
      label265: for (int k = 1; ; k = 2)
      {
        bg.qW().oS().a(new bn(18, k));
        return true;
        j = i & 0xFFFFFFFB;
        break;
      }
    }
    if (paramString.equals("contact_info_view_message"))
    {
      Intent localIntent = new Intent(this.context, ChattingUI.class);
      if (this.fDb)
      {
        localIntent.putExtra("Chat_User", this.elz.getUsername());
        localIntent.putExtra("Chat_Mode", 1);
        localIntent.addFlags(67108864);
        ((Activity)this.context).setResult(-1, localIntent);
        ((Activity)this.context).finish();
        return true;
      }
      localIntent.putExtra("Chat_User", this.elz.getUsername());
      localIntent.putExtra("Chat_Mode", 1);
      localIntent.addFlags(67108864);
      this.context.startActivity(localIntent);
      ((Activity)this.context).finish();
      return true;
    }
    if (paramString.equals("contact_info_bind_mobile_entry"))
    {
      MMWizardActivity.j(this.context, new Intent(this.context, BindMContactIntroUI.class));
      return true;
    }
    if (paramString.equals("contact_info_bind_qq_entry"))
    {
      MMWizardActivity.j(this.context, new Intent(this.context, BindQQUI.class));
      return true;
    }
    if (paramString.equals("contact_info_bind_fb_entry"))
    {
      this.context.startActivity(new Intent(this.context, FacebookAuthUI.class));
      return true;
    }
    if (paramString.equals("contact_info_fmessage_clear_data"))
    {
      com.tencent.mm.ui.base.e.a(this.context, this.context.getString(n.bBo), "", this.context.getString(n.bsM), this.context.getString(n.bsK), new ab(this), null);
      return true;
    }
    z.e("!44@/B4Tb64lLpLSOpQlr7qYXajw1oYKAJxyZZTPkZ6n53E=", "handleEvent : unExpected key = " + paramString);
    return false;
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.aa
 * JD-Core Version:    0.6.2
 */