package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.o.ac;

public class UIEntryStub extends Activity
{
  private String ehH;
  private int ehI;
  private Intent ehJ;

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    NotifyReceiver.lw();
  }

  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.ehJ = paramIntent;
  }

  public void onResume()
  {
    super.onResume();
    if (this.ehJ == null)
      this.ehJ = getIntent();
    bg.qX().d(new ce(new i(this)));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.UIEntryStub
 * JD-Core Version:    0.6.2
 */