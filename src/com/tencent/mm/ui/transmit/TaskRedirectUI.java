package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ui.LauncherUI;

public class TaskRedirectUI extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Intent localIntent = new Intent(this, LauncherUI.class);
    localIntent.addFlags(268435456);
    localIntent.addFlags(67108864);
    startActivity(localIntent);
    finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.TaskRedirectUI
 * JD-Core Version:    0.6.2
 */