package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.Map;

public class SecurityAccountVerifyUI extends MMWizardActivity
  implements m
{
  private String cFd;
  private String cFf;
  private String cTZ;
  private ay dHm;
  private ProgressDialog dWT = null;
  private Button fUA;
  private boolean fUB = false;
  private String fUq;
  private Button fUs;
  private String fUt;
  private EditText fUx;
  private TextView fUy;
  private TextView fUz;

  private void afq()
  {
    cancel();
    aQl();
  }

  private boolean j(int paramInt1, int paramInt2, String paramString)
  {
    if (com.tencent.mm.plugin.a.a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
      return true;
    switch (paramInt2)
    {
    default:
      return false;
    case -32:
      com.tencent.mm.ui.base.e.a(aPI(), n.bwR, n.ajf, null);
      return true;
    case -33:
      com.tencent.mm.ui.base.e.a(aPI(), n.bwQ, n.ajf, null);
      return true;
    case -34:
      Toast.makeText(this, n.bwp, 0).show();
      return true;
    case -57:
    case -1:
      Toast.makeText(aPI(), n.btk, 0).show();
      return true;
    case -41:
      Toast.makeText(aPI(), n.bwo, 0).show();
      return true;
    case -74:
    }
    com.tencent.mm.ui.base.e.a(aPI(), n.bwl, n.buo, null);
    return true;
  }

  protected final void DP()
  {
    this.cTZ = getIntent().getStringExtra("binded_mobile");
    this.fUq = getIntent().getStringExtra("auth_ticket");
    this.fUB = getIntent().getBooleanExtra("re_open_verify", false);
    this.fUx = ((EditText)findViewById(i.aje));
    this.fUy = ((TextView)findViewById(i.aEM));
    this.fUz = ((TextView)findViewById(i.aMi));
    this.fUA = ((Button)findViewById(i.aMh));
    this.fUx.addTextChangedListener(new ac(this));
    this.fUy.setText(ch.xD(this.cTZ));
    this.fUz.setTag(Integer.valueOf(60));
    this.dHm = new ay(new ad(this), true);
    this.fUA.setOnClickListener(new ae(this));
    if (!this.fUB)
    {
      this.fUs = ((Button)findViewById(i.amV));
      this.fUs.setVisibility(0);
      this.fUs.setOnClickListener(new ag(this));
    }
    a(new ah(this));
    a(0, getString(n.btO), new ai(this));
    eB(false);
    oP(n.cbO);
    this.dHm.cP(1000L);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    switch (paramx.getType())
    {
    default:
    case 145:
    case 132:
    }
    do
    {
      com.tencent.mm.modelfriend.ai localai;
      do
      {
        do
        {
          return;
          localai = (com.tencent.mm.modelfriend.ai)paramx;
          if (localai.sg() != 10)
            break;
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            z.i("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "resend verify code successfully");
            return;
          }
          Object[] arrayOfObject5 = new Object[2];
          arrayOfObject5[0] = Integer.valueOf(paramInt1);
          arrayOfObject5[1] = Integer.valueOf(paramInt2);
          z.w("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "resend verify code fail, errType %d, errCode %d", arrayOfObject5);
        }
        while (j(paramInt1, paramInt2, paramString));
        ActionBarActivity localActionBarActivity2 = aPI();
        int m = n.cbT;
        Object[] arrayOfObject6 = new Object[2];
        arrayOfObject6[0] = Integer.valueOf(paramInt1);
        arrayOfObject6[1] = Integer.valueOf(paramInt2);
        Toast.makeText(localActionBarActivity2, getString(m, arrayOfObject6), 0).show();
        return;
        if (localai.sg() != 11)
          break;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          this.fUq = localai.tR();
          z.d("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "duanyi test bind opmobile verify authticket = " + this.fUq);
          int k = getIntent().getIntExtra("from_source", 1);
          Intent localIntent2 = new Intent();
          localIntent2.putExtra("from_source", k);
          if (k == 1)
          {
            localIntent2.addFlags(67108864);
            localIntent2.putExtra("auth_ticket", this.fUq);
            com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, null);
            finish();
            return;
          }
          if (k == 2)
          {
            localIntent2.addFlags(67108864);
            localIntent2.putExtra("auth_ticket", this.fUq);
            com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, null);
            finish();
            return;
          }
          if (k == 3)
          {
            localIntent2.addFlags(67108864);
            localIntent2.putExtra("auth_ticket", this.fUq);
            String str = getIntent().getStringExtra("WizardTransactionId");
            if (str == null)
              str = "";
            Intent localIntent3 = (Intent)iNc.get(str);
            iNc.clear();
            if (localIntent3 != null)
              com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, localIntent3);
            while (true)
            {
              finish();
              return;
              com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, null);
            }
          }
          if (k == 5)
          {
            localIntent2.addFlags(67108864);
            localIntent2.putExtra("auth_ticket", this.fUq);
            com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, null);
            finish();
            return;
          }
          if (k == 6)
          {
            localIntent2.addFlags(67108864);
            localIntent2.putExtra("auth_ticket", this.fUq);
            com.tencent.mm.plugin.safedevice.a.a(this, localIntent2, null);
            finish();
            return;
          }
          aQl();
          return;
        }
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(paramInt1);
        arrayOfObject3[1] = Integer.valueOf(paramInt2);
        z.w("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "verify verify-code fail, errType %d, errCode %d", arrayOfObject3);
      }
      while (j(paramInt1, paramInt2, paramString));
      ActionBarActivity localActionBarActivity1 = aPI();
      int j = n.cbV;
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Integer.valueOf(paramInt1);
      arrayOfObject4[1] = Integer.valueOf(paramInt2);
      Toast.makeText(localActionBarActivity1, getString(j, arrayOfObject4), 0).show();
      return;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(localai.sg());
      arrayOfObject2[1] = Integer.valueOf(paramInt1);
      arrayOfObject2[2] = Integer.valueOf(paramInt2);
      z.w("!56@/B4Tb64lLpLCHt2tgayO4+XlFyFQ+G0BvdzSLyYUwo0jcenzQx7SDA==", "unknow bind mobile for reg op code %d, errType %d, errCode %d", arrayOfObject2);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.safedevice.a.e.j(true, true);
        Intent localIntent1 = new Intent(this, MySafeDeviceListUI.class);
        localIntent1.addFlags(67108864);
        startActivity(localIntent1);
        finish();
        return;
      }
    }
    while (j(paramInt1, paramInt2, paramString));
    int i = n.cbV;
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    Toast.makeText(this, getString(i, arrayOfObject1), 0).show();
  }

  protected final int getLayoutId()
  {
    return k.bmx;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fUt = b.DL();
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
    this.dHm.aNu();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      afq();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    bg.qX().b(145, this);
    bg.qX().b(132, this);
    super.onPause();
    if (!this.fUB)
      b.b(false, bg.qS() + "," + getClass().getName() + ",L600_200," + bg.eg("L600_200") + ",2");
  }

  protected void onResume()
  {
    bg.qX().a(145, this);
    bg.qX().a(132, this);
    super.onResume();
    if (!this.fUB)
    {
      b.b(true, bg.qS() + "," + getClass().getName() + ",L600_200," + bg.eg("L600_200") + ",1");
      b.jD("L600_200");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.SecurityAccountVerifyUI
 * JD-Core Version:    0.6.2
 */