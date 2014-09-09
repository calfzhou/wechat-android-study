package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.l;
import android.support.v4.app.v;
import com.tencent.mm.ui.dz;

public class AddressUI extends FragmentActivity
{
  public dz jrD;

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    l locall = o();
    if (locall.b(16908290) == null)
    {
      this.jrD = new e();
      this.jrD.setArguments(getIntent().getExtras());
      locall.p().a(16908290, this.jrD).commit();
    }
  }

  protected void onSaveInstanceState(Bundle paramBundle)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.AddressUI
 * JD-Core Version:    0.6.2
 */