package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.e;

public class RegByQQUI extends MMActivity
  implements com.tencent.mm.o.m
{
  private ProgressDialog dWT = null;
  private String fUt;
  private Button fqA;
  private CheckBox hHm;
  private SecurityImage iMR = null;
  private EditText iPB;
  private di iPo = new di();
  private EditText iRF;

  private void afq()
  {
    b.jE(this.fUt);
    XF();
    finish();
  }

  protected final void DP()
  {
    this.iRF = ((EditText)findViewById(com.tencent.mm.i.aLL));
    this.iPB = ((EditText)findViewById(com.tencent.mm.i.aLK));
    this.hHm = ((CheckBox)findViewById(com.tencent.mm.i.aeS));
    this.fqA = ((Button)findViewById(com.tencent.mm.i.aGg));
    findViewById(com.tencent.mm.i.aeR).setOnClickListener(new hk(this));
    this.hHm.setOnCheckedChangeListener(new hs(this));
    findViewById(com.tencent.mm.i.aAY).setOnClickListener(new ht(this));
    this.fqA.setOnClickListener(new hu(this));
    this.fqA.setEnabled(false);
    this.iRF.addTextChangedListener(new hv(this));
    this.iPB.addTextChangedListener(new hw(this));
    this.iPB.setOnEditorActionListener(new hx(this));
    this.iPB.setOnKeyListener(new hy(this));
    a(new hz(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpJpocFQ/FMhC2mYmE9Mq2Y1", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() != 380);
    do
    {
      return;
      this.iPo.iPN = ((com.tencent.mm.modelsimple.i)paramx).yY();
      this.iPo.iPK = ((com.tencent.mm.modelsimple.i)paramx).wC();
      this.iPo.iPM = ((com.tencent.mm.modelsimple.i)paramx).wB();
      this.iPo.iPL = ((com.tencent.mm.modelsimple.i)paramx).yZ();
      this.iPo.dCF = this.iRF.getText().toString().trim();
      this.iPo.iPI = this.iPB.getText().toString();
      String str1 = ((com.tencent.mm.modelsimple.i)paramx).za();
      if (paramInt2 == -6)
      {
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(aPI(), n.bZc, this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL, new hn(this, paramx), null, new hp(this), this.iPo);
          return;
        }
        z.d("!32@/B4Tb64lLpJpocFQ/FMhC2mYmE9Mq2Y1", "imgSid:" + this.iPo.iPK + " img len" + this.iPo.iPM.length + " " + com.tencent.mm.compatible.g.k.nL());
        this.iMR.b(this.iPo.iPN, this.iPo.iPM, this.iPo.iPK, this.iPo.iPL);
        return;
      }
      if (paramInt2 == -75)
      {
        e.b(this, n.bsD, n.bXV);
        return;
      }
      if (paramInt2 == -30)
      {
        if (com.tencent.mm.protocal.a.hrq)
        {
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("rawUrl", str1);
          localIntent2.putExtra("showShare", false);
          localIntent2.putExtra("show_bottom", false);
          localIntent2.putExtra("needRedirect", false);
          localIntent2.putExtra("neverGetA8Key", true);
          localIntent2.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
          localIntent2.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
          com.tencent.mm.plugin.a.a.dWo.h(localIntent2, this);
          return;
        }
        String str2 = ((com.tencent.mm.modelsimple.i)paramx).wm();
        Intent localIntent3 = new Intent();
        localIntent3.putExtra("regsetinfo_binduin", this.iPo.dCF);
        localIntent3.putExtra("regsetinfo_pwd", this.iPo.iPI);
        localIntent3.putExtra("regsetinfo_ismobile", 2);
        localIntent3.putExtra("regsetinfo_ticket", str2);
        localIntent3.putExtra("regsetinfo_NextControl", ((com.tencent.mm.modelsimple.i)paramx).wo());
        localIntent3.setClass(this, RegSetInfoUI.class);
        startActivity(localIntent3);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.ac.s(this, paramString);
        return;
      }
      if (paramInt2 == -212)
      {
        b.jF(bg.qS() + "," + getClass().getName() + ",L400_100_signup," + bg.eg("L400_100_signup") + ",1");
        e.a(this, getString(n.bYZ), "", new hq(this), new hr(this));
        return;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        bg.rf();
        Intent localIntent1 = com.tencent.mm.plugin.a.a.dWo.k(this);
        localIntent1.addFlags(67108864);
        localIntent1.putExtra("LauncherUI.enter_from_reg", true);
        startActivity(localIntent1);
        b.jF(bg.qS() + "," + getClass().getName() + ",L400_100_signup," + bg.eg("L400_100_signup") + ",4");
        finish();
        return;
      }
    }
    while (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString));
    int i = n.bKW;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(i, arrayOfObject), 0).show();
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bly;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str = getString(n.bZd);
    if (com.tencent.mm.protocal.a.hrq)
      str = getString(n.age) + getString(n.bsA);
    Bt(str);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.fUt = b.DL();
    DP();
    bg.qX().a(380, this);
  }

  public void onDestroy()
  {
    bg.qX().b(380, this);
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

  public void onPause()
  {
    super.onPause();
    b.b(false, bg.qS() + "," + getClass().getName() + ",R400_100_signup," + bg.eg("R400_100_signup") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    b.b(true, bg.qS() + "," + getClass().getName() + ",R400_100_signup," + bg.eg("R400_100_signup") + ",1");
    b.jD("R400_100_signup");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByQQUI
 * JD-Core Version:    0.6.2
 */