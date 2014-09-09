package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.List;

public class FindMContactLearmMoreUI extends MMWizardActivity
{
  private String cTZ;
  private m dDA = null;
  private ProgressDialog dWT = null;
  private List dtA = null;
  private String fAX = null;
  private String iQR = "";
  private int iQS = 2;
  private Button jkK;
  private TextView jkL;
  private ar jks;

  private void afq()
  {
    XF();
    aQl();
  }

  protected final void DP()
  {
    oP(n.bJH);
    this.jkK = ((Button)findViewById(i.aGM));
    this.jkL = ((TextView)findViewById(i.aky));
    this.jkK.setOnClickListener(new bh(this));
    this.jkL.setOnClickListener(new bi(this));
    bg.qW().oQ().set(12323, Boolean.valueOf(true));
    this.cTZ = ((String)bg.qW().oQ().get(6));
    if ((this.cTZ == null) || (this.cTZ.equals("")))
      this.cTZ = ((String)bg.qW().oQ().get(4097));
  }

  protected final int getLayoutId()
  {
    return k.bfF;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    DP();
  }

  public void onDestroy()
  {
    if (this.dDA != null)
    {
      bg.qX().b(431, this.dDA);
      this.dDA = null;
    }
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",RE300_600," + bg.eg("RE300_600") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    com.tencent.mm.plugin.a.b.jD("R300_100_phone");
    com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",RE300_600," + bg.eg("RE300_600") + ",1");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.FindMContactLearmMoreUI
 * JD-Core Version:    0.6.2
 */