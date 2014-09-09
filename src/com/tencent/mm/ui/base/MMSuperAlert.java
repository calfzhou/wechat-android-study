package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.cm;

public class MMSuperAlert extends Activity
{
  public static void c(Context paramContext, int paramInt1, int paramInt2)
  {
    Intent localIntent = new Intent(paramContext, MMSuperAlert.class);
    localIntent.putExtra("MMSuperAlert_title", paramInt1);
    localIntent.putExtra("MMSuperAlert_msg", paramInt2);
    localIntent.putExtra("MMSuperAlert_cancelable", false);
    paramContext.startActivity(localIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(k.bjI);
    int i = getIntent().getIntExtra("MMSuperAlert_msg", 0);
    int j = getIntent().getIntExtra("MMSuperAlert_title", 0);
    boolean bool = getIntent().getBooleanExtra("MMSuperAlert_cancelable", true);
    new cm().postDelayed(new do(this, i, j, bool), 50L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMSuperAlert
 * JD-Core Version:    0.6.2
 */