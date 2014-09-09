package com.tencent.mm.ui.account;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.ce;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.modelsimple.i;
import com.tencent.mm.o.x;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class FacebookLoginUI extends MMPreference
  implements com.tencent.mm.o.m
{
  private String cOh = "";
  private String fUt;
  private SecurityImage iMR = null;
  private ProgressDialog iNO;
  private DialogInterface.OnCancelListener iNP;
  private com.tencent.mm.ui.c.a.e iOp;
  private com.tencent.mm.modelsimple.n iOq;

  private void aQx()
  {
    try
    {
      if (this.iOp != null)
        this.iOp.cz(this);
      label16: b.jF(bg.qS() + "," + getClass().getName() + ",L14," + bg.eg("L14") + ",1");
      this.iOp = new com.tencent.mm.ui.c.a.e("290293790992170");
      this.iOp.a(this, FacebookAuthUI.iOf, new ay(this, (byte)0));
      return;
    }
    catch (Exception localException)
    {
      break label16;
    }
  }

  private void goBack()
  {
    b.jE(this.fUt);
    finish();
  }

  protected final void DP()
  {
    this.iOp = new com.tencent.mm.ui.c.a.e("290293790992170");
    this.iNP = new aw(this);
    aQx();
    a(new ax(this));
  }

  public final int DZ()
  {
    return q.czB;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.i("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "Scene Type " + paramx.getType());
    if (this.iNO != null)
    {
      this.iNO.dismiss();
      this.iNO = null;
    }
    if (!ch.S(this));
    while (!(paramx instanceof com.tencent.mm.modelsimple.n))
      return;
    this.cOh = ((com.tencent.mm.modelsimple.n)paramx).za();
    if ((paramx.getType() == 380) && (paramInt1 == 4) && ((paramInt2 == -16) || (paramInt2 == -17)))
      bg.qX().d(new ce(new ar(this)));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) || ((paramInt1 == 0) && (paramInt2 == 0)))
      {
        bg.rf();
        com.tencent.mm.platformtools.ac.jB("");
        f.F(this);
        com.tencent.mm.platformtools.ac.a(this, new as(this), false);
        return;
      }
      if (paramInt2 == -106)
      {
        com.tencent.mm.platformtools.ac.s(this, paramString);
        return;
      }
      if (paramInt2 == -6)
      {
        di localdi = new di();
        localdi.iPK = ((i)paramx).wC();
        localdi.iPM = ((i)paramx).wB();
        localdi.iPL = ((i)paramx).yZ();
        localdi.iPN = ((i)paramx).yY();
        localdi.dCF = "facebook@wechat_auth";
        localdi.iPI = this.iOp.aYA();
        if (this.iMR == null)
        {
          this.iMR = com.tencent.mm.ui.applet.m.a(this, com.tencent.mm.n.bZc, localdi.iPN, localdi.iPM, localdi.iPK, localdi.iPL, new at(this, localdi), null, new av(this), localdi);
          return;
        }
        z.d("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "imgSid:" + localdi.iPK + " img len" + localdi.iPM.length + " " + k.nL());
        this.iMR.b(localdi.iPN, localdi.iPM, localdi.iPK, localdi.iPL);
        return;
      }
      if (paramInt1 == 4);
      int j;
      switch (paramInt2)
      {
      default:
        if (com.tencent.mm.plugin.a.a.dWp.a(aPI(), paramInt1, paramInt2, paramString))
          j = 1;
        break;
      case -1:
      case -4:
      case -3:
      case -9:
      case -72:
      case -75:
      case -7:
      case -107:
      case -30:
      }
      while (j == 0)
      {
        int k = com.tencent.mm.n.bJW;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(k, arrayOfObject), 0).show();
        return;
        if (bg.qX().tw() == 6)
        {
          com.tencent.mm.ui.base.e.b(this, com.tencent.mm.n.bUe, com.tencent.mm.n.bUd);
          j = 1;
        }
        else
        {
          com.tencent.mm.ui.base.e.b(this, com.tencent.mm.n.bFW, com.tencent.mm.n.bQj);
          j = 1;
          continue;
          com.tencent.mm.ui.base.e.b(this, com.tencent.mm.n.bQi, com.tencent.mm.n.bQj);
          j = 1;
          continue;
          com.tencent.mm.ui.base.e.b(aPI(), com.tencent.mm.n.bYU, com.tencent.mm.n.buo);
          j = 1;
          continue;
          com.tencent.mm.platformtools.ac.ae(aPI());
          j = 1;
          continue;
          com.tencent.mm.ui.base.e.b(aPI(), com.tencent.mm.n.bGX, com.tencent.mm.n.buo);
          j = 1;
          continue;
          com.tencent.mm.ui.base.e.b(aPI(), com.tencent.mm.n.bGY, com.tencent.mm.n.buo);
          j = 1;
          continue;
          if (com.tencent.mm.protocal.a.hrq)
          {
            Intent localIntent = new Intent();
            localIntent.putExtra("rawUrl", this.cOh);
            localIntent.putExtra("showShare", false);
            localIntent.putExtra("show_bottom", false);
            localIntent.putExtra("needRedirect", false);
            localIntent.putExtra("neverGetA8Key", true);
            localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.hNg);
            localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.hNd);
            com.tencent.mm.plugin.a.a.dWo.h(localIntent, this);
          }
          j = 1;
          continue;
          j = 0;
        }
      }
    }
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str == null)
    {
      z.e("!44@/B4Tb64lLpKNEztPnVXez/m8ZdttX/a3Eg9smVocr9Y=", "onPreferenceTreeClick, key is null");
      return true;
    }
    if (str.equals("facebook_auth_bind_btn"))
    {
      aQx();
      return true;
    }
    return false;
  }

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.iOp.c(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(com.tencent.mm.n.age);
    com.tencent.mm.plugin.a.a.dWp.hY();
    this.fUt = b.DL();
    DP();
    bg.qX().a(380, this);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public void onPause()
  {
    super.onPause();
    b.b(false, bg.qS() + "," + getClass().getName() + ",L100_200_FB," + bg.eg("L100_200_FB") + ",2");
  }

  protected void onResume()
  {
    super.onResume();
    b.b(true, bg.qS() + "," + getClass().getName() + ",L100_200_FB," + bg.eg("L100_200_FB") + ",1");
    b.jD("L100_200_FB");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.FacebookLoginUI
 * JD-Core Version:    0.6.2
 */