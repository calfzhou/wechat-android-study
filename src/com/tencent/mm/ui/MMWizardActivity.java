package com.tencent.mm.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class MMWizardActivity extends MMActivity
{
  protected static final Map iNc = new HashMap();

  public static void b(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    String str = "trans." + ch.CN() + "." + paramIntent2.hashCode();
    iNc.put(str, paramIntent2);
    paramIntent1.putExtra("WizardTransactionId", str);
    Intent localIntent = ((Activity)paramContext).getIntent();
    if (localIntent != null)
      localIntent.putExtra("WizardTransactionId", str);
    j(paramContext, paramIntent1);
  }

  public static void j(Context paramContext, Intent paramIntent)
  {
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "startWizardActivity()");
    Assert.assertTrue("startWizardActivity: Param context should be a Activity :" + paramContext.toString(), paramContext instanceof Activity);
    Intent localIntent = ((Activity)paramContext).getIntent();
    Object localObject;
    String str1;
    if (localIntent != null)
    {
      localObject = localIntent.getStringExtra("WizardRootClass");
      str1 = localIntent.getStringExtra("WizardTransactionId");
    }
    while (true)
    {
      if (ch.jb((String)localObject));
      try
      {
        String str2 = paramIntent.getComponent().getClassName();
        localObject = str2;
        label81: Assert.assertFalse("startWizardActivity: ERROR in Get Root Class :[" + (String)localObject + "]", ch.jb((String)localObject));
        paramIntent.putExtra("WizardRootClass", (String)localObject);
        if (str1 != null)
          paramIntent.putExtra("WizardTransactionId", str1);
        paramContext.startActivity(paramIntent);
        return;
      }
      catch (Exception localException)
      {
        break label81;
      }
      str1 = null;
      localObject = null;
    }
  }

  protected final void aQl()
  {
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "finishWizard()");
    String str = getIntent().getExtras().getString("WizardRootClass");
    Assert.assertFalse("finishWizard: ERROR in Get Root Class :[" + str + "]", ch.jb(str));
    Intent localIntent = new Intent().setClassName(this, str);
    localIntent.putExtra("WizardRootClass", getIntent().getStringExtra("WizardRootClass"));
    localIntent.putExtra("WizardTransactionId", getIntent().getStringExtra("WizardTransactionId"));
    localIntent.putExtra("WizardRootKillSelf", true);
    localIntent.putExtra("wizard_activity_result_code", 1);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
  }

  protected final void cancel()
  {
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "cancel()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)iNc.get(str);
    iNc.remove(str);
    if (localIntent != null)
      z.d("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "canceled exit for transaction=" + str + ", intent=" + localIntent);
  }

  protected final void exit(int paramInt)
  {
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "exit()");
    String str = getIntent().getStringExtra("WizardTransactionId");
    Intent localIntent = (Intent)iNc.get(str);
    iNc.remove(str);
    if (localIntent != null)
    {
      z.d("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "doing post exit for transaction=" + str + ", intent=" + localIntent);
      localIntent.putExtra("wizard_activity_result_code", paramInt);
      startActivity(localIntent);
    }
  }

  public void finish()
  {
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "finish()");
    String str = getIntent().getStringExtra("WizardRootClass");
    if (getComponentName().getClassName().equals(str))
    {
      z.d("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "root wizard activity");
      exit(-1);
    }
    super.finish();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "onCreate()");
    Assert.assertFalse("MMWizardActivity Should Start By startWizardActivity or startWizardNextStep", ch.jb(getIntent().getExtras().getString("WizardRootClass")));
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false))
    {
      super.finish();
      z.i("!44@/B4Tb64lLpJvV+XMpT29t9nlu8JQyie2l3cWQ1nrjiU=", "finish wizard, root=" + getComponentName().getClassName());
      exit(getIntent().getExtras().getInt("wizard_activity_result_code"));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMWizardActivity
 * JD-Core Version:    0.6.2
 */