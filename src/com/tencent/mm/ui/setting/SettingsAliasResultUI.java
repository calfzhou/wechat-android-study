package com.tencent.mm.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMActivity;

public class SettingsAliasResultUI extends MMActivity
{
  private TextView eTE;
  private TextView jMV;
  private Button jMW;
  private ImageView jMX;
  private boolean jMY;
  private String wP;

  protected final void DP()
  {
    oP(n.bSX);
    this.eTE = ((TextView)findViewById(i.apF));
    this.jMV = ((TextView)findViewById(i.afO));
    this.jMW = ((Button)findViewById(i.aOG));
    this.jMX = ((ImageView)findViewById(i.aGN));
    a(new bv(this));
    this.jMV.setText(this.wP);
    if (!this.jMY)
    {
      this.jMW.setVisibility(0);
      this.eTE.setText(getString(n.bTc));
    }
    while (true)
    {
      this.jMW.setOnClickListener(new bw(this));
      return;
      this.jMW.setVisibility(8);
      this.eTE.setText(getString(n.bTd));
    }
  }

  protected final int getLayoutId()
  {
    return k.bmU;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
      finish();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.wP = ((String)bg.qW().oQ().get(42));
    this.jMY = Boolean.valueOf(getIntent().getBooleanExtra("has_pwd", true)).booleanValue();
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsAliasResultUI
 * JD-Core Version:    0.6.2
 */