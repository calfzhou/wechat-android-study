package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import com.jg.JgClassChecked;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.sdk.platformtools.z;

@JgClassChecked(author=20, fComment="checked", lastDate="20140422", reviewer=20, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXPayEntryActivity extends AutoLoginActivity
{
  private String ehY = null;

  protected final void a(a parama, Intent paramIntent)
  {
    boolean bool = true;
    if (paramIntent == null)
    {
      finish();
      return;
    }
    z.d("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "postLogin, delegate intent to OrderHandlerUI");
    this.ehY = paramIntent.getStringExtra("_mmessage_appPackage");
    z.d("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "postLogin, getCallingPackage success, value = " + this.ehY);
    if ((getIntent() == null) || (getIntent().getExtras() == null))
      bool = false;
    while (true)
    {
      if (!bool)
        z.e("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "postLogin, checkApp fail");
      Bundle localBundle = paramIntent.getExtras();
      Intent localIntent = new Intent();
      localIntent.putExtra("orderhandlerui_checkapp_result", bool);
      if (localBundle != null)
        localIntent.putExtras(localBundle);
      com.tencent.mm.am.a.b(this, "wallet_index", ".ui.OrderHandlerUI", localIntent);
      finish();
      return;
      com.tencent.mm.sdk.e.a locala = new com.tencent.mm.sdk.e.a();
      locala.e(getIntent().getExtras());
      String str1 = locala.appId;
      z.d("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "postLogin, appId = " + str1);
      if ((str1 == null) || (str1.length() == 0))
      {
        z.e("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "checkApp fail, appId is null");
        bool = false;
      }
      else
      {
        k localk1 = l.F(str1, bool);
        if (localk1 == null)
        {
          z.w("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "checkApp fail, not reg");
          k localk2 = new k();
          localk2.field_appId = str1;
          localk2.field_appName = "";
          localk2.field_packageName = this.ehY;
          localk2.field_status = 0;
          String str2 = u.aj(this, this.ehY);
          if (str2 != null)
            localk2.field_signature = str2;
          if ((bf.GO().b(localk2)) && (ap.jb(localk2.field_openId)))
          {
            z.d("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "checkApp, trigger getAppSetting, appId = " + str1);
            bf.azc().vd(str1);
          }
        }
        else if (localk1.field_status == 3)
        {
          z.e("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "checkApp fail, app is in blacklist");
          bool = false;
        }
        else if (!u.b(this, localk1, this.ehY))
        {
          z.e("!44@/B4Tb64lLpIk9oeRSFJsygj/TxmByc1i1jnzfdXNmcs=", "checkApp fail, app invalid");
          bool = false;
        }
      }
    }
  }

  protected final boolean e(Intent paramIntent)
  {
    return true;
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXPayEntryActivity
 * JD-Core Version:    0.6.2
 */