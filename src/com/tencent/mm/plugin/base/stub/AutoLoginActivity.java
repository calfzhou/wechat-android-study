package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.account.SimpleLoginUI;

public abstract class AutoLoginActivity extends Activity
{
  private boolean HF()
  {
    if ((!bg.ra()) || (bg.rd()))
    {
      z.w("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "not login");
      Intent localIntent = new Intent(this, getClass());
      localIntent.putExtras(getIntent());
      localIntent.addFlags(67108864);
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), localIntent);
      return true;
    }
    return false;
  }

  protected abstract void a(a parama, Intent paramIntent);

  protected abstract boolean e(Intent paramIntent);

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      z.e("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "onCreate intent is null");
      finish();
      return;
    }
    com.tencent.mm.am.a.aCl();
    z.d("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "onCreate, intent action = " + localIntent.getAction());
    if (!e(localIntent))
    {
      z.e("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "preLogin fail, no need to process");
      return;
    }
    if (HF())
    {
      finish();
      z.w("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "not login, go to SimpleLogin");
      return;
    }
    bg.rb();
    a(a.ehx, localIntent);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    if (paramIntent == null)
      return;
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    int i = paramIntent.getIntExtra("wizard_activity_result_code", 0);
    z.d("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "onNewIntent, resultCode = " + i);
    switch (i)
    {
    default:
      z.e("!44@/B4Tb64lLpI/xOSY/Qa0zpFqn1CXTwg8ruffkMqdYiM=", "onNewIntent, should not reach here, resultCode = " + i);
      a(a.ehy, paramIntent);
      return;
    case -1:
      a(a.ehx, paramIntent);
      return;
    case 0:
      HF();
      return;
    case 1:
    }
    a(a.ehz, paramIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.AutoLoginActivity
 * JD-Core Version:    0.6.2
 */