package com.tencent.mm.ui.bindmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.List;

public class FindMContactAlertUI extends MMWizardActivity
{
  private String cTZ;
  private m dDA = null;
  private ProgressDialog dWT = null;
  private List dtA = null;
  private String fAX = null;
  private String fUt;
  private String iQR = "";
  private int iQS = 2;
  private int jkA = 0;
  private int jkB = 0;
  private int jkC = 0;
  private String jkp = null;
  private String jkq = null;
  private boolean jkr = false;
  private com.tencent.mm.modelfriend.ar jks;
  private String jkt;
  private String jku;
  private int jkv = 0;
  private final int jkw = 200;
  private int jkx = 0;
  private int jky = 0;
  private int jkz = 0;

  private void aUf()
  {
    if (this.jkr)
    {
      com.tencent.mm.plugin.a.b.jF(bg.qS() + "," + getClass().getName() + ",R300_200_phone," + bg.eg("R300_200_phone") + ",1");
      com.tencent.mm.ui.base.e.a(this, false, getString(n.bJs), getString(n.buo), getString(n.btQ), getString(n.bsK), new an(this), new ao(this));
      return;
    }
    if (com.tencent.mm.modelfriend.aa.wa())
    {
      String str1 = this.jku;
      String str2 = this.jkt;
      int i = n.bJG;
      int j = n.bJF;
      ap localap = new ap(this);
      aq localaq = new aq(this);
      com.tencent.mm.ui.base.aa localaa = new com.tencent.mm.ui.base.aa(this);
      localaa.setTitle(str2);
      localaa.setMessage(str1);
      localaa.a(i, localap);
      localaa.b(j, localaq);
      localaa.aRz();
      localaa.setCancelable(false);
      localaa.show();
      localaa.getWindow().clearFlags(2);
      a(localaa);
      localaa.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ar(this, localaa));
      View localView = findViewById(i.background);
      localView.getViewTreeObserver().addOnGlobalLayoutListener(new as(this, localView));
      return;
    }
    aUh();
  }

  private void aUg()
  {
    int i = getWindowManager().getDefaultDisplay().getHeight();
    int j = this.jkz / 2 + this.jkx / 4;
    int k = i / 2 + this.jky / 2 - (i - this.jkA) + com.tencent.mm.aq.a.fromDPToPix(this, 20);
    if ((j != this.jkB) || (k != this.jkC))
    {
      this.jkB = j;
      this.jkC = k;
      View localView = findViewById(i.atD);
      localView.setVisibility(0);
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(j - localView.getMeasuredWidth() / 2, k, 0, 0);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(j);
      arrayOfObject[1] = Integer.valueOf(k);
      arrayOfObject[2] = Integer.valueOf(localView.getMeasuredWidth());
      z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", "attachArrow x: %s y: %s view.width: %s", arrayOfObject);
      localView.setLayoutParams(localLayoutParams);
      localView.startAnimation(AnimationUtils.loadAnimation(this, com.tencent.mm.b.Mp));
    }
  }

  private void aUh()
  {
    View localView = findViewById(i.atD);
    if (localView != null)
      localView.setVisibility(8);
    com.tencent.mm.o.ac localac = bg.qX();
    at localat = new at(this);
    this.dDA = localat;
    localac.a(431, localat);
    ActionBarActivity localActionBarActivity = aPI();
    getString(n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(localActionBarActivity, getString(n.cuj), true, new au(this));
    bg.qQ().a(new av(this));
    com.tencent.mm.platformtools.ac.f(true, false);
    com.tencent.mm.modelfriend.c.vp();
  }

  private void afq()
  {
    com.tencent.mm.plugin.a.b.jE(this.fUt);
    XF();
    aQl();
  }

  private View e(ViewGroup paramViewGroup)
  {
    View localView;
    if (this.jkv >= 200)
    {
      localView = null;
      return localView;
    }
    this.jkv = (1 + this.jkv);
    int i = paramViewGroup.getChildCount();
    for (int j = 0; ; j++)
    {
      if (j >= i)
        break label83;
      localView = paramViewGroup.getChildAt(j);
      if ((localView instanceof Button))
        break;
      if ((localView instanceof ViewGroup))
      {
        localView = e((ViewGroup)localView);
        if (localView != null)
          break;
      }
    }
    label83: return null;
  }

  protected final void DP()
  {
    this.jkt = getString(n.bJt);
    this.jku = getString(n.bJs);
    if (!ch.jb(this.jkp))
      this.jkt = this.jkp;
    if (!ch.jb(this.jkq))
      this.jku = this.jkq;
    this.cTZ = ((String)bg.qW().oQ().get(6));
    if ((this.cTZ == null) || (this.cTZ.equals("")))
      this.cTZ = ((String)bg.qW().oQ().get(4097));
  }

  protected final int getLayoutId()
  {
    return k.bfG;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.atC);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.fAX = getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = getIntent().getIntExtra("regsetinfo_NextStyle", 2);
    this.jkp = getIntent().getStringExtra("alert_title");
    this.jkq = getIntent().getStringExtra("alert_message");
    if (com.tencent.mm.modelfriend.aa.wb() != ab.dtS);
    for (boolean bool = true; ; bool = false)
    {
      this.jkr = bool;
      this.fUt = com.tencent.mm.plugin.a.b.DL();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = this.iQR;
      arrayOfObject[1] = Integer.valueOf(this.iQS);
      z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", "tigerreg mNextStep %s  mNextStyle %s ", arrayOfObject);
      if (!isFinishing())
        break;
      return;
    }
    DP();
    aUf();
  }

  public void onDestroy()
  {
    z.d("!44@/B4Tb64lLpIaEkywMHoqABQUhRrFI+cbSM7Lgi4eEq8=", "ondestroy");
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
    if (this.jkr)
    {
      com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",R300_100_QQ," + bg.eg("R300_100_QQ") + ",2");
      return;
    }
    com.tencent.mm.plugin.a.b.b(false, bg.qS() + "," + getClass().getName() + ",RE300_100," + bg.eg("RE300_100") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    if (this.jkr)
    {
      com.tencent.mm.plugin.a.b.jD("R300_100_QQ");
      com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",R300_100_QQ," + bg.eg("R300_100_QQ") + ",1");
      return;
    }
    com.tencent.mm.plugin.a.b.jD("R300_100_phone");
    com.tencent.mm.plugin.a.b.b(true, bg.qS() + "," + getClass().getName() + ",RE300_100," + bg.eg("RE300_100") + ",1");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindmobile.FindMContactAlertUI
 * JD-Core Version:    0.6.2
 */