package com.tencent.mm.plugin.accountsync.ui;

import android.accounts.AccountAuthenticatorResponse;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.accountsync.model.c;
import com.tencent.mm.plugin.accountsync.model.d;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public final class ContactsSyncUI extends MMActivity
{
  private AccountAuthenticatorResponse dWJ = null;
  private Bundle dWK = null;

  protected final void DP()
  {
    if ((!bg.ra()) || (bg.rd()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      return;
    }
    int i = getIntent().getIntExtra("contact_sync_scene", -1);
    if ((getIntent().getAction() != null) && (getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN")))
      i = 4;
    while (i == -1)
    {
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXSYYf8fQ8Ee/", "unkown scene, finish");
      finish();
      return;
      String str = getIntent().resolveType(this);
      z.i("!32@/B4Tb64lLpLSOpQlr7qYXSYYf8fQ8Ee/", "scheme = " + str + ", action = " + getIntent().getAction());
      if (!ch.jb(str))
        if (str.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile"))
          i = 2;
        else if (str.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip"))
          i = 12;
        else if (str.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video"))
          i = 13;
        else if (str.equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline"))
          i = 3;
        else if (str.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum"))
          i = 6;
        else
          i = -1;
    }
    Object localObject;
    switch (i)
    {
    case 5:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    default:
      localObject = null;
      label291: if (localObject != null)
        switch (((c)localObject).ah(this))
        {
        case 5:
        case 0:
        case 1:
        default:
        case 2:
        case 3:
        case 4:
        }
      break;
    case 2:
    case 6:
    case 12:
    case 13:
    case 3:
    case 4:
    case 1:
    }
    while (true)
    {
      finish();
      return;
      Uri localUri4 = getIntent().getData();
      localObject = new d(1, getIntent().getStringExtra("k_phone_num"), localUri4);
      break label291;
      Uri localUri3 = getIntent().getData();
      localObject = new d(3, getIntent().getStringExtra("k_phone_num"), localUri3);
      break label291;
      Uri localUri2 = getIntent().getData();
      localObject = new d(4, getIntent().getStringExtra("k_phone_num"), localUri2);
      break label291;
      Uri localUri1 = getIntent().getData();
      localObject = new d(2, getIntent().getStringExtra("k_phone_num"), localUri1);
      break label291;
      this.dWJ = ((AccountAuthenticatorResponse)getIntent().getParcelableExtra("accountAuthenticatorResponse"));
      if (this.dWJ != null)
        this.dWJ.onRequestContinued();
      if (getSharedPreferences(ak.aHi(), 0).getBoolean("upload_contacts_already_displayed", false))
        break;
      if (!getIntent().getBooleanExtra("k_login_without_bind_mobile", false));
      for (boolean bool3 = true; ; bool3 = false)
      {
        localObject = new a(this, bool3);
        break;
      }
      this.dWJ = ((AccountAuthenticatorResponse)getIntent().getParcelableExtra("accountAuthenticatorResponse"));
      if (this.dWJ != null)
        this.dWJ.onRequestContinued();
      boolean bool1 = getIntent().getBooleanExtra("k_login_without_bind_mobile", false);
      boolean bool2 = false;
      if (!bool1)
        bool2 = true;
      localObject = new a(this, bool2);
      break label291;
      Intent localIntent5 = getIntent();
      localIntent5.setClass(this, ContactsSyncUI.class);
      Intent localIntent6 = new Intent();
      localIntent6.setClass(this, BindMContactIntroUI.class);
      localIntent6.putExtra("is_bind_for_contact_sync", true);
      MMWizardActivity.b(this, localIntent6, localIntent5);
      finish();
      continue;
      Intent localIntent3 = getIntent();
      localIntent3.setClass(this, ContactsSyncUI.class);
      Intent localIntent4 = new Intent();
      localIntent4.setClass(this, SimpleLoginUI.class);
      MMWizardActivity.b(this, localIntent4, localIntent3);
      finish();
      continue;
      Intent localIntent1 = getIntent();
      localIntent1.setClass(this, ContactsSyncUI.class);
      Intent localIntent2 = new Intent();
      localIntent2.setClass(this, SimpleLoginUI.class);
      localIntent2.putExtra("accountAuthenticatorResponse", this.dWJ);
      MMWizardActivity.b(this, localIntent2, localIntent1);
      finish();
      continue;
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXSYYf8fQ8Ee/", "unkown scene, finish");
    }
  }

  public final void finish()
  {
    if (this.dWJ != null)
    {
      if (this.dWK == null)
        break label35;
      this.dWJ.onResult(this.dWK);
    }
    while (true)
    {
      this.dWJ = null;
      super.finish();
      return;
      label35: this.dWJ.onError(4, "canceled");
    }
  }

  protected final int getLayoutId()
  {
    return -1;
  }

  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.i("!32@/B4Tb64lLpLSOpQlr7qYXSYYf8fQ8Ee/", "onCreate()");
    Bt("");
    int i = getIntent().getIntExtra("wizard_activity_result_code", 0);
    switch (i)
    {
    default:
      z.e("!32@/B4Tb64lLpLSOpQlr7qYXSYYf8fQ8Ee/", "onCreate, should not reach here, resultCode = " + i);
      finish();
      return;
    case 1:
      finish();
      return;
    case -1:
    case 0:
    }
    DP();
  }

  public final void setAccountAuthenticatorResult(Bundle paramBundle)
  {
    this.dWK = paramBundle;
    finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.ui.ContactsSyncUI
 * JD-Core Version:    0.6.2
 */