package com.tencent.mm.ui.account.mobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import com.tencent.mm.c.a.ej;
import com.tencent.mm.c.a.el;
import com.tencent.mm.c.a.em;
import com.tencent.mm.c.a.en;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ak;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.friend.FindMContactAddUI;
import java.util.List;

public final class cp
  implements m, ed
{
  private String fAX = null;
  private String iQR = "";
  private int iQS = 2;
  private MobileVerifyUI iUO;

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKNhhU94SG29rLHHX9rhbeQs+jmFtLB+kQ=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.iUO.dWT != null)
    {
      this.iUO.dWT.dismiss();
      this.iUO.dWT = null;
    }
    if (paramx.getType() == 132)
    {
      bg.qX().b(132, this);
      if ((((ak)paramx).sg() == 2) && (paramInt1 == 0) && (paramInt2 == 0))
      {
        bg.rf();
        j = com.tencent.mm.pluginsdk.a.ba(this.iUO).size();
        k = 0;
        if (j != 0)
          k = 1;
        if ((this.iQR == null) || (!this.iQR.contains("1")) || (k == 0))
          break label274;
        b.jE("R300_300_QQ");
        localIntent2 = new Intent(this.iUO, FindMContactAddUI.class);
        localIntent2.addFlags(67108864);
        localIntent2.putExtra("regsetinfo_ticket", this.fAX);
        localIntent2.putExtra("regsetinfo_NextStep", this.iQR);
        localIntent2.putExtra("regsetinfo_NextStyle", this.iQS);
        localIntent2.putExtra("login_type", 1);
        localIntent3 = com.tencent.mm.plugin.a.a.dWo.k(this.iUO);
        localIntent3.addFlags(67108864);
        MMWizardActivity.b(this.iUO, localIntent2, localIntent3);
        this.iUO.finish();
      }
    }
    label274: 
    while ((this.iUO.j(paramInt1, paramInt2, paramString)) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      int j;
      int k;
      Intent localIntent2;
      Intent localIntent3;
      return;
      Intent localIntent1 = com.tencent.mm.plugin.a.a.dWo.k(this.iUO);
      localIntent1.addFlags(67108864);
      this.iUO.startActivity(localIntent1);
      this.iUO.iVn = 4;
      this.iUO.finish();
      return;
    }
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    int i = n.bwP;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    Toast.makeText(localMobileVerifyUI1, localMobileVerifyUI2.getString(i, arrayOfObject), 0).show();
  }

  public final void a(MobileVerifyUI paramMobileVerifyUI)
  {
    this.iUO = paramMobileVerifyUI;
    this.fAX = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_ticket");
    this.iQR = paramMobileVerifyUI.getIntent().getStringExtra("regsetinfo_NextStep");
    this.iQS = paramMobileVerifyUI.getIntent().getIntExtra("regsetinfo_NextStyle", 2);
  }

  public final boolean ph(int paramInt)
  {
    switch (cs.iUR[(paramInt - 1)])
    {
    default:
      return false;
    case 1:
      ej localej2 = new ej();
      localej2.cJY.context = this.iUO;
      com.tencent.mm.sdk.c.a.aGB().g(localej2);
      String str3 = localej2.cJZ.cFd;
      em localem2 = new em();
      com.tencent.mm.sdk.c.a.aGB().g(localem2);
      String str4 = localem2.cKa.cFf;
      bg.qX().a(132, this);
      ak localak3 = new ak(this.iUO.cTZ, 2, this.iUO.iTQ.getText().toString().trim(), "", str3, str4);
      bg.qX().d(localak3);
      MobileVerifyUI localMobileVerifyUI3 = this.iUO;
      MobileVerifyUI localMobileVerifyUI4 = this.iUO;
      this.iUO.getString(n.buo);
      localMobileVerifyUI3.dWT = e.a(localMobileVerifyUI4, this.iUO.getString(n.bwO), true, new cr(this, localak3));
      return false;
    case 2:
      bg.qX().a(132, this);
      ak localak2 = new ak(this.iUO.cTZ, 1, "", 0, "");
      bg.qX().d(localak2);
      return false;
    case 3:
    }
    ej localej1 = new ej();
    localej1.cJY.context = this.iUO;
    com.tencent.mm.sdk.c.a.aGB().g(localej1);
    String str1 = localej1.cJZ.cFd;
    em localem1 = new em();
    com.tencent.mm.sdk.c.a.aGB().g(localem1);
    String str2 = localem1.cKa.cFf;
    bg.qX().a(132, this);
    ak localak1 = new ak(this.iUO.cTZ, 2, this.iUO.iTQ.getText().toString().trim(), "", str1, str2);
    bg.qX().d(localak1);
    MobileVerifyUI localMobileVerifyUI1 = this.iUO;
    MobileVerifyUI localMobileVerifyUI2 = this.iUO;
    this.iUO.getString(n.buo);
    localMobileVerifyUI1.dWT = e.a(localMobileVerifyUI2, this.iUO.getString(n.bwO), true, new cq(this, localak1));
    return false;
  }

  public final void start()
  {
  }

  public final void stop()
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.cp
 * JD-Core Version:    0.6.2
 */