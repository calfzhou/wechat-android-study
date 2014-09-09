package com.tencent.mm.jdbiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.fk;

public class JDRemindDialog extends Activity
{
  private aa dQr = null;

  private void Cl()
  {
    if (getIntent() == null);
    Bundle localBundle;
    do
    {
      return;
      localBundle = getIntent().getExtras();
    }
    while (localBundle == null);
    ad localad = new ad(this);
    localad.BK("");
    localad.BL(localBundle.getString("alertcontent"));
    localad.a(localBundle.getString("alertconfirm"), new a(this));
    localad.b(localBundle.getString("alert_cancel"), new b(this));
    this.dQr = localad.aRB();
    this.dQr.setCanceledOnTouchOutside(false);
    this.dQr.show();
  }

  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    Intent localIntent = new Intent(paramContext, JDRemindDialog.class);
    localIntent.putExtra("alertcontent", paramString1);
    localIntent.putExtra("alertconfirm", paramString2);
    localIntent.putExtra("alert_cancel", paramString3);
    localIntent.putExtra("alertjumpurl", paramString4);
    localIntent.putExtra("alert_activityid", paramString5);
    localIntent.addFlags(805306368);
    paramContext.startActivity(localIntent);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    Cl();
  }

  protected void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if (this.dQr != null)
    {
      this.dQr.dismiss();
      this.dQr = null;
    }
    Cl();
  }

  protected void onPause()
  {
    super.onPause();
    fk.a(false, null);
  }

  protected void onResume()
  {
    super.onResume();
    fk.a(true, null);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.JDRemindDialog
 * JD-Core Version:    0.6.2
 */