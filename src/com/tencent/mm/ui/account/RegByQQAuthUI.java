package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;

public class RegByQQAuthUI extends MMActivity
  implements m
{
  private String cGZ;
  private String dCF;
  private String dQm;
  private ProgressDialog dWT = null;
  private String iPI;
  private EditText iRA = null;
  private int iRB;

  protected final void DP()
  {
    this.iRB = getIntent().getIntExtra("RegByQQ_BindUin", 0);
    this.iPI = getIntent().getStringExtra("RegByQQ_RawPsw");
    this.dCF = getIntent().getStringExtra("RegByQQ_Account");
    this.dQm = getIntent().getStringExtra("RegByQQ_Ticket");
    this.cGZ = getIntent().getStringExtra("RegByQQ_Nick");
    z.v("!32@/B4Tb64lLpJpocFQ/FMhC8SHjVT5uccY", "values : bindUin:" + this.iRB + "  pass:" + this.iPI + "  ticket:" + this.dQm);
    this.iRA = ((EditText)findViewById(i.aGi));
    if ((this.cGZ != null) && (!this.cGZ.equals("")))
      this.iRA.setText(this.cGZ);
    oP(n.bYY);
    a(0, getString(n.btO), new hh(this));
    a(new hj(this));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!32@/B4Tb64lLpJpocFQ/FMhC8SHjVT5uccY", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.dWT != null)
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (!ch.S(this));
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        switch (paramx.getType())
        {
        default:
          return;
        case 126:
        }
        bg.rf();
        bf.dkH.y("login_user_name", this.dCF);
        Intent localIntent1 = new Intent(this, BindMContactIntroUI.class);
        localIntent1.putExtra("skip", true);
        Intent localIntent2 = a.dWo.k(this);
        localIntent2.addFlags(67108864);
        localIntent2.putExtra("LauncherUI.enter_from_reg", true);
        MMWizardActivity.b(this, localIntent1, localIntent2);
        return;
      }
      int i;
      if (a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
        i = 1;
      while (i == 0)
      {
        int j = n.bKW;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(j, arrayOfObject), 0).show();
        return;
        if (paramInt1 == 4);
        switch (paramInt2)
        {
        default:
          i = 0;
          break;
        case -1:
          if (bg.qX().tw() == 6)
          {
            e.b(this, n.bUe, n.bUd);
            i = 1;
          }
          break;
        case -3:
          e.b(this, n.bth, n.bYW);
          i = 1;
          break;
        case -4:
          e.b(this, n.btg, n.bYW);
          i = 1;
          break;
        case -12:
          e.b(this, n.bYX, n.bYW);
          i = 1;
          break;
        case -11:
          e.b(this, n.bYV, n.bYW);
          i = 1;
          break;
        case -72:
          e.b(aPI(), n.bYU, n.buo);
          i = 1;
          break;
        case -75:
          e.b(aPI(), n.bsD, n.buo);
          i = 1;
        }
      }
    }
  }

  protected final int getLayoutId()
  {
    return k.blF;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
  }

  public void onPause()
  {
    super.onPause();
    bg.qX().b(126, this);
  }

  public void onResume()
  {
    super.onResume();
    bg.qX().a(126, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.RegByQQAuthUI
 * JD-Core Version:    0.6.2
 */