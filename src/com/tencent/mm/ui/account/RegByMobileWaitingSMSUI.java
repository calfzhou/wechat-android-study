package com.tencent.mm.ui.account;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.account.mobile.MobileVerifyUI;
import com.tencent.mm.ui.base.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegByMobileWaitingSMSUI extends MMActivity
{
  private String cTZ;
  private ProgressBar eBw;
  private ListView fRC;
  private String fUt;
  private ki iQH;
  private boolean iQI;
  private kj iQJ = new ha(this);
  private TextView iRo;
  private CountDownTimer iRp;
  private int iRq = 30;
  private hf iRr;
  private List iRs = new ArrayList();
  String[] iRt = { "你好", "可以请你喝一杯吗？", "Здравствуйте!", "Darf ich Ihnen einen Drink ausgeben?", "Ich habe Gefühle für Dich.", "Bonjour!", "Prends soins de toi.", "?Hola! ", "Soy un ingeniero.", "Tu novio es un hombre bonito", "今日は!", "カッコいいですね", "Buona notte!", "Ayons une fête ce soir!", "Let's enjoy the holidays.", "Hello!" };
  private Drawable iRu;
  private List iRv = new ArrayList();
  private boolean iRw = false;

  private void BB(String paramString)
  {
    try
    {
      if (this.iQH != null)
      {
        this.iQH.aQW();
        this.iQH = null;
      }
      if ((this.iRp != null) && (this.iRp != null))
      {
        this.iRp.cancel();
        this.iRp = null;
      }
      if (!this.iQI)
      {
        this.iQI = true;
        Intent localIntent = getIntent();
        localIntent.putExtra("mobile_verify_purpose", 2);
        if ((paramString != null) && (paramString.length() > 0))
          localIntent.putExtra("!32@/B4Tb64lLpKNhhU94SG29vC9zoVXGkMMIntent_sms_code", paramString);
        a(MobileVerifyUI.class, localIntent);
        finish();
      }
      return;
    }
    finally
    {
    }
  }

  private void goBack()
  {
    e.a(this, getString(n.bSP), "", getString(n.bSQ), getString(n.bSR), new hd(this), new he(this));
  }

  protected final void DP()
  {
    this.iRo = ((TextView)findViewById(i.aXe));
    this.eBw = ((ProgressBar)findViewById(i.aXg));
    this.fRC = ((ListView)findViewById(i.aXf));
    this.iQI = false;
    String str1 = getString(n.bwF);
    if (a.hrq)
      str1 = getString(n.age) + getString(n.bsA);
    Bt(str1);
    this.cTZ = getIntent().getExtras().getString("bindmcontact_mobile");
    this.cTZ = be.AV(this.cTZ);
    this.iRq = getIntent().getIntExtra("mobileverify_countdownsec", this.iRq);
    Random localRandom = new Random();
    for (int i = 0; i < this.iRq; i++)
      this.iRs.add(Integer.valueOf(localRandom.nextInt(1000)));
    int j = localRandom.nextInt(1000) % this.iRv.size();
    this.iRu = ((Drawable)this.iRv.get(j));
    this.iRv.remove(j);
    a(new gz(this));
    new be();
    String str2 = "86";
    if (this.cTZ.startsWith("+"))
    {
      this.cTZ = this.cTZ.replace("+", "");
      str2 = be.AT(this.cTZ);
      if (str2 != null)
        this.cTZ = this.cTZ.substring(str2.length());
    }
    String str3 = be.bC(str2, this.cTZ);
    if ((str2 != null) && (str2.length() > 0))
      this.iRo.setText("+" + str2 + " " + str3);
    while (true)
    {
      this.fRC.setVisibility(4);
      if (this.iRp == null)
      {
        this.iRp = new hb(this, 1000 * this.iRq);
        this.eBw.setMax(this.iRq);
        this.iRp.start();
      }
      return;
      this.iRo.setText(str3);
    }
  }

  protected final int getLayoutId()
  {
    return k.bjS;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.iRv.add(getResources().getDrawable(h.VJ));
    this.iRv.add(getResources().getDrawable(h.VK));
    this.iRv.add(getResources().getDrawable(h.VL));
    this.iRv.add(getResources().getDrawable(h.VM));
    this.iRv.add(getResources().getDrawable(h.VN));
    this.iRv.add(getResources().getDrawable(h.VO));
    DP();
    this.iQH = new ki(this, this.iQJ);
    this.iQH.aQV();
    this.fUt = b.DL();
  }

  protected void onDestroy()
  {
    if (this.iQH != null)
    {
      this.iQH.aQW();
      this.iQH = null;
    }
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    b.jD("RE200_250");
    if (this.iRw)
      b.jE(this.fUt);
    while (true)
    {
      b.b(false, bg.qS() + "," + getClass().getName() + ",RE200_250," + bg.eg("RE200_250") + ",2");
      return;
      b.jE("RE200_300");
    }
  }

  protected void onResume()
  {
    super.onResume();
    b.b(true, bg.qS() + "," + getClass().getName() + ",RE200_250," + bg.eg("RE200_250") + ",1");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByMobileWaitingSMSUI
 * JD-Core Version:    0.6.2
 */