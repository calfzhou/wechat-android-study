package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelfriend.ar;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.List;

public class FindMContactIntroUI extends MMWizardActivity
{
  private String cTZ;
  private m dDA = null;
  private ProgressDialog dWT = null;
  private List dtA = null;
  private String fAX = null;
  private String fUt;
  private String iQR = "";
  private int iQS = 2;
  private Button jjU;
  private TextView jkG;
  private TextView jkH;
  private boolean jkr = false;
  private ar jks;

  private void aUh()
  {
    ac localac = com.tencent.mm.model.bg.qX();
    be localbe = new be(this);
    this.dDA = localbe;
    localac.a(431, localbe);
    ActionBarActivity localActionBarActivity = aPI();
    getString(n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(n.cuj), true, new bf(this));
    com.tencent.mm.model.bg.qQ().a(new bg(this));
  }

  private void afq()
  {
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    XF();
    aQl();
  }

  protected final void DP()
  {
    this.jjU = ((Button)findViewById(i.aOT));
    this.jkH = ((TextView)findViewById(i.atG));
    this.jkG = ((TextView)findViewById(i.atF));
    if ((this.iQR != null) && (this.iQR.contains("2")))
      this.jkG.setText(getString(n.bJp));
    while (true)
    {
      this.cTZ = ((String)com.tencent.mm.model.bg.qW().oQ().get(6));
      if ((this.cTZ == null) || (this.cTZ.equals("")))
        this.cTZ = ((String)com.tencent.mm.model.bg.qW().oQ().get(4097));
      this.jjU.setOnClickListener(new aw(this));
      this.jkH.setOnClickListener(new ax(this));
      return;
      this.jkG.setText(getString(n.bJq));
    }
  }

  protected final int getLayoutId()
  {
    return k.bfE;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.atC);
    a.dWp.hY();
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    if (aa.wb() != ab.dtS);
    for (boolean bool = true; ; bool = false)
    {
      this.jkr = bool;
      this.fUt = com.tencent.mm.plugin.a.b.DL();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.iQR;
      arrayOfObject[1] = Integer.valueOf(this.iQS);
      z.d("!44@/B4Tb64lLpIaEkywMHoqAGJMqdmq/35TqHlpNl+apC8=", "tigerreg mNextStep %s  mNextStyle %s ", arrayOfObject);
      return;
    }
  }

  public void onDestroy()
  {
    if (this.dDA != null)
    {
      com.tencent.mm.model.bg.qX().b(431, this.dDA);
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
    com.tencent.mm.plugin.a.b.jE("RE900_100");
    if (this.jkr)
    {
      com.tencent.mm.plugin.a.b.b(false, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R300_100_QQ," + com.tencent.mm.model.bg.eg("R300_100_QQ") + ",4");
      return;
    }
    com.tencent.mm.plugin.a.b.b(false, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R300_100_phone," + com.tencent.mm.model.bg.eg("R300_100_phone") + ",4");
  }

  protected void onResume()
  {
    super.onResume();
    DP();
    if (this.jkr)
    {
      com.tencent.mm.plugin.a.b.b(true, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R300_100_QQ," + com.tencent.mm.model.bg.eg("R300_100_QQ") + ",1");
      com.tencent.mm.plugin.a.b.jD("R300_100_QQ");
      return;
    }
    com.tencent.mm.plugin.a.b.b(true, com.tencent.mm.model.bg.qS() + "," + getClass().getName() + ",R300_100_phone," + com.tencent.mm.model.bg.eg("R300_100_phone") + ",1");
    com.tencent.mm.plugin.a.b.jD("R300_100_phone");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.FindMContactIntroUI
 * JD-Core Version:    0.6.2
 */